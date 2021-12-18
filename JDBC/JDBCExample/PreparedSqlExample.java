package com.sonata.JDBCExample;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class PreparedSqlExample {

	public static void main(String Args[])
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","admin@123");
		   PreparedStatement ps=con.prepareStatement("SELECT * FROM student.info where id=?");
		   ps.setInt(1,2);
		   ResultSet rs=ps.executeQuery();
		   
		while(rs.next())
		{
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			
		}
			
		}catch(ClassNotFoundException e1) {System.out.println(e1);}
		catch(SQLException e2) {e2.printStackTrace();}
	}

}
