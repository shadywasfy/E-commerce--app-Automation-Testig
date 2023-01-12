package stepDefintions;

import Pages.P09_ShoppingCartPage;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class D09_ShoppingCartStepDefinition {

    WebDriver driver =Hooks.driver;
    P09_ShoppingCartPage cart =new P09_ShoppingCartPage(driver);


    @And("user select 'cell phones' from 'electronics' category")
    public void categories() throws InterruptedException {

        Actions action = new Actions(driver);
        action.moveToElement(cart.categoriesTypePOM()).perform();
        cart.subCategoryPOM().click();
        Thread.sleep(3000);

    }
    @And("user add products to cart")
    public void categoryPOM() throws InterruptedException {
        cart.product1POM().click();
        Thread.sleep(3000);

        cart.product2POM().click();
        Thread.sleep(3000);

        cart.product3POM().click();
        Thread.sleep(3000);

    }
    @And("user go to the cart page")
    public void cartPage() throws InterruptedException {
        cart.cartPagePOM().click();
        Thread.sleep(3000);
    }
}
