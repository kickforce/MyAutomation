package com.example.myautomation;

import MainPage.MainPage;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.selector.ByText;
import org.junit.BeforeClass;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import pages.*;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Condition.text;

public class MainPageTest extends BaseTest {
  private WebDriver driver;
private SignInPage signInPage;
//private BasePage basePage;

	@BeforeClass
	public void setUp() {
		driver=getDriver();
	}

  @Test
  public void openPageChrome() {
    Selenide.open("https://devby.io/");
    Selenide.$("div.navbar__row > nav > a:nth-child(1)").shouldHave(text("Новости"));
    Selenide.closeWindow();
  }

  @Test
  public void openPageFox() {
    System.setProperty("selenide.browser", "firefox");
    Selenide.open("https://devby.io/");
    Selenide.closeWindow();
  }

  @Test
  public void celeniumOpenPageFox() {
    System.setProperty("webdriver.gecko.driver", "/Users/vitali/IdeaProjects/geckodriver");
    WebDriver driver = new FirefoxDriver();
    String url = "https://devby.io/";
    driver.get(url);
    driver.close();
  }

  @Test
  public void celeniumOpenPageChrome() {
    System.setProperty("webdriver.chrome.driver", "/Users/vitali/IdeaProjects/chromedriver");
    WebDriver driver = new ChromeDriver();
    String url = "https://devby.io/";
    driver.get(url);
    driver.close();
  }


  @Test
   public void orderCasualDress() {
    //MainPage mainPage = new MainPage(driver);
    MainPage.openPage("http://automationpractice.com/index.php");
    SignInPage.logIn();
    SignInPage.logInAss("kickforce666@gmail.com", "123qweQWE");
    MainPage.dressesTopMenu();
    MainPage.casualdress();
    CasualDressPage.hoverDress();
    CasualDressPage.addToChart();
    MainPage.switchToWindow();
    CasualDressPage.proceedOnPopUp();
    OrderPage.confirmOrder();
    String ordernumber = OrderPage.getOrderNumber();
    ContactFormPage.contactUs();
    ContactFormPage.subjectHeadingChoose();
    ContactFormPage.selectReference(ordernumber);
    ContactFormPage.enterText();
    ContactFormPage.submitContactForm();
  }

  @Test
  public void regUser() {
    //MainPage mainPage = new MainPage(driver);
    MainPage.openPage("http://automationpractice.com/index.php");
    SignInPage.logIn();
    SignInPage.newUserCredentials("newuser@newuser.com");
    SignInPage.creatUser();
    NewUserPage.enterInformation();
    NewUserPage.submitForm();
  }

  @Test
  public void writeReview() {
    //MainPage mainPage = new MainPage(driver);
    MainPage.openPage("http://automationpractice.com/index.php");
    SignInPage.logIn();
    SignInPage.logInAss("kickforce666@gmail.com", "123qweQWE");
    MainPage.tshirtTopMenu();
    TshirtPage.dressHover();
    TshirtPage.clickMore();
    TshirtPage.openComment();
    TshirtPage.swithToCommentPage();
    TshirtPage.setFiveStart();
    TshirtPage.enterTitle();
    TshirtPage.enterComment("Faded short sleeve t-shirt with high neckline. Soft and stretchy material for a comfortable fit. Accessorize with a straw hat and you're ready for summer!");
    TshirtPage.submitCommnet();
    TshirtPage.switchToOkWindow();
    TshirtPage.approveWindow();
  }
}
