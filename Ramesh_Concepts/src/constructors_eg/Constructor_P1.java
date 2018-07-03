package constructors_eg;

class Employee
{
	String name;
	int a;
public Employee(String name,int a)
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
public class Constructor_P1
{
	public static void main(String[] args) {
		Employee e1 = new Employee("krishna",1);
		e1.dispaly();
		Employee e2 = new Employee("selenium", 2);
		e2.dispaly();
	
		
	}
	
	
}
