package webHandlingSolutions;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling 
{

	public static void main(String[] args)
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//main page
		
		String parentId=driver.getWindowHandle();
		System.out.println(parentId);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		//child page
	
		
		Set<String> allId=driver.getWindowHandles();
		System.out.println(allId);
		
		/*
		 * Ask driver to switch based on id
		 * If id's are not same then switch
		 */
		
		for(String childId:allId)
		{
			if(!parentId.equals(childId))//
			{
				driver.switchTo().window(childId);
				//child window
				driver.findElement(By.name("EmailHomePage")).sendKeys("test@gmail.com");
				
				
				//driver.close();//child
				//driver.quit();//all windows
				
				
			}
		}
		
		//parent
		driver.switchTo().window(parentId);
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		
	}

}
