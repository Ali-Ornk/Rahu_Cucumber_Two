package exp3.DefineTheSteps;

import Utilities.GenericUtils;
import Utilities.TestContextSetup;
import exp3.PageObjects.LandingPage;
import exp3.PageObjects.OffersPage;
import exp3.PageObjects.PageObjectManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class OfferPAgeStepDefinitions {
PageObjectManager pageObjectManager;
    TestContextSetup testContextSetup;
    public OfferPAgeStepDefinitions(TestContextSetup p_testContextSetup){
        this.testContextSetup = p_testContextSetup;
    }
    public String offerPageProductNAme;



    @Then("User searched for {string} in offer page to check if product exist ss")
    public void user_searched_for_the_same_shortname_in_offer_page_to_check_if_product_exist(String ProductName) {
      SwitchToOffersPAge();

        OffersPage offersPage =new OffersPage(testContextSetup.testBase.WebDriverManager());

        offersPage.SearchItem(ProductName);
        testContextSetup.testBase.WebDriverManager().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        offerPageProductNAme = offersPage.getProductName();
        //  String offerPageProductNAme = DriverUtil.getDriver().findElement(By.xpath("//td[.='Tomato']")).getText();

    }
    public void SwitchToOffersPAge(){ //for using in other methods we created this window handler method
       // if (testContextSetup.driver.getCurrentUrl().equals("https://rahulshettyacademy.com/seleniumPractise/#/")) //if we wanna use this method for specific url
       // pageObjectManager =new PageObjectManager(testContextSetup.driver);
        LandingPage landingPage = testContextSetup.pageObjectManager.getLandingPage();
        landingPage.SelectTopDealsPage();
        testContextSetup.genericUtils.SwitchWindowToChild();

    }

    @And("^validate product name is in offer page matches with landing page ss")
    public void validate_product_name_is_in_offer_page_matches_with_landing_page() {

        Assert.assertEquals(offerPageProductNAme, testContextSetup.LandingPageProductName);

    }
}