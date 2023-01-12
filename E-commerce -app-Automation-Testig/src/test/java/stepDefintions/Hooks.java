package stepDefintions;

import Mangers.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver  driver ;

    @Before
    public void openBrowser() throws InterruptedException {
        //set driverManger
        driver = DriverManager.getDriver();
        //2 new object of webdriver
        driver = new ChromeDriver();

        //3 configuration
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 4- navigate to url
        driver.navigate().to("https://demo.nopcommerce.com/");
        Thread.sleep(3000);
    }
    @After
    public static void quitDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }


}
