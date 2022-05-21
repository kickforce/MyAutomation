package com.example.myautomation;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseTest {
  public static WebDriver driver;
  //public static WebDriverWait wait;

  @BeforeAll
  public static void driverSetup(){
          if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "/Users/vitali/IdeaProjects/chromedriver");
            driver =  new ChromeDriver();
            driver.manage().deleteAllCookies();
            driver.manage().window().fullscreen();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
           // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
          }
  }
  /*@AfterAll
  public static void driverTearDown(){
    driver.quit();
  }*/

}
