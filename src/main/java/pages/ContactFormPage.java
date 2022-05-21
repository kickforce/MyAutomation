package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ContactFormPage {
   @FindBy(id = "id_contact" )
    static WebElement subjectheading;
@FindBy(css = "div:nth-child(6) > div > select")
    static List<WebElement> orderreference;
    @FindBy(css = "#message")
    static WebElement messagebox;
    @FindBy(css = "#submitMessage")
    static WebElement submitmesssage;
     @FindBy(css = "#contact-link > a")
    static WebElement contactus;

  public ContactFormPage(WebDriver driver) {
    //  this.driver = driver;
    PageFactory.initElements(driver, this);
  }


public static void subjectHeadingChoose(){
     Select subject = new Select(subjectheading);
    subject.selectByValue("2");
}
public static void selectReference(String refenceordernumber) {

    List<WebElement> refnumber = orderreference;
    for (WebElement option : refnumber) {
      if (option.getText().contains(refenceordernumber)) {
        option.click();
        break;
      }
    }
}
public static void enterText(){
      messagebox.sendKeys("I have a problem with my order. Could you help me,please?");
}
public static void submitContactForm(){
      submitmesssage.click();
    }
    public static void contactUs(){
    contactus.click();
}
}
