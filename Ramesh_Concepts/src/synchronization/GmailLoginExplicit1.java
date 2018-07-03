package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailLoginExplicit1 
{
	static WebDriver driver;
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\01 for testing\\selenium web drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.gmail.com");
		WebElement username = driver.findElement(By.id("identifierId"));
		username.clear();
		
		
		username.sendKeys("udaykiran.aut");
		WebElement next = driver.findElement(By.id("identifierNext"));
		next.sendKeys(Keys.ENTER);
		WebDriverWait w1 = new WebDriverWait(driver, 10);
		
		w1.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		
		
		WebElement password = driver.findElement(By.name("password"));
		
		password.sendKeys("123password123");
		driver.findElement(By.id("passwordNext")).click();
	

	}

}
