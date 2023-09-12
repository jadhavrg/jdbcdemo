package prepareStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Helper 
{
	public static Connection getCon() throws SQLException
	{
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pejm17", "root", "MySQL@9566") ;
		return con ;
	}
}
