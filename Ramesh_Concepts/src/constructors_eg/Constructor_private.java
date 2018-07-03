package constructors_eg;

public class Constructor_private 
{
	private Constructor_private() //public
	{
		System.out.println("private constructor1");
	}
	public static void main(String[] args) 
	{
		Constructor_private ep1 = new Constructor_private();
	}
}

class TestDemo
{
	public static void main(String[] args)
	{
		Constructor_private ep2 = new Constructor_private();	
		
	}
}