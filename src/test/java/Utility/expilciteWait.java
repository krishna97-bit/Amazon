package Utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class expilciteWait {
	
	static WebDriver driver;
	
	public static WebDriverWait  expliciteWait(String x , int y)
	{
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(null)));
		
		return wait;
		
		
		//y= duration in sec 
		// x = xpath expression
	}

}
