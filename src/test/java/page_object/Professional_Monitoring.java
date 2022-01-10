package page_object;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Professional_Monitoring extends NavigationBar {

    private static final By HomeSecurity = By.id("xc-polaris-menu-home-security");
    private static final By ProfessionalMonitoring = By.xpath("(//a[@class='xc-polaris-link xc-polaris2'][normalize-space()='Professional Monitoring'])[1]");
    private static final By MonitoringPage = By.xpath("(//h1[normalize-space()='Professional Monitoring'])[1]");


    private static final Logger LOGGER = LogManager.getLogger(Professional_Monitoring.class);

    public Professional_Monitoring(WebDriver driver) {
        super(driver);
    }


    public NavigationBar mouseHoverOnHomeSecurity() {
        LOGGER.debug("User mouse hover to Home Security");
        ActOn.element(driver, HomeSecurity).mouseHover();
        return this;
    }

    public Professional_Monitoring clickProfessionalMonitoring() {
        LOGGER.debug("User clicks on professional monitoring");
        ActOn.element(driver, ProfessionalMonitoring).click();
        return this;
    }

    public Professional_Monitoring validateMonitoringPage() {
        LOGGER.debug("User lands on professional monitoring page");
        boolean validateMonitoring = driver.findElement(MonitoringPage).isDisplayed();
        Assert.assertTrue("Professional Monitoring page is validated", validateMonitoring);
        return this;
    }

}
