package com.cts.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.bean.RegisterBean;
import com.cts.service.RegisterService;
import com.cts.service.RegisterServiceImpl;

/**
 * Servlet implementation class RegisterServlet
 */
//@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userType=request.getParameter("userType");
        
        response.sendRedirect("Register.jsp?userType="+userType);

		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String First_Name = request.getParameter("First_Name");
        String Last_Name = request.getParameter("Last_Name");
        String Age = request.getParameter("Age");
        String MobileNumber = request.getParameter("MobileNumber");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String password1 = request.getParameter("password1");
        String userType = request.getParameter("userType");
       System.out.println(request.getParameter("userType"));
        
        RegisterBean registerBean = new RegisterBean();

        registerBean.setFirst_Name(First_Name);
        registerBean.setLast_Name(Last_Name);
        registerBean.setAge(Age);
        registerBean.setMobileNumber(MobileNumber);
        
        registerBean.setUserName(username);
        registerBean.setPassword(password);
        registerBean.setPassword1(password1); 
        registerBean.setUserType(userType);
        
        RegisterService registerService = (RegisterService) new RegisterServiceImpl();
        
        boolean userRegistered = registerService.registerUser(registerBean);
        if(userRegistered)   //On success, you can display a message to user on Home page
        {
                        request.getRequestDispatcher("login.jsp").forward(request, response);
        }
        else   
        {
                        request.setAttribute("errMessage", userRegistered);
                        request.getRequestDispatcher("Sign.jsp").include(request, response);
        }
}

		//doGet(request, response);
	}


