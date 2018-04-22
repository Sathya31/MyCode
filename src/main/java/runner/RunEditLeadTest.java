package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="./src/main/java/features", glue= {"pages","wdMethods"}, tags= {"Smoke"},
monochrome=true)
public class RunEditLeadTest {

}
