package stepDefintions;

import Pages.P10_WishlistPage;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;

public class D10_WishlistStepDefinition {

    WebDriver driver =Hooks.driver;
    P10_WishlistPage wish = new P10_WishlistPage(driver);

    @And("user add products to wishlist")
    public void categoryPOM() throws InterruptedException {
        wish.product1POM().click();
        Thread.sleep(3000);

        wish.product2POM().click();
        Thread.sleep(3000);

        wish.product3POM().click();
        Thread.sleep(3000);

    }
    @And("user go to the wishlist page")
    public void cartPage() throws InterruptedException {
        wish.cartPagePOM().click();
        Thread.sleep(3000);
    }
}
