package com.cellers.serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// set the MIME type
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println(
				"<h1 style='color:blue'><marquee behavior='alternate'>Welcome to the world of Servlet</marquee> </h1>");
		out.close();

	}
}