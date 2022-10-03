package com.cellers.serv;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

			String n = request.getParameter("userName");
			out.print("Welcome " + n);
			// create a session in servlet
			HttpSession session = request.getSession();
			session.setAttribute("abc", n);

			out.print("<a href='servlet2'>Click here to go to SecondServlet</a>");

			out.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}