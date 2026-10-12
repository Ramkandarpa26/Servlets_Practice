package com.cdgn.service1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class MyGenericServlet
 */
@WebServlet("/hi")
public class MyGenericServlet extends GenericServlet {
	public void init(ServletConfig config) throws ServletException {
		System.out.println("This is init Method");
	}

	
	public void destroy() {
		System.out.println("This is destroy Method");
	}


	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		pw.println("<h1>This is service method");
	}

}
