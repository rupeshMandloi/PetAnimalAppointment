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
 * Servlet implementation class Information
 */
@WebServlet("/Information")
public class Information extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
	       PrintWriter out = response.getWriter();
	       String fname = request.getParameter("first");
	       String lname = request.getParameter("last");
	       String petname = request.getParameter("pet");
	       String illname = request.getParameter("illness");
	       String mobile = request.getParameter("phone");
	       String Email = request.getParameter("email");
	       String date1 = request.getParameter("fdate");
	       String time1 = request.getParameter("ftime");
	       String date2 = request.getParameter("sdate");
	       String time2 = request.getParameter("stime");
    
	       try{
	           Class.forName("com.mysql.cj.jdbc.Driver");
	           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rupesh","root","Rupesh@123" );
	           
	           PreparedStatement ps = con.prepareStatement("insert into contact values(?,?,?,?,?,?,?,?,?,?)");
	           ps.setString(1,fname);
	           ps.setString(2, lname);
	           ps.setString(3, petname);
	           ps.setString(4, illname);
	           ps.setString(5, mobile);
	           ps.setString(6, Email);
	           ps.setString(7, date1);
	           ps.setString(8, time1);
	           ps.setString(9, date2);
	           ps.setString(10, time2);
	           
	           
	           int i  = ps.executeUpdate();
	           if(i > 0 && !fname.isEmpty() && !lname.isEmpty() && !petname.isEmpty()&& !illname.isEmpty()&& !mobile.isEmpty()&& !date1.isEmpty()&& !time1.isEmpty() ){
	               
	               out.println("<h1>Successfully appointment!...</h1>");
	               out.println("<h1><a href=index.html>Go to Home</a></h1>");
//	               RequestDispatcher rd = request.getRequestDispatcher("index.html");
//	               rd.include(request, response);
	           }
	           else{
	               out.println("<h1> fill the all option</h1>");
	           }
	       }catch(Exception e){
	    	   out.println(e+" <h1>User Already Exits !</h1>");
			   out.println("<h3><a href=Register.html> Try Again</h3>");
	         }
	       out.close();
	}

}
