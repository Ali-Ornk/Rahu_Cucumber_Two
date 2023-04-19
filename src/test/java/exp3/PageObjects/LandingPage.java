package exp3.PageObjects;

import Utilities.TestContextSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {  //This class helps us to get locator in Landing page and make the maintenance easier
    public WebDriver driver;
    public LandingPage(WebDriver p_driver){
        this.driver =p_driver;
    } //for using driver we r creating this constructor


    /*
    *Why we are creating this locators?
    * -to make the maintenance easier
    * -to get rid of the hard-codding in our test methods
     */
    By Search = By.xpath("//input[@type='search']"); //instead of @FindBy we are using this By nameOfVariable = By.locatorType(path)
   By ProductName = By.xpath("//h4[.='Tomato - 1 Kg']");
   By TopDealPage = By.linkText("Top Deals");



    public void SearchItem(String name){
        driver.findElement(Search).sendKeys(name);
        /*
         * By this method we will get the search bar and send element in it
         */
    }

    public void getSearchText(){
        driver.findElement(Search).getText();
    }

    public String getProductName(){
        return driver.findElement(ProductName).getText();
        /*
         *By this method we will reach the product and get the text of product
         */
    }
    public void SelectTopDealsPage(){
        driver.findElement(TopDealPage).click();
        /*
        *By this method we will open the "Top Deal" page
         */
    }
}
