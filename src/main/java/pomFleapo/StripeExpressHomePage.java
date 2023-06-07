package pomFleapo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StripeExpressHomePage 
{
	@FindBy(xpath="(//div[@class='db-NavItem-content'])[3]")
	private WebElement YourAccout;
	
	  public StripeExpressHomePage(WebDriver driver)
			{		
				PageFactory.initElements(driver, this);   
			}
	  
	  public void clickOnYourAcc()
	  {
		  YourAccout.click();
	  }
	  

}
