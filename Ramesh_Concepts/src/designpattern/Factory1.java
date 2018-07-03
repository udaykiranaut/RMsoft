package designpattern;

interface Course
{
	void course();
}
class JavaCourse implements Course
{

	@Override
	public void course() 
	{
	System.out.println("java---course");
		
	}
}
class SeleniumCourses implements Course
{

	@Override
	public void course() 
	{
	System.out.println("SeleniumCourse");
	}
}

class WebServicesCourse implements Course 	
{
	@Override
	public void course() 
	{
	System.out.println("webservicescourse");		
	}
}

class FactoryDesign
{
	// factory method to get the object
	public static Course getCourse(String type)
	{
		if(type.equalsIgnoreCase("javacourse"))
		{
			return new JavaCourse();
		}else if(type.equalsIgnoreCase("seleniumcourse"))
		{
			return new SeleniumCourses();
		}else
		{
			return new WebServicesCourse();
		}
	}
		
}
public class Factory1 
{
	public static void main(String[] args) 
	{
		JavaCourse jc1=(JavaCourse)FactoryDesign.getCourse("javacourse");
		jc1.course();
		SeleniumCourses jc2 = (SeleniumCourses)FactoryDesign.getCourse("SeleniumCourse");
		jc2.course();
		WebServicesCourse jc3 = (WebServicesCourse)FactoryDesign.getCourse("webservices");
		jc3.course();
	}
}
