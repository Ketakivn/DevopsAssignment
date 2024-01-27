package testNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDisableFromExecution 
{
  @Test
  public void teatCase1() 
  {
	  System.out.println("This is test case 1");
  }
  
  
  @Test
  public void teatCase2() 
  {
	  System.out.println("This is test case 2");
  }
  
  
  @Test(enabled=false)
  public void teatCase3() 
  {
	  System.out.println("This is test case 3");
  }
  
  @Test
  public void testCase4()
  {
	  System.out.println("This is test case 4");
  }
  
  
  
}
