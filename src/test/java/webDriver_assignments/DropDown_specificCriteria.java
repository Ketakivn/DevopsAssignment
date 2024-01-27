package webDriver_assignments;

import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import helper.Utility;

public class DropDown_specificCriteria
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		System.out.println("Title of the page is : "+driver.getTitle());
		
		WebElement ele=driver.findElement(By.name("url"));
		Select el=new Select(ele);
		
		System.out.println("Is dropdown supports multiple selction?"+el.isMultiple());
		el.selectByIndex(5);
		Thread.sleep(2000);
		
		el.selectByValue("search-alias=office-products");
		Thread.sleep(2000);
		
		el.selectByVisibleText("Gift Cards");
		
		List<WebElement>allOptions=el.getOptions();
		System.out.println("Totle options are: "+allOptions.size());
		
		for(WebElement i:allOptions)
		{
			System.out.println(i.getText());
			if(i.getText().contains("Headphones"))
					{
						i.click();
						break;
					}
		}

	}

}
