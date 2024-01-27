package pageObjectAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage_1
{

private WebDriver driver;
	
	//initialize driver
	
	public LoginPage_1(WebDriver driver)//baseclass driver
	{
		this.driver=driver;
	}
	
	//locators
	private By un=By.name("username");
	
	private By psw=By.name("password");
	
	private By loginbtn=By.xpath("//button[@type='submit']");
	
	
	
	
	//public Methods
	
	public void doLogin(String username, String password)
	{
		driver.findElement(un).sendKeys(username);
		driver.findElement(psw).sendKeys(password);
		driver.findElement(loginbtn).click();
		
	}
	
	public String getUrl()
	
	{
		return driver.getCurrentUrl();
	}
	
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	
	
	

}
