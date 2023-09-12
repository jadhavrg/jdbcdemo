package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDatabase 
{
	public static void main(String[] args) throws SQLException 
	{
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pejm17", "root", "MySQL@9566") ;
		Statement st = con.createStatement() ;
		st.execute("delete from student where id = 5") ;
		System.out.println("Database deleted successfully");
				
	}
}
