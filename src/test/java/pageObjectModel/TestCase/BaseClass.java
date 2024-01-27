package pageObjectModel.TestCase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import pageObjectModel.Pages.LoginPage;
import pageObjectModel.Pages.NewLoginPage;

public class BaseClass 
{
	public WebDriver driver;
	public LoginPage lp;
	public NewLoginPage np;
	
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		lp=new LoginPage(driver);
		//np=new NewLoginPage(driver);
		np=PageFactory.initElements(driver,NewLoginPage.class );
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	

}
