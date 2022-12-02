package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NopCommerceLoginPage {
	
	@FindBy (xpath = "//input[@name='Email']")private WebElement IpEmail;
	@FindBy (xpath = "//input[@name='Password']")private WebElement IpPassword;
	@FindBy (xpath = "(//input[@name='RememberMe'])[1]")private WebElement RememberMeCheckBox;
	@FindBy (xpath = "//a[text()='Forgot password?']")private WebElement ForgotPassword;
	@FindBy (xpath = "//button[@class='button-1 login-button']")private WebElement LogInButton;
	@FindBy (xpath = "//button[@class='button-1 register-button']")private WebElement RegesterButton;
	
	public NopCommerceLoginPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void InputEmail (String Email) {
		IpEmail.sendKeys(Email);
	}
	
	public void InputPassword (String Pass) {
		IpPassword.sendKeys(Pass);
	}
	
	public void ClickOnRememberMe () {
		RememberMeCheckBox.click();
	}
	
	public void ClickOnForgotPassword () {
		ForgotPassword.click();
	}
	
	public void ClickOnLogInButton () {
		LogInButton.click();
	}
	
	public void ClickOnRegesterButton () {
		RegesterButton.click();
	}

}
