package exp2.Page_Objects;

import Utilities.DriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;

public class LandingPage {

By search = By.xpath("//input[@type='search']");
By productName = By.xpath("//h4[.='Tomato - 1 Kg']");
    By TopDeals = By.xpath("//a[.='Top Deals']");
public void SearchItem(String name){
   DriverUtil.getDriver().findElement(search).sendKeys(name,Keys.ENTER);

}
public void getSearchText(){
   DriverUtil.getDriver().findElement(search).getText();
}
public String getProductName(){
  return DriverUtil.getDriver().findElement(productName).getText();
}
    public void CleanSearchBox(){
        DriverUtil.getDriver().findElement(search).clear();
    }

    public boolean productNameIsDisplayed(){
   return DriverUtil.getDriver().findElement(productName).isDisplayed();
    }
    public void GoToOfferPage() {
        DriverUtil.getDriver().findElement(TopDeals).click();
    }
}
