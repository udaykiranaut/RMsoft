package object_5ways;

class Fifthobj
{
	String name;
	int id;
	public Fifthobj(String name,int id)
	{
		System.out.println("default constructor");
		System.out.println(name);
		System.out.println(id);
	}
	public void display()
	{
		System.out.println(name);
		System.out.println(id);
	}
	
}
public class Fifth_serializable 
{

	public static void main(String[] args) 
	{
		Fifthobj fo = new Fifthobj("uk",94);
		fo.display();
		

	}

}
