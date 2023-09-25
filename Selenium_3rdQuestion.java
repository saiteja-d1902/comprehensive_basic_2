package com.comprehensive;

import java.time.Duration;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment3 {
@Test
    public void automation() throws InterruptedException {
    WebDriver driver;
    System.setProperty("webdriver.edge.driver","C:\\Intel\\msedgedriver.exe");
    driver=new EdgeDriver();
    driver.manage().window().maximize();

    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    driver.get("https://www.automationanywhere.com/");
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//button[@id = 'onetrust-accept-btn-handler']")))).click();
WebElement img = driver.findElement(By.xpath("//img[@alt='Automation Anywhere']"));
if(img.isDisplayed()) {
    System.out.println("Automation Anywhere logo is visible");
}
else {
    System.out.println("Automation Anywhere logo is not visible");
}
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,350)", "");
WebElement requestDemo = driver.findElement(By.xpath("//a[@title = 'Request Demo']"));
Assert.assertTrue(requestDemo.isDisplayed(), "Request Demo");

requestDemo.click();
WebElement ai = driver.findElement(By.xpath("//img[@alt='Automation + AI']"));
Assert.assertTrue(ai.isDisplayed(), "Automation + AI");
driver.quit();

    
    }
}