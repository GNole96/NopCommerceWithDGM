package test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pojo.Browser;
import pom.NopCommerceLandingPage;
import utility.BaseClass;
import utility.ReportClass;

public class TestComputerMenu extends BaseClass {
	ExtentReports report;
	ExtentTest test ; 

	@BeforeTest
	public void configureTest() {
		report = ReportClass.addReports("TestComputer");
	}

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
