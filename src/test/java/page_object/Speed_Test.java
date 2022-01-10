package page_object;

import command_providers.ActOn;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Speed_Test extends NavigationBar {
    private static final By Support = By.name("support");
    private static final By PerformSpeedTest = By.xpath("(//a[normalize-space()='Perform a Speed Test'])[1]");
    private static final By XfinitySpeedTest = By.xpath("(//h1[normalize-space()='Xfinity Speed Test'])[1]");

    private static final Logger LOGGER = LogManager.getLogger(Speed_Test.class);

    public Speed_Test(WebDriver driver) {
        super(driver);
    }

    public NavigationBar clicksOnSupport() {
        LOGGER.debug("user clicks on Perform a speed test option");
        ActOn.element(driver,Support).click();
        return this;
    }

    public Speed_Test clickOnPerformASpeedTest () {
        LOGGER.debug("user clicks on Perform a speed test option");
        ActOn.element(driver, PerformSpeedTest).click();
        return this;
    }


    public Speed_Test validateTestPage () {
        LOGGER.debug("User validate speed test page");
        boolean validateSpeedTest = driver.findElement(XfinitySpeedTest).isDisplayed();
        Assert.assertTrue("Speed test page is validated", validateSpeedTest);
        return this;
    }


}
