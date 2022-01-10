package page_object;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Flex_Streaming extends NavigationBar {
    private static final By TvStreaming = By.id("xc-polaris-menu-tv-and-streaming");
    private static final By FlexStreaming = By.linkText("Flex Streaming");
    private static final By XfinityFlex = By.xpath("(//strong[normalize-space()='Xfinity Flex'])[1]");

    private static final Logger LOGGER = LogManager.getLogger(Flex_Streaming.class);

    public Flex_Streaming(WebDriver driver) {
        super(driver);
    }

    public NavigationBar mouseHoverToTvAndStreaming() {
        LOGGER.debug("User mouse hovers to Tv&Streaming");
        ActOn.element(driver, TvStreaming).mouseHover();
        return this;
    }

    public Flex_Streaming clicksOnFlexStreaming() {
        LOGGER.debug("user clicks on Flex Streaming");
        ActOn.element(driver,FlexStreaming).click();
        return this;
    }

    public Flex_Streaming ValidateFlexStreamingPage () {
        LOGGER.debug("user lands on Flex Streaming page");
        boolean validateFlexStreaming = driver.findElement(XfinityFlex).isDisplayed();
        Assert.assertTrue("Flex Streaming page is validated", validateFlexStreaming);
        return this;
    }

}
