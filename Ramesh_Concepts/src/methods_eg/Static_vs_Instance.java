package methods_eg;

public class Static_vs_Instance 
{
	int a=123;
	static String course ="automation";
	public void sample1()
	{
		System.out.println(a);
		System.out.println(course);
		sample2();
	}
	public static void sample2()
	{
		System.out.println(course);
		Static_vs_Instance si1 = new Static_vs_Instance();
		System.out.println(si1.a);
		//si1.sample1();  // non static method
	}
	public static void main(String[] args) 
	{
		Static_vs_Instance si2 = new Static_vs_Instance();
		si2.sample1();
		System.out.println(si2.a);
	}
}
