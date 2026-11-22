
package com.qa.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class InventoryPage {

    WebDriver driver;

    // Locators
    By addToCartButton =
        By.id("add-to-cart-sauce-labs-backpack");

    By cartButton =
        By.className("shopping_cart_link");

    // Constructor
    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    // Add product to cart
    public void addProductToCart() {

        WebDriverWait wait =
            new WebDriverWait(driver, Duration.ofSeconds(15));

        wait.until(
            ExpectedConditions.visibilityOfElementLocated(
                By.className("inventory_list")
            )
        );

        wait.until(
            ExpectedConditions.elementToBeClickable(addToCartButton)
        ).click();
    }

    // Open cart
    public void openCart() {

        WebDriverWait wait =
            new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(
            ExpectedConditions.elementToBeClickable(cartButton)
        ).click();
    }
}
