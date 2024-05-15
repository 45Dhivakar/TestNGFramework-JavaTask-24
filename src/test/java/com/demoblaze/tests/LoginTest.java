package com.demoblaze.tests;

import com.demoblaze.pages.HomePage;
import com.demoblaze.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
     WebDriver driver;
     HomePage homePage;
     LoginPage loginPage;

    @BeforeMethod
    public void setUp() {
    	System.setProperty("Webdriver.gecko.driver","C:\\Users\\Dell\\Downloads\\geckodriver-v0.34.0-win64.exe");
        //WebDriverManager.chromedriver().setup();
    	driver = new FirefoxDriver();
        driver.get("https://www.demoblaze.com/");
        homePage = new  HomePage(driver);
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testLogin() {
        homePage.clickLogin();
        loginPage.enterUsername("testuser");
        loginPage.enterPassword("123@456");
        loginPage.clickLoginButton();
       
    }

    @AfterMethod
    public void tearDown() {
            driver.quit();
        }
    
}
