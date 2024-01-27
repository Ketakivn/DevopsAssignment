package testNGDemo;

import org.testng.annotations.*;


public class AnnotationDemo 
{
  @Test(priority=1)
  public void registerTest() 
  {
	  System.out.println("This is Register Test!");
  }
  
  
  
  @Test(priority=2)
  public void LoginTest() 
  {
	  System.out.println("This is Login Test!");
  }

  

  @Test(priority=3)
  public void LogoutTest() 
  {
	  System.out.println("This is Logout Test!");
  }

  
  
  //Annotations
  @BeforeMethod
  public void bMethod()
  {
	  System.out.println("BeforeMethod executes before every test case!");
  }
  
  @AfterMethod
  public void aMethod()
  {
	  System.out.println("AfterMethod will execute after test case!");
  }
  
  @BeforeClass
  public void bClass()
  {
	  System.out.println("BeforeClass executes before only first test case!");
  }
  
  @AfterClass
  public void aClass()
  {
	  System.out.println("AfterClass executees after only last test case!");
  }
  
  @BeforeTest
  public void bTest()
  {
	  System.out.println("BeforeTest will run before class/all classes!");
  }
  
  
  @AfterTest
  public void aTest()
  {
	  System.out.println("BeforeTest will run after class/all classes!");
  }
  
  
  @BeforeSuite
  public void bSuite()
  {
	  System.out.println("BeforeSuite will run before test!");
  }
  
  
  @BeforeSuite
  public void aSuite()
  {
	  System.out.println("AfterSuite will run after test!");
  }
   
  
  
}
