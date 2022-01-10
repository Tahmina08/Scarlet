package command_providers;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class ElementActions {
    private static final Logger LOGGER = LogManager.getLogger(ElementActions.class);
    public By locator;
    WebDriver driver;

    public ElementActions(WebDriver driver, By locator) {
        this.driver = driver;
        this.locator = locator;
    }
    public WebElement getElements() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement element = null;
        try {
            element = driver.findElement(locator);
        } catch (Exception e) {
            LOGGER.error("Element exception for the locator" + locator + " and exception is: " + e.getMessage());
        }
        return element;
    }

    public ElementActions click() {
        getElements().click();
        return this;
    }

    public ElementActions setValue(String value) {
        getElements().clear();
        getElements().sendKeys(value);
        return this;
    }

    public ElementActions selectValue(String value) {
        Select select = new Select(getElements());
        select.selectByVisibleText(value);
        return this;


    }

    public ElementActions mouseHover() {
        Actions actions = new Actions(driver);
        actions.moveToElement(getElements()).perform();
        return this;
    }

    public String getTextValue() {

        return getElements().getText();
    }
}





