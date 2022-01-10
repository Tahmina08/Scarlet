package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_object.Flex_Streaming;

public class FlexStreamingSteps {
    private static final Logger LOGGER = LogManager.getLogger(FlexStreamingSteps.class);
    WebDriver driver = Hooks.driver;

    @When("user mouse hovers to Tv&Streaming option")
    public void TvAndStreaming() {
        new Flex_Streaming(driver)
                .mouseHoverToTvAndStreaming();

    }

   @And("clicks on Flex Streaming to open the page")
    public void FlexStreaming () {
        new Flex_Streaming(driver)
                .clicksOnFlexStreaming();
    }

    @Then("User lands on Xfinity Flex page")
    public void landsOnFlexStreaming () {
        new Flex_Streaming(driver)
                .ValidateFlexStreamingPage();
    }

}
