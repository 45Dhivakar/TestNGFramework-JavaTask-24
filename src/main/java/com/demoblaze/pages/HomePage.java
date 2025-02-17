package com.demoblaze.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;

	@FindBy(id="signin2")
	 WebElement signButton;
	
	@FindBy(id="login2")
     WebElement loginButton;
	
 public HomePage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
 public void clickSignUp() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", signButton);
}
 public void clickLogin() {
	 loginButton.click();
 }
}
