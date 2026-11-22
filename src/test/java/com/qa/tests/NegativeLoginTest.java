

package com.qa.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;

import com.qa.pages.LoginPage;

@Listeners(ExtentReportManager.class)
public class NegativeLoginTest extends BaseTest {

    @Test
    public void invalidUsernameTest() {

        LoginPage login = new LoginPage(driver);

        login.loginWithoutWaiting(
            "wrong_user",
            "secret_sauce"
        );

        String errorMessage = driver.findElement(
            By.cssSelector("[data-test='error']")
        ).getText();

        Assert.assertTrue(
            errorMessage.contains(
                "Username and password do not match"
            ),
            "Error message not displayed!"
        );

        System.out.println("Invalid Username Test Passed!");
    }
}
