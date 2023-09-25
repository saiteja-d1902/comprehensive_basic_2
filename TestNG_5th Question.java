package com.comprehensive;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgAssignment5 {



        @Test(priority = 1, enabled = true, timeOut =  100000)
        public void testSearchProduct() {
             WebDriver driver;
             System.setProperty("webdriver.edge.driver","C:\\Intel\\msedgedriver.exe");
             driver=new EdgeDriver();
             driver.manage().window().maximize();

             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://www.amazon.in/");

            // Search for a product
            WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
            searchBox.sendKeys("iPhone 13");
            WebElement searchButton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
            searchButton.click();

            // Verify that the search results page is displayed
            WebElement searchResultsPage = driver.findElement(By.xpath("//span[@class='a-size-medium-plus a-color-base a-text-bold']"));
            Assert.assertTrue(searchResultsPage.isDisplayed());

            // Close the browser
            driver.quit();
        }

        @Test(priority = 0, enabled = false, timeOut =  20000)
        public void testAddToCart() {
             WebDriver driver;
             System.setProperty("webdriver.edge.driver","C:\\Intel\\msedgedriver.exe");
             driver=new EdgeDriver();
             driver.manage().window().maximize();

             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
           
            driver.get("https://www.amazon.in/");

            // Search for a product
            WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
            searchBox.sendKeys("iPhone 13");
            WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
            searchButton.click();

            // Click on the first product in the search results
            WebElement firstProduct = driver.findElement(By.xpath("//ul[@id='s-results-list-wrapper']/li[1]"));
            firstProduct.click();

            // Add the product to the cart
            WebElement addToCartButton = driver.findElement(By.id("add-to-cart-button"));
            addToCartButton.click();

            // Verify that the product has been added to the cart
            WebElement cartButton = driver.findElement(By.id("nav-cart"));
            Assert.assertTrue(cartButton.getText().contains("1 item"));

            driver.quit();
        }
    }