package com.demoblaze.tests;
import com.demoblaze.pages.HomePage;

import com.demoblaze.pages.SignUpPage;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignUpTest {
	    WebDriver driver;
	    HomePage homePage;
	    SignUpPage signUpPage;
	    WebDriverWait wait;

	    @BeforeMethod
	    public void setUp() {
	    	System.setProperty("Webdriver.gecko.driver","C:\\Users\\Dell\\Downloads\\geckodriver-v0.34.0-win64.exe");
	        //WebDriverManager.chromedriver().setup();
	        driver = new FirefoxDriver();
	        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        driver.get("https://www.demoblaze.com/");
	        homePage = new HomePage(driver);
	        signUpPage = new SignUpPage(driver);
	    }

	    @Test
	    public void testSignUp() {
	        homePage.clickSignUp();
	        wait.until(ExpectedConditions.visibilityOf(signUpPage.getUsernameField()));
	        signUpPage.enterUsername("testuser");
	        signUpPage.enterPassword("123@456");
	        signUpPage.clickSignupButton();
	      
	    }

	    @AfterMethod
	    public void tearDown() {	      
	            driver.quit();
	        
	    }
}
