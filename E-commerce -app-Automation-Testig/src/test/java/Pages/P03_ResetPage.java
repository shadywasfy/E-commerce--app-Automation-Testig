package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class P03_ResetPage {

    WebDriver driver;
    public P03_ResetPage(WebDriver driver){
        this.driver = driver ;
        PageFactory.initElements(driver,this);

    }

    public WebElement emailPOM(){
        return driver.findElement(By.id("Email"));
    }


    public WebElement flashPOM(){
        return   driver.findElement(By.id("bar-notification"));
    }


    public void resetSteps( String email){
        //enter username using POM
        emailPOM().clear();
        emailPOM().sendKeys(email);


    }
}


