package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_object.Find_Store;
import page_object.Flex_Streaming;

public class FindStoreSteps {
    private static final Logger LOGGER = LogManager.getLogger(FindStoreSteps.class);
    WebDriver driver = Hooks.driver;

    @When("user clicks on Find a Store Option")
    public void RetailStore() {
        new Find_Store(driver)
                .clicksOnFindAStore();

    }

    @Then("User lands on Find a retail Store page")
    public void landsOnFindStorePage () {
        new Find_Store(driver)
                .ValidateFindStore();
    }


}
