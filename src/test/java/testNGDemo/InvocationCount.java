package testNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class InvocationCount
{
  @Test(priority=1)
  public void enrollForTheCourse() 
  {
	  System.out.println("Student enroll for the course");
  }
  
  
  @Test(priority=2)
  public void training() 
  {
	  System.out.println("Student will get training for the course");
  }
  
  
  @Test(priority=3,invocationCount=3)
  public void  placementcall()
  {
	  System.out.println("Student will get placements for the course");
  }
  
  
  
}
