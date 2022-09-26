package com.cellers.jdbc;

import java.sql.*;

public class PreparedStatementTest {

	public static void main(String[] args) throws SQLException {
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sept2022", "root", "root")) {
			//PreparedStatement pst = con.prepareStatement(
				//	"create table student(sno numeric(10),sname varchar(50),saddress varchar(10),primary key(sno))");
			//execute method returns a boolean
			//pst.execute();

			PreparedStatement pst1 = con.prepareStatement("insert into student(sno,sname,saddress) values(?,?,?)");
			pst1.setInt(1, 726);
			pst1.setString(2, "Jessica");
			pst1.setString(3, "Dallas");
			//executeUpdate returns an int
			pst1.executeUpdate();
			
			
			//System.out.println(x + " record(s) inserted");
			PreparedStatement pst3 = con.prepareStatement("select * from student");
			ResultSet rs1 = pst3.executeQuery();
			while(rs1.next()) {
				int studentnumber = rs1.getInt(1);
				String studentname = rs1.getString(2);
				String studentaddress = rs1.getString(3);
				System.out.print(studentnumber + " ");
				System.out.print(studentname + " ");
				System.out.println(studentaddress);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
