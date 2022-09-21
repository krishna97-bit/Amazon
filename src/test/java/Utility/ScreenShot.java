package Utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	
	
	public static void Screenshot(WebDriver driver) throws IOException
	{
		DateTimeFormatter time = DateTimeFormatter.ofPattern("ss.mm.hh.dd.mm.yyyy");
		LocalDateTime now = LocalDateTime.now();
		String dtf = time.format(now);
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("\"E:\\Screenshots\\orange\\Test"+dtf+"jpeg");
		FileHandler.copy(source, dest);
		
		
	}

}
