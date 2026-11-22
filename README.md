# E-Commerce Website Automation Testing

## Project Overview
This project automates the testing of an e-commerce website using Selenium WebDriver with Java. It verifies important user functionalities such as login, product selection, shopping cart and checkout.

## Application Under Test
- Website: https://www.saucedemo.com/
- Application: SauceDemo

## Technologies Used
- Java
- Selenium WebDriver
- TestNG
- Maven
- Eclipse IDE
- ExtentReports
- Git & GitHub

## Framework
Page Object Model (POM)

## Test Scenarios

1. **Valid Login Test** – Verify login with valid credentials.
2. **Invalid Login Test** – Verify the error message for invalid credentials.
3. **Add to Cart Test** – Verify that a product can be added to the shopping cart.
4. **Checkout Test** – Verify the checkout process and successful order completion.

## Project Structure

```text
ECommerceAutomation
│
├── src/test/java
│   └── com/qa
│       ├── pages
│       │   ├── LoginPage.java
│       │   ├── InventoryPage.java
│       │   ├── CartPage.java
│       │   └── CheckoutPage.java
│       │
│       └── tests
│           ├── BaseTest.java
│           ├── LoginTest.java
│           ├── NegativeLoginTest.java
│           ├── ProductTest.java
│           └── CheckoutTest.java
│
├── pom.xml
├── .gitignore
└── ExtentReport.html
```

## Test Execution

Run all test cases using Maven:

```bash
mvn clean test
```

## Test Results

- Total Test Cases: 4
- Passed: 4
- Failed: 0

## Reports
ExtentReports is used to generate an HTML test execution report.

## GitHub Repository
https://github.com/sowjanyamadasu577/ECommerce-Automation-Testing

## Author
Sowjanya Madasu

QA Automation Testing Project
