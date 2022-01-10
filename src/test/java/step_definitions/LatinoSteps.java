package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_object.Latino;

public class LatinoSteps {
    private static final Logger LOGGER = LogManager.getLogger(LatinoSteps.class);
    WebDriver driver = Hooks.driver;

    @When("User mouse hovers to Tv&Streaming")
    public void TvAndsStreaming() {
        new Latino(driver)
                .MouseHoverToTvStreaming();
    }

    @And("Clicks on Latino from menu bar")
    public void clickOnLatino() {
        new Latino(driver)
                .clickLatino();
    }

    @And("Clicks on View Latino Channels")
    public void clickOnViewLatino() {
        new Latino(driver)
                .clickViewLatinoChannels();
    }

    @Then("View Latino Channel Lineup Page")
    public void LandsOnChannelPage () {
        new Latino(driver)
                .ValidateLatinoChannelsPage();
    }
}
