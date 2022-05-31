package jQueryApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import pomClassForJquery.JqueryDeomsPage;
import pomClassForJquery.JqueryHeaders;

public class VerifyDraggableAndDroppablePageOfJquery {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	//1st test case verify draggable page 
		driver.get("https://jqueryui.com/");
	JqueryHeaders jqueryHeaders	 =  new JqueryHeaders(driver);
		jqueryHeaders.clickDemos();
		
		JqueryDeomsPage jqueryDeomsPage = new JqueryDeomsPage(driver);
		jqueryDeomsPage.clickDraggable();
	
		String url = driver.getCurrentUrl();
	   String title =  driver.getTitle();
	   System.out.println(url);
	   System.out.println(title);
	Assert.assertEquals("https://jqueryui.com/draggable/", url);
	Assert.assertEquals("Draggable | jQuery UI", title);
//	if(url.equals("https://jqueryui.com/draggable/") && title.equals("Draggable | jQuery UI"))
//	{
//	              System.out.println("PASS");
//    }
// else
//	{
//	    	System.out.println("FAIL");
//	}
	
	driver.navigate().back();
	
	//2nd Test case verify Droppable page
	
	jqueryHeaders.clickDemos();
	jqueryDeomsPage.clickDroppable();
	
	url = driver.getCurrentUrl();
	title = driver.getTitle();
	System.out.println(url);
	System.out.println(title);
	
//	if(url.equals("https://jqueryui.com/droppable/") && title.equals("Droppable | jQuery UI"))
//	{
//		System.out.println("pass");
//	}
//	else
//	{
//		System.out.println("fail");
//	}
//	
	
	
}





}
