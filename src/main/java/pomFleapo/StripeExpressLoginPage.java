package pomFleapo;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StripeExpressLoginPage 
{
	@FindBy(xpath="//input[@type='tel']")
	private WebElement Code;
	
	public static WebDriver driver;

	 public StripeExpressLoginPage(WebDriver driver)
		{		
			PageFactory.initElements(driver, this); 
			 
		}
	 public void switchToChildWindow()
	 {
		 Set<String> allIds = driver.getWindowHandles();    
			ArrayList<String> al=new ArrayList<>(allIds);       
			String childWindowID = al.get(1);
			driver.switchTo().window(childWindowID);
		 
	 }
	 public void enterCode(String code)
	 {
		 Code.sendKeys(code);
	 }
	 public void closeWindow()
	 {
		 driver.close();
	 }

}
