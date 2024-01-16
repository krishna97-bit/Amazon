package Amz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon {
	
	@FindBy (xpath="//a[@id='nav-logo-sprites']")
	private WebElement logo;




public Amazon (WebDriver driver)
{
	PageFactory.initElements(driver, this);
}


public void Homepage()
{
	Boolean logo1 = logo.isDisplayed();
	System.out.println(logo1);
System.out.println("amazon");
}


































}