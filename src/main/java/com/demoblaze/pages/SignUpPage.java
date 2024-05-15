package com.demoblaze.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	WebDriver driver;
	
@FindBy(id="sign-username")
private
 WebElement usernameField;

@FindBy(id="sign-password")
 WebElement passwordField;

@FindBy(xpath="//button[contains(text(),'Sign up')]")
WebElement signupButton;

public SignUpPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
public void enterUsername(String username) {
	getUsernameField().sendKeys(username);
	
}
public void enterPassword(String password) {
	passwordField.sendKeys(password);
}
public void clickSignupButton() {
	signupButton.click();
}
public WebElement getUsernameField() {
	return usernameField;
}
public void setUsernameField(WebElement usernameField) {
	this.usernameField = usernameField;
}
}

