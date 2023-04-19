package exp3.RunTheTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/exp3/Features",glue = "exp3.DefineTheSteps", monochrome = true)
public class RoadRunner extends AbstractTestNGCucumberTests {
}
