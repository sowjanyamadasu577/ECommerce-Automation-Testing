
package com.qa.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CheckoutPage {

    WebDriver driver;

    // Locators
    By firstName = By.id("first-name");
    By lastName = By.id("last-name");
    By postalCode = By.id("postal-code");
    By continueButton = By.id("continue");
    By finishButton = By.id("finish");
    By successMessage = By.className("complete-header");

    // Constructor
    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    // Enter customer details
    public void enterDetails(String first, String last, String zip) {

        WebDriverWait wait =
            new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(
            ExpectedConditions.visibilityOfElementLocated(firstName)
        ).sendKeys(first);

        driver.findElement(lastName).sendKeys(last);
        driver.findElement(postalCode).sendKeys(zip);
    }

    // Click Continue
    public void clickContinue() {

        WebDriverWait wait =
            new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(
            ExpectedConditions.elementToBeClickable(continueButton)
        ).click();
    }

    // Finish Order
    public void finishOrder() {

        WebDriverWait wait =
            new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(
            ExpectedConditions.elementToBeClickable(finishButton)
        ).click();
    }

    // Get success message
    public String getSuccessMessage() {

        WebDriverWait wait =
            new WebDriverWait(driver, Duration.ofSeconds(10));

        return wait.until(
            ExpectedConditions.visibilityOfElementLocated(successMessage)
        ).getText();
    }
}
