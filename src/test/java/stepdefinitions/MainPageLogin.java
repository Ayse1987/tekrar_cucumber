package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.TestPage;
import utilities.ConfigReader;
import utilities.Driver;

public class MainPageLogin {
    TestPage testPage=new TestPage();
    @Given("user is in the main page")
    public void user_is_in_the_main_page() {
        Driver.getDriver().get(ConfigReader.getProperty("test_address_url"));

    }
    @Given("user sends username")
    public void user_sends_username() {
        testPage.email.sendKeys(ConfigReader.getProperty("test_address_username"));

    }
    @Given("user sends password")
    public void user_sends_password() {
        testPage.password.sendKeys("Test1234!");

    }
    @Given("user clicks submit button")
    public void user_clicks_submit_button() {
        testPage.singInButton.click();

    }
    @Then("verify the login page")
    public void verify_the_login_page() {


    }
    @Then("user closes the driver")
    public void user_closes_the_driver() {
       Driver.closeDriver();
    }
}
