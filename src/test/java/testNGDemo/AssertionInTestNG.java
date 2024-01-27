package testNGDemo;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionInTestNG
{
  @Test(priority=1)
  public void hardAssertion()
  {
	  String act="Selenium WebDriver Test is WebUI Automation liabrary";
	  
	  String exp= ("WebUI Test");
	  
	  //assertionEquals()
	 // Assert.assertEquals(act, exp,"Fail: Strings are not equal");
	 // System.out.println("Pass: Strings are equal");
	  
	  
	  //assertTrue
	 // Assert.assertTrue(act.contains(exp),"Fail: Actual string doesn't match ");
	  //System.out.println("Actual string contains WebUI");
	  
	  
	 //assertFalse()
	  Assert.assertFalse(act.contains(exp),"Fail : Actual string contains WebUI Test");
	  System.out.println("Pass : Actual string not contains WebUI Test");
	  System.out.println("Hard Assertion is completed!");
	  
  }
  
  @Test(priority=2)
  public void SoftAssertionTest()
  {
	  
	  SoftAssert sf=new SoftAssert();
	  
	  int a=100,b=200;
	  
	  //AssertEquals
	 //sf.assertEquals(a, b,"Fail: Number are not equals");
	 //System.out.println(" Pass: Numbers are equals");
	 //System.out.println("This is Soft assertion test case!");
	  
	  
	  
	  //sf.assertTrue(a==b,"Fail: Number are not equals");
	  //System.out.println(" Pass: Numbers are equals");
	  //System.out.println("This is Soft assertion test case!");
		  
	  Assert.assertFalse(a==b,"Fail: Number are not equals");
	  System.out.println(" Pass: Numbers are equals");
	  System.out.println("This is Soft assertion test case!");
	  


	  sf.assertAll();
	  
	  
  }
  
}
