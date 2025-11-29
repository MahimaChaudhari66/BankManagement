package com.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection 
{
	private static Connection conn;//Has a RealtionShip
	public static Connection getConnection() 
	{
		try {
			 try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			}
			 catch (ClassNotFoundException e)
			 {	
				e.printStackTrace();
			}
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL21","system","mahima");
			System.out.println(conn+" ");
		} 
		catch (SQLException e) 
		{		
			e.printStackTrace();
		}
		return conn;
		
	}

}
