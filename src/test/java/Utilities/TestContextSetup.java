package Utilities;

import exp3.PageObjects.PageObjectManager;
import org.openqa.selenium.WebDriver;

public class TestContextSetup {

  public WebDriver driver;
  public String LandingPageProductName;


  public TestBase testBase;

  public GenericUtils genericUtils;
public PageObjectManager pageObjectManager;
  public TestContextSetup(){
      testBase =new TestBase();
 pageObjectManager =new PageObjectManager(testBase.WebDriverManager());
 genericUtils = new GenericUtils(testBase.WebDriverManager());
  }
}
