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
        driver.findElement(Search).sendKeys(name); //* By this method we will get the search bar and send element in it
    }

    public void getSearchText(){
        driver.findElement(Search).getText();
        /*
         *By this method we will reach the product and get the text of product
         */
    }

    public String getProductName(){
        return driver.findElement(ProductName).getText();
    }
}
