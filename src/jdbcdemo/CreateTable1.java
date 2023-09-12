package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable1 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver") ;
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pejm17", "root", "MySQL@9566") ;
		Statement st = con.createStatement() ;
		
//		st.execute("insert into student values(2, 'Amit', 22)") ;
		
		st.execute("create table employee(id int, name varchar(20), role varchar(25)") ;
	//	st.execute("insert into employee(id, name, role) values(1,'Rushi', 'Developer', 2, 'Amit', 'Developer', 3, 'Amar', 'Tester', 4, 'Vishal', 'Developer', 5, 'Durga', 'Tester', 6, 'Tanuja', 'Tester' ") ;
		System.out.println("Table is created and values are inserted..!!");
	
	}
}
