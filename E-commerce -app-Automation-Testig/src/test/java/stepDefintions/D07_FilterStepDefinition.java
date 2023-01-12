package stepDefintions;

import Pages.P07_FilterPage;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class D07_FilterStepDefinition {

    WebDriver driver = Hooks.driver;
    P07_FilterPage filter = new P07_FilterPage(driver);


    @And("the user select Apparel  category")
    public void specific_category () throws InterruptedException {
      Actions action = new Actions(driver);
        action.moveToElement(filter.categoryTypePOM()).perform();
        Thread.sleep(1000);
    }
    @And("select shoes sub category")
    public void subCategoryPOM() throws InterruptedException {
        filter.subCategoryPOM().click();
        Thread.sleep(1000);
    }
    @And("user select colors")
    public void colorsPOM() throws InterruptedException {
        filter.greyColorPOM().click();
        Thread.sleep(1000);
        filter.blueColorPOM().click();
        Thread.sleep(1000);
    }

}
