package Utilities;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class GenericUtils { // this util has the methods which can perform some duties like window handling and other
                            // purpose of this util is instead of writing blocks of codes everytime for each method
                            //by creating instance of this class we can handle problems instead of writing block of codes
    public WebDriver driver;
public GenericUtils(WebDriver p_driver){
    this.driver = p_driver;
}

    public void SwitchWindowToChild(){
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();//instead of creating a list we crate this
        String Parent = i1.next();
        String Child = i1.next();
        driver.switchTo().window(Child);
    }
}
