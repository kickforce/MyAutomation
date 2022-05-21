package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static pages.SignInPage.driver;

public class OrderPage {
    //WebDriver driver;
    @FindBy(css = ".standard-checkout.button-medium")
    static
    WebElement proceedtosummary;
    @FindBy(css = "p >button")
    static
    WebElement proceedtoaddres;
    @FindBy(id ="cgv")
    static
    WebElement shippingcheckbox;
    @FindBy(css = "p >button")
    static
    WebElement proceedtopayent;
    @FindBy(css = ".bankwire")
    static
    WebElement paybybankwire;
    @FindBy(css = "#cart_navigation > button")
    static
    WebElement confirmorder;
    @FindBy(css = ".box")
            static  WebElement number;



    // driver.findElement(By.cssSelector("#message")).sendKeys("I have a problem with my order. Could you help me,please?");
  //  driver.findElement(By.cssSelector("#submitMessage")).click();


    /*driver.findElement(By.cssSelector("#contact-link > a")).click();
    Select subject = new Select(driver.findElement(By.id("id_contact")));
    subject.selectByValue("2");*/

 /*    String textWithNumber = driver.findElement(By.cssSelector(".box")).getText();
    String number = textWithNumber.substring(216, 225);*/

 /*    driver.findElement(By.cssSelector(".standard-checkout.button-medium")).click();
    driver.findElement(By.cssSelector("p >button")).click();
    driver.findElement(By.id("cgv")).click();
    driver.findElement(By.cssSelector("p >button")).click();
    driver.findElement(By.cssSelector(".bankwire")).click();
    driver.findElement(By.cssSelector("#cart_navigation > button")).click();*/

  public OrderPage(WebDriver driver) {
    //  this.driver = driver;
    PageFactory.initElements(driver, this);
  }
public static ContactFormPage confirmOrder(){
    proceedtosummary.click();
    proceedtoaddres.click();
    shippingcheckbox.click();
    proceedtopayent.click();
    paybybankwire.click();
    confirmorder.click();
    return new ContactFormPage(driver);
}

public static String getOrderNumber(){
    String ordernumber = number.getText().substring(216, 225);;
    number.getText().substring(216, 225);
    return ordernumber;
}


}
