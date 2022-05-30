package com.example.myautomation;

/*import org.junit.AfterClass;
import org.junit.BeforeClass;*/
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BaseTest {
  private static WebDriver driver;

  @BeforeAll
  public static void beforeAll() {
    System.setProperty("webdriver.chrome.driver", "/Users/vitali/IdeaProjects/chromedriver");
    System.setProperty("headless", "false"); // You can set this property elsewhere
    String headless = System.getProperty("headless");
    ChromeDriverManager.chromedriver();
    if("true".equals(headless)) {
      ChromeOptions chromeOptions = new ChromeOptions();
      chromeOptions.addArguments("--headless");
      driver = new ChromeDriver(chromeOptions);
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      driver.manage().window().fullscreen();
    } else {
      driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      driver.manage().window().fullscreen();
    }
  }

  public WebDriver getDriver() {
    return driver;
  }

}

