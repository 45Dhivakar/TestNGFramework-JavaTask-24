package com.demoblaze.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
@FindBy(id="loginusername")
 WebElement usernameField;

@FindBy(id="loginpassword")
 WebElement passwordField;

@FindBy (css="button[onclick='logIn()']")
 WebElement loginButton;

public LoginPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
public void enterUsername(String username) {
	usernameField.sendKeys(username);
}
public void enterPassword(String password) {
	passwordField.sendKeys(password);
}
public void clickLoginButton() {
	loginButton.click();
}
}
