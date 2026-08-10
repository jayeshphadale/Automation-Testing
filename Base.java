package Demo.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base
{
	WebDriver driver;

	public WebDriver launchBrowser(String URL, String BrowserName)
	{
		if (BrowserName.contains("Chrome"))
		{
			driver = new ChromeDriver();
			driver.get(URL);
			driver.manage().window().maximize();
			return driver;
		}
		else
		{
			driver = new FirefoxDriver();
			driver.get(URL);
			driver.manage().window().maximize();
			return driver;
		}
	}
}