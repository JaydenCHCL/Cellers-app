package com.cellers.jdbc;

import java.sql.*;

public class JDBCTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Load the mysql driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		// Create a connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sept2022", "root", "root");
		// Create a Statement
		Statement st = con.createStatement();
		//st.execute("create table emp(eno numeric(10),ename varchar(50),esal numeric(10),primary key(eno))");
		st.execute("insert into 'emp' values(100, 'Rebecca', 95000)");
		st.execute("insert into 'emp' values(101, 'Jayden', 112345)");
		st.execute("insert into 'emp' values(102, 'Jethon', 75000)");
		st.execute("insert into 'emp' values(103, 'Adam', 80000)");
		
		st.execute("insert into 'emp' values(104, 'Brandon', 87000)");
		st.execute("insert into 'emp' values(105, 'Dummy', 12345");
		
		st.execute("update 'emp' set esal = 33333 where eno =102");
		st.execute("delete from 'emp' where eno = 104");
		ResultSet rs = st.executeQuery("select * from emp");
		while(rs.next()) {
			System.out.println("Emp No " + rs.getInt("eno"));
			System.out.println("Emp Name " + rs.getString(2));
			System.out.println("Emp Salary " + rs.getInt("esal"));
		}
	}
}
