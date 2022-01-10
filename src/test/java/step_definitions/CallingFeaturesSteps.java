package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_object.Calling_features;
import page_object.Flex_Streaming;

public class CallingFeaturesSteps {
    private static final Logger LOGGER = LogManager.getLogger(CallingFeaturesSteps.class);
    WebDriver driver = Hooks.driver;

    @When("user mouse hovers to Home Phone option")
    public void Phone() {
        new Calling_features(driver)
                .mouseHoverOnHomePhone();

    }

    @And("clicks on Features")
    public void Features () {
        new Calling_features(driver)
                .clickFeatures();
    }
    @And("clicks see all calling features")
    public void seeAll () {
        new Calling_features(driver)
                .clickOnSeeAllCallingFeatures();
    }

    @Then("User lands on Xfinity voice features page")
    public void landsOnVoiceFeatures() {
        new Calling_features(driver)
                .ValidateXfinityVoice();
    }
}
