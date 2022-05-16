package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage {
    WebDriver driver;
    @FindBy(css = ".standard-checkout.button-medium")
    WebElement proceedtosummary;
    @FindBy(css = "p >button")
    WebElement proceedtoaddres;
    @FindBy(id ="cgv")
            WebElement shippingcheckbox;
    @FindBy(css = "p >button")
            WebElement proceedtopayent;
    @FindBy(css = ".bankwire")
            WebElement paybybankwire;
    @FindBy(css = "#cart_navigation > button")
            WebElement confirmorder;

 /*    driver.findElement(By.cssSelector(".standard-checkout.button-medium")).click();
    driver.findElement(By.cssSelector("p >button")).click();
    driver.findElement(By.id("cgv")).click();
    driver.findElement(By.cssSelector("p >button")).click();
    driver.findElement(By.cssSelector(".bankwire")).click();
    driver.findElement(By.cssSelector("#cart_navigation > button")).click();*/

  public OrderPage(WebDriver driver) {
      this.driver = driver;
    PageFactory.initElements(driver, this);
  }
public void confirmOrder(){
    proceedtosummary.click();
    proceedtoaddres.click();
    shippingcheckbox.click();
    proceedtopayent.click();
    paybybankwire.click();
    confirmorder.click();

}
}
