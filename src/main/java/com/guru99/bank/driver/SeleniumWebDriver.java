package com.guru99.bank.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumWebDriver {

    //creacion de objeto tipo WebDriver
    public static WebDriver driver;

    //metodo para levantar el navegador
    public static void chromeDrive(String url){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-infobars");

        driver = new ChromeDriver(options);
        driver.get(url);
    }
}
