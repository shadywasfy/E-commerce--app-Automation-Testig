package stepDefintions;

import Pages.P01_RegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class D01_RegistrationStepDefinition {

    public static  WebDriver driver = Hooks.driver;

    P01_RegistrationPage registration= new P01_RegistrationPage(driver);

    @When("user navigate to registration page")
    public void user_navigate () throws InterruptedException {
        driver.navigate().to("https://demo.nopcommerce.com/register?returnUrl=%2Fcart");
        Thread.sleep(3000);

    }
    @And("user select his  gender")
    public void Gender(){
        registration.GenderPOM().click();
    }
    @And("user type the first name and last name")
    public void first_lastName()  {
        registration.FirstNamePOM().sendKeys("shady");
        registration.LastNamePOM().sendKeys("wasfy");
    }
    @And("user select date of birthday")
    public void date_of_birthday()  {
        Select select1 =new Select(registration.DayPOM());
        select1.selectByValue("10");
        Select select2 =new Select(registration.MonthPOM());
        select2.selectByValue("4");
        Select select3 =new Select(registration.YearPOM());
        select3.selectByValue("1996");

    }
    @And("user enter the emil")
    public void email()  {
        registration.EmailPOM().sendKeys("shadyy@gmail.com");
    }
    @And("user enter the company name")
    public void company()  {
        registration.CompanyPOM().sendKeys("Home");
    }
    @And("user select newsletter options")
    public void news_litter()  {
        registration.NewsLetterPOM().isEnabled();
    }
    @And("user enter password and confirm password")
    public void pass_confPass()  {
        registration.PasswordPOM().sendKeys("newproject");
        registration.ConfirmPasswordPOM().sendKeys("newproject");
    }

    @And("user click on register  button")
    public void register_button() throws InterruptedException {
     registration.ConfirmPasswordPOM().sendKeys(Keys.ENTER);
      Thread.sleep(3000);
    }
    //compare actual with expected result
    @Then("user could register successfully")
    public void success_register(){
        Assert.assertEquals("https://demo.nopcommerce.com/registerresult/1?returnUrl=/cart",driver.getCurrentUrl());
    }

//    @And("user close the browser")
//    public void close_browser() throws InterruptedException {
//        Thread.sleep(3000);
//        driver.quit();
//    }
//    @Given("user open the browser")
//    public void open_browser() throws InterruptedException {
//        //1 bridge between test scripts and browsers
//        String chromePath  = System.getProperty("user.dir") +"\\src\\main\\resources\\chromedriver.exe";
//        System.out.println(chromePath);
//        System.setProperty("webdriver.chrome.driver",chromePath);
//
//        //2 new object of webdriver
//        driver = new ChromeDriver();
//
//        //3 navigate to google website and maximize screen and sleep 3 seconds
//        driver.manage().window().maximize();
//        Thread.sleep(3000);
//
//        //4 creat new objects
//        registration = new RegistrationPage(driver);
//
//
//
//    }
}
