package step_definitions;

import command_providers.ActOn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_object.Internet_Deals;
import utilities.ReadConfigFiles;

public class InternetDealSteps {

    private static final Logger LOGGER = LogManager.getLogger(InternetDealSteps.class);
    WebDriver driver = Hooks.driver;

    @Given("User is on the home page")
    public void navigateToHomePage() {
        String url = ReadConfigFiles.getPropertyValues("XfinityURL");
        ActOn.browser(driver).openBrowser(url);
        LOGGER.info("User is on the home page");

    }
    @When("user mouse hover to Internet Menu")
    public void mouseHoverToInternet() {
        new Internet_Deals(driver)
                .mouseHoverToInternetMenu();
    }

    @And("clicks on the Internet Deals option")
    public void clickOnInternetDeals() {
        new Internet_Deals(driver)
                .clicksOnInternetDeals();
    }

    @Then("user lands on the Internet Service Deals")
    public void ValidateDealsPage() {
      new Internet_Deals(driver)
              .ValidateInternetDealsPage();
    }

}
