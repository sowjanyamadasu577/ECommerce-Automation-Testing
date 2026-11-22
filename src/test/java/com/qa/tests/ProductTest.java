package com.qa.tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;

import com.qa.pages.LoginPage;
import com.qa.pages.InventoryPage;

@Listeners(ExtentReportManager.class)
public class ProductTest extends BaseTest {

    @Test
    public void addProductToCartTest() {


            LoginPage login = new LoginPage(driver);
            login.login("standard_user", "secret_sauce");

            InventoryPage inventory = new InventoryPage(driver);
            inventory.addProductToCart();

            String cartCount = driver.findElement(
                org.openqa.selenium.By.className("shopping_cart_badge")
            ).getText();

            Assert.assertEquals(cartCount, "1");

            System.out.println("POM Product Test Passed!");
        }
    }