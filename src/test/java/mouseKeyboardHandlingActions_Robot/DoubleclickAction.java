package mouseKeyboardHandlingActions_Robot;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleclickAction 
{

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement btn=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		Actions act=new Actions(driver);
		act.doubleClick(btn).perform();
		
		Thread.sleep(2000);
		
		//alert
		Alert alt=driver.switchTo().alert();
		System.out.println("Alert text: "+alt.getText());
		alt.accept();
		
		
		
		
		
		
		
		
		
	}

}
