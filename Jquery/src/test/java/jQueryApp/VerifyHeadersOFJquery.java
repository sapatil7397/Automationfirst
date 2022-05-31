package jQueryApp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClassForJquery.JqueryHeaders;

public class VerifyHeadersOFJquery {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("https://jqueryui.com/");
	
	
	// 1st test case verify deoms page
	JqueryHeaders jqueryHeaders = new JqueryHeaders(driver);
	jqueryHeaders.clickDemos();
	
	String url = driver.getCurrentUrl();
	String title= driver.getTitle();
	System.out.println(title);
	System.out.println(url);
	if(url.equals("https://jqueryui.com/demos/") && title.equals("jQuery UI Demos | jQuery UI"))
	{
		System.out.println("PASS");
	}
	else
	{
		System.out.println("FAIL");
	}
	
	
	driver.navigate().back();
	
	//2nd test case download page
	
		
	jqueryHeaders.clickDownload();
	
	url = driver.getCurrentUrl();
	title = driver.getTitle();
	System.out.println(url);
	System.out.println(title);
	
	if(url.equals("https://jqueryui.com/download/") && title.equals("Download Builder | jQuery UI"))
	{
		System.out.println("PASS");
	}
	else
	{
		System.out.println("FAIL");
	}
	
	driver.navigate().back();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
