package TestNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Amz.Amazon;
import Utility.Pojo;
import Utility.ScreenShot;

public class NewTest1 extends Pojo  {
	
	static WebDriver driver;
	
	@BeforeClass
	public void BeforeClass()
	{
		WebDriver driver = Opencromebrowser();
		this.driver = driver;
		
	}
	
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("BeforeMethod");
	}
	
  @Test
  public void Homepage() 
  {
	  Amazon amz = new Amazon(driver);
	  amz.Homepage();
  }
  
  
  @AfterMethod
  public void AfterMethod()
  {
	  System.out.println("AfterMethod");
  }
  
  @AfterClass
  public void afterClass()
  {
	  System.out.println("AfterClass");
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
