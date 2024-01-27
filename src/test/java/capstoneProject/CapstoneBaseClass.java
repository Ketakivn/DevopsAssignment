package capstoneProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pageObjectAssignment.LoginPage_1;

public class CapstoneBaseClass
{

	public WebDriver driver;
	public CapstoneLoginPage lp;
	public AdminManagement adm;
	
	
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		lp=new CapstoneLoginPage(driver);
		adm=new AdminManagement(driver);
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
