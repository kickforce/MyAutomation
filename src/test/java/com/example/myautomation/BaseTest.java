package com.example.myautomation;

  /*import org.junit.AfterClass;
  import org.junit.BeforeClass;*/

import com.codeborne.selenide.Config;
import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import model.config.TestConfig;
import utils.TestConfigSettings;


import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class BaseTest {
  // private static RemoteWebDriver driver;
  private static WebDriver driver;
    public static final TestConfig CONFIG = TestConfigSettings.getInstance().getTestConfig();



  @BeforeAll
  public static void beforeAll() throws MalformedURLException {
    System.setProperty(CONFIG.getBrowser(), CONFIG.getBrowserPath());
    System.setProperty("headless", String.valueOf(CONFIG.getHeadless())); // You can set this property elsewhere
    String headless = System.getProperty("headless");
    ChromeDriverManager.chromedriver();
    if ("true".equals(headless)) {
      ChromeOptions chromeOptions = new ChromeOptions();
      chromeOptions.addArguments("--headless");
      driver = new ChromeDriver(chromeOptions);
      driver.manage().timeouts().implicitlyWait(CONFIG.getTimeout(), TimeUnit.SECONDS);
      //driver.manage().window().fullscreen();
    } else {
    }
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(CONFIG.getTimeout(), TimeUnit.SECONDS);
    //driver.manage().window().fullscreen();

   /* final DesiredCapabilities capabilities = new DesiredCapabilities();
      capabilities.setCapability("browserName", "chrome");
    capabilities.setCapability("browserVersion", "101.0");
    capabilities.setCapability("selenoid:options", Map.<String, Object>of(
            "enableVNC", true,
            "enableVideo", true
    ));
       driver = new RemoteWebDriver(
              URI.create("http://localhost:4444/wd/hub").toURL(),
            capabilities
    );*/
    // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

  }

  @AfterAll
  public static void afterAll() {
    if (null != driver) {
      driver.close();
      driver.quit();
    }
  }

  public WebDriver getDriver() {
    return driver;
  }
}

