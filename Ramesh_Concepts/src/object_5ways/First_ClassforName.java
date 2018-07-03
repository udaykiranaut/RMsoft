package object_5ways;

class FirstObject1
{
	public FirstObject1()
	{
		System.out.println("default constructor");
	}
	public void display()
	{
		System.out.println("first way to create an object , with newInstance of Class.class");
	}
}
public class First_ClassforName 
{
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException 
	{
		FirstObject1 firsto1=(FirstObject1)Class.forName("object_5ways.FirstObject1").newInstance();
		firsto1.display();
	}
	

}
