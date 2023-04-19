package exp3.PageObjects;

import Utilities.TestContextSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
    public WebDriver driver;
    public LandingPage(WebDriver p_driver){
        this.driver =p_driver;
    }

    By Search = By.xpath("//input[@type='search']");
   By ProductName = By.xpath("//h4[.='Tomato - 1 Kg']");
   By TopDealPage = By.linkText("Top Deals");

    public void SearchItem(String name){
        driver.findElement(Search).sendKeys(name);
    }

    public void getSearchText(){
        driver.findElement(Search).getText();
    }

    public String getProductName(){
        return driver.findElement(ProductName).getText();
    }
    public void SelectTopDealsPage(){
        driver.findElement(TopDealPage).click();
    }
}
