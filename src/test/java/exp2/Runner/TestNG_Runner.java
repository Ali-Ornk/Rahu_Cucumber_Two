package exp2.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/exp2/featurefile",glue = "exp2.Steps",monochrome = true)
public class TestNG_Runner extends AbstractTestNGCucumberTests  {
}
