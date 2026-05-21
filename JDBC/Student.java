package com.tka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import sun.jvm.hotspot.tools.SysPropsDumper;

public class Student {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// 2 nd step ragister & loda driver class

		Class.forName("com.mysql.cj.jdbc.Driver");

		// 3rd Step GET CONNECTION
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:1320/school","root","root");

		// 4th step we have two option (statment(static0) & preapredstetment(dynamic) )
		Statement s = c.createStatement();
		// 5th step execute query and get result
		int checked = s.executeUpdate("insert into student(id,name,city)value(124,'sairam','nanded'),(125,'samir','delhi')");
		if (checked > 0) {
			System.out.println("Inserted....");
		} else {
			System.out.println("Not Inserted...");
		}
	}
}
