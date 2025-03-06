package stepDefinitions;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.util.List;

public class MainSteps{

    @Given("User is on NetBanking landing page")
    public void user_is_on_net_banking_landing_page() {
        // Write code here that turns the phrase above into concrete actions
        //Playwright, Selenium, API code,
        System.out.println("User landed on netbanking page");
        ChromeOptions options = new ChromeOptions();

// Create a temporary directory for user data, ensuring it is writable
String tempDir = "/tmp/selenium/user_data_" + System.currentTimeMillis();
options.addArguments("user-data-dir=" + tempDir);

// Optional: Run in headless mode in CI environments
options.addArguments("--headless");
options.addArguments("--no-sandbox");
options.addArguments("--disable-dev-shm-usage");

        // Initialize ChromeDriver with options
        WebDriver driver = new ChromeDriver(options);
       // WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
       // Assert.assertEquals(driver.getTitle(), "GreenKart - veg and fruits kart");
        driver.quit();

    }

    @Given("User is on Practice landing page")
    public void user_is_on_practice_landing_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Practice landing page");
        //Assert.assertTrue(true);
    }


    @When("User Signup into application")
    public void user_signup_into_application(List<String> data) {

        System.out.println(data.get(0));
        System.out.println(data.get(1));
        System.out.println(data.get(2));
        System.out.println(data.get(3));


    }

//  @When("User login into application with {string} and password {string}")
//		public void user_login_into_application_with_and_password(String username, String password) {
//		    // Write code here that turns the phrase above into concrete actions
//		System.out.println(username +"and password is "+password);
//
//		}

    @When("^User login into application with (.+) and password (.+)$")
    public void user_login_into_application_with_and_password(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(username +"and password is "+password);

    }



    @Then("Home Page is displayed")
    public void home_page_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Home page is displayed");
    }
    @Then("Cards are displayed")
    public void cards_are_displayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Cards are displayed");
    }


    @Given("setup the entries in database")
    public void setupEntries()
    {
        System.out.println("**********************");
        System.out.println("setup the entries in database");

    }

    @When("launch the browser from config variables")
    public void launchBrowser()
    {
        System.out.println("launch the browser from config variables");
    }

    @When("hit the home page url of banking site")
    public void hitUrl()
    {
        System.out.println("hit the home page url of banking site");
    }


}
