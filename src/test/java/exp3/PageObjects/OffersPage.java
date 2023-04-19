package exp3.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {

   WebDriver driver;


    public OffersPage(WebDriver p_driver){
        driver =p_driver;
    }

    By Search = By.xpath("//input[@type='search']");
    By ProductName = By.cssSelector("tr td:nth-child(1)");

    public void SearchItem(String name){
        driver.findElement(Search).sendKeys(name);
    }

    public void getSearchText(){
        driver.findElement(Search).getText();
    }

    public String getProductName(){
        return driver.findElement(ProductName).getText();
    }
}
