package UtilsLayer;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseLayer.baseclass;

public class Takesscreenshot extends baseclass {

	public static void screenshot() {
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String date=new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
		File dest=new File(System.getProperty("user.dir")+"//screenshot//"+date+"//.png");
	//	FileUtils.copyfile(src,dest);
		
	}

	
}
