package pomFleapo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnableMessagingPage 
{
	    @FindBy(xpath="(//button[@type='button'])[1]")
	    private WebElement EnableMessaging;
	    @FindBy(xpath="(//div[@class='flex-center-between'])[3]")
	    private WebElement MonetizationSetting;
	    @FindBy(xpath="//div[@class='jsx-9c5a6c68431d5bdf close absolute top-6 right-6 cursor-pointer']")
	    private WebElement CancelBtn;
	    @FindBy(xpath="(//div[@class='checkbox-toggle peer'])[1]")
	    private WebElement Tipping;
	    @FindBy(xpath="(//div[@class='cursor-pointer'])[2]")
	    private WebElement VisaConnectStripe;
	    
	    public EnableMessagingPage(WebDriver driver)
		{		
			PageFactory.initElements(driver, this);   
		}
	    public void clickEnableMessaging()
	    {
	    	EnableMessaging.click();
	    }
	    public void clickMonitizationSetting()
	    {
	    	MonetizationSetting.click();
	    }
	    public void clickVisaConnectStripe()
	    {
	    	VisaConnectStripe.click();
	    }
	    public void clickCancelBtn()
	    {
	    	CancelBtn.click();
	    }
	    public void clickTipping()
	    {
	    	Tipping.click();
	    }

}
