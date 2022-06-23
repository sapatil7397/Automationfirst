package jQueryAppTestNg;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import browser.Base;
import pomClassForJquery.JqueryHeaders;
import utils.Utility;

public class VerifyDemosHeadersOfJQuery {
   WebDriver driver;
   JqueryHeaders jqueryHeaders;
   
   @Parameters ("browserName")
   @BeforeTest 
   public void LaunchBrowser(String browser)
   {
	   System.out.println(browser);
	   if(browser.equals("Chrome"))
	   {
		   driver = Base.openChromeDriver();
	   }
	   if(browser.equals("Edge"))
	   {
		   driver= Base.openEdgeDriver();
	   }
	   
	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
   }
	@BeforeClass
	public void creatPomObjects()
	{
		 jqueryHeaders = new JqueryHeaders(driver);
	}
	
	@BeforeMethod
	public void LaunchApplication()
	{
		driver.get("https://jqueryui.com/");
		
	}
	
	@Test
	public void VerifyDemosTab()
	{
		jqueryHeaders.clickDemos();
		
		String url = driver.getCurrentUrl();
		String title= driver.getTitle();
		System.out.println(title);
		System.out.println(url);
		boolean result =jqueryHeaders.isEnabled();
		
		
		Assert.assertEquals("https://jqueryui.com/demo/", url);
		Assert.assertEquals("jQuery UI Demos | jQuery UI", title);
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(true, result);
		soft.assertAll();
			}
	
	@AfterMethod
	public void capturescreenshot(ITestResult result) throws IOException
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			Utility.captureScreenshot(driver, 123);
		}
		
	}
// 	@AfterClass	
// 	public void clearObjects() throws InterruptedException
// 	{
// 		jqueryHeaders= null;
// 	}
// 		@AfterTest
// 		public void closeBrowesr()
// 		{
// 			driver.close();
// 			driver = null;
// 			System.gc();
			
// 		}
	
	
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

