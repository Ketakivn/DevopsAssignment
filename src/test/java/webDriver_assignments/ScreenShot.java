package webDriver_assignments;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class ScreenShot
{
  @Test
  public void screenShotTest() throws IOException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://www.amazon.in");
	  
	  //Create a object to take screen shot
	  TakesScreenshot ts=(TakesScreenshot) driver;
	  
	//take screenshot --->temp file
	  File temp=ts.getScreenshotAs(OutputType.FILE);
	  
	  //location
	  File dest=new File("./"+"\\Screenshots\\amazon1.png");
	  
	  //from temp loc --->expected location
	  FileHandler.copy(temp, dest);
	  
	  
  }
}
