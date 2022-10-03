package com.cellers.employeeServletAssignment;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Insert extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Jdbc Connection
		try {
			Class.forName(DBUtil.driver);
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found " + e);
		}
		try {
			Connection conn = DriverManager.getConnection(DBUtil.url, DBUtil.user, DBUtil.password);
			System.out.println("connection successful");
			
			// Query/statement to insert the values
			PreparedStatement st = conn.prepareStatement("insert into emp values(?, ?, ?)");

			// set values into the query
			st.setInt(1, Integer.valueOf(request.getParameter("eno")));
			st.setString(2, request.getParameter("ename"));
			st.setInt(3, Integer.valueOf(request.getParameter("esal")));

			// Execute the query
			st.executeUpdate();

			st.close();
			conn.close();

			// Redirect the response to success page
			response.sendRedirect("Success.jsp?msg=Insert");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
