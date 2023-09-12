package prepareStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteDataDynamiclly 
{
	public static void main(String[] args) throws SQLException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter id: ");
		int id = sc.nextInt() ;
		
		Connection con = Helper.getCon() ;
		PreparedStatement ps = con.prepareStatement("select * from user where id=?") ;
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery() ;

		PreparedStatement ps1 = con.prepareStatement("delete from user where id=?") ;
		ps1.setInt(1, id) ;
				
		if (rs.next()) 
		{
			ps1.executeUpdate() ;
			System.out.println("Data is deleted successfully...!!");
		}
		else
		{
			System.out.println("No user found - Invalid id");
		}
		
	}
}
