package webHandlingSolutions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTypesDemo 
{

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		
		//alert1
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		
		//alert appears
		Thread.sleep(2000);
		
		
		//alert handling
		Alert alt1=driver.switchTo().alert();
		System.out.println("Text of the alert is: "+alt1.getText());
		
		
		//ok
		alt1.accept();
		
		
		//result
		WebElement result=driver.findElement(By.id("result"));
		System.out.println("Alert result is: "+result.getText());
		

	}

}
