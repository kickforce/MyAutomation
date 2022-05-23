package com.example.myautomation;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
  private static WebDriver driver;
  	static String driverPath = "/Users/vitali/IdeaProjects/chromedriver";


		public WebDriver getDriver() {
		return driver;
	}
  private static void setDriver(String browserType) {
		switch (browserType) {
		case "chrome":
			driver = initChromeDriver("http://automationpractice.com/index.php");
			break;
		case "firefox":
			driver = initFirefoxDriver("http://automationpractice.com/index.php");
			break;
		default:
			System.out.println("browser : " + browserType
					+ " is invalid, Launching Firefox as browser of choice..");
			driver = initFirefoxDriver("http://automationpractice.com/index.php");
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
	public static void initializeTestBaseSetup() {
		try {
			String chrome = "chrome";
			setDriver(chrome);

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
