package waitScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitDemo 
{
	
	
	public static WebElement waitForPresenceofElement(WebDriver driver,By loc)
	{
		WebDriverWait obj=new WebDriverWait(driver,Duration.ofSeconds(5));
		return obj.until(ExpectedConditions.presenceOfElementLocated(loc));
			
	}
	
	public WebElement waitForElementClickable(WebDriver driver,By loc)
	{
		WebDriverWait btnobj=new WebDriverWait(driver,Duration.ofSeconds(5));
		return btnobj.until(ExpectedConditions.elementToBeClickable(loc));
			
	}
	
	
	public static WebElement waitForVisibilityofElement(WebDriver driver,By loc)
	{
		WebDriverWait obj=new WebDriverWait(driver,Duration.ofSeconds(5));
		return obj.until(ExpectedConditions.visibilityOfElementLocated(loc));
			
	}
	
	public static boolean waitForUrlContains(WebDriver driver,String url)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.urlContains(url));
		
	}
	
	
	public static boolean waitForTitleContains(WebDriver driver,String title)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.titleContains(title));
		
	}
	
	
	public static void main(String[] args)
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		//By locator
		By email=By.id("input-email");
		By pass=By.name("password");
		By btn=By.xpath("//input[@value='Login']");
		
		boolean status=waitForUrlContains(driver,"login");
		if(status)
		{
			System.out.println("Url is: "+driver.getCurrentUrl());
			
			boolean title=waitForTitleContains(driver,"Account");
			System.out.println("Status is: "+driver.getTitle());
		
		//email
		WebElement ele1=waitForPresenceofElement(driver,email);
		ele1.sendKeys("test@gmail.com");
		
		//password
		waitForVisibilityofElement(driver,pass).sendKeys("test123");
		
		
		//button
		WebElement ele2=waitForPresenceofElement(driver,btn);
		ele2.click();
		
		}
		//Explicit Wait- WebDriverWait class
		/*
		 * TimeoutException: Expected condition failed:
		 * waiting for presence of element located by: By.id: input-email###
		 * (tried for 5 second(s) with 500 milliseconds interval)
		 */
		
	//	WebDriverWait obj=new WebDriverWait(driver,Duration.ofSeconds(5));
	//	WebElement ele=obj.until(ExpectedConditions.presenceOfElementLocated(email));
		
	//	ele.sendKeys("test@gmail.com");
		
	//	WebDriverWait btnobj=new WebDriverWait(driver,Duration.ofSeconds(5));
	//	btnobj.until(ExpectedConditions.elementToBeClickable(btn)).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static void waitForVisibilityOfElement() {
		// TODO Auto-generated method stub
		
	}

}
