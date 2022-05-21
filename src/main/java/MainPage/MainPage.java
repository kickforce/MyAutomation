package MainPage;

import com.beust.ah.A;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.SignInPage;

public class MainPage {
  WebDriver driver;
  @FindBy(css = "#block_top_menu > ul > li:nth-child(2) > a")
  WebElement blocktopmenu;
  @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/ul/li[1]/a")
  WebElement casualdress;


    //driver.findElement(By.cssSelector(".col-md-6 > div.button-container > a")).click();



  //WebElement dresstab = driver.findElement(By.cssSelector("#block_top_menu > ul > li:nth-child(2) > a"));
   // action.moveToElement(dresstab).build().perform();
    //driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[2]/ul/li[1]/a")).click();

  public MainPage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);

  }

  public SignInPage openPage(String urladdres) {
    driver.get(urladdres);
    return new SignInPage(driver);
  }
  public void topMenu(){
    Actions action = new Actions(driver);
    action.moveToElement(blocktopmenu).build().perform();
  }
  public void casualdress(){
    casualdress.click();
  }
  public void switchToWindow(){
    driver.switchTo().activeElement();
  }

}
