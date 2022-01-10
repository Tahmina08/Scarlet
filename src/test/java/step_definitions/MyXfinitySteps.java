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
import page_object.My_Xfinity;
import utilities.ReadConfigFiles;

public class MyXfinitySteps {
    private static final Logger LOGGER = LogManager.getLogger(MyXfinitySteps.class);
    WebDriver driver = Hooks.driver;


    @When("user Clicks on MyXfinity Icon")
    public void ClicksOnMyXfinity() {
        new My_Xfinity(driver)
                .clickOnMyXfinity();
    }


    @Then("user lands on My Xfinity Page")
    public void validateMyXfinityPageLogo() {
        new My_Xfinity(driver)
                .ValidateMyXfinityPage();}


}
