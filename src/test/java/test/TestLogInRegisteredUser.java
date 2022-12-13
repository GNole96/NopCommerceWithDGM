package test;



import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import pojo.Browser;
import pom.NopCommerceLandingPage;
import pom.NopCommerceLoginPage;
import utility.BaseClass;
import utility.Parametrization;
import utility.ReportClass;

public class TestLogInRegisteredUser extends BaseClass {
	ExtentReports reports;
	ExtentTest test;
	
	@Parameters({"ReportName"})
	@BeforeTest
	public void testConfiguration(String a) {
		reports = ReportClass.addReports(a);
	}
		
	@Parameters({"browserName"})
	@BeforeMethod
	public void openBrowser(String BrowName) 
	{	
		driver = Browser.openBrowser(BrowName);
	}

	@Test
	public void logInWithRegMadhu() throws EncryptedDocumentException, IOException {
		test = reports.createTest("logInWithRegCreds");
		NopCommerceLandingPage r = new NopCommerceLandingPage(driver);
		r.logInUser();
		NopCommerceLoginPage ln = new NopCommerceLoginPage(driver);
		ln.InputEmail(Parametrization.getData("Sheet1", 4, 6));
		ln.InputPassword(Parametrization.getData("Sheet1", 4, 8));
		ln.ClickOnLogInButton();
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://demo.nopcommerce.com/");
	}
	
	@Test
	public void logInWithRegCredGaurav() throws EncryptedDocumentException, IOException {
		test = reports.createTest("logInWithRegCreds");
		NopCommerceLandingPage r = new NopCommerceLandingPage(driver);
		r.logInUser();
		NopCommerceLoginPage ln = new NopCommerceLoginPage(driver);
		ln.InputEmail(Parametrization.getData("Sheet1", 5, 6));
		ln.InputPassword(Parametrization.getData("Sheet1", 5, 8));
		ln.ClickOnLogInButton();
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://demo.nopcommerce.com/");
	}

	@Test
	public void logInWithRegDeepak() throws EncryptedDocumentException, IOException {
		test = reports.createTest("logInWithRegCreds");
		NopCommerceLandingPage r = new NopCommerceLandingPage(driver);
		r.logInUser();
		NopCommerceLoginPage ln = new NopCommerceLoginPage(driver);
		ln.InputEmail(Parametrization.getData("Sheet1", 6, 6));
		ln.InputPassword(Parametrization.getData("Sheet1", 6, 8));
		ln.ClickOnLogInButton();
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://demo.nopcommerce.com/");
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
