package testCases;

import java.time.Duration;


//import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
public WebDriver driver;

	
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		
		driver.get("https://www.calculator.net/carbohydrate-calculator.html");
		driver.manage().window().maximize();
		System.out.println("Launched Carbohydrate Calculator site");
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
		System.out.println("Browser closed successfully");
	}
	
	
}
