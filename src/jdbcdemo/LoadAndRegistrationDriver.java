package jdbcdemo;

public class LoadAndRegistrationDriver 
{
	public static void main(String[] args) throws ClassNotFoundException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		System.out.println("Driver Registration Successfully..!!");
	}
}
