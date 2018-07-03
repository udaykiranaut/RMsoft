package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLoginImplicit1 
{
	static WebDriver driver;
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\01 for testing\\selenium web drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		
		driver.manage().timeouts().setScriptTimeout(110, TimeUnit.SECONDS);
		
		driver.get("https://www.gmail.com");
		WebElement username = driver.findElement(By.id("identifierId"));
		username.clear();
		username.sendKeys("udaykiran.aut");
		WebElement next = driver.findElement(By.id("identifierNext"));
		next.sendKeys(Keys.ENTER);
		WebElement password = driver.findElement(By.name("password"));
		
		password.sendKeys("123password123");
		driver.findElement(By.id("passwordNext")).click();
		
		
	}

}
