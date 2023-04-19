package exp1.exp11.Step_Definition;
import Utilities.DriverUtil;
import Utilities.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LandingPageStepDefinition {

    TestContextSetup textContextSetup;
public LandingPageStepDefinition(TestContextSetup textContextSetup)
{
    this.textContextSetup = textContextSetup;
}


    @Given("User is on GreenCard Landing Page")
    public void user_is_on_green_card_landing_page() {

        DriverUtil.getDriver().get("https://rahulshettyacademy.com/seleniumPractise/#/");
    }

    @When("user searched with Shortname {string} and extracted actual name of product")
    public void user_searched_with_shortname_and_extracted_actual_name_of_product(String string) {
        WebElement SearchBox = DriverUtil.getDriver().findElement(By.xpath("//input[@type='search']"));
        SearchBox.sendKeys(string, Keys.ENTER);
        WebElement Tom = DriverUtil.getDriver().findElement(By.xpath("//h4[.='Tomato - 1 Kg']"));
        Assert.assertTrue(Tom.isDisplayed());
        DriverUtil.getDriver().navigate().back();
        SearchBox.clear();
       SearchBox.sendKeys("Tomato");
        Assert.assertTrue(Tom.isDisplayed());

    }




    }


