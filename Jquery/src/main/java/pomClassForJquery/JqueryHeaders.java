package pomClassForJquery;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JqueryHeaders {

   @FindBy (xpath = "//a[text()='Demos']")	
   private WebElement demos;
	
   @FindBy (xpath = "//a[text()='Download']")
   private WebElement download;
   
   @FindBy (xpath  = "//a[text()='API Documentation']")
	private WebElement apiDocumentation;
   
   @FindBy (xpath = "//a[text()='Themes']")
	private WebElement themes;
   
   @FindBy (xpath = "//a[text()='Development']")
   private WebElement development;
	
	@FindBy (xpath="//a[text()='Support']")
	private WebElement support;
	
	@FindBy (xpath = "//a[text()='Blog']")
	private WebElement blog;
	
	@FindBy (xpath = "//a[text()='About']")
	private WebElement about;
	
	public JqueryHeaders(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickDemos()
	{
		demos.click();
	}
	
	public boolean isEnabled()
	{
		boolean result =demos.isEnabled();
		return result;
	}
	

	public void clickDownload()
	{
		download.click();
	}
	
	public void clickAPIDocumentation()
	{
		apiDocumentation.click();
	}
	
	public void clickThemes()
	{
		themes.click();
	}
	
	public void clickDevelopment()
	{
		development.click();
	}
	

	public void clickSupport()
	{
		support.click();
	}
	
	public void clickBlog()
	{
		blog.click();
	}
	
	public void clickAbout()
	{
		about.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
