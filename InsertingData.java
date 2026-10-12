package com.cdgn.service1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Inserting")
public class InsertingData extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/servlets";
			Connection con=DriverManager.getConnection(url,"root","root");
			int id=Integer.parseInt(request.getParameter("id"));
			String name=request.getParameter("name");
			int age=Integer.parseInt(request.getParameter("age"));
			String email=request.getParameter("email");
			String password=request.getParameter("password");
			PreparedStatement  ps=con.prepareStatement("insert into Student values(?,?,?,?,?)");
			ps.setInt(1, id);
			ps.setString(2,name);
			ps.setInt(3, age);
			ps.setString(4,email);
			ps.setString(5,password);
			PrintWriter pw=response.getWriter();
			int result=ps.executeUpdate();
			if(result==1) {
				pw.println("<h1>Data Inserted Successfully.....");
			}
			else pw.println("<h1>Data Transaction failed......");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}