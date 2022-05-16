package pages;

import MainPage.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
  WebDriver driver;

  @FindBy(css = "#email")
  WebElement email;
  @FindBy(css = "#passwd")
  WebElement password;
  @FindBy(css = ".icon-lock")
  WebElement submit;
  @FindBy(css = ".header_user_info")
    WebElement signin;

  public SignInPage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);

  }

  public void logInAss(String emailValue, String passwordValue){
    email.sendKeys(emailValue);
    password.sendKeys(passwordValue);
    submit.click();

  }
  public void logIn(){
     signin.click();
  }
}
