package com.example.myautomation;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    private WebDriver driver;

    @BeforeSuite
  public  void driverSetup(){
          if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "/Users/vitali/IdeaProjects/chromedriver");
            driver =  new ChromeDriver();
            driver.manage().deleteAllCookies();
            driver.manage().window().fullscreen();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
          }
  }
  @AfterSuite
  public  void driverTearDown(){
    driver.quit();
  }

   public WebDriver getDriver() {
        return driver;
    }
}
