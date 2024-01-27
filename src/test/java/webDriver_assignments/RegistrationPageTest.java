package webDriver_assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import helper.Utility;

public class RegistrationPageTest
{
  @Test
  public void facebookRegistration()
  
  {
	  
	  //Q:Implement a test case using WebDriver to validate the functionality of a registration.

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.linkText("Create new account")).click();
		
	    //firstname
		
		driver.findElement(By.name("firstname")).sendKeys("admin");
		
		//surname
		
		driver.findElement(By.name("lastname")).sendKeys("surname");
		
		//mobile number or email address
		
		driver.findElement(By.name("reg_email__")).sendKeys("admin1233@gmail.com");
		
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("admin1233@gmail.com");
		
		//password
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("surname@12");
		
		//dropdown
		
		WebElement dayele=driver.findElement(By.id("day"));
		Utility.selectBasedDropdown(dayele,"28");
		
			
		//month dropdown
		WebElement monele=driver.findElement(By.id("month"));
		Utility.selectBasedDropdown(monele,"May");
				
		//year dropdown
		WebElement yearele=driver.findElement(By.id("year"));
		Utility.selectBasedDropdown(yearele,"2012");
				
		//gender
			
		//driver.findElement(By.xpath("(//input[@type='radio'])]2]")).click();
        List<WebElement> gender=driver.findElements(By.xpath("//span[@class='_5k_3']"));
		
		for(WebElement i:gender)
		{
			if(!i.isSelected())//element which is not selected do click-yes
			{
				i.click();
				
			}
		}
		
		//SignUps
		
		driver.findElement(By.name("websubmit")).click();
		
		
		
  }
}
