package page_object;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Latino extends NavigationBar{
    private static final By TvStreaming = By.id("xc-polaris-menu-tv-and-streaming");
    private static final By Latino = By.xpath("(//a[@class='xc-polaris-link xc-polaris2'][normalize-space()='Latino'])[1]");
    private static final By LatinoChannels = By.xpath("//*[@id=\"356adbf9-4ef3-4a28-a7ae-6b3dff03c4a1\"]/div/div/div[2]/div/div/div/footer/a");
    private static final By XfinityLatinoChannnels = By.id("mcetoc_1el6b2cpue");



    private static final Logger LOGGER = LogManager.getLogger(Latino.class);

    public Latino(WebDriver driver) {
        super(driver);
    }

    public NavigationBar MouseHoverToTvStreaming() {
        ActOn.element(driver,TvStreaming).mouseHover();
        return this; }

    public Latino clickLatino(){
        ActOn.element(driver, Latino).click();
        return this; }

    public Latino clickViewLatinoChannels() {
        ActOn.element(driver, LatinoChannels).click();
        return this; }




    public Latino ValidateLatinoChannelsPage() {
            LOGGER.debug("user lands on Latino Channels page");
            boolean validateLatino = driver.findElement(XfinityLatinoChannnels).isDisplayed();
            Assert.assertTrue("Comcast Business page is validated", validateLatino);
            return this;}


}
