package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static pages.SignInPage.driver;

public class OrderPage {
  @FindBy(css = ".standard-checkout.button-medium")
  static WebElement proceedtosummary;
  @FindBy(css = "p >button")
  static WebElement proceedtoaddres;
  @FindBy(id = "cgv")
  static WebElement shippingcheckbox;
  @FindBy(css = "p >button")
  static WebElement proceedtopayent;
  @FindBy(css = ".bankwire")
  static WebElement paybybankwire;
  @FindBy(css = "#cart_navigation > button")
  static WebElement confirmorder;
  @FindBy(css = ".box")
  static WebElement number;

  public OrderPage(WebDriver driver) {
    PageFactory.initElements(driver, this);
  }

  public static ContactFormPage confirmOrder() {
    proceedtosummary.click();
    proceedtoaddres.click();
    shippingcheckbox.click();
    proceedtopayent.click();
    paybybankwire.click();
    confirmorder.click();
    return new ContactFormPage(driver);
  }

  public static String getOrderNumber() {
    String ordernumber = number.getText().substring(216, 225);
    return ordernumber;
  }


}
