package pomFleapo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OtpPage 
{
	@FindBy(xpath="//input[@class=' ']")////input[@class=' ']
	private WebElement Otp;
	
	public OtpPage(WebDriver driver)
	{		
		PageFactory.initElements(driver, this);   
	}
	
	public void sendOTP(String OTP)
	{
		Otp.sendKeys(OTP);
		
	}

}
