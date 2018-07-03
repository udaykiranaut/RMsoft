package constructors_eg;

class Employee2
{
	String name;
	int a;
	public Employee2()
	{
		System.out.println("default constructor");
	}
	public Employee2(int c)
	{
		System.out.println("int parameter");
	}
	public Employee2(String name,int a)
	{
	this.name = name;
	this.a=a;
	//this.dispaly();
	}
	public void dispaly()
	{
		System.out.println(name+"-----"+a);
	}
	
}
	public class Constructor_Ol
	{
	    public static void main(String[] args) {
		Employee e1 = new Employee("krishna",1);
		e1.dispaly();
		Employee e2 = new Employee("selenium", 2);
		e2.dispaly();
		Employee2 e3 = new Employee2();
		Employee2 e4 = new Employee2(11);
		Employee2 e5 = new Employee2('a');
		
	}
}


