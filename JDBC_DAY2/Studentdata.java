package com.tka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Studentdata {
	public void insertData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:1320/school", "root", "root");
		Statement ps = c.createStatement();
		int checked = ps.executeUpdate(
				"insert into student (id , name,city) value (123,'sakshi','nanded'),(124,'sarang','nanded'),(125,'sohan','nanded'),(126,'rahul','pune'),(127,'sudarshan','kolhapur'),(128,'smir','latur'),(129,'suraj','solapur')");
		if (checked > 0) {
			System.out.println("Inserted");
		} else {
			System.out.println("Not inserted");
		}
		c.close();
	}

	public void updateData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:1320/school", "root", "root");
		Statement ps = c.createStatement();
		int checked = ps.executeUpdate("update student set name = 'sarang',city = 'nanded' where id =124");
		if (checked > 0) {
			System.out.println("Updated");
		} else {
			System.out.println("Not updated");
		}
		c.close();
	}

	public void deleteData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:1320/school", "root", "root");
		Statement ps = c.createStatement();
		int checked = ps.executeUpdate("delete from student where id = 125");
		if (checked > 0) {
			System.out.println("Deleted");
		} else {
			System.out.println("Not Deleted ");
		}
		c.close();

	}

	public void fetchAllrecord() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:1320/school", "root", "root");
		Statement ps = c.createStatement();
		ResultSet rs = ps.executeQuery("select * from student");
		while (rs.next()) {
			System.out.println(rs.getInt(1) + "   " + rs.getString(2) + "   " + rs.getString(3));
		}
		c.close();
	}
	public void getSingleRecord() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
	Connection c =	DriverManager.getConnection("jdbc:mysql://localhost:1320/school", "root", "root");
	Statement ps = c.createStatement();
	ResultSet rs = ps.executeQuery("select * from student where id = 125");
	while (rs.next()) {
		System.out.println(rs.getInt(1)+ "  " + rs.getString(2)+ "    "+ rs.getString(3));
	}
	
	}
}
