package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_object.Compare_Competition;

public class CompareCompetitionSteps {
    private static final Logger LOGGER = LogManager.getLogger(CompareCompetitionSteps.class);
    WebDriver driver = Hooks.driver;

    @When("user clicks on compare the competition option")
    public void Compares() {
        new Compare_Competition(driver)
                .clickCompareTheCompetition();

    }

//    @And("clicks on Xfinity VS. FiOS")
//    public void XfinityVSFiOs() {
//        new Compare_Competition(driver)
//                .clickXfinityVSFiOs();
//    }

    @Then("User lands on Xfinity VS. FiOs Page")
    public void landsOnComparePage() {
        new Compare_Competition(driver)
                .ValidateComparisonPage();
    }
}
