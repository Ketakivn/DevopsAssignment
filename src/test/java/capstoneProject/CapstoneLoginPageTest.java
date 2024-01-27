package capstoneProject;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjectAssignment.TestCase.BaseClass;

public class CapstoneLoginPageTest extends CapstoneBaseClass
{

	@Test(priority=1)
	  public void verifyUrl() 
	  {
		  
		  String url=lp.getUrl();
		  Assert.assertTrue(url.contains("hrmlive"),"Url is invalid");
		  System.out.println("Url is valid: "+url);
	  }
	  
	  
	  @Test(priority=2)
	  public void verifyTitle() 
	  {
		  String actTitle=lp.getAppTitle();
		  Assert.assertTrue(actTitle.contains("OrangeHRM"),"Title is not matched!");
		  System.out.println("Title is matched!");
	  }
	  
	  @Test(priority=3)
	  public void verifyLogin() 
	  {
		  lp.doLogin("Admin", "admin123");
		  Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"Login Fail");
		  System.out.println("Login Completed!");
	  }
	  
}
