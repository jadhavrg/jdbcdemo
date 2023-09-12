package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentDriver 
{
	public static void main(String[] args) throws SQLException 
	{
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pejm17", "root", "MySQL@9566") ;
		Statement st = con.createStatement() ;
		System.out.println("1.save student 2. view student 3. delete student 4. update student ");
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the values: ");
		int ch = sc.nextInt() ;
		
		switch (ch) 
		{
		case 1 :
		{
			st.execute("insert into student values(5, 'Shubham', 20)") ;
			System.out.println("Data inserted.");
			break;
		}
		case 2:
		{
			st.execute("select * from student where id=5") ;
			System.out.println("Viewed");
			break;
		}
		
		case 3:
		{
			st.execute("delete from student where id=5") ;
			System.out.println("deleted");
			break;
		}
		
		case 4:
		{
			st.execute("update student set age='21' where id=5") ;
			System.out.println("Updated");
			break;
		}
		default:
			System.out.println("Please enter a value input....!!!");
		}
		
	}
}
