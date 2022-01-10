package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page_object.Speed_Test;


public class SpeedTestSteps {
    WebDriver driver = Hooks.driver;

   @When("user clicks on support button")
   public void clicksOnSupportButton() {
           new Speed_Test(driver)
                   .clicksOnSupport();
   }

   @And("clicks on perform a speed test")
   public void clicksOnPerformSpeedTest () {
       new Speed_Test(driver)
               .clickOnPerformASpeedTest();
   }


   @Then("User lands on Xfinity speed test page")
   public void landsOnTestPage () {
       new Speed_Test(driver)
               .validateTestPage();
   }
}
