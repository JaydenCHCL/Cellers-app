package com.cellers.jdbc;

import java.sql.*;

public class CallableStatementTest {

	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sept2022", "root", "root")) {
			CallableStatement cst = con.prepareCall("{call getEmp(?,?,?)}");
			//execute method returns a boolean
			cst.setInt(1,  102);
			cst.registerOutParameter(2, java.sql.Types.VARCHAR);
			cst.registerOutParameter(3, java.sql.Types.VARCHAR);
			cst.executeUpdate();
			
			String empName = cst.getString(2);
			String empSal = cst.getString(3);
		
			
			System.out.println(empName + " " + empSal);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
