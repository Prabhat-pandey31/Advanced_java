package jbdc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InputDemo {
	
	
	public static void main(String[] args) throws Exception {
		
		String name1 = "prajwal";
		String email1 = "prajwal@123";
		String pass1 = "prajwal@123";
		String gender1 = "male";
		String city1 = "delhi";
		
		

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "Welcome@2024");
		PreparedStatement ps =con.prepareStatement("insert into register values(?,?,?,?,?)");
		ps.setString(1,name1);
		ps.setString(2,email1 );
		ps.setString(3, pass1);
		ps.setString(4, gender1);
		ps.setString(5, city1);
		
	    int i = ps.executeUpdate();
	    
	    if(i>0) {
	    	System.out.println("success");
	    }
	    else {
	    	System.out.println("fail");
	    }
	}

}



