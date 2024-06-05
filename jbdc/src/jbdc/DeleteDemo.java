package jbdc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteDemo {
	public static void main(String[] args)throws Exception {
		
		String email = " prabhatpabdey3105@gmail.com";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "Welcome@2024");
		PreparedStatement ps =con.prepareStatement("delete from register where email=?");
		ps.setString(1, email);
		
		int i = ps.executeUpdate();
		
		if(i>0) {
			System.out.println("deleted successfully");
		}
		else {
			System.out.println("failed");
		}
	}

}
