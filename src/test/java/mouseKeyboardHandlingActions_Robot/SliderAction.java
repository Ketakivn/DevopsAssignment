package mouseKeyboardHandlingActions_Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderAction
{

	public static void main(String[] args)
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		
		//frame
		driver.switchTo().frame(0);
		
		WebElement ele=driver.findElement(By.className("ui-slider-handle"));
		
		Actions act=new Actions(driver);
		act.clickAndHold(ele).moveToElement(ele, 200, 0).build().perform();
		
		
		
		
		
		
		
		
		
		
		

	}

}
