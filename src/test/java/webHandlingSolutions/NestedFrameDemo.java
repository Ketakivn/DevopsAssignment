package webHandlingSolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameDemo 
{

	public static void main(String[] args)
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		//top frame
		//driver.switchTo().frame("frame-top");
		//driver.switchTo().frame(0);
		
		//left
		//driver.switchTo().frame("frame-left");
		
		driver.switchTo().frame(0).switchTo().frame("frame-left");
		
		String text1=driver.findElement(By.xpath("//body[normalize-space()='LEFT']")).getText();
		System.out.println("Left Frame Text: "+text1);
		
		System.out.println("********Left Frame Source*******");
		
		System.out.println(driver.getPageSource());
		
		System.out.println("****************************");
		
		//to come back to top frame
		driver.switchTo().defaultContent();
		
		
		// left-->middle [no]
		driver.switchTo().frame(0);//top
		driver.switchTo().frame("frame-middle");
		String text2=driver.findElement(By.id("content")).getText();
		System.out.println("Middle frame text is: "+text2);
		
		System.out.println("**********************************");
		
		//to come back to top frame
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(0).switchTo().frame("frame-right");
		System.out.println("Right side page source is: ");
		System.out.println(driver.getPageSource());
		
		System.out.println("*****************************");
		
		//bottom frame
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		System.out.println("Page source for bottom frame: ");
		System.out.println(driver.getPageSource());
		
		
		
	}
}
