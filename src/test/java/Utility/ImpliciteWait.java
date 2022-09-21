package Utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class ImpliciteWait {
	
	
static WebDriver driver;

public static void impliciteewait(WebDriver driver)
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}


}
