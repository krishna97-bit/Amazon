package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pojo {
	
	 static WebDriver driver;
	
	public static WebDriver Opencromebrowser()
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
		 driver.get("https://www.amazon.com");
		 
		 return driver;
	}

}
