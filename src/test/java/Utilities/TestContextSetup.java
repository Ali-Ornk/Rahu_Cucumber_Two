package Utilities;

import exp3.PageObjects.PageObjectManager;
import org.openqa.selenium.WebDriver;

public class TestContextSetup {

//  This is the GODFATHER, HEART, TOP,KING... of all classes. We can think like roof of the Condo. All other classes are getting under this roof.
    //Each condo apartment has own roof like GenericUtils or TestBase or PageObjectManager. But this class (TestContextSetup) is big roof, top roof.
    //for calling
  public String LandingPageProductName;


  public TestBase testBase;

  public GenericUtils genericUtils;
public PageObjectManager pageObjectManager;
  public TestContextSetup(){ //in this constructor we are creating object of each small roof classes
      testBase =new TestBase(); // that instance is where we keep our Web-driver
 pageObjectManager =new PageObjectManager(testBase.WebDriverManager()); //all landing pages and their method are in this instance
 genericUtils = new GenericUtils(testBase.WebDriverManager()); //all our other methods will be called by using this instance
  }
}
