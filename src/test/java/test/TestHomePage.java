package test;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pojo.Browser;
import pom.NopCommerceLandingPage;
import utility.BaseClass;

public class TestHomePage extends BaseClass{
	
	@BeforeMethod
	public void openBrowser() {
	driver=	Browser.openBrowser("Chrome");
	}

	@Test
	public void currencySelect() {
		NopCommerceLandingPage nop = new NopCommerceLandingPage(driver);
		nop.selectCurrency(1);
		assertEquals(nop.validateCurrency(),"€1032.00");
	}
}
