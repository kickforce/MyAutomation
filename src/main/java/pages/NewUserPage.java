package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class NewUserPage {

  @FindBy(id = "id_gender1")
  static WebElement gender;
  @FindBy(id = "customer_firstname")
  static WebElement firstname;
  @FindBy(id = "customer_lastname")
  static WebElement lastname;
  @FindBy(id = "newsletter")
  static WebElement newsletter;
  @FindBy(id = "optin")
  static WebElement option;
  @FindBy(id = "days")
  static WebElement day;
  @FindBy(id = "months")
  static WebElement month;
  @FindBy(id = "years")
  static WebElement year;
  @FindBy(id = "passwd")
  static WebElement password;
  @FindBy(id = "company")
  static WebElement company;
  @FindBy(id = "address1")
  static WebElement addres;
  @FindBy(id = "city")
  static WebElement city;
  @FindBy(id = "id_state")
  static WebElement state;
  @FindBy(id = "postcode")
  static WebElement postcode;
  @FindBy(id = "other")
  static WebElement other;
  @FindBy(id = "phone")
  static WebElement phone;
  @FindBy(id = "phone_mobile")
  static WebElement phonemobile;
  @FindBy(id = "alias")
  static WebElement alias;
  @FindBy(id = "submitAccount")
  static WebElement submitaccount;
  public NewUserPage(WebDriver driver) {
    PageFactory.initElements(SignInPage.driver, this);
  }

  public static void enterInformation(){
    gender.click();
    firstname.sendKeys("Ivan");
    lastname.sendKeys("Ivanov");
    newsletter.click();
    option.click();
    Select days = new Select(day);
    days.selectByValue("1");
    Select months = new Select(month);
    months.selectByValue("1");
    Select years = new Select(year);
    years.selectByValue("2020");
    password.sendKeys("12345");
    company.sendKeys("Kaseya");
    addres.sendKeys("701 Brickell Avenue");
    city.sendKeys("Miami");
    Select idstate = new Select(state);
    idstate.selectByVisibleText("Florida");
    postcode.sendKeys("33131");
    other.sendKeys("Additional information");
    phone.sendKeys("+375292929297");
    phonemobile.sendKeys("+375333333333");
    alias.sendKeys("18, Baker street");
  }

  public static void submitForm() {
  submitaccount.click();
  }

}
