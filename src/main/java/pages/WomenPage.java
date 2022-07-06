package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class WomenPage extends BasePage {

  public WomenPage(WebDriver driver) {
    super(driver);
  }

  @FindBy(css = ".product-container")
  WebElement blouse;
  @FindBy(css = ".lnk_view.btn.btn-default > span")
  WebElement moreBtn;
  @FindBy(id = "wishlist_button")
  WebElement wishlistbtn;
  @FindBy(css = ".fancybox-item.fancybox-close")
  WebElement wishlistcross;
  @FindBy(css = ".account")
  WebElement account;
  @FindBy(css = "div:nth-child(2) > ul > li > a > span")
  WebElement wishlist;

  @FindBy(css = "td:nth-child(1) > a")
  WebElement  firstelement;

  @FindBy(css = ".icon-remove ")
  WebElement deleteelement;

  public void hoverBlouse() {
    Actions action = new Actions(driver);
    action.moveToElement(blouse).build().perform();
    moreBtn.click();
  }

  public void addToWishlist(){
    wishlistbtn.click();
  }
  public void closeWindow(){
    driver.switchTo().activeElement();
    wishlistcross.click();
  }
  public void openAccount(){
    account.click();
  }

  public void openWishList(){
    wishlist.click();
  }
  public void openFirstElement(){
    firstelement.click();
  }
  public void deleteElement(){
    deleteelement.click();
  }
}
