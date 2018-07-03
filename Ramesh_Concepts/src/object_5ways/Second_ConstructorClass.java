package object_5ways;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Second_ConstructorClass 
{
	public Second_ConstructorClass()
	{
		System.out.println("default constructor");
	}
	public void display()
	{
		System.out.println("method : newInstance() of constructor class");
	}
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException 
	{
	Constructor c1	= Second_ConstructorClass.class.getConstructor();//1
	Second_ConstructorClass o1 = (Second_ConstructorClass)c1.newInstance();
	o1.display();
	Constructor<Second_ConstructorClass> c2 = Second_ConstructorClass.class.getConstructor();//2 using generic no need to type cast
	Second_ConstructorClass o2 = c2.newInstance();
	o2.display();
	}
}
