package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable 
{
	public static void main(String[] args) throws SQLException 
	{
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pejm17", "root", "MySQL@9566") ;
		Statement st = con.createStatement() ;
		st.execute("create table student(id int, name varchar(20), age int)") ;
		System.out.println("Database created successfully..!!");
	}
}