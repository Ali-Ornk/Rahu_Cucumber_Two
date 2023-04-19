package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
    public WebDriver driver; // it is main, unique, top, king driver of all framework





    public WebDriver WebDriverManager() {

//with this method we will reach our TOP driver from other classes. it is mix of DriverUtil and PropertiesReadingUtil

        try {
            FileInputStream  fileInputStream = new FileInputStream(System.getProperty("user.dir") + "//src/Rahul_Cucumber_Two/src/test/recourses/global.properties");
            Properties properties = new Properties();
            properties.load(fileInputStream);
            String url = properties.getProperty("url");

        if (driver == null) {
            if (properties.getProperty("browser").equalsIgnoreCase("chrome") ){
                ChromeOptions ops = new ChromeOptions();
                ops.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(ops);
            } else if (properties.getProperty("browser").equalsIgnoreCase("firefox")) {
                WebDriverManager.firefoxdriver().getWebDriver();
                driver= new FirefoxDriver();
            }

            driver.get(url);

        }
        } catch (IOException e) {
            System.out.println("file has not found");
        }
        return driver;
    }
}