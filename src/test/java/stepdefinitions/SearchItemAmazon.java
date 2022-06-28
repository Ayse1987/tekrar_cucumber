package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.Driver;
import utilities.JSUtils;

public class SearchItemAmazon {
   AmazonPage amazon=new AmazonPage();
    @Given("is on amazon home page")
    public void is_on_amazon_home_page() {
        Driver.getDriver().get("https://www.amazon.com");




    }
    @Given("usersend backpack to search box")
    public void usersend_backpack_to_search_box() {

        amazon.searchBox.sendKeys("back pack"+Keys.ENTER);
    }
    @Then("verify result in page")
    public void verify_result_in_page() {

    }

}
