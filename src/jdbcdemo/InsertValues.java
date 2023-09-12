package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertValues 
{
	public static void main(String[] args) throws SQLException 
	{
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pejm17", "root", "MySQL@9566") ;
		Statement st = con.createStatement() ;
		st.execute("insert into student values(1, 'Rushi', 22)") ;
		st.execute("insert into student values(2, 'Amit', 22)") ;
		st.execute("insert into student values(3, 'Vishal', 21)") ;
		st.execute("insert into student values(4, 'Amar', 28)") ;
		System.out.println("Values are inserted successfully..!");
	}
}
