package misc_selenium;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Control_A 
{
	public static void main(String[] args) 
	{
		WebDriver driver;
		//System.setProperty("webdriver.chrome.driver", "E:\\01 for testing\\selenium web drivers\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "E:\\01 for testing\\selenium web drivers\\geckodriver\\geckodriver10.exe");
		//driver = new ChromeDriver();
		driver = new FirefoxDriver();
		driver.get("http://127.0.0.1:8091/sugarcrm/index.php?action=Login&module=Users");
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.chord(Keys.CONTROL,"t")).build().perform();
		actions.sendKeys(Keys.chord(Keys.CONTROL,"h")).build().perform();
		actions.sendKeys(Keys.chord(Keys.CONTROL,Keys.SHIFT,"a")).build().perform();	
	}
}
