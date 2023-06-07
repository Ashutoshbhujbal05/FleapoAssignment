package pomFleapo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(xpath="//input[@type='text']")
	private WebElement PageName;
    @FindBy(xpath="//textarea[@name='IntroMessage']")
    private WebElement IntroMessage;
    @FindBy(xpath="(//button[@type='button'])[2]")
	private WebElement AddSocialLink;
    @FindBy(xpath="//a[text()='Sign Out']")
    private WebElement SignOut;
    @FindBy(xpath="//img[@sizes='100vw']")
    private WebElement AccountSetting;
  
    
    public HomePage(WebDriver driver)
	{		
		PageFactory.initElements(driver, this);   
	}
    public void enterPageName(String Name)
    {
    	PageName.sendKeys(Name);
    }
    public void enterIntroMessage(String Message)
    {
    	IntroMessage.sendKeys(Message);
    }
    public void addSocialLink()
    {
    	AddSocialLink.click();
    }
    public void clickAccountSetting()
    {
    	AccountSetting.click();
    }
  
    public void clickSignOut()
    {
    	SignOut.click();
    }
}
