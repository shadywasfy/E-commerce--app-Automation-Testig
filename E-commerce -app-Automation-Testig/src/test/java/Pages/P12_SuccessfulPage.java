package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class P12_SuccessfulPage {
    WebDriver driver;
    public P12_SuccessfulPage(WebDriver driver){
        this.driver = driver ;
        PageFactory.initElements(driver,this);

    }
    public WebElement checkPOM(){
        return driver.findElement(By.id("termsofservice"));
    }
    public WebElement checkoutPOM(){
        return driver.findElement(By.id("checkout"));
    }
    public WebElement firstNamePOM() {
        return driver.findElement(By.id("BillingNewAddress_FirstName"));
    }
    public WebElement lastNamePOM() {
        return driver.findElement(By.id("BillingNewAddress_LastName"));
    }
    public WebElement emailAPOM() {
        return driver.findElement(By.id("BillingNewAddress_Email"));
    }
    public WebElement companyPOM() {
        return driver.findElement(By.id("BillingNewAddress_Company"));
    }

    public WebElement countryPOM() {
        return driver.findElement(By.id("BillingNewAddress_CountryId"));
    }
    public WebElement cityPOM() {
        return driver.findElement(By.id("BillingNewAddress_City"));
    }
    public WebElement address1POM() {
        return driver.findElement(By.id("BillingNewAddress_Address1"));
    }
    public WebElement address2POM() {
        return driver.findElement(By.id("BillingNewAddress_Address2"));
    }
    public WebElement zibCodePOM() {
        return driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
    }
    public WebElement phoneNumPOM() {
        return driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
    }
    public WebElement faxNumPOM() {
        return driver.findElement(By.id("BillingNewAddress_FaxNumber"));
    }
    public WebElement continueButton1POM() {
        return driver.findElement(By.xpath("(//div[@class='buttons']/child::*)[5]"));
    }
    public WebElement continueButton2POM() {
        return driver.findElement(By.xpath("(//div[@class='buttons']/child::*)[14]"));
    }
    public WebElement continueButton3POM() {
        return driver.findElement(By.xpath("(//div[@class='buttons']/child::*)[17]"));
    }
    public WebElement continueButton4POM() {
        return driver.findElement(By.xpath("(//div[@class='buttons']/child::*)[20]"));
    }
    public WebElement confirmPOM() {
        return driver.findElement(By.xpath("(//div[@class='buttons']/child::*)[23]"));
    }
        public void AddressSteps( ){
            firstNamePOM().clear();
            firstNamePOM().sendKeys("shady");

            lastNamePOM().clear();
            lastNamePOM().sendKeys("wasfy");
            emailAPOM().clear();
            emailAPOM().sendKeys("shadyyy@gmail.com");
            companyPOM().clear();
            companyPOM().sendKeys("Home");


            Select select =new Select(countryPOM());
            select.selectByVisibleText("Egypt");

            cityPOM().sendKeys("Giza");
            address1POM().sendKeys("Home1");
            address2POM().sendKeys("Home2");
            zibCodePOM().sendKeys("12511");
            phoneNumPOM().sendKeys("01268686868");
            faxNumPOM().sendKeys("45645645645645");

    }
}
