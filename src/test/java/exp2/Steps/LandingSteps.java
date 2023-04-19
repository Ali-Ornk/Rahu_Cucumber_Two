package exp2.Steps;
import Utilities.DriverUtil;
import Utilities.TestContextSetup;
import exp2.Page_Objects.LandingPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LandingSteps {

    TestContextSetup textContextSetup;
    public LandingSteps(TestContextSetup textContextSetup)
    {
        this.textContextSetup = textContextSetup;
    }

    @Given("User is on GreenCard Landing Page s")
    public void user_is_on_green_card_landing_page_s() {
        DriverUtil.getDriver().get("https://rahulshettyacademy.com/seleniumPractise/#/");
    }



    @When("user searched with Shortname {string} and extracted actual name of product s")
    public void user_searched_with_shortname_and_extracted_actual_name_of_product_s(String string) {
        LandingPage landingPage = new LandingPage();
        landingPage.SearchItem(string);
        System.out.println(landingPage.getProductName());
        landingPage.getSearchText();
        DriverUtil.getDriver().navigate().back();
        landingPage.CleanSearchBox();
        landingPage.SearchItem("Tomato");
        Assert.assertTrue(landingPage.productNameIsDisplayed());

    }




}
