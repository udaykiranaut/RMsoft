package misc_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByClass 
{

	public static void main(String[] args) 
	{
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","E:\\01 for testing\\selenium web drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.gmail.com");
	//driver.findElement(By.id("identifierId")).sendKeys("seleniumhq");
	//driver.findElement(By.ById.id("identifierId")).sendKeys("seleniumhq2");
	WebElement ele1 = driver.findElement(By.ById.id("identifierId"));
	ele1.clear();
	ele1.sendKeys("seleniumhq3");

	}

}
