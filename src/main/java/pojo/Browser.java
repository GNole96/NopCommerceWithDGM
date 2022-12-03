package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import utility.BaseClass;

public class Browser extends BaseClass{

	public static WebDriver openBrowser(String namebrowser) {
		
		if(namebrowser.equals("Chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
			
		}else if(namebrowser.equals("IE"))
		{
			WebDriverManager.iedriver().setup();
			 driver = new InternetExplorerDriver();	
		}
		else if (namebrowser.equals("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.get("https://demo.nopcommerce.com");
		driver.manage().window().maximize();
		return driver;
	}
}
