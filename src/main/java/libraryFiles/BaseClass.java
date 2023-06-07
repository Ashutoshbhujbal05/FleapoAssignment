package libraryFiles;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class BaseClass 
{
public WebDriver driver;
	
	public void initializeBrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\OM\\Desktop\\chromedriver_win32 (1)\\chromedriver_win32 (2)\\chromedriver.exe");

		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
        ops.addArguments("--disable-notifications");
		driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get("https://develop-v2.superlink.io/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));		
	}
	

}
