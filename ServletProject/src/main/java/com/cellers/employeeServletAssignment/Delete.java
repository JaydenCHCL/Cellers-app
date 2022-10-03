package com.cellers.employeeServletAssignment;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Delete extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			Class.forName(DBUtil.driver);
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found " + e);
		}
		try {
			Connection conn = DriverManager.getConnection(DBUtil.url, DBUtil.user, DBUtil.password);
			System.out.println("connection successful");
			PreparedStatement st = conn.prepareStatement("delete from emp where eno=?");

			st.setInt(1, Integer.valueOf(request.getParameter("eno")));

			st.executeUpdate();

			st.close();
			conn.close();

			response.sendRedirect("Success.jsp?msg=Delete");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
