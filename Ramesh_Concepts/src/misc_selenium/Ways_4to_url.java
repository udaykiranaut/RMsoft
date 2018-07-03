package misc_selenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ways_4to_url
{

	public static void main(String[] args) throws MalformedURLException 
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\01 for testing\\selenium web drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		// 1 using get()---WebDriver(I)
		//driver.get("http://127.0.0.1:8091/sugarcrm/index.php?action=Login&module=Users");
		// 2 using navigate.to
		//driver.navigate().to("http://127.0.0.1:8091/sugarcrm/index.php?action=Login&module=Users");
		// 3 using to.(new URL(""))
		driver.navigate().to(new URL("http://127.0.0.1:8091/sugarcrm/index.php?action=Login&module=Users"));
		// 4 using javaScript executor
		
		

	}

}
