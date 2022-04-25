package com.example.myautomation;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;

public class MainPageTest {

  @Test
  public void openPageChrome() {
    Configuration.pageLoadTimeout=6000;
    Selenide.open("http://automationpractice.com/index.php");
    Selenide.$(".sf-with-ul").shouldHave(text("Women"));
    Selenide.closeWindow();
  }

    @Test
  public void openPageFox() {
    System.setProperty("selenide.browser", "firefox");
    Selenide.open("https://pikabu.ru");
    Selenide.closeWindow();
  }

  @Test
  public void celeniumOpenPageFox() {
    System.setProperty("webdriver.gecko.driver", "/Users/vitali/IdeaProjects/geckodriver");
    WebDriver driver = new FirefoxDriver();
    String url = "https://pikabu.ru";
    driver.get(url);
    driver.close();
  }

  @Test
  public void celeniumOpenPageChrome() {
    System.setProperty("webdriver.chrome.driver", "/Users/vitali/IdeaProjects/chromedriver");
    WebDriver driver = new ChromeDriver();
    String url = "https://pikabu.ru";
    driver.get(url);
    driver.close();
  }
}
