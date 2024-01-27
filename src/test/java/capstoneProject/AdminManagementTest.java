package capstoneProject;

import org.testng.annotations.Test;

public class AdminManagementTest extends CapstoneBaseClass
{
	
  @Test(priority=1)
  public void login()
  {
	  lp.doLogin("Admin", "admin123");
  }
  
  @Test(priority=2)
  public void verifymenu() 
  {
	 System.out.println("Verification of number of items in Menu list");
	 int itemnumber=adm.listofMenu("Admin");
  }
  
  @Test(priority=3)
  public void testSearchwithUsername() 
  {
	  adm.usernamesearchbox("Admin");
	
  }
  
  @Test(priority=4)
  public void searchWithUserrole()  
  {
	  
	  adm.statusdropdown("Admin");
  }
  
  @Test(priority=5)
  public void searchWithUserStatus()
  {
	  adm.statusdropdown("Enabled");
	  
  }
  
  
  
}
