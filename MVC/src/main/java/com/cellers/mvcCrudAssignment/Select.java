package com.cellers.mvcCrudAssignment;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Select")
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

			int prdNum = 0;
			String prdName = "";
			int prdPrice = 0;

			Connection conn = DriverManager.getConnection(DBUtil.url, DBUtil.user, DBUtil.password);
			System.out.println("connection successful");
			PreparedStatement st = conn.prepareStatement("select * from products where prdNum=?");

			st.setInt(1, Integer.valueOf(request.getParameter("prdNum")));

			ResultSet rs = st.executeQuery();

			while (rs.next()) {

				prdNum = rs.getInt(1);
				prdName = rs.getString(2);
				prdPrice = rs.getInt(3);

			}

			rs.close();
			st.close();
			conn.close();

			response.sendRedirect("Result.jsp?prdNum=" + prdNum + "&prdName=" + prdName + "&prdPrice=" + prdPrice);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
