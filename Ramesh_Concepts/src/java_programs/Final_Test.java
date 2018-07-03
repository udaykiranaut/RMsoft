package java_programs;

final public class Final_Test 
{
	final class TestInner
	{
		
	}
	final public int a = 9000;
	final public void display()
	{
		a =8000;
	}
	 public static void main(String[] args) 
	{
		

	}

}
class test extends Final_Test
{
	public void display()
	{
		a =80000;
	}
}
