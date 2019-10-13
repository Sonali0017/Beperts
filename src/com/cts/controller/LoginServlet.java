package com.cts.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cts.bean.LoginBean;
import com.cts.bean.RegisterBean;
import com.cts.service.LoginService;
import com.cts.service.LoginServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
//@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		PrintWriter pw=response.getWriter();
 LoginService loginService = (LoginService) new LoginServiceImpl();
        LoginBean bean = new LoginBean();
        bean.setUserName(request.getParameter("username"));
        bean.setPassword(request.getParameter("password"));
        System.out.println("Mybean:"+bean);
        HttpSession session=request.getSession();
        RequestDispatcher dispatcher = null;
        
        if(loginService.validateUser(bean)) {
        	
        	RegisterBean registerBean=loginService.getRegisterUserByEmailid(request.getParameter("username"));
        	session.setAttribute("registerBean", registerBean);
                    System.out.println("inside the if block");
                    String userType = loginService.getUserType(bean.getUserName());
                    System.out.println(userType+"user type value");
                    if(registerBean.getUserType().equalsIgnoreCase("A")) {
                                    System.out.println("inside A if ");
                                    // AdminHome.jsp
                                    dispatcher = request.getRequestDispatcher("AdminLogin.jsp");
                dispatcher.forward(request, response);
                    }
                    else if (registerBean.getUserType().equalsIgnoreCase("U")){
                                    // userHome.jsp
                                    dispatcher = request.getRequestDispatcher("StartLearning.jsp");
                dispatcher.forward(request, response);
                    }
                    else {
                                    // login.jsp
                                    dispatcher = request.getRequestDispatcher("login.jsp");
                dispatcher.forward(request, response);
                    }
                    /*System.out.println("true");
        dispatcher = request.getRequestDispatcher("Home1.jsp");
        dispatcher.forward(request, response);*/
        }
        else {                  System.out.println("false");
                        dispatcher=request.getRequestDispatcher("login.jsp");
                        dispatcher.forward(request, response);
        }
        
}

		//doGet(request, response);
	}


