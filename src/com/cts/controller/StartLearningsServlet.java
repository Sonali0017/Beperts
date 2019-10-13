package com.cts.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.bean.UploadBean;
import com.cts.service.keywordSearchService;
import com.cts.service.keywordSearchServiceImpl;

/**
 * Servlet implementation class StartLearningsServlet
 */
@WebServlet("/StartLearningsServlet")
public class StartLearningsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private keywordSearchService ksService = new keywordSearchServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StartLearningsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = null;
    	List<UploadBean> ub = new ArrayList<UploadBean>();
		ub = ksService.getAllCourses();
		System.out.println("In Servlet get method");
		request.setAttribute("courses",ub);		
		
		
		
		 dispatcher = request.getRequestDispatcher("StartLearning.jsp");
         dispatcher.forward(request, response);	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
