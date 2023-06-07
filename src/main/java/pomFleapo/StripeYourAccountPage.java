package pomFleapo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StripeYourAccountPage 
{
	@FindBy(xpath="//span[text()='Sign out']")
	private WebElement SignOut;
	
	 public StripeYourAccountPage(WebDriver driver)
		{		
			PageFactory.initElements(driver, this);   
		}
	 
	 public void clickOnSignOutBtn()
	 {
		 SignOut.click();
	 }

}
