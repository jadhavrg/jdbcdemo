package prepareStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class FetchDataDynamically 
{
	public static void main(String[] args) throws SQLException 
	{
		Scanner sc = new Scanner(System.in)  ;
		System.out.println("Please enter id: ");
		int id = sc.nextInt() ;
		
		Connection con = Helper.getCon() ;
		PreparedStatement ps = con.prepareStatement("select * from user where id=?") ;
		ps.setInt(1, id);
		
		ResultSet rs = ps.executeQuery() ;
		
		if (rs.next())
		{
			System.out.println("Your id: " + rs.getInt(1));
			System.out.println("Your name: " + rs.getString(2));
			System.out.println("Your email: " + rs.getString(3));
			System.out.println("Your password: " + rs.getString(4));
			System.out.println("Your mobile no. : " + rs.getLong(5));
		}
		else
		{
			System.out.println("No user found - Invalid id");
		}
	}
}
