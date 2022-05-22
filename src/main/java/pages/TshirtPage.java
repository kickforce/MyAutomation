package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static pages.SignInPage.driver;

public class TshirtPage {
  @FindBy(css = ".product-container")
  static WebElement dress;
  @FindBy(css = ".lnk_view.btn.btn-default > span")
  static WebElement more;
  @FindBy(id = "content")
  static WebElement comment;
  @FindBy(css = ".star_content > div:nth-child(7) > a")
  static WebElement fivestart;
  @FindBy(id = "comment_title")
  static WebElement title;
  @FindBy(xpath = "//*[@id='product_comments_block_extra']/ul/li/a")
  static WebElement content;
  @FindBy(css = "#submitNewMessage")
  static WebElement submitnewmessage;
  @FindBy(xpath = "//*[@id='product']/div[2]/div/div/div/p[2]/button/span")
  static WebElement submitwindow;

  public TshirtPage(WebDriver driver) {
    PageFactory.initElements(SignInPage.driver, this);
  }

  public static void dressHover() {
    Actions action = new Actions(driver);
    action.moveToElement(dress).build().perform();
  }

  public static void clickMore() {
    more.click();
  }

  public static void openComment() {
    content.click();
  }

  public static void swithToCommentPage() {
    driver.switchTo().activeElement();

  }

  public static void setFiveStart() {
    fivestart.click();
  }

  public static void enterTitle() {
    title.sendKeys("High quality product");
  }

  public static void enterComment(String text) {
    comment.sendKeys(text);
  }

  public static void submitCommnet() {
    submitnewmessage.click();
  }

  public static void switchToOkWindow() {
    driver.switchTo().activeElement();
  }

  public static void approveWindow() {
    submitwindow.click();

  }
}
