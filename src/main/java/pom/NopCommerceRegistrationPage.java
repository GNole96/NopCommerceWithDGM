package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class NopCommerceRegistrationPage {
		
@FindBy (xpath="//input[@value='M']")private WebElement RegGenderMale;
@FindBy (xpath="//input[@value='F']")private WebElement RegGenderFemale;
@FindBy (xpath="//input[@id='FirstName']")private WebElement RegFirstName;
@FindBy (xpath="//input[@id='LastName']")private WebElement  RegLastName;
@FindBy (xpath="//select[@name='DateOfBirthDay']")private WebElement RegDOB;
@FindBy (xpath="//select[@name='DateOfBirthMonth']")private WebElement RegDOM;
@FindBy (xpath="//select[@name='DateOfBirthYear']")private WebElement  RegDOY;
@FindBy (xpath="//input[@name='Email']")private WebElement RegInputMailId;
@FindBy (xpath="//input[@name='Company']")private WebElement RegInputCompany;
@FindBy (xpath="(//input[@name='Newsletter'])[1]")private WebElement RegClickOnNewsLetter;
@FindBy (xpath="//input[@name='Password']")private WebElement RegPassword;
@FindBy (xpath="//input[@name='ConfirmPassword']")private WebElement RegConformPassword;
@FindBy (xpath="//button[@name='register-button']")private WebElement RegSubmmitButton;
@FindBy (xpath="//a[text()='Continue']")private WebElement ContinueButton;


public NopCommerceRegistrationPage (WebDriver driver) {
PageFactory.initElements(driver, this); }


public void SelectGenderMale () {
RegGenderMale.click();
}

public void SelectGenderFemale () {
RegGenderFemale.click();
}

public void EnterFirstName (String firstname) {
RegFirstName.sendKeys(firstname);
}

public void EnterLastName (String lastname) {
RegLastName.sendKeys(lastname);
}

public void SelectDateOfBirth (String date) {
RegDOB.click();
Select A = new Select(RegDOB);
A.selectByValue(date);
}

public void SelectDateOfMonth (String month) {
RegDOM.click();
Select A = new Select(RegDOM);
A.selectByValue(month);
}

public void SelectDateOfYear (String year) {
RegDOY.click();
Select A = new Select(RegDOY);
A.selectByValue(year);
}

public void EnterInputMailId (String mail) {
RegInputMailId.sendKeys(mail);
}

public void EnterInputCompanyName (String CompanyName) {
RegInputCompany.sendKeys(CompanyName);
}

public void NewsLatterCheckBox () {
RegClickOnNewsLetter.click();
}

public void EnterPassword (String Pass) {
RegPassword.sendKeys(Pass);
}

public void EnterConformPassword (String pass) {
RegConformPassword.sendKeys(pass);
}

public void ClickOnSubmitButton () {
RegSubmmitButton.click();
}

public void clickOnContinue() {
	ContinueButton.click();
}
}

