package dmsDws.tools.map2.widgets.advancedSearchHorizontal;

import dmsDws.dmsLoginPage.DmsLogin;
import dmsDws.tools.map2.widgets.searches._commonSearch.SearchDws;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import utility.ConfigurationManager;
import utility.PropertyLoader;
import utility.PropertySource;
import utility.WebDriverFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by Julia on 17.04.2017.
 */
public class AdvSearchHorizTestBase {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected ConfigurationManager manager;
    protected SearchDws searchDws;
    protected DmsLogin dmsLogin;
    protected String mapPage;

    /*run browser, turn on MAP2, create user with manager role, set jQuery - 1.11.22, close browser*/
    @BeforeSuite
    @Parameters({"browserName"})
    public void preSteps(String browserName) throws InterruptedException {
        //run browser, login to dms
        driver = WebDriverFactory.getInstance(browserName);
        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 30);
        manager = ConfigurationManager.getInstance(driver);
        driver.get(PropertyLoader.loadProperty(PropertySource.URL, "dms.url"));
        waitForJSandJQueryToLoad();
        manager.getDmsLoginPage(driver).loginToDms(PropertyLoader.loadProperty(PropertySource.CRED, "super.login"), PropertyLoader.loadProperty(PropertySource.CRED, "super.pw"));
        waitForJSandJQueryToLoad();
        // turn on MAP2 on root user
        manager.getDmsMenu(driver).clickOnUsersMenu();
        waitForJSandJQueryToLoad();
        manager.getUsers(driver).openRootUserEditor();
        waitForJSandJQueryToLoad();
        manager.getUserEditor(driver).turnOnMap2();
        waitForJSandJQueryToLoad();
        //add new user with manager role, turn on MAP2, Website Settings
        manager.getUsers(driver).clickAddUser();
        waitForJSandJQueryToLoad();
        manager.getUserEditor(driver).addNewManager(PropertyLoader.loadProperty(PropertySource.CRED, "manager.login"), PropertyLoader.loadProperty(PropertySource.CRED, "manager.pw"), PropertyLoader.loadProperty(PropertySource.VALUES, "manager.role"));
        waitForJSandJQueryToLoad();
        manager.getUsers(driver).openLastUserEditor();
        waitForJSandJQueryToLoad();
        manager.getUserEditor(driver).clickAccessTab();
        manager.getUserEditor(driver).turnOnMap2Checkbox();
        manager.getUserEditor(driver).turnOnWebsiteSettings();
        manager.getUserEditor(driver).clickSaveBtn();
        waitForJSandJQueryToLoad();
        //put jQuery version - 1.11.2
        manager.getDmsMenu(driver).clickOnWebsiteMenu();
        waitForJSandJQueryToLoad();
        manager.getGeneralWebsiteSettings(driver).setjQueryVersion(PropertyLoader.loadProperty(PropertySource.VALUES, "jQuery1112"));
        waitForJSandJQueryToLoad();
        //close browser
        if (driver != null) {
            WebDriverFactory.killDriverInstance();
        }
        if (manager != null) {
            ConfigurationManager.killManagerInstance();
        }
    }

    /*run browser, turn on Advanced Search in Sites, add home page in MAP2*/
    @BeforeClass
    @Parameters({"browserName"})
    public void setup(String browserName) throws Exception {
        //run browser, login to dms
        driver = WebDriverFactory.getInstance(browserName);
        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 30);
        manager = ConfigurationManager.getInstance(driver);
        driver.get(PropertyLoader.loadProperty(PropertySource.URL, "dms.url"));
        waitForJSandJQueryToLoad();
        manager.getDmsLoginPage(driver).loginToDms(PropertyLoader.loadProperty(PropertySource.CRED, "super.login"), PropertyLoader.loadProperty(PropertySource.CRED, "super.pw"));
        waitForJSandJQueryToLoad();
        //turn on Advamced Search Horizontal widget in Sites
        manager.getDmsMenu(driver).clickOnSitesMenu();
        waitForJSandJQueryToLoad();
        manager.getSites(driver).openSiteEditor();
        waitForJSandJQueryToLoad();
        manager.getSiteEditor(driver).turnOnAdvSearchHorizWidgetSite();
        waitForJSandJQueryToLoad();
        wait.until(isSiteEditorInvisible());
        //add home page and Advanced Search Horizontal widget in MAP2
       /* manager.getDmsMenu(driver).clickOnMap2Menu();
        waitForJSandJQueryToLoad();
        wait.until(isLoadingInvisible());
        manager.getMap2General(driver).clickHomePageTab();
        waitForJSandJQueryToLoad();
        wait.until(isLoadingInvisible());
        wait.until(isAddPageVisible());
        manager.getMap2General(driver).clickAddPage();
        waitForJSandJQueryToLoad();
        wait.until(isLoadingInvisible());
        manager.getMap2PageEditor(driver).addAdvancedSearchWidget();
        waitForJSandJQueryToLoad();
        manager.getMap2PageEditor(driver).activatePage();
        waitForJSandJQueryToLoad();
        wait.until(isLoadingInvisible());
        wait.until(isPageActivatedTooltipVisible());*/

    }

    /*delete Home page in MAP2, close browser*/
    @AfterClass(alwaysRun = true)

    public void tearDown() throws InterruptedException {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL, "dms.url"));
        waitForJSandJQueryToLoad();
        try {
            //delete the last home page in MAP2
            manager.getDmsMenu(driver).clickOnMap2Menu();
            waitForJSandJQueryToLoad();
            wait.until(isLoadingInvisible());
            manager.getMap2General(driver).clickHomePageTab();
            waitForJSandJQueryToLoad();
            wait.until(isLoadingInvisible());
            wait.until(getConditionForTitle("Index"));
            manager.getMap2General(driver).deletePage();
            waitForJSandJQueryToLoad();
            wait.until(isPageDeletedTooltipVisible());
        } catch (Exception ex) {
            if (driver != null) {
                //   LOG.info("Killing web driver");
                WebDriverFactory.killDriverInstance();
            }
        }
        if (driver != null) {
            //   LOG.info("Killing web driver");
            WebDriverFactory.killDriverInstance();
        }
        if (manager != null) {
            ConfigurationManager.killManagerInstance();
        }
    }

    /*delete the last user in Users tree*/
    @AfterSuite
    @Parameters({"browserName"})
    public void backToDefaultSettings(String browserName) throws InterruptedException {
        driver = WebDriverFactory.getInstance(browserName);
        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
        manager = ConfigurationManager.getInstance(driver);
        driver.get(PropertyLoader.loadProperty(PropertySource.URL, "dms.url"));
        waitForJSandJQueryToLoad();
        manager.getDmsLoginPage(driver).loginToDms(PropertyLoader.loadProperty(PropertySource.CRED, "super.login"), PropertyLoader.loadProperty(PropertySource.CRED, "super.pw"));
        waitForJSandJQueryToLoad();
        manager.getDmsMenu(driver).clickOnUsersMenu();
        waitForJSandJQueryToLoad();
        manager.getUsers(driver).deleteLastUser();
        waitForJSandJQueryToLoad();

        if (driver != null) {
            WebDriverFactory.killDriverInstance();
        }
        if (manager != null) {
            ConfigurationManager.killManagerInstance();
        }
    }

    public boolean waitForJSandJQueryToLoad() {

        WebDriverWait wait = new WebDriverWait(driver, 30);
    /*method for execute Java Script: page should be loaded*/
        ExpectedCondition<Boolean> jsLoad = new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            }
        };

        // wait for jQuery to load
        ExpectedCondition<Boolean> jQueryLoad = new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                try {
                    return ((Long) ((JavascriptExecutor) driver).executeScript("return jQuery.active") == 0);
                } catch (Exception e) {
                    // no jQuery present
                    return true;
                }
            }
        };
        return wait.until(jQueryLoad) && wait.until(jsLoad);
    }

    protected ExpectedCondition<WebElement> isAddPageVisible() {
        return ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("div.map-link.pull-right")));
    }

    protected ExpectedCondition<Boolean> getConditionForTitle(String pageName) {
        return ExpectedConditions.textToBe(By.xpath("//div[@class='pull-left']/span"), pageName);
    }

    protected ExpectedCondition<WebElement> isPageActivatedTooltipVisible() {
        return ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='jGrowl']//div[@class='message'][contains(text(), 'Page activated')]")));
    }

    protected ExpectedCondition<WebElement> isPageDeletedTooltipVisible() {
        return ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='jGrowl']//div[@class='message'][contains(text(), 'Page deleted')]")));
    }

    protected ExpectedCondition<Boolean> isLoadingInvisible() {
        return ExpectedConditions.invisibilityOfElementLocated(By.className("mask"));
    }

    protected ExpectedCondition<WebElement> isPostFormVisible() {
        return ExpectedConditions.visibilityOf(driver.findElement(By.className("btn-message-ok")));
    }

    protected ExpectedCondition<WebElement> isLeadsListVisible() {
        return ExpectedConditions.visibilityOf(driver.findElement(By.id("leads-list-width")));
    }

    protected ExpectedCondition<WebElement> isHomeBreadcrumbsVisible() {
        return ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='slid_breadcrumb']//a[contains(text(), 'Home')]")));
    }

    protected ExpectedCondition<Boolean> isSiteEditorInvisible() {
        return ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@aria-labelledby='ui-dialog-title-site_editor']"));
    }

    protected ExpectedCondition<WebElement> isWebsiteSidePanelVisible() {
        return ExpectedConditions.visibilityOf(driver.findElement(By.className("td_left_user-managment")));
    }

    protected ExpectedCondition<WebElement> isLocalizationBreadcrumbsVisible() {
        return ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[@class='header_dealership'][contains(text(), 'Localization')]")));
    }

    protected ExpectedCondition<WebElement> isUWFormVisible() {
        return ExpectedConditions.visibilityOf(driver.findElement(By.id("informationform")));
    }
}
