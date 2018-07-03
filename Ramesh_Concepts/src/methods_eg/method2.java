package methods_eg;

public class method2 
{
	int a=90,b=100;
	static String name = "selenium";
	public void add()
	{
		int sum = a+b;
		System.out.println(sum);
		System.out.println(name);
	}
	public int sub()
	{
		int sub = b-a;
		return sub;
	}
	public static void hello()
	{
		System.out.println(name);
		//System.out.println(a);// we can not access non static variable in static block directly.
		method2 m1 = new method2();
		System.out.println(m1.b);// by creating object we can access non static variable in static block.
		
	}
	
	public static void main(String[] args) 
	{
	method2 s1 = new method2();
	s1.add();
	System.out.println("-------");
	System.out.println(s1.sub());
	System.out.println("-------");
	//System.out.println(s1.add()); // no return type for add().
	System.out.println("-----1--direct access");
	//directly we can access  statics variable and methods
	System.out.println(name);
	hello();
	System.out.println("-----2--through class name");
	method2.hello();
	System.out.println(method2.name);
	System.out.println("-----3--using object");
	System.out.println(s1.name);
	s1.hello();
	 
	}
}
