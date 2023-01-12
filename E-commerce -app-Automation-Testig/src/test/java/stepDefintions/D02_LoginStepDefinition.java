package stepDefintions;

import Pages.P02_LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class D02_LoginStepDefinition {
    WebDriver driver =Hooks.driver;
    P02_LoginPage login = new P02_LoginPage(driver);




    @When("user navigate to login page")
    public void user_navigate ()  {
        driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");

    }
    @And("^user enter \"(.*)\" and \"(.*)\"$")
    public void valid_data(String email,String password){
        login.LoginSteps(email,password);
    }
    @And("user click on login button")
    public void login_button()  {
     login.passwordPOM().sendKeys(Keys.ENTER);

    }
    //compare actual with expected result
    @Then("user could login successfully")
    public void success_login(){
        Assert.assertEquals("https://demo.nopcommerce.com/",driver.getCurrentUrl());



    }

}
