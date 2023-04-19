package exp3.PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
   public WebDriver driver;
    public LandingPage landingPage;
    public OffersPage offersPage;





    public PageObjectManager(WebDriver p_driver){  //Constructor of this class
        this.driver= p_driver;
    }

    public LandingPage getLandingPage(){
       landingPage= new LandingPage(driver);
       return landingPage;
    }

    public OffersPage getOffersPage(){
        offersPage =new OffersPage(driver);
        return offersPage;
    }
}
