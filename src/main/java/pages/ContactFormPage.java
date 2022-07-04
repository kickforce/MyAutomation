package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ContactFormPage extends BasePage {
  @FindBy(id = "id_contact")
   WebElement subjectheading;
  @FindBy(css = "div:nth-child(6) > div > select")
   List<WebElement> orderreference;
  @FindBy(css = "#message")
   WebElement messagebox;
  @FindBy(css = "#submitMessage")
   WebElement submitmesssage;
  @FindBy(css = "#contact-link > a")
   WebElement contactus;
  @FindBy(css = ".alert.alert-success")
  WebElement message;

  public void messageText(){
    message.getText().contains("Your message has been successfully sent to our team.");
  }

  public ContactFormPage(WebDriver driver) {super(driver);}

  public void subjectHeadingChoose() {
    Select subject = new Select(subjectheading);
    subject.selectByValue("2");
  }

  public void selectReference(String refenceordernumber) {

    List<WebElement> refnumber = orderreference;
    for (WebElement option : refnumber) {
      if (option.getText().contains(refenceordernumber)) {
        option.click();
        break;
      }
    }
  }

  public void enterText() {
    messagebox.sendKeys("I have a problem with my order. Could you help me,please?");
  }

  public void submitContactForm() {
    submitmesssage.click();
  }

  public void contactUs() {contactus.click();}
}
