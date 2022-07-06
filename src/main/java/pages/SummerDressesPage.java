package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SummerDressesPage extends BasePage {

  public SummerDressesPage(WebDriver driver) {
    super(driver);
  }

  @FindBy(xpath = "//*[@id='center_column']/ul/li[1]")
  WebElement dress;
  @FindBy(xpath = "//*[@id='center_column']/ul/li[1]/div/div[2]/div[2]/a[2]")
  WebElement morebtn;
  @FindBy(css = "#color_11")
  WebElement black;
  @FindBy(css = "#color_13")
  WebElement orange;
  @FindBy(css = "#color_14")
  WebElement blue;
  @FindBy(css = "#color_16")
  WebElement yellow;


  public void hoverDress() {
    Actions action = new Actions(driver);
    action.moveToElement(dress).build().perform();
    morebtn.click();
  }

  public void clickBlack() {
    black.click();
    driver.getCurrentUrl().contains("black");
  }

  public void clickOrange() {
    orange.click();
    driver.getCurrentUrl().contains("orange");
  }

  public void clickBlue() {
    blue.click();
    driver.getCurrentUrl().contains("blue");
  }

  public void clickYellow() {
    yellow.click();
    driver.getCurrentUrl().contains("yellow");
  }
}
