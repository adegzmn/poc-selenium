package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Contact_Us_Steps {
//    private WebDriver driver;

//    @Before
//    public void setup() {
//        System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dir" + "/src/main/java/drivers/chromedriver"));
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
//        driver = new ChromeDriver(chromeOptions);
//        driver.manage().window().maximize();
//    }
//
//    @After
//    public void tearDown(){
//        driver.quit();
//    }

    @Given("I access the WebDriver University - Contact Us Page")
    public void i_access_the_web_driver_university_contact_us_page() {
//        driver.get("http://webdriveruniversity.com/Contact-Us/contactus.html");
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Test 1");
    }

    @When("I enter a unique first name")
    public void i_enter_a_unique_first_name() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Test 2");
    }

    @When("I enter a unique last name")
    public void i_enter_a_unique_last_name() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Test 3");
    }

    @When("I enter a unique email address")
    public void i_enter_a_unique_email_address() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Test 4");
    }

    @When("I enter a unique comment")
    public void i_enter_a_unique_comment() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Test 5");
    }

    @When("I click on the submit button")
    public void i_click_on_the_submit_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Test 6");
    }

    @Then("I should be presented with a successful contact us submission message")
    public void i_should_be_presented_with_a_successful_contact_us_submission_message() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Test 7");
    }
}
