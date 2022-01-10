package page_object;

import command_providers.ActOn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationBar {
    private static final By XfinityLogo = By.xpath("(//a[@href='https://www.xfinity.com'])[1]");
    private static final By Internet = By.id("xc-polaris-menu-internet");
    private static final By Support = By.name("support");
    private static final By TvStreaming = By.id("xc-polaris-menu-tv-and-streaming");
    private static final By Mobile = By.id("(//a[@class='xc-polaris-link xc-polaris2'][normalize-space()='Mobile'])[1]");
    private static final By HomeSecurity = By.id("xc-polaris-menu-home-security");
    private static final By HomePhone = By.id("xc-polaris-menu-phone");
    private static final By Compare = By.xpath("(//a[normalize-space()='Compare the Competition'])[1]");
    private static final By FindMyStore = By.xpath("(//a[@name='findastore'])[1]");
    private static final By MyXfinity = By.name("myxfinity");
    private static final By Comcast = By.xpath("(//a[@class='xc-header--navigation-link'][normalize-space()='Comcast Business'])[1]");

    public WebDriver driver;
    public NavigationBar(WebDriver driver) {
        this.driver = driver;
    }

    //Xfinity Home Page
    public Home navigateToHome() {
        ActOn.element(driver, XfinityLogo).click();
        return new Home(driver);
    }

    //Xfinity Internet Menu
    public NavigationBar mouseHoverToInternetOptions() {
        ActOn.element(driver, Internet).mouseHover();
        return this;
    }

    //Xfinity MyXfinity
    public NavigationBar clickMyXfinity() {
        ActOn.element(driver, MyXfinity).click();
                return this; }


    //Xfinity Support
    public NavigationBar clickOnSupport() {
        ActOn.element(driver, Support).click();
        return this;
    }

    //Xfinity Tv and Streaming
    public NavigationBar mouseHoverToTvStreaming() {
        ActOn.element(driver,TvStreaming).mouseHover();
        return this;
    }

    //Xfinity Tv Mobile
    public NavigationBar clickOnMobile() {
        ActOn.element(driver,Mobile).click();
        return this;
    }

    //Xfinity Home Security
    public NavigationBar mouseHoverToHomeSecurity() {
        ActOn.element(driver,HomeSecurity).mouseHover();
        return this;
    }

    //Xfinity Home Phone
    public NavigationBar mouseHoverToHomePhone() {
        ActOn.element(driver, HomePhone).mouseHover();
        return this;
    }

    //Xfinity Compare the competition
    public NavigationBar clickCompare() {
        ActOn.element(driver, Compare).click();
        return this;
    }

    //Xfinity Find my store
    public NavigationBar clickFindMyStore() {
        ActOn.element(driver, FindMyStore).click();
        return this;
    }

    public NavigationBar clickComcastBusiness(){
        ActOn.element(driver, Comcast).click();
        return this;}

}

