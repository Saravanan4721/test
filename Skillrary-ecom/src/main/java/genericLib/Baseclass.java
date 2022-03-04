package genericLib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass {
	public WebDriver driver;
	
	@BeforeMethod
	public void openApp() {
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	} 
	@AfterMethod
	public void closeApp(ITestResult result) throws IOException 
	{
	int status = result.getStatus();
     if(status==2)
		{
			Screenshot s=new Screenshot();
			s.getPhoto(driver);
		}
		driver.quit();
}
}

