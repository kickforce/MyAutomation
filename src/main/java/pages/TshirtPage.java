package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class TshirtPage extends BasePage {
  @FindBy(css = ".product-container")
  WebElement dress;
  @FindBy(css = ".lnk_view.btn.btn-default > span")
  WebElement more;
  @FindBy(id = "content")
  WebElement comment;
  @FindBy(css = ".star_content > div:nth-child(7) > a")
  WebElement fivestart;
  @FindBy(id = "comment_title")
  WebElement title;
  @FindBy(xpath = "//*[@id='product_comments_block_extra']/ul/li/a")
  WebElement content;
  @FindBy(css = "#submitNewMessage")
  WebElement submitnewmessage;
  @FindBy(xpath = "//*[@id='product']/div[2]/div/div/div/p[2]/button/span")
  WebElement submitwindow;
  @FindBy(css = "")
  WebElement commenttext;

  public void checkComment() {
    commenttext.getText()
            .contains("Your comment has been added and will be available once approved by a moderator ");
  }

  public TshirtPage(WebDriver driver) {
    super(driver);
  }

  public void dressHover() {
    Actions action = new Actions(driver);
    action.moveToElement(dress).build().perform();
  }

  public void clickMore() {
    more.click();
  }

  public void openComment() {
    content.click();
  }

  public void swithToCommentPage() {
    driver.switchTo().activeElement();
  }

  public void setFiveStart() {
    fivestart.click();
  }

  public void enterTitle() {
    title.sendKeys("High quality product");
  }

  public void enterComment(String text) {
    comment.sendKeys(text);
  }

  public void submitCommnet() {
    submitnewmessage.click();
  }

  public void switchToOkWindow() {
    driver.switchTo().activeElement();
  }

  public void approveWindow() {
    submitwindow.click();
  }
}
