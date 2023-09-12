package prepareStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertValuesDynamically 
{
	public static void main(String[] args) throws SQLException  
	{
		Connection con = Helper.getCon() ;
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter your id: ");
		int id = sc.nextInt() ;
		
		System.out.println("Enter your name: ");
		String name = sc.next() ;
		
		System.out.println("Enter your age: ");
		int age = sc.nextInt() ;
		
		PreparedStatement ps = con.prepareStatement("insert into student(id,name,age) values(?,?,?) ") ;
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setInt(3, age) ;
		
		ps.execute() ;
		System.out.println("Data is inserted Successfully");
	}
}
