package com.example.myautomation;

import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class BaseTest {
  private WebDriver driver;
  	static String driverPath = "/Users/vitali/IdeaProjects/chromedriver";


		public WebDriver getDriver() {
		return driver;
	}
  private void setDriver(String browserType, String appURL) {
		switch (browserType) {
		case "chrome":
			driver = initChromeDriver(appURL);
			break;
		case "firefox":
			driver = initFirefoxDriver(appURL);
			break;
		default:
			System.out.println("browser : " + browserType
					+ " is invalid, Launching Firefox as browser of choice..");
			driver = initFirefoxDriver(appURL);
		}
	}
  private static WebDriver initFirefoxDriver(String appURL) {
		System.out.println("Launching Firefox browser..");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		return driver;
	}

	private static WebDriver initChromeDriver(String appURL) {
		System.out.println("Launching google chrome with new profile..");
		System.setProperty("webdriver.chrome.driver", driverPath
				+ "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		return driver;
	}

	@BeforeClass
	public void initializeTestBaseSetup(String browserType, String appURL) {
		try {
			setDriver(browserType, appURL);

		} catch (Exception e) {
			System.out.println("Error....." + e.getStackTrace());
		}
	}

	/*@AfterClass
	public void tearDown() {
		driver.quit();
	}*/
/*  @BeforeAll
  static WebDriver driverSetup() {
    if (driver == null) {
      this.driver = driver;
      WebDriver driver = new ChromeDriver();
      PageFactory.initElements(driver, this);
      System.setProperty("webdriver.chrome.driver", "/Users/vitali/IdeaProjects/chromedriver");
      driver = new ChromeDriver();
      driver.manage().deleteAllCookies();
      driver.manage().window().fullscreen();
      driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    return driver;
  }*/
/*
  @AfterAll
  public void driverTearDown(){
    driver.quit();
  }
*/

}
