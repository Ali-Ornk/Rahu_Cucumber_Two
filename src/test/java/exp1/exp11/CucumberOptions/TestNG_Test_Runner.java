package exp1.exp11.CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/exp1/exp11/Features",glue = "exp1/exp11/Step_Definition",monochrome = true
        //tags = "@chosenTests"  by '  tag="....." ' we can run specific tests
      //  tags ="@chosenTest1 or chosenTest2 "  by '  tag="...or.." 'we can run different type tests
        //tags = "not @chosenTests" will run test except " @chosenTests"
        // tags = "@chosenTest1 and @chosenTest2 "  by '  tag="...and.." 'it will look for tests has @chosenTest1 and @chosenTest2 at the same time
        //dryRun = true, //if created a step in feature file but we didnt create step definition it will show us and ask for to create it
        //         plugin = {"pretty","html:target/cucumber.html" , "json:target/cucumber.json" , "junit:target/cucumber.xml"}
        //
        //
        //
          )
public class TestNG_Test_Runner extends AbstractTestNGCucumberTests {

}
