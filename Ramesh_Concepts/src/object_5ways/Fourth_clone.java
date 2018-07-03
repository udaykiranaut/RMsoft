package object_5ways;

public class Fourth_clone implements Cloneable
{
	int a=10,b=20;
	public Fourth_clone()
	{
		System.out.println("clone default constructor");
	}
	public void display()
	{
		System.out.println("fourth approch clone()");
		System.out.println(a+ "," +b);
	}

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Fourth_clone fc = new Fourth_clone();
		Fourth_clone cc1= (Fourth_clone)fc.clone();
		cc1.display();
		cc1.a=1000;
		cc1.b=2000;
		cc1.display();

	}

}
