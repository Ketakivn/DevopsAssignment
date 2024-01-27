package capstoneProject;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility
{


	public static void getScreenshot(WebDriver driver)
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		  File temp=ts.getScreenshotAs(OutputType.FILE);
		  
		  //location
		  File dest=new File("./"+"\\Screenshots\\capstoneProject.png");
		  
		  try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
	}

	
	
	
	
	//Select based dropdown
	
	
public static void selectBasedDropdown(WebElement ele,String value)
	
	{
	Select dd=new Select(ele);
	
	System.out.println("Is dropdown support multiple selection: "+dd.isMultiple());
	
	List<WebElement> allOptions=dd.getOptions();
	
	System.out.println("Total Otions are: "+allOptions.size());
	
	for(WebElement i:allOptions)
	{
		System.out.println(i.getText());
		if(i.getText().contains(value))
		{
			i.click();
			break;
		}
	}

	}
	
}
