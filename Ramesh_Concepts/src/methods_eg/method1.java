package methods_eg;

public class method1 
{
	int a=90,b=100;
	public void add()
	{
		int sum = a+b;
		System.out.println(sum);
	}
	public int sub()
	{
		int sub = b-a;
		return sub;
	}
	
	public static void main(String[] args) 
	{
	method1 s1 = new method1();
	s1.add();
	System.out.println(s1.sub());
	//System.out.println(s1.add()); // no return type for add()
	}

}
