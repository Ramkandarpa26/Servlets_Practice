package com.cdgn.service1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Data")
public class ReadingFormData extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		int age=Integer.parseInt(request.getParameter("age"));
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		PrintWriter out=response.getWriter();
		out.println("<h1>"+id);
		out.println("<h1>"+name);
		out.println("<h1>"+age);
		out.println("<h1>"+email);
		out.println("<h1>"+password);
		out.println("This is a Get Method");
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		int age=Integer.parseInt(request.getParameter("age"));
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		PrintWriter out=response.getWriter();
		out.println("<h1>"+id);
		out.println("<h1>"+name);
		out.println("<h1>"+age);
		out.println("<h1>"+email);
		out.println("<h1>"+password);
		out.println("This is a PostMethod.");
	}

}
