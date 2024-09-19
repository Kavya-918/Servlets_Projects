package com.tap;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Driver;

public class Servlet1 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url = "jdbc:mysql://localhost:3306/jee4";
		String username = "root";
		String password = "9418";
		Connection con;
		PreparedStatement pstmt;
		PrintWriter out;
		String sql = "INSERT INTO `members` (`name`,`lastname`,`email`) VALUES(?,?,?)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded");
			con=DriverManager.getConnection(url,username,password);
			System.out.println("Connection success");
			pstmt =con.prepareStatement(sql);
			pstmt.setString(1,req.getParameter("name"));
			pstmt.setString(2,req.getParameter("lastname"));
			pstmt.setString(3,req.getParameter("email"));
			int n = pstmt.executeUpdate();
			out = resp.getWriter();
			if(n > 0) {
				out.print("Registration success");
			}
			else {
				out.print("Registration failure");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
