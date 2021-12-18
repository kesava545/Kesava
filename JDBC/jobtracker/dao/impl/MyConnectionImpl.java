package com.sonata.jobtracker.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.sonata.jobtracker.dao.MyConnection;

/**
 * This class is used to create a connection to MySQL database.
 * @author ganesh.bm
 * 
 *
 */
public class MyConnectionImpl implements MyConnection
{

	public Connection connectToMySQL() {
		Connection con = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/portal","root","admin@123");
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

	@Override
	public Connection connectionToMySQL() {
		// TODO Auto-generated method stub
		return null;
	}

}