package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="./src/main/java/features/cl.feature", glue= {"pages","wdMethods"})
public class RunTest {

}
