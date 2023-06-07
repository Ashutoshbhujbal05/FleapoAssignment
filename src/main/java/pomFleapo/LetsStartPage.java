package pomFleapo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LetsStartPage 
{
	@FindBy(xpath="//button[@type='button']")
	private WebElement letsStartBtn;
	
	WebDriver driver;
	
	public LetsStartPage(WebDriver driver)
	{		
		PageFactory.initElements(driver, this);   
 	}
	public void clickOnLetsStartBtn()
	{
		letsStartBtn.click();
	}

}
