package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_object.Phone_Compatibility;

public class PhoneCompatibilitySteps {
    private static final Logger LOGGER = LogManager.getLogger(PhoneCompatibilitySteps.class);
    WebDriver driver = Hooks.driver;

    @When("user clicks on Mobile option")
    public void Mobile() {
        new Phone_Compatibility(driver)
                .clicksOnMobile();
    }

    @And("clicks on Check Phone Compatibility")
    public void PhoneCompatibilities() {
        new Phone_Compatibility(driver)
                .clicksOnCheckPhoneCompatibility();
    }

    @And("clicks on Check Compatibility")
    public void CheckCompatibilities() {
        new Phone_Compatibility(driver)
                .clicksOnCheckCompatibility();
    }
    @Then("User lands on Check Phone Compatibility Page")
    public void landsOnCompatibility () {
        new Phone_Compatibility(driver)
                .ValidateCompatibilityPage();
    }

}
