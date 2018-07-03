package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickableActions
{

	public static void main(String[] args) 
	{
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "E:\\01 for testing\\selenium web drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://www.gmail.com");
	driver.findElement(By.id("identifierId")).sendKeys("selenium");
	WebElement next = driver.findElement(By.id("identifierNext"));
	//driver.findElement(By.xpath("//span[text()='Next']")).click();
	Actions act1 = new Actions(driver);
	//act1.click(next).build().perform();
	//act1.click(next).build().perform();
	//act1.sendKeys(next, Keys.ENTER).build().perform();
	//act1.clickAndHold(next).build().perform();
	//act1.moveToElement(next).sendKeys(Keys.ENTER).build().perform();
	act1.moveToElement(next).click().build().perform();
	}

}
