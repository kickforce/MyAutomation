package com.example.myautomation;

/*import org.junit.AfterClass;
import org.junit.BeforeClass;*/
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BaseTest {
  private WebDriver driver;

  @BeforeSuite
  /*public void beforeSuite() {
    driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "/Users/vitali/IdeaProjects/geckodriver");
    driver.manage().deleteAllCookies();
    driver.manage().window().fullscreen();
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
  }*/

public void beforeSuite() {
        System.setProperty("headless", "false"); // You can set this property elsewhere
        String headless = System.getProperty("headless");

        ChromeDriverManager.chromedriver();
        if("true".equals(headless)) {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--headless");
            driver = new ChromeDriver(chromeOptions);
        } else {
            driver = new ChromeDriver();
        }
    }


@AfterSuite
  public void afterSuite() {
    if (null != driver) {
      driver.close();
      driver.quit();
    }
  }
  public WebDriver getDriver() {
    return driver;
  }
 /* private WebDriver driver;
	static String driverPath = "/Users/vitali/IdeaProjects/geckodriver";

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

	private static WebDriver initChromeDriver(String appURL) {
		System.out.println("Launching google chrome with new profile..");
		System.setProperty("webdriver.chrome.driver", driverPath
				+ "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		return driver;
	}

	private static WebDriver initFirefoxDriver(String appURL) {
		System.out.println("Launching Firefox browser..");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		return driver;
	}

	//@Parameters({ "browserType", "appURL" })
  String browserType =  "chrome";
  String appURL = "http://automationpractice.com/index.php";
	@BeforeClass
	public void initializeTestBaseSetup(String browserType, String appURL) {
		try {
			setDriver(browserType, appURL);

		} catch (Exception e) {
			System.out.println("Error....." + e.getStackTrace());
		}
	}

*/
}

