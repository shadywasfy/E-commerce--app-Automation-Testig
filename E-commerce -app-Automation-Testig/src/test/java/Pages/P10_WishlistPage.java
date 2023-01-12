package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class P10_WishlistPage {
    WebDriver driver;
    public P10_WishlistPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public WebElement product1POM() {
        return driver.findElement(By.xpath("(//button[@class='button-2 add-to-wishlist-button'])[3]"));
    }
    public WebElement product2POM() {
        return driver.findElement(By.xpath("(//button[@class='button-2 add-to-wishlist-button'])[2]"));
    }
    public WebElement product3POM() {
        return driver.findElement(By.xpath("(//button[@class='button-2 add-to-wishlist-button'])[1]"));
    }
    public WebElement cartPagePOM() {
        return driver.findElement(By.xpath("//p[@class='content']/child::*"));
    }
}