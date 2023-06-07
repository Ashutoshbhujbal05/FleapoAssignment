package testFleapo;

import java.io.IOException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import libraryFiles.BaseClass;
import pomFleapo.AddSocialLink;
import pomFleapo.EnableMessagingPage;
import pomFleapo.HomePage;
import pomFleapo.LetsStartPage;
import pomFleapo.LoginPage;
import pomFleapo.MobileNumPage;
import pomFleapo.OtpPage;
import pomFleapo.StripeExpressHomePage;
import pomFleapo.StripeExpressLoginPage;
import pomFleapo.StripeYourAccountPage;

public class TestClassFleapo extends BaseClass
{
	 
	 LoginPage login;
	 LetsStartPage start;
	 MobileNumPage mobile;
	 OtpPage otp;
	 HomePage home;
	 AddSocialLink sl;
	 EnableMessagingPage messeging;
	 StripeExpressLoginPage stripeLogin;
	 StripeExpressHomePage stripeHome;
	 StripeYourAccountPage stripeAcc;
	 
	 @BeforeClass
	 public void operBrowser() throws IOException
	 {
		 initializeBrowser();
		 login = new LoginPage(driver);
		 start = new LetsStartPage(driver);
		 mobile = new MobileNumPage(driver);
		 otp = new OtpPage(driver);
		 home = new HomePage(driver);
		 sl = new AddSocialLink(driver);
		 messeging = new EnableMessagingPage(driver);
	 }
	 @BeforeMethod
	 public void Login() throws InterruptedException
	 {
		 login.clickOnLoginBtn();
		 start.clickOnLetsStartBtn();
		 mobile.enterMobNum("4444444444");
		 mobile.contiueBtn();
		 otp.sendOTP("123456");
	 }
	 @Test
	 public void PerformActionOnPage()
	 {
		 home.enterPageName("Ashutosh Bhujbal");
		 home.enterIntroMessage("I Am From Pune And Ready To Relocate..");
		 home.addSocialLink();
		 sl.selectPlatform();
		 sl.addEmail("ashubhujbal753@gmail.com");
         sl.clickAddBtn();
         messeging.clickEnableMessaging();
         messeging.clickMonitizationSetting();
         messeging.clickTipping();
         messeging.clickVisaConnectStripe();
         stripeLogin.switchToChildWindow();
         stripeLogin.enterCode("000000");
         stripeHome.clickOnYourAcc();
         stripeAcc.clickOnSignOutBtn();
         stripeLogin.closeWindow();
         messeging.clickCancelBtn();
      }
	 @AfterMethod
	 public void Signout()
	 {
		 home.clickAccountSetting();
		 home.clickSignOut();
		 driver.close();
	 }
	 @AfterClass
	 public void closeBrowser()
		{
			driver.quit();
		}
	
	

}
