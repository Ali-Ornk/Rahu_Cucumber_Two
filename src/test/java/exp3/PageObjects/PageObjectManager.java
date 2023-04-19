package exp3.PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
   public WebDriver driver;
    public LandingPage landingPage; //we called landing page here to put and create a method make us reach landing page
    public OffersPage offersPage; ////we called offers page here to put and create a method make us reach offers page





    public PageObjectManager(WebDriver p_driver){  //Constructor of this class and for using webdriver we should do it
        this.driver= p_driver;
    }

    public LandingPage getLandingPage(){ //by this method we will reach to LandingPage
       landingPage= new LandingPage(driver);
       return landingPage;
    }

    public OffersPage getOffersPage(){
        offersPage =new OffersPage(driver);//by this method we will reach to OffersPage
        return offersPage;
    }
}
//Why we created this class? we already have classes and we can create their instances!
//Purpose of it to collect everything in one class
//even this PageObjectManager class will go to another top class to manage our code from one class