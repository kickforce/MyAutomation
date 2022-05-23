package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
  static WebDriver driver;

  @FindBy(css = "#email")
  static
  WebElement email;
  @FindBy(css = "#passwd")
  static
  WebElement password;
  @FindBy(css = ".icon-lock")
  static
  WebElement submit;
  @FindBy(css = ".header_user_info")
  static
  WebElement signin;
  @FindBy(css = "#email_create")
  static
  WebElement createemail;
  @FindBy(css = "#SubmitCreate")
  static
  WebElement createuser;

  public SignInPage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);

  }

  public static CasualDressPage logInAss(String emailValue, String passwordValue) {
    email.sendKeys(emailValue);
    password.sendKeys(passwordValue);
    submit.click();
    return new CasualDressPage(driver);
  }

  public static void logIn() {
    signin.click();
  }

  public static void newUserCredentials(String newemail) {
    createemail.sendKeys(newemail);
  }

  public static NewUserPage creatUser() {
    createuser.click();
    return new NewUserPage(driver);
  }
}
