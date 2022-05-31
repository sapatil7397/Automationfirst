package utils;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {

	public static void captureScreenshot(WebDriver driver ,int testID) throws IOException
	{
		
		
		TakesScreenshot t = (TakesScreenshot)driver;
         File source = t.getScreenshotAs(OutputType.FILE);
//         Calendar cal = Calendar.getInstance();
//     	Date d  = cal.getTime();
//     	
//     	String timestanmp = d.toString().replace(":", "").replace(" ", "");
//     	System.out.println(timestanmp);
         
         Date currentdate = new Date();
         String date = currentdate.toString().replace(" ", "-").replace(":", " ");
		File dest = new File("C:\\Automation screenshot\\Test" +testID + date + ".jpeg");
		FileHandler.copy(source, dest);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
