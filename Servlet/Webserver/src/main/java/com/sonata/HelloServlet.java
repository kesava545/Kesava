package com.sonata;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/Hello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	PrintWriter out=response.getWriter();
	response.setContentType("text/html");
	String FirstName=request.getParameter("name");
	getServletContext().setAttribute("personname",FirstName);
	String LastName=request.getParameter("lastname");
	String ClassName=request.getParameter("classname");
	out.println(FirstName +"<br>");
	out.println(LastName +"<br>");
	out.println(ClassName +"<br>");
	//out.println("<h>servlet</h>")
	out.println(new java.util.Date());
	out.println(response.getStatus());
	//response.sendError(407, "Need authentication!!!" );
	//response.setStatus(500);
	//out.println(response.getLocale());
	}

	
	}

