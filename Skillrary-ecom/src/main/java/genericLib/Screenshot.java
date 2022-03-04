package genericLib;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	
	public void getPhoto(WebDriver driver) throws IOException {
		
	    Date d= new Date();
		String currentdate= d.toString().replaceAll(":","-");
		
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
	    File dest = new File(AutoConstant.photopath+currentdate+".png");
		FileUtils.copyDirectory(src,dest);
	}

}
