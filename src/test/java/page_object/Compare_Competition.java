package page_object;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Compare_Competition extends NavigationBar {
    private static final By Compare = By.xpath("(//a[normalize-space()='Compare the Competition'])[1]");
    private static final By FiOs = By.xpath("(//a[normalize-space()='Xfinity vs. FiOS'])[1]");

    private static final Logger LOGGER = LogManager.getLogger(Compare_Competition.class);

    public Compare_Competition(WebDriver driver) {
        super(driver);
    }

    public NavigationBar clickCompareTheCompetition() {
        LOGGER.debug("User click on Compare the Competition");
        ActOn.element(driver, Compare).click();
        return this;
}

    public Compare_Competition ValidateComparisonPage() {
        LOGGER.debug("USer lands on Xfinity VS. FiOs page");
        boolean ValidateComparePage = driver.findElement(FiOs).isDisplayed();
        Assert.assertTrue("Xfinity vs FiOs is validated", ValidateComparePage);
        return this;
    }
}
