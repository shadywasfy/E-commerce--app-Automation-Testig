package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class P05_CurrenciesPage {
    WebDriver driver;
    public P05_CurrenciesPage(WebDriver driver){
        this.driver = driver ;
        PageFactory.initElements(driver,this);

    }

    public WebElement currnciesPOM(){
        return driver.findElement(By.id("customerCurrency"));

    }


}
