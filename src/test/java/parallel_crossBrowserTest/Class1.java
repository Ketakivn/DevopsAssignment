package parallel_crossBrowserTest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Class1 
{
	 @Test 
	 public void ChromeTest() 
	  {
		 WebDriver driver=new ChromeDriver(); 
		 driver.get("https://www.google.com");
		 System.out.println("Title is: "+driver.getTitle());
	  }
	  
	  
	 
	  
	
	
	
}
