package pomFleapo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddSocialLink 
{
	@FindBy(xpath="//select[@id='platform']")
	private WebElement SelectPlatform;
	@FindBy(xpath="//input[@placeholder='userfour']")
	private WebElement AddEmail;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement AddBtn;
	
	 public AddSocialLink(WebDriver driver)
		{		
			PageFactory.initElements(driver, this);   
		}
	 public void selectPlatform()
	 {
		 Select s = new Select(SelectPlatform);
		 s.selectByValue("Email");
	 }
	 public void addEmail(String Email)
	 {
		 AddEmail.sendKeys(Email);
	 }
	 public void clickAddBtn()
	 {
		 AddBtn.click();
	 }
	
	

}
