package testNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDemo3_Priority 
{
  @Test(priority=1,description="This is first test case")
  public void registerTest()
  {
	  System.out.println("THis is register test");
  }
  
 
  
  
   @Test(priority=2,description="This is second test case")
  public void loginTest()
  {
  	 System.out.println("THis is login test");
  }
    
  
   
   @Test(priority=3,description="This is third test case")
   public void searchProductTest()
  {
    System.out.println("THis is Search Product test");
  }
      
      
   
   @Test(priority=4,description="This is my fouth test case")
   public void addToCartTest()
   {
     	System.out.println("THis is Add to Cart  test");
   }
}
