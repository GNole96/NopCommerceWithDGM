package test;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import pojo.Browser;
import pom.NopCommerceLandingPage;
import utility.BaseClass;
import utility.ReportClass;

@Listeners (utility.ListenersClass.class)
public class TestRegistrationPage extends BaseClass {
	ExtentReports  reports;
	ExtentTest test;
	
	@BeforeTest
	public void testConfiguration() {
		reports = ReportClass.addReports("RegistrationPageReport");
	}
		
@BeforeMethod
public void openBrowser() 
{	
	driver = Browser.openBrowser("Edge");
}

@Test
public void VerifyRegURL()
{
	test = reports.createTest("VerifyRegURL");
	
	String Title = driver.getTitle();
Assert.assertEquals(Title, "nopCommerce demo store");
}

@Test
public void verifyRegestrTab(){
	test = reports.createTest("verifyRegestrTab");
	
	NopCommerceLandingPage r = new NopCommerceLandingPage(driver);
	r.regesterUser();
	String url = driver.getCurrentUrl();
	Assert.assertEquals(url, "https://demo.nopcommerce.com/register?returnUrl=%2F");
	
}

@AfterMethod
public void listenersClass(ITestResult result) {
	
	if(result.getStatus()==ITestResult.SUCCESS)
	{
		test.log(Status.PASS, result.getName());
	}
	else if(result.getStatus()==ITestResult.FAILURE)
	{
		test.log(Status.FAIL, result.getName());
	}
	else
	{
		test.log(Status.SKIP, result.getName());
	}
}

@AfterTest
public void clearData() {
	reports.flush();
}


}
