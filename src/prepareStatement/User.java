package prepareStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class User 
{
	public static void main(String[] args) throws SQLException 
	{
		Connection con = Helper.getCon() ;
		Statement st = con.createStatement() ;
		//st.execute("create table user(id int, name varchar(20), email varchar(30), password varchar(20), mobile long)") ;
		//System.out.println("Table is created ");
		PreparedStatement ps = con.prepareStatement("insert into user(id,name,email,password,mobile) values(?,?,?,?,?)") ;
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Please enter your id: ");
		int id = sc.nextInt() ;
		System.out.println("Please enter your name: ");
		String name = sc.next() ;
		System.out.println("Please enter your Email: ");
		String email = sc.next() ;
		System.out.println("Please enter your password: ");
		String password = sc.next() ;
		System.out.println("Please enter your mobile no. :");
		long mobile = sc.nextLong() ;
		
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, email);
		ps.setString(4, password);
		ps.setLong(5, mobile);
		
		ps.execute() ;
		System.out.println("Data is inserted Sussesfully...!!");
				
	}
}
