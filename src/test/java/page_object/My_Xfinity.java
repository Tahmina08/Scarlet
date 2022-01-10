package page_object;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class My_Xfinity extends NavigationBar {
    private static final By MyXfinity = By.name("myxfinity");
    private static final By MyXfinityLogo = By.name("myxfinity");

    private static final Logger LOGGER = LogManager.getLogger(My_Xfinity.class);

    public My_Xfinity(WebDriver driver) {
        super(driver);
    }


    public NavigationBar clickOnMyXfinity() {
        ActOn.element(driver, MyXfinity).click();
        return this;
    }

    public My_Xfinity ValidateMyXfinityPage() {
        LOGGER.debug("user lands on My Xfinity page");
        boolean validateMyPage = driver.findElement(MyXfinityLogo).isDisplayed();
        Assert.assertTrue("MyXfinity is validated", validateMyPage);
        return this;

    }
}