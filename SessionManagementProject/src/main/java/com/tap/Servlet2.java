package com.tap;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet2 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(); // for taking session object 
		//session object only one not many
		//String session =session.getAttribute("username"); //getting username
		//above throw error because session is object so downcast
		String username =(String)session.getAttribute("username");
		 PrintWriter out=resp.getWriter();
		 out.println("Hello"+username+ "Attempts over contact admin");	
	}
}
