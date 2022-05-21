package com.example.myautomation;

import MainPage.MainPage;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Condition.text;

public class MainPageTest extends BaseTest {

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
    MainPage mainPage = new MainPage(driver);
    mainPage.openPage("http://automationpractice.com/index.php");
    SignInPage.logIn();
    SignInPage.logInAss("kickforce666@gmail.com", "123qweQWE");
    mainPage.topMenu();
    mainPage.casualdress();
    CasualDressPage.hoverDress();
    CasualDressPage.addToChart();
    mainPage.switchToWindow();
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
  public void regUser(){
    MainPage mainPage = new MainPage(driver);
    mainPage.openPage("http://automationpractice.com/index.php");
    SignInPage.logIn();
    SignInPage.newUserCredentials("newuser@newuser.com");
    SignInPage.creatUser();
    NewUserPage.enterInformation();
    NewUserPage.submitForm();
  }

  @Test
  public void writeReview() {
    System.setProperty("webdriver.chrome.driver", "/Users/vitali/IdeaProjects/chromedriver");
    WebDriver driver = new ChromeDriver();
    String url = "http://automationpractice.com/index.php";
    driver.get(url);
    driver.findElement(By.cssSelector(".header_user_info")).click();
    WebElement email = driver
            .findElement(By.cssSelector("#email"));
    email.sendKeys("kickforce666@gmail.com");
    WebElement pass = driver
            .findElement(By.cssSelector("#passwd"));
    pass.sendKeys("123qweQWE");
    driver.findElement(By.cssSelector(".icon-lock")).click();
    driver.findElement(By.cssSelector("#block_top_menu > ul > li:nth-child(3) > a")).click();
    Actions action = new Actions(driver);
    WebElement dress = driver
            .findElement(By.cssSelector(".product-container"));
    action.moveToElement(dress).build().perform();
    driver.findElement(By.cssSelector(".lnk_view.btn.btn-default > span")).click();
    driver.findElement(By.cssSelector(".open-comment-form")).click();
    driver.switchTo().activeElement();
    driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
    driver.findElement(By.cssSelector(".star_content > div:nth-child(7) > a")).click();
    driver.findElement(By.id("comment_title")).sendKeys("High quality product");
    driver.findElement(By.id("content")).sendKeys("Faded short sleeve t-shirt with high neckline. Soft and stretchy material for a comfortable fit. Accessorize with a straw hat and you're ready for summer!");
    driver.findElement(By.id("submitNewMessage")).click();
    driver.switchTo().activeElement();
    driver.findElement(new ByText("OK")).click();
  }

  @Test
  public void addBluse() {

  }


}
