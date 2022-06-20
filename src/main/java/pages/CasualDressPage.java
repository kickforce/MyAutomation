package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import static pages.SignInPage.driver;

public class CasualDressPage extends BasePage{
  @FindBy(css = ".product-container")
   WebElement casualdresshover;
  @FindBy(css = ".button.ajax_add_to_cart_button.btn.btn-default")
   WebElement addtochart;
  @FindBy(css = ".col-md-6 > div.button-container > a")
   WebElement proceedbutton;

  public CasualDressPage(WebDriver driver) {
      super(driver);
  }

  public  void hoverDress() {
    Actions action = new Actions(driver);
    action.moveToElement(casualdresshover).build().perform();
  }

  public  void addToChart() {
    addtochart.click();
  }

  public  OrderPage proceedOnPopUp() {
    proceedbutton.click();
    return new OrderPage(driver);
  }
}
