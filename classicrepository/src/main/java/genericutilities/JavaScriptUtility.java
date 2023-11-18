package genericutilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptUtility extends BaseClass{
	
	public void enteringDataIntoElement(WebElement element, String data) {
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].value='"+data+"'", element);
		
	}
	
	public void clickingOnElement(WebElement element) {
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", element);
		
	}
	
	public void scrollingThePage(int x,int y) {
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("scrollBy("+x+","+y+")");
	}

}
