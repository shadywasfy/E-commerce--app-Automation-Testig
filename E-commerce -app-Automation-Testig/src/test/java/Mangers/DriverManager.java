package Mangers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
    public static WebDriver driver;
    public static WebDriver getDriver(){
        if (driver == null){
            //1 bridge between test scripts and browsers
            String chromePath  = System.getProperty("user.dir") +"\\src\\main\\resources\\chromedriver.exe";
            System.setProperty("webdriver.chrome.driver",chromePath);




        }
        return driver;
    }
}
