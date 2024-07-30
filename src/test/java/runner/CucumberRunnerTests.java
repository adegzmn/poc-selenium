package runner;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerAdapter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Listeners;

@CucumberOptions(tags = "", features = {"src/test/resources/features/Contact_Us.feature"}, glue = {"stepDefinitions"},
        plugin = {})

@Listeners({ExtentITestListenerAdapter.class})
public class CucumberRunnerTests extends AbstractTestNGCucumberTests {

}