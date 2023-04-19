package exp2.Steps;

import Utilities.DriverUtil;
import Utilities.TestContextSetup;
import exp2.Page_Objects.LandingPage;
import exp2.Page_Objects.OffersPage;

import io.cucumber.java.en.Then;
import org.testng.Assert;

public class OfferSteps {
    TestContextSetup textContextSetup;
    public OfferSteps(TestContextSetup textContextSetup)
    {
        this.textContextSetup = textContextSetup;
    }
    @Then("User searched for {string} in offer page to check if product exist s")
    public void user_searched_for_in_offer_page_to_check_if_product_exist_s(String string) {
        SwitchToOfferPAge();
        System.out.println("DriverUtil before handle= " + DriverUtil.getDriver().getTitle());
        OffersPage offersPage =new OffersPage();
        offersPage.SearchItem(string);
       // textContextSetup.Tom_Text= offersPage.getProductName();
        offersPage.CleanSearchBox();
        offersPage.SearchItem("Tomato");
       // textContextSetup.Tomato_Text= offersPage.getProductName();

    }
public void SwitchToOfferPAge(){
    LandingPage landingPage =new LandingPage();
    landingPage.GoToOfferPage();


}

    @Then("validate product name is in offer page matches with landing page s")
    public void validate_product_name_is_in_offer_page_matches_with_landing_page_s() {
       // Assert.assertEquals(textContextSetup.Tom_Text, "Tomato");
        //Assert.assertEquals(textContextSetup.Tomato_Text, "Tomato");
    }



}
