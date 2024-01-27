package webDriver_assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateWebsite
{

	//Q.Write a WebDriver script to navigate to s website and click on a specific link
	
	public static void main(String[] args)
	{
		//Create a session
				WebDriver driver=new ChromeDriver();

				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				driver.get("https://www.google.com");
				
				
				//google----> facebook
				
				driver.navigate().to("https://www.facebook.com");
				
				System.out.println("Title: "+driver.getTitle());
				
				driver.findElement(By.linkText("Create new account")).click();
				

	}

}
