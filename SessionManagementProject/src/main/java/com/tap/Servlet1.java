package com.tap;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet1 extends HttpServlet {
	static int count =3;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String password=req.getParameter("password");
		String username = req.getParameter("username");
		HttpSession session =req.getSession();
		session.setAttribute("username", username);
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html"); 
		if("stev".equals(password)) {
			out.print("Welcome to Home page");
		}
		else if(count > 0){ 
			out.print("Invalid password," +count+" attempts left");
			count--;
			RequestDispatcher rd=req.getRequestDispatcher("index.html");
			rd.include(req, resp);
		}
		else { 
			
		}
	}
}
