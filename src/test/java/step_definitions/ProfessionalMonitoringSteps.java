package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_object.Phone_Compatibility;
import page_object.Professional_Monitoring;

public class ProfessionalMonitoringSteps {
    private static final Logger LOGGER = LogManager.getLogger(ProfessionalMonitoringSteps.class);
    WebDriver driver = Hooks.driver;

    @When("User mouse hovers to Security")
    public void Security() {
        new Professional_Monitoring(driver)
                .mouseHoverOnHomeSecurity();
    }

    @And("clicks on Professional monitoring")
    public void Monitoring() {
        new Professional_Monitoring(driver)
                .clickProfessionalMonitoring();
    }

    @Then("User lands on professional monitoring page")
    public void landsOnMonitoring () {
        new Professional_Monitoring(driver)
                .validateMonitoringPage();
    }
}
