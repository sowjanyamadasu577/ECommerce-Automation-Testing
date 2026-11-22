package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;

import com.qa.pages.LoginPage;
import com.qa.pages.InventoryPage;
import com.qa.pages.CartPage;
import com.qa.pages.CheckoutPage;

@Listeners(ExtentReportManager.class)
public class CheckoutTest  extends BaseTest{

    @Test
    public void checkoutTest() {


            // Login
            LoginPage login = new LoginPage(driver);
            login.login("standard_user", "secret_sauce");

            // Add product
            InventoryPage inventory = new InventoryPage(driver);
            inventory.addProductToCart();
            inventory.openCart();

            // Checkout
            CartPage cart = new CartPage(driver);
            cart.clickCheckout();

            // Customer details
            CheckoutPage checkout = new CheckoutPage(driver);
            checkout.enterDetails("Sowjanya", "Madasu", "560076");
            checkout.clickContinue();
            checkout.finishOrder();

            // Verify order
            Assert.assertEquals(
                checkout.getSuccessMessage(),
                "Thank you for your order!"
            );

            System.out.println("POM Checkout Test Passed!");
        }
    }