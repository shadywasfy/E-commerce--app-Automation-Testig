package stepDefintions;

import Pages.P05_CurrenciesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class D05_CurrenciesStepDefinition {

    WebDriver driver = Hooks.driver;
    P05_CurrenciesPage currency =new P05_CurrenciesPage(driver);


    @Then("the user click on customer currency and select us or Euro")
    public void currency() throws InterruptedException {
        Select select1 =new Select(currency.currnciesPOM());
        select1.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");
        Thread.sleep(1000);
        Select select2 =new Select(currency.currnciesPOM());
        select2.selectByValue("https://demo.nopcommerce.com/changecurrency/1?returnUrl=%2F");
        Thread.sleep(1000);
    }
}
