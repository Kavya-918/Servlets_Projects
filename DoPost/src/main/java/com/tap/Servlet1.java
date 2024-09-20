package com.tap;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String un = req.getParameter("username");
		PrintWriter out = resp.getWriter();
		out.print("Hello" +un+ "Welcome to homepage(doget)");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String un = req.getParameter("username");
		PrintWriter out = resp.getWriter();
		out.print("Hi"+" "+un+" "+ "Welcome to homepage(dopost)");
	}

}
