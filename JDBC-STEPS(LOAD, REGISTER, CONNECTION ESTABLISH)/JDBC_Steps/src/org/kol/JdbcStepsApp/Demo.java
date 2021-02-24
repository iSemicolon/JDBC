package org.kol.JdbcStepsApp;

import java.sql.*;

public class Demo {

	public static void main(String[] args) {
		
		Connection con=null;
		Statement stmt=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("SucessFully Load And Registered");
			
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			System.out.println("SucessFully Connection Established");
			
			stmt=con.createStatement();
			System.out.println("Sucessfully Statement Created");
			
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
		finally {
			
			if(stmt!=null)
			{
				try {
					stmt.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
			
			if(con!=null)
			{
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
		}
	}

}
