package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;
import pages.SignInPage;
import pages.TshirtPage;

public class MainPage extends BasePage {
  //static WebDriver driver;
  @FindBy(css = "#block_top_menu > ul > li:nth-child(2) > a")
  WebElement dresses;
  @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/ul/li[1]/a")
  WebElement casualdress;
  @FindBy(css = "#block_top_menu > ul > li:nth-child(3) > a")
  static WebElement tshirt;

  public MainPage(WebDriver driver) {
    /*this.driver = driver;
    PageFactory.initElements(driver, this);*/
    super(driver);


  }

  public SignInPage openPage(String urladdres) {
    driver.get(urladdres);
    return new SignInPage(driver);
  }

  public void dressesTopMenu() {
    Actions action = new Actions(driver);
    action.moveToElement(dresses).build().perform();
  }

  public void tshirtTopMenu() {
    tshirt.click();
    //return new TshirtPage(driver);
  }

  public void casualdress() {
    casualdress.click();
  }

  public void switchToWindow() {
    driver.switchTo().activeElement();
  }

}
