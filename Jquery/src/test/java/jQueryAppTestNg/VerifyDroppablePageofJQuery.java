package jQueryAppTestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import browser.Base;
import pomClassForJquery.JqueryDeomsPage;
import pomClassForJquery.JqueryHeaders;

public class VerifyDroppablePageofJQuery {

	WebDriver driver;
	JqueryHeaders jqueryHeaders;
	JqueryDeomsPage jqueryDeomsPage;
	
	@Parameters ("browserName")
	@BeforeTest
	public void launchBrowser(String browser) {
		System.out.println(browser);
		if(browser.equals("Chrome"))
		{
			driver = Base.openChromeDriver();
		}
		if(browser.equals("Edge"))
		{
			driver = Base.openEdgeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
@BeforeClass
 public void createPOMObjects()
{
	 jqueryDeomsPage = new JqueryDeomsPage(driver);
	 jqueryHeaders	 =  new JqueryHeaders(driver);
}

@BeforeMethod 
public void openApplication()
{
	driver.get("https://jqueryui.com/");
	
		jqueryHeaders.clickDemos();
		
		

}

@Test
public void verifyDroppableTab()
{
jqueryDeomsPage.clickDroppable();
	
	String url = driver.getCurrentUrl();
	String title = driver.getTitle();
	System.out.println(url);
	System.out.println(title);
	
	Assert.assertEquals("https://jqueryui.com/droppable/", url);
	Assert.assertEquals("Droppable | jQuery UI", title);
	
}
@AfterClass
public void clearobject()
{
	 jqueryDeomsPage = null;
	 jqueryHeaders	 = null;
}
@AfterTest
public void closeBrowser()
{
	driver.close();
	driver = null;
	System.gc();
}

















}
