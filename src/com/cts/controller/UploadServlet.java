package com.cts.controller;

import java.io.IOException; 
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.cts.bean.UploadBean;

import com.cts.service.UploadService;
import com.cts.service.UploadServiceImpl;
import com.cts.Dao.UploadDao;


/**
 * Servlet implementation class UploadServlet
 */
@WebServlet("/UploadServlet")
@MultipartConfig
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UploadService uploadService = new UploadServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UploadServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String keyword = request.getParameter("keyword");
		String skillname = request.getParameter("skillname");
		System.out.println("In Servelt");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println(request.getParameter("keyword"));
		System.out.println(request.getParameter("skillname"));
		InputStream inputStream = null; // input stream of the upload file

		// obtains the upload file part in this multipart request
		Part filePart = request.getPart("description");
		if (filePart != null) {
			// prints out some information for debugging
			System.out.println(filePart.getName());
			System.out.println(filePart.getSize());
			System.out.println(filePart.getContentType());

			// obtains input stream of the upload file
			inputStream = filePart.getInputStream();
		}

		System.out.println("In Servlet");
		// obtains the upload file part in this multipart request
		
		UploadBean upload = new UploadBean(keyword,skillname,inputStream);
		
		
		//System.out.println(upload.get());
		
		  if(uploadService.addUpload(upload)==1) {
		 request.getRequestDispatcher("StartLearning.jsp").forward(request,response); 
		 request.setAttribute("addResourceMsg", "Resource Added");
		  session.setAttribute("addResourceMsg", "Resource Added");
		 
		 }
		 
		  else {
			  request.getRequestDispatcher("AdminLogin.jsp").forward(request,response);
			  request.setAttribute("addResourceMsg", "Resource Not Added");
		  		session.setAttribute("addResourceMsg", "Resource Added");
		 
		 }
			}

}

