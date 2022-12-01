package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class Screenshot extends BaseClass {
	
	public static void takeScreenshot(String name) throws IOException {
		
		File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File ("C:\\Users\\SAICOM\\eclipse-workspace\\NopCommerceProject\\Screenshot\\"+name+".png");
		FileHandler.copy(source, destination);
		
	}

}
