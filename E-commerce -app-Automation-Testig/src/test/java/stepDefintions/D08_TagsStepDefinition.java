 package stepDefintions;

import Pages.P08_TagsPage;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;

 public class D08_TagsStepDefinition {

    WebDriver driver =Hooks.driver;
    P08_TagsPage tag = new P08_TagsPage(driver);


    @And("the user click on random category 'apparel'")
    public void categories()  {
        tag.categoryTypePOM().click();
    }
    @And("select different tags")
    public void categoryPOM() throws InterruptedException {
        tag.tag1POM().click();
        Thread.sleep(1000);
        tag.tag2POM().click();
        Thread.sleep(1000);
        tag.tag3POM().click();
        Thread.sleep(1000);
    }

}
