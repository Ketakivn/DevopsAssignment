package parallel_crossBrowserTest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Class2 
{
	 @Test 
	  public void FirefoxTest() 
	  {
		 WebDriver driver=new FirefoxDriver(); 
		 driver.get("https://www.facebook.com");
		 System.out.println("Title is: "+driver.getTitle());
	  }
}
