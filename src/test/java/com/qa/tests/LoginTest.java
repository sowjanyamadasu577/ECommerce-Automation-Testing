
package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;

import com.qa.pages.LoginPage;

@Listeners(ExtentReportManager.class)
public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest() {


            LoginPage login = new LoginPage(driver);

            login.login("standard_user", "secret_sauce");

            Assert.assertTrue(
                driver.getCurrentUrl().contains("inventory"),
                "Login failed!"
            );

            System.out.println("POM Login Test Passed!");
    }
}
        
       
