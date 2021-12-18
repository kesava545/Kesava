package com.sonata.JDBCExample;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

	public class InsertPrepareExample {
		public static void main(String args[]){
			try
			{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection
					("jdbc:mysql://localhost:3306/employee","root", "admin@123");
			PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?)");
			ps.setInt(1, 11);
			ps.setString(2, "Swamy");
			ps.setDouble(3, 350000.0);
			int a = ps.executeUpdate();
			ps.setInt(1, 10);
			ps.setString(2, "shyamu");
			ps.setDouble(3, 30000);
			int a1 = ps.executeUpdate();
			System.out.println("the number of records updated are" + a1);
			}catch(ClassNotFoundException e1) {System.out.println(e1);}
			catch(SQLException e2) {e2.printStackTrace();}
		}
	}

