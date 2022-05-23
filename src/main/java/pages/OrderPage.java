package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import static pages.SignInPage.driver;

public class OrderPage extends BasePage{
  @FindBy(css = ".standard-checkout.button-medium")
   WebElement proceedtosummary;
  @FindBy(css = "p >button")
   WebElement proceedtoaddres;
  @FindBy(id = "cgv")
   WebElement shippingcheckbox;
  @FindBy(css = "p >button")
   WebElement proceedtopayent;
  @FindBy(css = ".bankwire")
   WebElement paybybankwire;
  @FindBy(css = "#cart_navigation > button")
   WebElement confirmorder;
  @FindBy(css = ".box")
   WebElement number;

  public OrderPage(WebDriver driver) {
   // PageFactory.initElements(driver, this);
        super(driver);

  }

  public  ContactFormPage confirmOrder() {
    proceedtosummary.click();
    proceedtoaddres.click();
    shippingcheckbox.click();
    proceedtopayent.click();
    paybybankwire.click();
    confirmorder.click();
    return new ContactFormPage(driver);
  }

  public  String getOrderNumber() {
    String ordernumber = number.getText().substring(216, 225);
    return ordernumber;
  }


}
