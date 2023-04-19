package Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class DriverUtil {
private DriverUtil(){}




    private static WebDriver driver; //we are using encapsulation logic here making driver private
    //we will need to create getter and setter for driver

    public static WebDriver getDriver(){
        if (driver==null){
            String browser=Properties_Reading_Util.getProperties("Browser");//chrome-headless

            switch (browser) {
                case "chrome" -> {
                    // WebDriverManager.chromedriver().setup();
                    ChromeOptions ops = new ChromeOptions();
                    ops.addArguments("--remote-allow-origins=*");;
                    driver = new ChromeDriver(ops);
                }
                case "firefox" -> {
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                }
                case "chrome-headless" -> {
                    ChromeOptions option = new ChromeOptions();
                    option.addArguments("--headless", "--remote-allow-origins=*");
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(option);
                }
                case "firefox-headless" -> {
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver(new FirefoxOptions().setHeadless(true));
                }
                case "safari-headless" -> {
                    WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver();
                }
            }
        }
        return driver;
    }

    public static void CloseDriver(){
        if (driver!=null){
            driver.quit();
            driver=null;
        }
    }
}

