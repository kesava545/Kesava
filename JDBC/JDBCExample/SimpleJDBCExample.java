package com.sonata.JDBCExample;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;


public class SimpleJDBCExample {
	public static void main(String Args[])
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","admin@123");
		   Statement st=con.createStatement();
		   ResultSet rs=st.executeQuery("SELECT * FROM student.info");
		   
		while(rs.next())
		{
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			
		}
			
		}catch(Exception e) 
		{
			System.out.println(e);
			
		}
	}

}
