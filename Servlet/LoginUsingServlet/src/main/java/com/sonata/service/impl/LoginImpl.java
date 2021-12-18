package com.sonata.service.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.sonata.service.LoginInterface;


public class LoginImpl implements LoginInterface {

	@Override
	public boolean validateUser(String username, String pwd) throws SQLException {
		boolean st =false;
        try {

            //loading drivers for mysql
            Class.forName("com.mysql.cj.jdbc.Driver");

            //creating connection with the database
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","admin@123");
            PreparedStatement ps = (PreparedStatement) con.prepareStatement("select pwd from loging where username=?");
            
			
            ps.setString(1,username);
      
            ResultSet rs =(ResultSet) ps.executeQuery();
            st = rs.next();
            if( rs.getString("pwd").equals(pwd))
    			    {
    			    return true;
    			    }else
    			    {
    			    return false;
    			    }
    		
            
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return st;  
		/*MySQLConnection con  =  new  MySQLConnectionImpl();
		java.sql.Connection c = con.getConnection();
		String sql = "SELECT * FROM userdetails";
		PreparedStatement st = (PreparedStatement) c.prepareStatement(sql);
		if(username.equals(username) && pwd.equals(password)
			    {
			    return true;
			    }else
			    {
			    return false;
			    }
		return true;
		boolean  loginSuccessful = false;
		 String sql = "SELECT* FROM  Login WHERE Username=@userName AND [Password]=@password'";

		 MySQLConnection con  =  new  MySQLConnectionImpl();
		con.Parameters.Add(new SqlParameter("Name", userName));
		con.Parameters.Add(new SqlParameter("[Password]", password));
		SQLDataReader rdr = mySQL.ExecuteReader();

		if (rdr.HasrRows()) 
		   loginSuccessful = true;

		return loginSuccessful ;*/
	}

}
