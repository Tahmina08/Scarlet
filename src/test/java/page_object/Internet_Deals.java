package page_object;

import command_providers.ActOn;
import io.cucumber.java.en.Given;
import org.apache.commons.logging.Log;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.ReadConfigFiles;

public class Internet_Deals extends NavigationBar{
    private static final By Internet = By.id("xc-polaris-menu-internet");
    private static final By InternetDeals = By.xpath("(//a[@class='xc-polaris-link xc-polaris2'][normalize-space()='Internet Deals'])[1]");
    private static final By PerformancePro = By.xpath("(//img[@alt='Official logo of Comcast, Official logo of Xfinity'])[1]");

    private static final Logger LOGGER = LogManager.getLogger(Internet_Deals.class);

    public Internet_Deals(WebDriver driver) {
        super(driver);
    }


    public NavigationBar mouseHoverToInternetMenu() {
        LOGGER.debug("user mouse hovers to Internet");
        ActOn.element(driver, Internet).mouseHover();
        return this;
    }

    public Internet_Deals clicksOnInternetDeals() {
        LOGGER.debug("user clicks on Internet Deals");
        ActOn.element(driver, InternetDeals).click();
        return this;
    }

    public Internet_Deals ValidateInternetDealsPage() {
        LOGGER.debug("user lands on Internet Deals page");
        boolean validateDealsPage = driver.findElement(PerformancePro).isDisplayed();
        Assert.assertTrue("Internet Deals page is validated", validateDealsPage);
        return this;
    }
}
