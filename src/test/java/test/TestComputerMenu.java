package test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pojo.Browser;
import pom.NopCommerceLandingPage;

public class TestComputerMenu {

	WebDriver driver;
	@BeforeMethod
	public void openBrowser() {
	 driver=Browser.openBrowser("Chrome");
	}
	
	@Test
	public void validateComputerMenu() {
		NopCommerceLandingPage nop= new NopCommerceLandingPage(driver);
		nop.computersMenu();
		String str=driver.getCurrentUrl();
		System.out.println(str);
		assertEquals(str,"https://demo.nopcommerce.com/computers");
		
	}
}
