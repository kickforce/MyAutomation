package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {
  @FindBy(css = "#block_top_menu > ul > li:nth-child(2) > a")
  WebElement dresses;
  @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/ul/li[1]/a")
  WebElement casualdress;
  @FindBy(css = "#block_top_menu > ul > li:nth-child(3) > a")
  WebElement tshirt;

  @FindBy(css = "#block_top_menu > ul > li:nth-child(1) > a")
  WebElement women;

  @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[1]/ul/li[1]/ul/li[2]/a")
  WebElement blouse;
  @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/ul/li[3]/a")
  WebElement summerdress;

  public WomenPage clickWomen() {
    Actions action = new Actions(driver);
    action.moveToElement(women).build().perform();
    blouse.click();
    return new WomenPage(driver);
  }


  public MainPage(WebDriver driver) {
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

  public TshirtPage tshirtTopMenu() {
    tshirt.click();
    return new TshirtPage(driver);
  }

  public CasualDressPage casualdress() {
    casualdress.click();
    return new CasualDressPage(driver);
  }

  public void switchToWindow() {
    driver.switchTo().activeElement();
  }

  public void acceptAlertMessage() {
    driver.switchTo().alert().accept();
  }

  public SummerDressesPage summerDresses() {
    Actions action = new Actions(driver);
    action.moveToElement(dresses).build().perform();
    summerdress.click();
    return new SummerDressesPage(driver);
  }
}
