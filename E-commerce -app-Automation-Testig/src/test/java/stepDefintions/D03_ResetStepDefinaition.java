package stepDefintions;
import Pages.P03_ResetPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class D03_ResetStepDefinaition {

    WebDriver driver = Hooks.driver;
    P03_ResetPage reset = new P03_ResetPage(driver);

    @And("user navigate to reset page")
    public void user_navigate() throws InterruptedException {
        driver.navigate().to("https://demo.nopcommerce.com/passwordrecovery");
        Thread.sleep(3000);
    }

    @When("^the user enter \"(.*)\"$")
    public void Email_Account(String email) {
        reset.resetSteps(email);
    }

    @And("user click on recover button")
    public void recover_button() throws InterruptedException {
        reset.emailPOM().sendKeys(Keys.ENTER);
        Thread.sleep(3000);
    }

    @Then("user could reset password successfully")
    public void Text_msg() {
        String expectedResult = "Email with instructions has been sent to you.";
        String actualResult = reset.flashPOM().getText();
        System.out.println("actualResult : " + actualResult);

        // Assert.assertTrue("Notification message: Text is true ", actualResult.contains(expectedResult));
        Assert.assertEquals("Notification message: Text is true ", actualResult.contains(expectedResult), true);
    }
}