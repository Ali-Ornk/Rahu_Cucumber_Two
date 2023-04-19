package exp2.Page_Objects;

import Utilities.DriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class OffersPage {


    By Search = By.id("search-field");
     By ProductName = By.xpath("//td[.='Tomato']");
    By TopDeals = By.xpath("//a[.='Top Deals']");
    public void SearchItem(String nameOfItem){
        DriverUtil.getDriver().findElement(Search).sendKeys(nameOfItem, Keys.ENTER);
    }

    public String getProductName(){
        return DriverUtil.getDriver().findElement(ProductName).getText();
    }

    public void CleanSearchBox(){
        DriverUtil.getDriver().findElement(TopDeals).clear();
    }
}
/*

 */