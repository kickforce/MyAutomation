package com.example.myautomation;

//import MainPage.MainPage;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.*;

import static com.codeborne.selenide.Condition.text;

public class MainPageTest extends BaseTest {
/*
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
  }*/

  @Test
  public void orderCasualDress() {
    MainPage mainPage = new MainPage(getDriver());
    SignInPage signInPage = mainPage.openPage("http://automationpractice.com/index.php");
    signInPage.logIn();
    signInPage.logInAss("kickforce666@gmail.com", "123qweQWE");
    mainPage.dressesTopMenu();
    CasualDressPage casualDressPage = mainPage.casualdress();
    casualDressPage.hoverDress();
    casualDressPage.addToChart();
    mainPage.switchToWindow();
    OrderPage orderPage = casualDressPage.proceedOnPopUp();
    orderPage.confirmOrder();
    orderPage.ordertext();
  }

  @Test
  public void regUser() {
    MainPage mainPage = new MainPage(getDriver());
    SignInPage signInPage = mainPage.openPage("http://automationpractice.com/index.php");
    signInPage.logIn();
    signInPage.newUserCredentials("newuser5@newuser.com");
    NewUserPage newUserPage = signInPage.creatUser();
    newUserPage.enterInformation();
    MainPage mainPage1 = newUserPage.submitForm();
    mainPage1.dressesTopMenu();
    CasualDressPage casualDressPage = mainPage1.casualdress();
    casualDressPage.hoverDress();
    casualDressPage.addToChart();
    mainPage.switchToWindow();
    OrderPage orderPage = casualDressPage.proceedOnPopUp();
    ContactFormPage contactFormPage = orderPage.confirmOrder();
    String ordernumber = orderPage.getOrderNumber();
    contactFormPage.contactUs();
    contactFormPage.subjectHeadingChoose();
    contactFormPage.selectReference(ordernumber);
    contactFormPage.enterText();
    contactFormPage.submitContactForm();
    contactFormPage.messageText();

  }

  @Test
  public void writeReview() {
    MainPage mainPage = new MainPage(getDriver());
    SignInPage signInPage = mainPage.openPage("http://automationpractice.com/index.php");
    signInPage.logIn();
    signInPage.logInAss("kickforce666@gmail.com", "123qweQWE");
    TshirtPage tshirtPage = mainPage.tshirtTopMenu();
    tshirtPage.dressHover();
    tshirtPage.clickMore();
    tshirtPage.openComment();
    tshirtPage.swithToCommentPage();
    tshirtPage.setFiveStart();
    tshirtPage.enterTitle();
    tshirtPage.enterComment("Faded short sleeve t-shirt with high neckline. Soft and stretchy material for a comfortable fit. Accessorize with a straw hat and you're ready for summer!");
    tshirtPage.submitCommnet();
    tshirtPage.switchToOkWindow();
    tshirtPage.checkComment();
    tshirtPage.approveWindow();
  }

  @Test
  public void addBlouse() {
    MainPage mainPage = new MainPage(getDriver());
    SignInPage signInPage = mainPage.openPage("http://automationpractice.com/index.php");
    signInPage.logIn();
    signInPage.logInAss("kickforce666@gmail.com", "123qweQWE");
    WomenPage womenPage = mainPage.clickWomen();
    womenPage.hoverBlouse();
    womenPage.addToWishlist();
    womenPage.closeWindow();
    womenPage.openAccount();
    womenPage.openWishList();
    womenPage.openFirstElement();
    womenPage.deleteElement();
    mainPage.acceptAlertMessage();
  }

  @Test
  public void checkDifferentColourDress() {
    MainPage mainPage = new MainPage(getDriver());
    mainPage.openPage("http://automationpractice.com/index.php");
    SummerDressesPage summerDressesPage = mainPage.summerDresses();
    summerDressesPage.hoverDress();
    summerDressesPage.clickBlack();
    summerDressesPage.clickOrange();
    summerDressesPage.clickBlue();
    summerDressesPage.clickYellow();
  }
}
