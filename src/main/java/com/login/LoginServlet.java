package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			 response.setContentType("text/html;charset=UTF-8");
		       PrintWriter out = response.getWriter();
			Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rupesh","root","Rupesh@123" );
	           
			 String name = request.getParameter("name");
			String password = request.getParameter("pass");
			 
			 PreparedStatement ps = con.prepareStatement("select username from login where username = ? and password = ?");
			 
			 ps.setString(1,name);
			 ps.setString(2, password);
			 ResultSet rs = ps.executeQuery();
			 
			 if(rs.next() && !name.isEmpty() && !password.isEmpty()) {
				 RequestDispatcher rd = request.getRequestDispatcher("welcome.html");
				 rd.forward(request,response);
			 }
			 else {
				 out.println("<h2>Login failed</h2>");
				 out.println("<a href=login.jsp> Try again </a>");
			 }
		} 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
