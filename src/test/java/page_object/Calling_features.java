package page_object;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Calling_features extends NavigationBar {
    private static final By HomePhone = By.id("xc-polaris-menu-phone");
    private static final By Features = By.xpath("(//a[@class='xc-polaris-link xc-polaris2'][normalize-space()='Features'])[1]");
    private static final By SeeAllCallingFeatures = By.xpath("(//a[normalize-space()='See All Calling Features'])[1]");
    private static final By XfinityVoice = By.xpath("(//h1[normalize-space()='Xfinity Voice Features Quick Reference Guide'])[1]");

    private static final Logger LOGGER = LogManager.getLogger(Calling_features.class);

    public Calling_features(WebDriver driver) {
        super(driver);
    }

    public NavigationBar mouseHoverOnHomePhone() {
        LOGGER.debug("User mouse hovers to Home Phone");
        ActOn.element(driver, HomePhone).mouseHover();
        return this;
    }

    public Calling_features clickFeatures() {
        LOGGER.debug("User clicks on features option");
        ActOn.element(driver, Features).click();
        return this;
    }

    public Calling_features clickOnSeeAllCallingFeatures() {
        LOGGER.debug("User clicks on see all calling features");
        ActOn.element(driver,SeeAllCallingFeatures).click();
        return this;
    }

    public Calling_features ValidateXfinityVoice() {
        LOGGER.debug("User lands on Xfinity Voice features Page");
        boolean validateVoiceFeatures = driver.findElement(XfinityVoice).isDisplayed();
        Assert.assertTrue("Flex Streaming page is validated", validateVoiceFeatures);
        return this;
    }

}
