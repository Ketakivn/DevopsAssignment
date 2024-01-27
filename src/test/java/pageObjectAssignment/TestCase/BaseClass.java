package pageObjectAssignment.TestCase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pageObjectAssignment.LoginPage_1;


public class BaseClass 
{

	public WebDriver driver;
	public LoginPage_1 lp;
	
	
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		lp=new LoginPage_1(driver);
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
