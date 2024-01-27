package capstoneProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


import DataDrivenTest.CustomData;
public class Scenario_1_Login
{
	  //@Test(dataProvider="testdata1",dataProviderClass=CustomData.class)
	
	  @Test(priority=1, dataProvider="ExcelData",dataProviderClass=CustomData.class)
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
			
			//screenshots
			
			Utility.getScreenshot(driver);
		
  }
	  
	  @Test(priority=2,dependsOnMethods="Login")
	  public void logout()
	  {
		  WebDriver driver=new ChromeDriver();
		  
		  driver.findElement(By.className("oxd-userdropdown-icon")).click();
		  
		  driver.findElement(By.linkText("Logout")).click();
		  
	  }
	  
}
