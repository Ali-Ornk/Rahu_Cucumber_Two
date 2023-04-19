package exp3.DefineTheSteps;

import Utilities.TestContextSetup;
import exp3.PageObjects.LandingPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;

import java.util.concurrent.TimeUnit;

public class LandingPageStepDefinitions {
    TestContextSetup testContextSetup;

    public LandingPageStepDefinitions(TestContextSetup p_testContextSetup) {
        this.testContextSetup = p_testContextSetup;  //This constructor will do the duties for @Given that is why we dont have any code in @Given method
                                                        //this method will do it in "LandingPage"
                                                      //   public void SearchItem(String name){
                                                  //        driver.findElement(Search).sendKeys(name);}

    }

    @Given("User is on GreenCard Landing Page ss")
    public void user_is_on_green_card_landing_page() {

    }

    @When("user searched with Shortname {string} and extracted actual name of product ss")
    public void user_searched_with_shortname_and_extracted_actual_name_of_product(String ProductNAme) {
        //we are creating an instance of landing page but it is NOT like LandingPage landing = new LandingPage(WebDriver driver)
        //We are calling it from our GODFATHER class
        //LandingPage instanceName = RoofClass    . smallRoofClas   . methodOfSmallRoofClass
        LandingPage landingPage = testContextSetup.pageObjectManager.getLandingPage();


        landingPage.SearchItem(ProductNAme);
        testContextSetup.testBase.WebDriverManager().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
       /* try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
        testContextSetup.LandingPageProductName = landingPage.getProductName();
        String newName = testContextSetup.LandingPageProductName;
        testContextSetup.LandingPageProductName = newName.substring(0, newName.indexOf(" "));
    }


}
