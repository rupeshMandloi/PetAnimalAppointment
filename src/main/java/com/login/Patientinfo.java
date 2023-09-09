package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Patientinfo
 */
@WebServlet("/Patientinfo")
public class Patientinfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
	       PrintWriter out = response.getWriter();
	       String fname = request.getParameter("first");
	       String petname = request.getParameter("pet");
	       String category = request.getParameter("category");
	       String illname = request.getParameter("illness");
	       String mobile = request.getParameter("phone");
	       String Email = request.getParameter("email");
	       String admite = request.getParameter("admite");
	       String Dis = request.getParameter("Dis");
	       String mtype = request.getParameter("mtype");
	       String money = request.getParameter("money");
    
	       try{
	           Class.forName("com.mysql.cj.jdbc.Driver");
	           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rupesh","root","Rupesh@123" );
	           
	           PreparedStatement ps = con.prepareStatement("insert into patient values(?,?,?,?,?,?,?,?,?,?)");
	           ps.setString(1,fname);
	           ps.setString(2, petname);
	           ps.setString(3, category);
	           ps.setString(4, illname);
	           ps.setString(5, mobile);
	           ps.setString(6, Email);
	           ps.setString(7, admite);
	           ps.setString(8, Dis);
	           ps.setString(9, mtype);
	           ps.setString(10, money);
	           
	           
	           int i  = ps.executeUpdate();
	           if(i > 0 && !fname.isEmpty() && !petname.isEmpty() && !petname.isEmpty()&& !illname.isEmpty()&& !mobile.isEmpty()&& !admite.isEmpty()&& !Dis.isEmpty() && !mtype.isEmpty()&& !money.isEmpty()){
	               
	               out.println("<h1>Data Successfully  Register !...</h1>");
//	               RequestDispatcher rd = request.getRequestDispatcher("index.html");
//	               rd.include(request, response);
	           }
	           else{
	               out.println("<h1> fill the all option</h1>");
	           }
	       }catch(Exception e){
//	    	   out.println(e+" <h1> !</h1>");
	    	   out.println("<h1>Data not Successfully  Register !...</h1>");
			   out.println("<h3><a href=welcome.html> Try Again</h3>");
	         }
	       out.close();
	}

}
