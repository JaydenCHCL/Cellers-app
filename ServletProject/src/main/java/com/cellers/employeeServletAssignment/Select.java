package com.cellers.employeeServletAssignment;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Select extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			Class.forName(DBUtil.driver);
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found " + e);
		}
		try {

			int id = 0;
			String name = "";
			int salary = 0;

			Connection conn = DriverManager.getConnection(DBUtil.url, DBUtil.user, DBUtil.password);
			System.out.println("connection successful");
			PreparedStatement st = conn.prepareStatement("select * from emp where eno=?");

			st.setInt(1, Integer.valueOf(request.getParameter("eno")));

			ResultSet rs = st.executeQuery();

			while (rs.next()) {

				id = rs.getInt(1);
				name = rs.getString(2);
				salary = rs.getInt(3);

			}

			rs.close();
			st.close();
			conn.close();

			response.sendRedirect("Result.jsp?eno=" + id + "&ename=" + name + "&esal=" + salary);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
