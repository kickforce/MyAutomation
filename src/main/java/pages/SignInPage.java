package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends BasePage {
  private WebDriver driver;

  @FindBy(css = "#email")

  WebElement email;
  @FindBy(css = "#passwd")

  WebElement password;
  @FindBy(css = ".icon-lock")

  WebElement submit;
  @FindBy(css = ".header_user_info")

  WebElement signin;
  @FindBy(css = "#email_create")

  WebElement createemail;
  @FindBy(css = "#SubmitCreate")

  WebElement createuser;

  public SignInPage(WebDriver driver) {
    /*this.driver = driver;
    PageFactory.initElements(driver, this);*/
    super(driver);
  }

  public CasualDressPage logInAss(String emailValue, String passwordValue) {
    email.sendKeys(emailValue);
    password.sendKeys(passwordValue);
    submit.click();
    return new CasualDressPage(driver);
  }

  public void logIn() {
    signin.click();
  }

  public  void newUserCredentials(String newemail) {
    createemail.sendKeys(newemail);
  }

  public  NewUserPage creatUser() {
    createuser.click();
    return new NewUserPage(driver);
  }
}
