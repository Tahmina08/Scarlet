package page_object;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Phone_Compatibility extends NavigationBar {
    private static final By Mobile = By.xpath("(//a[@class='xc-polaris-link xc-polaris2'][normalize-space()='Mobile'])[1]");
    private static final By CheckPhoneCompatibility = By.xpath("(//a[normalize-space()='Check phone compatibility'])[1]");
    private static final By CheckCompatibility = By.xpath("(//a[contains(text(),'Check Compatibility')])[1]");
    private static final By XfinityMobile = By.xpath("(//img[@alt='Xfinity Mobile - Home'])[2]");

    private static final Logger LOGGER = LogManager.getLogger(Phone_Compatibility.class);

    public Phone_Compatibility(WebDriver driver) {
        super(driver);
    }

    public NavigationBar clicksOnMobile() {
        LOGGER.debug("User clicks on Mobile from Navigation Bar");
        ActOn.element(driver,Mobile).click();
        return this;
    }

    public Phone_Compatibility clicksOnCheckPhoneCompatibility() {
        LOGGER.debug("Clicks on check phone compatibility");
        ActOn.element(driver,CheckPhoneCompatibility).click();
        return this;
    }

    public Phone_Compatibility clicksOnCheckCompatibility() {
        LOGGER.debug("Clicks on check compatibility");
        ActOn.element(driver, CheckCompatibility).click();
        return this;
    }

    public Phone_Compatibility ValidateCompatibilityPage () {
        LOGGER.debug("user lands on phone compatibility page");
        boolean validateCompatibility = driver.findElement(XfinityMobile).isDisplayed();
        Assert.assertTrue("Phone compatibility page is validated", validateCompatibility);
        return this;
    }
}


