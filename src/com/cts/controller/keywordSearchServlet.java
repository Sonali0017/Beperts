package com.cts.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.bean.keywordSearchBean;
import com.cts.service.keywordSearchService;
import com.cts.service.keywordSearchServiceImpl;

/**
 * Servlet implementation class keywordSearchServlet
 */
//@WebServlet("/keywordSearchServlet")
public class keywordSearchServlet extends HttpServlet {
	
	keywordSearchService ks = new keywordSearchServiceImpl();
	keywordSearchBean kb = new keywordSearchBean();
//	SearchService searchservive;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public keywordSearchServlet() {
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
		System.out.println("hey");
		System.out.println(request.getParameter("search2"));
		String sb =  ks.keywordSearch(request.getParameter("search2"));
		System.out.println(request.getParameter("search2"));
		
	//	String forwardpage = searchservive.getSearchResults(sb);
		
	
		
		 //System.out.println(sb);
		//  boolean keywordSearched = keywordsearch.registerUser(registerBean);
		
		response.setContentType("text/html");
 		response.getWriter().println(sb.toString());
		 
		 
		 
		
	}

}
