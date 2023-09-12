package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabase 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver") ;
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "MySQL@9566") ;
		Statement st = con.createStatement() ;
		st.execute("create database pejm17") ;
		System.out.println("Database created successfully...!!");
	}
}
