package java_programs;

public class Static_Test 
{
	static class Static_Inner
	{
		
	}
	static int a =9000;
	static public void display()
	{
		a =8000;
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		Static_Test st = new Static_Test();
		st.display();
		
	}

}
class Test extends Static_Test
{
	public void display()
	{
		
	}
	public static void main(String[] args) 
	{
		
	}
}
