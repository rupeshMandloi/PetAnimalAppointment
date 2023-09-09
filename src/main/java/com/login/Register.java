package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
	       PrintWriter out = response.getWriter();
	       String name = request.getParameter("Name");
	       String password = request.getParameter("password");
    
	       try{
	           Class.forName("com.mysql.cj.jdbc.Driver");
	           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rupesh","root","Rupesh@123" );
	           
	           PreparedStatement ps = con.prepareStatement("insert into login values(?,?)");
	           ps.setString(1,name);
	           ps.setString(2, password);

	           
	           
	           int i  = ps.executeUpdate();
	           if(i > 0 && !name.isEmpty() && !password.isEmpty() ){
	        
	               RequestDispatcher rd = request.getRequestDispatcher("index.html");
	               rd.include(request, response);
	       
	           }
	           else{
	               out.println("<h1> fill the all option</h1>");
	           }
	       }catch(Exception e){
	    	   out.println(" <h1>User Already Exits !</h1>");
			   out.println("<h3><a href=Register.html> Try Again</h3>");
	         }
	       out.close();
	}

}
