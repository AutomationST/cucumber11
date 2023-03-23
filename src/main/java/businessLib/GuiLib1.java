package businessLib;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GuiLib1 {
	WebDriver driver;
 public GuiLib1(WebDriver driver) {
	 this.driver = driver;
 }
	public boolean Click(WebElement element,String ClickType) {
		try {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", element);
		
			return true;
		}catch(Exception e) {
			return false;
		}
	}
}
