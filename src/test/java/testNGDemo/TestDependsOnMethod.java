package testNGDemo;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDependsOnMethod
{
  @Test(priority=1)
  public void register() 
  {
	  System.out.println("User must be register!");
	  boolean status=false;
	  Assert.assertTrue(status);
  }
  
  @Test(priority=2,dependsOnMethods="register")
  public void login() 
  {
	  System.out.println("After registration user can login");
  }
  
  
  
  
}
