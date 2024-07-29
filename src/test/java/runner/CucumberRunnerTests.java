package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", features = {"src/test/resources/features/Contact_Us.feature"}, glue = {"stepDefinitions"},
        plugin = {})

public class CucumberRunnerTests extends AbstractTestNGCucumberTests {

}