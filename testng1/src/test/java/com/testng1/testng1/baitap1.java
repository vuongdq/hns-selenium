package com.testng1.testng1;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

// Kiểm tra tiêu đề của trang web

public class baitap1 {
    public static void main(String[] args) {

        // Đoạn này cần nhớ khai bao để kết nối với chrome Driver
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();



        String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Chrome and direct it to the Base URL

        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }

        //close Chrome
        driver.close();
    }

}
