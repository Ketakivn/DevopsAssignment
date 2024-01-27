package capstoneProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureListTest
{

	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		
		//global wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		
		
		//login
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.className("orangehrm-login-button")).click();
		
		List<WebElement> list1=driver.findElements(By.xpath("(//ul)[1]//li"));
		for (WebElement i:list1)
		{
			System.out.println(i.getText());
		}

	}

}
