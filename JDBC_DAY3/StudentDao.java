package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentDao {
	public void insertData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:1320/school", "root", "root");
		PreparedStatement ps = c.prepareStatement("insert into student (id,name,city)values(?,?,?)");
		ps.setInt(1, 130);
		ps.setString(2, "chandu");
		ps.setString(3, "nashik");
		int checked = ps.executeUpdate();
		if (checked > 0) {
			System.out.println("Inserted");
		} else {
			System.out.println("not inserted");

		}
		c.close();
	}

	public void Deletedata() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:1320/school", "root", "root");
		PreparedStatement ps = c.prepareStatement("delete from student where id = ?");
		ps.setInt(1, 125);

		int checked = ps.executeUpdate();
		if (checked > 0) {
			System.out.println("Deleted");
		} else {
			System.out.println("Deleted");

		}
		c.close();
	}

	public void UpdateData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:1320/school", "root", "root");
		PreparedStatement ps = c.prepareStatement("Update  student set name = ?,city = ? where id = ?");
		ps.setInt(3, 126);
		ps.setString(1, "samrat");
		ps.setString(2, "hydrabad");

		int checked = ps.executeUpdate();
		if (checked > 0) {
			System.out.println("Updated");
		} else {
			System.out.println("NOT Updated");

		}
		c.close();

	}

	public void getAlldata() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:1320/school", "root", "root");
		PreparedStatement ps = c.prepareStatement("select * from student");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getInt(1) + "    " + rs.getString(2) + "    " + rs.getString(3));
		}
	}

	public void getSingleData()throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:1320/school", "root", "root");
		PreparedStatement ps = c.prepareStatement("select * from student where id = ?");
		ps.setInt(1, 126);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getInt(1) + "    " + rs.getString(2) + "    " + rs.getString(3));
		
	}
}
}