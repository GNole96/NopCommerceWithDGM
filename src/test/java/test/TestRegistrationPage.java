package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import pojo.Browser;
import pom.NopCommerceLandingPage;
import pom.NopCommerceRegistrationPage;
import utility.BaseClass;
import utility.Parametrization;
import utility.ReportClass;

@Listeners (utility.ListenersClass.class)
public class TestRegistrationPage extends BaseClass {
	ExtentReports  reports;
	ExtentTest test;
	
	@Parameters({"Nm"})
@BeforeTest
public void testConfiguration(String Nm) {
	reports = ReportClass.addReports(Nm);
}
		
@Parameters({"BroName"})
@BeforeMethod
public void openBrowser(String BroName) 
{	

	driver = Browser.openBrowser("Chrome");

	driver = Browser.openBrowser(BroName);
}

@Test (enabled = false)
public void VerifyRegURL()
{
	test = reports.createTest("VerifyRegURL");
	
	String Title = driver.getTitle();
Assert.assertEquals(Title, "nopCommerce demo store");
}

@Test (enabled = false)
public void verifyRegestrTab() throws EncryptedDocumentException, IOException{
	test = reports.createTest("verifyRegestrFunction");
	
	NopCommerceLandingPage r = new NopCommerceLandingPage(driver);
	r.regesterUser();
	String url = driver.getCurrentUrl();
	Assert.assertEquals(url, "https://demo.nopcommerce.com/register?returnUrl=%2F");
	
}

@Test (priority = 3)
public void registerNewFemaleUser () throws EncryptedDocumentException, IOException {
	test = reports.createTest("registerNewFemaleUser");
	NopCommerceLandingPage r = new NopCommerceLandingPage(driver);
	r.regesterUser();
	NopCommerceRegistrationPage reg = new NopCommerceRegistrationPage(driver);
	reg.SelectGenderFemale();
	reg.EnterFirstName(Parametrization.getData("Sheet1", 4, 1));
	reg.EnterLastName(Parametrization.getData("Sheet1", 4, 2));
	reg.SelectDateOfBirth(Parametrization.getData("Sheet1", 4, 3));
	reg.SelectDateOfMonth(Parametrization.getData("Sheet1", 4, 4));
	reg.SelectDateOfYear(Parametrization.getData("Sheet1", 4, 5));
	reg.EnterInputMailId(Parametrization.getData("Sheet1", 4, 6));
	reg.EnterInputCompanyName(Parametrization.getData("Sheet1", 4, 7));
	reg.EnterPassword(Parametrization.getData("Sheet1", 4, 8));
	reg.EnterConformPassword(Parametrization.getData("Sheet1", 4, 8));
	reg.ClickOnSubmitButton();
	String CurrentURl = driver.getCurrentUrl();
	Assert.assertEquals(CurrentURl, "https://demo.nopcommerce.com/registerresult/1?returnUrl=/");
	reg.clickOnContinue();
	String cURL = driver.getCurrentUrl();
	Assert.assertEquals(cURL, "https://demo.nopcommerce.com/");
	
} 

@Test (priority = 4)
public void registerNewMaleUser () throws EncryptedDocumentException, IOException {
	test = reports.createTest("registerNewMaleUser");
	NopCommerceLandingPage r = new NopCommerceLandingPage(driver);
	r.regesterUser();
	NopCommerceRegistrationPage reg = new NopCommerceRegistrationPage(driver);
	reg.SelectGenderMale();
	reg.EnterFirstName(Parametrization.getData("Sheet1", 5, 1));
	reg.EnterLastName(Parametrization.getData("Sheet1", 5, 2));
	reg.SelectDateOfBirth(Parametrization.getData("Sheet1", 5, 3));
	reg.SelectDateOfMonth(Parametrization.getData("Sheet1", 5, 4));
	reg.SelectDateOfYear(Parametrization.getData("Sheet1", 5, 5));
	reg.EnterInputMailId(Parametrization.getData("Sheet1", 5, 6));
	reg.EnterInputCompanyName(Parametrization.getData("Sheet1", 5, 7));
	reg.EnterPassword(Parametrization.getData("Sheet1", 5, 8));
	reg.EnterConformPassword(Parametrization.getData("Sheet1", 5, 8));
	reg.ClickOnSubmitButton();
	SoftAssert ass = new SoftAssert ();
	String CurrentURl = driver.getCurrentUrl();
	ass.assertEquals(CurrentURl, "https://demo.nopcommerce.com/registerresult/1?returnUrl=/");
	reg.clickOnContinue();
	String cURL = driver.getCurrentUrl();
	ass.assertEquals(cURL, "https://demo.nopcommerce.com/");
	ass.assertAll();
}

@Test (priority = 5)
public void registerNewUser () throws EncryptedDocumentException, IOException {
	test = reports.createTest("registerNewUser");
	NopCommerceLandingPage r = new NopCommerceLandingPage(driver);
	r.regesterUser();
	NopCommerceRegistrationPage reg = new NopCommerceRegistrationPage(driver);
	reg.SelectGenderMale();
	reg.EnterFirstName(Parametrization.getData("Sheet1", 6, 1));
	reg.EnterLastName(Parametrization.getData("Sheet1", 6, 2));
	reg.SelectDateOfBirth(Parametrization.getData("Sheet1", 6, 3));
	reg.SelectDateOfMonth(Parametrization.getData("Sheet1", 6, 4));
	reg.SelectDateOfYear(Parametrization.getData("Sheet1", 6, 5));
	reg.EnterInputMailId(Parametrization.getData("Sheet1", 6, 6));
	reg.EnterInputCompanyName(Parametrization.getData("Sheet1", 6, 7));
	reg.EnterPassword(Parametrization.getData("Sheet1", 6, 8));
	reg.EnterConformPassword(Parametrization.getData("Sheet1", 6, 8));
	reg.ClickOnSubmitButton();
	SoftAssert ass = new SoftAssert ();
	String CurrentURl = driver.getCurrentUrl();
	ass.assertEquals(CurrentURl, "https://demo.nopcommerce.com/registerresult/1?returnUrl=/");
	reg.clickOnContinue();
	String cURL = driver.getCurrentUrl();
	ass.assertEquals(cURL, "https://demo.nopcommerce.com/");
	ass.assertAll();

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
