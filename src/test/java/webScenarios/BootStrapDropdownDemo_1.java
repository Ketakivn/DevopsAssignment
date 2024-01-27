package webScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropdownDemo_1
{
	public static void main(String[] args)
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");
		
		//dd
		driver.findElement(By.id("menu1")).click();
		
		List<WebElement> list1=driver.findElements(By.xpath("//ul[@aria-labelledby='menu1']//li//a"));
		
		System.out.println("Total options are: "+list1.size());
		
		for(WebElement i:list1)
		{
			System.out.println(i.getText());
		}
		
		
		
		
		
		
		
		
	}
}