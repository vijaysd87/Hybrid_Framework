package generic;

import java.io.File;
import java.util.Date;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Capture1 {
	public static void screenshot(WebDriver driver)
	{
		try
		{
			String path="./Screenshot/";
		    java.util.Date d= new java.util.Date();
		    String d1 = d.toString();
		    String d2 = d1.replaceAll(":", "-");
		    TakesScreenshot tss=(TakesScreenshot)driver;
		    File src = tss.getScreenshotAs(OutputType.FILE);
		    File dst = new File(path + d2 + ".Png");
		    org.openqa.selenium.io.FileHandler.copy(src, dst);
		   }
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
