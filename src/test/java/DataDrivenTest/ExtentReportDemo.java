package DataDrivenTest;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportDemo 
{
  @Test
  public void reportTest() 
  {
	  
	  //create ExtentReport instance
	  ExtentReports extent = new ExtentReports();
	  
	  //Using reporter we can add path
	  ExtentSparkReporter spark = new ExtentSparkReporter("Reports/Automation.html");
	  
	  //setup any configuration
	  spark.config().setDocumentTitle("Sprint1 Title");
	  spark.config().setReportName("Automation Testing Report");
	  spark.config().setTheme(Theme.DARK);
	  
	  //attached the reports
	  extent.attachReporter(spark);
	  
	  //Create a test- ExtentTest
	  ExtentTest test=extent.createTest("Test1");
	  
	  //logs
	  test.pass("Test case is pass!");
	  test.fail("Test case is fail!");
	  test.info("Test is in progress!");
	  test.skip("Test case is skipped!");
	  
	  //exit from report
	  extent.flush();
	  
	  
	  
	  
	  
	  
  }
}
