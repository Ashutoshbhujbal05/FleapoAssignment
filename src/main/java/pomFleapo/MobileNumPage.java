package pomFleapo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobileNumPage 
{
	@FindBy(xpath="//div[@class='flag in']")
	private WebElement CountryCode;
	@FindBy(xpath="//li[@class='country highlight']")
	private WebElement IndiaCode;
	@FindBy(xpath="//input[@class='form-control ']")
	private WebElement MobileNum;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement continueBtn;


	WebDriver driver;
	
	public MobileNumPage(WebDriver driver)
	{		
		PageFactory.initElements(driver, this);   
	}
	public void clickOnCountryCode()
	{
		CountryCode.click();
	}
	public void clickIndiaCode()
	{
		IndiaCode.click();
	}
	public void enterMobNum(String Mobile)
	{
		 MobileNum.sendKeys(Mobile);
	}
	public void contiueBtn()
	{
		continueBtn.click();
	}
	 
}
