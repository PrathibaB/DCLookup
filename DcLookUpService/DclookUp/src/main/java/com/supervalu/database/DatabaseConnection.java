package com.supervalu.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
	public Connection connectToDatabase() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/distcenters", "root", "Ultimatix@95");
		} catch (ClassNotFoundException e) {
			System.out.println("class not found");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("error connecting to DB");
			e.printStackTrace();
		}
		return conn;
	}

	public ResultSet retrieveUsingId(String id) {
		Connection conn = connectToDatabase();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			String query = "Select * from dcdetails where locid='" + id + "'";
			rs = stmt.executeQuery(query);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}

	public ResultSet retrieveUsingName(String dcName) {

		Connection conn = connectToDatabase();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			String query = "Select * from dcdetails where locname like '%" + dcName + "%'";
			rs = stmt.executeQuery(query);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rs;

	}

	public ResultSet retrieveAddress(String id) {

		Connection conn = connectToDatabase();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			String query = "Select * from address where locid='" + id + "'";
			rs = stmt.executeQuery(query);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rs;

	}

}
