package exp3.DefineTheSteps;

import Utilities.TestContextSetup;
import io.cucumber.java.After;

public class Hooks {
    TestContextSetup testContextSetup;
    public Hooks( TestContextSetup p_testContextSetup){
        testContextSetup=p_testContextSetup;
    }
    @After
    public void AfterScenario(){
        testContextSetup.testBase.WebDriverManager().quit();
    }
}
