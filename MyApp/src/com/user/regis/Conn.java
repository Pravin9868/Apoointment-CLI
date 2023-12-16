package com.user.regis;
import java.sql.*;  
import com.mysql.cj.jdbc.Driver;

public class Conn {
   public static void main(String[] args) {
	   try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myapp","root","root");	 
			System.out.println("!!!!!!Connection Established Successfully!!!!!!!");      
	   }
			catch(Exception e) {
				System.out.println("Exception you got is:-"+e);
			}
}
	
}
