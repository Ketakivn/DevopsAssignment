package capstoneProject;

import java.time.Duration;
import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class AdminManagement 
{
	public WebDriver driver;
	public int menuitems;
	
	//initialize
	public AdminManagement(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locators
	
	private @FindBy (xpath="//li[@class='oxd-main-menu-item-wrapper']")
		List<WebElement> menulist;
	
	private @FindBy (xpath="input[@class='oxd-input oxd-input--active'][2]")
		WebElement username;
	
	private @FindBy (xpath="//div[@class='oxd-table-body']//div[@class='oxd-table-row oxd-table-row--with-border']")
		List<WebElement> row;
		
	private @FindBy (xpath="//div[@class='oxd-table-body']//div[@class='oxd-table-row oxd-table-cell oxd-padding-cell']")
		List<WebElement> cell;
	
	private @FindBy(xpath="(//div[@role='option'])")
		List<WebElement> userOption;
	
	private @FindBy (xpath=("//div[@class='oxd-select-text--after'])[1]"))
		WebElement userroledropdown;
			
	private @FindBy (xpath="//button[@type='submit']")
		WebElement searchbtn;
	
	private @FindBy (xpath="//button[text()=' Reset ']")
		WebElement resetbtn;
	
	private @FindBy (xpath="//div[@role='option'")
		List<WebElement> statustext;
	
	private @FindBy (xpath="//div[@class=\"oxd-select-text--after\"])[2]")
		WebElement statusdropdown;
	
	
	
	
	//methods
			
	public void torefreshpage()
	{
		resetbtn.click();
	}
	
	
	public int listofMenu(String menuselection)
	{
		System.out.println("List of Menu Items : ");
		for(WebElement i:menulist)
		{
			System.out.println(i.getText());
		}
		
		for(WebElement i:menulist)
		{
			i.getText();
			if(i.getText().contains(menuselection))
					{
						System.out.println("Option Selected from menu: "+i.getText());
						i.click();
						break;
					}
		}
		
		return menuitems=menulist.size();
	}

	
	public void userRoleDropdown(String optionselect)
	{
		userroledropdown.click();
		Utility.selectBasedDropdown(userroledropdown, optionselect);
		searchbtn.click();
		System.out.println("Total number of entries : "+row.size());
		System.out.println("Total Record Found: ");
		for(int i=0; i<row.size(); i++)
		{
			for(int c=(1*6)+1; c<(6+(i*6)); c++)
			{
				System.out.println(cell.get(c).getText()+"\t");
			}
			
		}
	}	
		
	public void statusdropdown(String optionselect)	
	{
		statusdropdown.click();
		Utility.selectBasedDropdown(statusdropdown, optionselect);
		searchbtn.click();
		System.out.println("Total number of entries: "+row.size());
		System.out.println("TotalRecord Found: ");
		for(int i=0; i<row.size(); i++)
		{
			for(int c=(1*6)+1; c<(6+(i*6)); c++)
			{
				System.out.println(cell.get(c).getText()+"\t");
			}
			System.out.println();
		}
	}
		
	
	public void usernamesearchbox(String usernamesearch)	
	{
		username.sendKeys(usernamesearch);
		
		System.out.println("Total number of entries: "+row.size());
		System.out.println("TotalRecord Found: ");
		for(int i=0; i<row.size(); i++)
		{
			for(int c=(1*6)+1; c<(6+(i*6)); c++)
			{
				System.out.println(cell.get(c).getText()+"\t");
			}
			System.out.println();
		}
	}
	
}	
