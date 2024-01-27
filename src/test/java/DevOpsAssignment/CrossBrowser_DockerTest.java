package DevOpsAssignment;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser_DockerTest
{
	WebDriver driver;
	@Parameters({"bname"})
  @Test
  public void browserTest(String bname) throws MalformedURLException, InterruptedException 
  {
	
	  if(bname.equalsIgnoreCase("chrome"))
	  {
		  ChromeOptions options=new ChromeOptions();
		  driver=new RemoteWebDriver(new URL("http://localhost:4444"),options);
		  System.out.println("Connection established with Chrome Browser");
	  }
		
	  if(bname.equalsIgnoreCase("firefox"))
	  {
		  ChromeOptions options=new ChromeOptions();
		  driver=new RemoteWebDriver(new URL("http://localhost:4444"),options);
		  System.out.println("Connection established with Firefocx Browser");
	  }
	  
		
	  if(bname.equalsIgnoreCase("edge"))
	  {
		  ChromeOptions options=new ChromeOptions();
		  driver=new RemoteWebDriver(new URL("http://localhost:4444"),options);
		  System.out.println("Connection established with Edge Browser");
	  }
	  
	  Thread.sleep(5000);
	  driver.get("https://www.amazon.in");
	  
	  Thread.sleep(3000);
	  System.out.println("Application Executing Parallelly!!");
	  
	  driver.quit();
	  
	  
	  
	  
	  
  }
}
