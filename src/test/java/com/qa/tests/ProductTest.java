
package com.qa.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.pages.LoginPage;
import com.qa.pages.InventoryPage;

@Listeners(ExtentReportManager.class)
public class ProductTest extends BaseTest {

    @Test
    public void addProductToCartTest() {

        // Login to application
        LoginPage login = new LoginPage(driver);
        login.login("standard_user", "secret_sauce");

        // Add product to cart
        InventoryPage inventory = new InventoryPage(driver);
        inventory.addProductToCart();

        // Wait for cart badge
        WebDriverWait wait =
            new WebDriverWait(driver, Duration.ofSeconds(10));

        String cartCount = wait.until(
            ExpectedConditions.visibilityOfElementLocated(
                By.className("shopping_cart_badge")
            )
        ).getText();

        // Verify cart count
        Assert.assertEquals(cartCount, "1");

        System.out.println("Add Product to Cart Test Passed!");
    }
}
