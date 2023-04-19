package exp1.exp11.Step_Definition;

import Utilities.DriverUtil;
import Utilities.TestContextSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class OfferPageStepDefinition {
    TestContextSetup textContextSetup;
    public OfferPageStepDefinition(TestContextSetup textContextSetup)
    {
        this.textContextSetup = textContextSetup;
    }
    @Then("User searched for {string} in offer page to check if product exist")
    public void user_searched_for_the_same_shortname_in_offer_page_to_check_if_product_exist(String ShortName) {
        System.out.println("DriverUtil before handle= " + DriverUtil.getDriver().getTitle());
        DriverUtil.getDriver().findElement(By.xpath("//a[.='Top Deals']")).click();
    Set<String>Windows = DriverUtil.getDriver().getWindowHandles();
        List<String> AllWindows = new ArrayList<>(Windows);
DriverUtil.getDriver().switchTo().window(AllWindows.get(1));
        DriverUtil.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    WebElement SearchBox =     DriverUtil.getDriver().findElement(By.id("search-field"));

    SearchBox.sendKeys(ShortName);
        WebElement Tom =     DriverUtil.getDriver().findElement(By.xpath("//td[.='Tomato']"));
       // textContextSetup.Tom_Text= Tom.getText();
   SearchBox.clear();
   SearchBox.sendKeys("Tomato");
 // textContextSetup.Tomato_Text= Tom.getText();


    }
    @And("^validate product name is in offer page matches with landing page$")
    public void validate_product_name_is_in_offer_page_matches_with_landing_page()  {
    //    Assert.assertEquals(textContextSetup.Tom_Text, "Tomato");
   //     Assert.assertEquals(textContextSetup.Tomato_Text, "Tomato");
    }

}
