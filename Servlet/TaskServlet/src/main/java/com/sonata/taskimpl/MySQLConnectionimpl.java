package com.sonata.taskimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.sonata.taskinterface.MySQLConnection;

public class MySQLConnectionimpl implements MySQLConnection {

	@Override
	public Connection getConnection() {
	Connection con = null;
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/task","root","admin@123");

	} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	return con;
	}
	

}
