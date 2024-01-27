package DataDrivenTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HrmDataDrivenTest 
{
   //@Test(dataProvider="testdata1",dataProviderClass=CustomData.class)
  @Test(dataProvider="ExcelData",dataProviderClass=CustomData.class)
  public void loginTest(String un,String psw) 
  {
	//create a driver
		WebDriver driver=new ChromeDriver();
		
		//global wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		
		
		//login
		
		driver.findElement(By.name("username")).sendKeys(un);
		
		driver.findElement(By.name("password")).sendKeys(psw);
		
		driver.findElement(By.className("orangehrm-login-button")).click();
		
		
		//Validation

		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"Login Failed!");
		System.out.println("Login Completed!");
	


	  
	  
  }
}
