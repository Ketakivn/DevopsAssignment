package webScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableAutomation 
{

	public static void main(String[] args)
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/customers.html?email-name=test%40gmail.com&password-name=test123&submit-name=");
			
		System.out.println("***********All Headings***********");
		
		List<WebElement> heading=driver.findElements(By.xpath("//thead//tr//th"));
		
		System.out.println("Total headings are: "+heading.size());
		
		for(WebElement i:heading)
		{
			System.out.println(i.getText());
		}
		
		System.out.println("***********Total Rows***********");
		
		int rows=driver.findElements(By.xpath("//tbody//tr")).size();
		System.out.println("Total rows are: "+rows);
		
		
		System.out.println("***********Total cells***********");
		
		int cells=driver.findElements(By.xpath("//tbody//tr[1]//td")).size();
		System.out.println("TOtal cells are: "+cells);
		
		System.out.println("***********Print Row 4***********");
		
		String text1=driver.findElement(By.xpath("//tbody//tr[4]")).getText();
		System.out.println(text1);
		
		System.out.println("***********Print First Coloumn***********");
		
		List<WebElement> cell=driver.findElements(By.xpath("//tbody//tr//td[2]"));
		
		for(WebElement i:cell)
		{
			System.out.println(i.getText());
		}
		
		System.out.println("***********Complete Table Data***********");
		
		List<WebElement> list2=driver.findElements(By.xpath("//tbody//tr//td"));
		//System.out.println(list2);
		
		for(WebElement i:list2)
		{
			System.out.println(i.getText());
		}

		
		
		
	}

}
