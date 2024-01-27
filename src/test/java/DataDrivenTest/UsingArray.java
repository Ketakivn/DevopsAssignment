package DataDrivenTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UsingArray 
{
	//@DataProvider(name="testdata1")
	//public Object[][] testData() 
	//{
	//	Object data[][]= {{"Admin","admin123"},{"Sarang","test123"},{"Priya","pri123"},{"Pooja","poo123"}};
	//	return data;
	//}
	
	
  @Test(dataProvider="testdata1",dataProviderClass=CustomData.class)
  public void loinTest(String un,String psw) 
  {
	  System.out.println("User name is : "+un);
	  System.out.println("Password is : "+psw);
  }
  
  
}
