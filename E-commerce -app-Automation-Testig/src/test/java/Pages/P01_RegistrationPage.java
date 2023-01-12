package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class P01_RegistrationPage {
    WebDriver driver ;
    public P01_RegistrationPage(WebDriver driver){
        this.driver = driver ;
        PageFactory.initElements(driver,this);

    }

    public WebElement GenderPOM(){
        return   driver.findElement(By.id("gender-male"));
    }
    public WebElement FirstNamePOM(){
        return   driver.findElement(By.id("FirstName"));
    }
    public WebElement LastNamePOM(){
        return   driver.findElement(By.id("LastName"));
    }
    public WebElement DayPOM(){
        return   driver.findElement(By.name("DateOfBirthDay"));
    }
    public WebElement MonthPOM(){
        return   driver.findElement(By.name("DateOfBirthMonth"));
    }
    public WebElement YearPOM(){
        return   driver.findElement(By.name("DateOfBirthYear"));
    }
    public WebElement EmailPOM(){
        return   driver.findElement(By.id("Email"));
    }
    public WebElement CompanyPOM(){
        return   driver.findElement(By.id("Company"));
    }
    public WebElement NewsLetterPOM(){
        return   driver.findElement(By.id("Newsletter"));
    }
    public WebElement PasswordPOM(){
        return   driver.findElement(By.id("Password"));
    }
    public WebElement ConfirmPasswordPOM(){
        return   driver.findElement(By.id("ConfirmPassword"));
    }






}
