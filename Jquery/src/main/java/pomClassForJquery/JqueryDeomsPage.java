package pomClassForJquery;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JqueryDeomsPage {

//   @FindBy (xpath = "(//a[text()='Draggable'])[1]")	
//   private WebElement draggable;
//	
//   @FindBy (xpath = "(//a[text()='Droppable'])[1]")	
//   private WebElement droppable;
//	
//   @FindBy (xpath = "(//a[text()='Resizable'])[1]")	
//   private WebElement resizable;
	
   @FindBy (xpath = "(//a[text()='Selectable'])[1]")	
   private WebElement selectable;
	
   @FindBy (xpath = "((//a[text()='Sortable'])[1]")	
   private WebElement sortable;
	

  private  WebDriverWait wait ;
   
	public JqueryDeomsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
		 wait = new WebDriverWait(driver,10);
	}
	
	public void clickDraggable()
	{
		// wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.visibilityOf(droppable));
		draggable.click();
	}
	
	public void clickDroppable()
	{
		// wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(droppable));
	     droppable.click();
		
		
	}
	
	public void clickResizable()
	{
		resizable.click();
	}
	
	public void clickSelectable()
	{
		selectable.click();
	}
	
	public void clickSortable()
	{
		sortable.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
