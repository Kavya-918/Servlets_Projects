package com.tap;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name=req.getParameter("username");
	String password =req.getParameter("password");
	//System.out.print("Hello" +name+ "Welcome to the home page"); console output get
	PrintWriter out =resp.getWriter();
	out.println("Hello"+" "+name+" "+"Welcome to Homepge(doget)");
	}

}
