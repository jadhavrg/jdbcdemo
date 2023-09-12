package jdbcdemo;

public class PP 
{
	public static void main(String[] args) 
	{
		String s1 = new String("Rushi") ;
		System.out.println(s1.hashCode());
		
		String s2 = "Rushi" ;
		System.out.println(s2.hashCode());
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String s3 = new String("Jadhav") ;
		String s4 = new String("Jadhav") ;
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		String s5 = "Rushi" ;
		System.out.println(s5.hashCode());
		System.out.println(s2==s5);
	}
}
