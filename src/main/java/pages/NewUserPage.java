package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class NewUserPage extends BasePage{

  @FindBy(id = "id_gender1")
   WebElement gender;
  @FindBy(id = "customer_firstname")
   WebElement firstname;
  @FindBy(id = "customer_lastname")
   WebElement lastname;
  @FindBy(id = "newsletter")
   WebElement newsletter;
  @FindBy(id = "optin")
   WebElement option;
  @FindBy(id = "days")
   WebElement day;
  @FindBy(id = "months")
   WebElement month;
  @FindBy(id = "years")
   WebElement year;
  @FindBy(id = "passwd")
   WebElement password;
  @FindBy(id = "company")
   WebElement company;
  @FindBy(id = "address1")
   WebElement addres;
  @FindBy(id = "city")
   WebElement city;
  @FindBy(id = "id_state")
   WebElement state;
  @FindBy(id = "postcode")
   WebElement postcode;
  @FindBy(id = "other")
   WebElement other;
  @FindBy(id = "phone")
   WebElement phone;
  @FindBy(id = "phone_mobile")
   WebElement phonemobile;
  @FindBy(id = "alias")
   WebElement alias;
  @FindBy(id = "submitAccount")
   WebElement submitaccount;

  public NewUserPage(WebDriver driver) {super(driver);}

  public  void enterInformation(){
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

  public  void submitForm() {
  submitaccount.click();
  }

}
