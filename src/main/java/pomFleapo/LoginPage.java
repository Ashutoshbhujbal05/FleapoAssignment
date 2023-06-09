package pomFleapo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	@FindBy(xpath="//a[text()='Login']")
	private WebElement login;
		
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{		
		PageFactory.initElements(driver, this);   
		 
	}
	public void clickOnLoginBtn()
	{
		login.click();
	}

}
