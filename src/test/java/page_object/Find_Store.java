package page_object;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Find_Store extends NavigationBar {
    private static final By FindMyStore = By.xpath("(//a[@name='findastore'])[1]");
    private static final By FindRetailStore = By.xpath("(//h1[normalize-space()='Find an Xfinity Store'])[1]");


    private static final Logger LOGGER = LogManager.getLogger(Find_Store.class);

    public Find_Store(WebDriver driver) {
        super(driver);
    }


    public Find_Store clicksOnFindAStore() {
        LOGGER.debug("user clicks on Find A Store");
        ActOn.element(driver, FindMyStore).click();
        return this;
    }

    public Find_Store ValidateFindStore () {
        LOGGER.debug("user lands on Find a Store page");
        boolean validateFindAStore = driver.findElement(FindRetailStore).isDisplayed();
        Assert.assertTrue("Find a retail store page is validated", validateFindAStore);
        return this;
    }


}
