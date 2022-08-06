package com.testng1.testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadImage {
    public static void main(String[] args) {
        System.setProperty("webdriver.Chrome.driver","chromedriver");
        String baseUrl = "http://demo.guru99.com/test/upload/";
        WebDriver driver = new ChromeDriver();
        System.out.println("hello");
        driver.get(baseUrl);
        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
        // Enter the file path to upload
        uploadElement.sendKeys("C:\\Users\\Admin\\Downloads\\3.pdf");
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.name("send")).click();
    }
}
