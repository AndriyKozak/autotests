package dmsDws.tools.map2.widgets.advancedSearchHorizontal;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.PropertyLoader;
import utility.PropertySource;

/**
 * Created by Julia on 26.04.2017.
 */
public class AdvSearchHorizTurnOffAccessSites extends AdvSearchHorizTestBaseHome {

    private WebDriverWait wait;

    /*Trade In widget should not be present in MAP2*/
    @Test
    public void AdvSearchHorizWidgetDoesntExistInLib() throws InterruptedException {
        wait = new WebDriverWait(driver, 20);
        driver.manage().deleteAllCookies();
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dms.url"));
        /*login under supervisor*/
        manager.getDmsLoginPage(driver).loginToDms(PropertyLoader.loadProperty(PropertySource.CRED, "super.login"), PropertyLoader.loadProperty(PropertySource.CRED,"super.pw"));
        waitForJSandJQueryToLoad();
        /*navigate to dms-Sites*/
        manager.getDmsMenu(driver).clickOnSitesMenu();
        waitForJSandJQueryToLoad();
        /*turn off widget from access*/
        manager.getSites(driver).openSiteEditor();
        waitForJSandJQueryToLoad();
        manager.getSiteEditor(driver).turnOffAdvSearchHorizWidgetSite();
        waitForJSandJQueryToLoad();
        /*login under manager*/
        driver.manage().deleteAllCookies();
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dms.url"));
        waitForJSandJQueryToLoad();
        manager.getDmsLoginPage(driver).loginToDms(PropertyLoader.loadProperty(PropertySource.CRED, "manager.login"), PropertyLoader.loadProperty(PropertySource.CRED,"manager.pw"));
        waitForJSandJQueryToLoad();
        /*navigate to MAP2*/
        manager.getDmsMenu(driver).clickOnMap2Menu();
        waitForJSandJQueryToLoad();
        //open new Home page in MAP2
        manager.getMap2General(driver).clickHomePageTab();
        waitForJSandJQueryToLoad();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("div.map-link.pull-right"))));
        wait.until(getConditionForTitle("Index"));
        Thread.sleep(1000);
        manager.getMap2General(driver).clickAddPage();
        waitForJSandJQueryToLoad();
        Thread.sleep(2000);
        Assert.assertFalse(manager.getMap2PageEditor(driver).isAdvancedSearchWidgetExists());
    }

    /*Advanced Search Horizontal widget should not be present in MAP2 Editor*/
    @Test
    public void AdvSearchHorizWidgetDoesntExistInEditor() throws InterruptedException {
        driver.manage().deleteAllCookies();
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dms.url"));
        wait = new WebDriverWait(driver, 20);
        /*login under supervisor*/
        manager.getDmsLoginPage(driver).loginToDms(PropertyLoader.loadProperty(PropertySource.CRED, "super.login"), PropertyLoader.loadProperty(PropertySource.CRED,"super.pw"));
        waitForJSandJQueryToLoad();
        /*navigate to dms-Sites*/
        manager.getDmsMenu(driver).clickOnSitesMenu();
        waitForJSandJQueryToLoad();
        /*turn on widget from access*/
        manager.getSites(driver).openSiteEditor();
        waitForJSandJQueryToLoad();
        manager.getSiteEditor(driver).turnOnAdvSearchHorizWidgetSite();
        waitForJSandJQueryToLoad();
        Thread.sleep(1000);
        /*navigate to MAP2, add Home page and Advanced Search Horizontal widget*/
        manager.getDmsMenu(driver).clickOnMap2Menu();
        waitForJSandJQueryToLoad();
        manager.getMap2General(driver).clickHomePageTab();
        waitForJSandJQueryToLoad();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("div.map-link.pull-right"))));
        wait.until(getConditionForTitle("Index"));
        Thread.sleep(1000);
        manager.getMap2General(driver).clickAddPage();
        waitForJSandJQueryToLoad();
        Thread.sleep(2000);
        manager.getMap2PageEditor(driver).addAdvancedSearchWidget();
        waitForJSandJQueryToLoad();
        manager.getMap2PageEditor(driver).activatePage();
        waitForJSandJQueryToLoad();
        /*navigate to dms-Sites*/
        manager.getDmsMenu(driver).clickOnSitesMenu();
        waitForJSandJQueryToLoad();
        /*turn off widget from access*/
        manager.getSites(driver).openSiteEditor();
        waitForJSandJQueryToLoad();
        manager.getSiteEditor(driver).turnOffAdvSearchHorizWidgetSite();
        waitForJSandJQueryToLoad();
        /*login under manager*/
        driver.manage().deleteAllCookies();
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dms.url"));
        waitForJSandJQueryToLoad();
        manager.getDmsLoginPage(driver).loginToDms(PropertyLoader.loadProperty(PropertySource.CRED, "manager.login"), PropertyLoader.loadProperty(PropertySource.CRED,"manager.pw"));
        waitForJSandJQueryToLoad();
        /*navigate to MAP2*/
        manager.getDmsMenu(driver).clickOnMap2Menu();
        waitForJSandJQueryToLoad();
        /*open the last created Home page*/
        manager.getMap2General(driver).clickHomePageTab();
        waitForJSandJQueryToLoad();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("div.map-link.pull-right"))));
        wait.until(getConditionForTitle("Index"));
        Thread.sleep(1000);
        manager.getMap2General(driver).editLastPage();
        waitForJSandJQueryToLoad();
        Thread.sleep(1000);

        Assert.assertFalse(manager.getMap2PageEditor(driver).isAdvancesSearchWidgetExistsInEditor());
    }

    /*Advanced Search Horizontal widget should not be present on dws page*/
    @Test
    public void advSearchHorizDwsWidgetDoesntExist() throws InterruptedException {
        driver.manage().deleteAllCookies();
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dms.url"));
        wait = new WebDriverWait(driver, 20);
        /*login under supervisor*/
        manager.getDmsLoginPage(driver).loginToDms(PropertyLoader.loadProperty(PropertySource.CRED, "super.login"), PropertyLoader.loadProperty(PropertySource.CRED,"super.pw"));
        waitForJSandJQueryToLoad();
        /*navigate to dms-Sites*/
        manager.getDmsMenu(driver).clickOnSitesMenu();
        waitForJSandJQueryToLoad();
        /*turn on widget from access*/
        manager.getSites(driver).openSiteEditor();
        waitForJSandJQueryToLoad();
        manager.getSiteEditor(driver).turnOnAdvSearchHorizWidgetSite();
        waitForJSandJQueryToLoad();
        Thread.sleep(1000);
        /*navigate to MAP2*/
        manager.getDmsMenu(driver).clickOnMap2Menu();
        waitForJSandJQueryToLoad();
        /*add Home page and Advanced Search Horizontal widget*/
        manager.getMap2General(driver).clickHomePageTab();
        waitForJSandJQueryToLoad();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("div.map-link.pull-right"))));
        Thread.sleep(1000);
        manager.getMap2General(driver).clickAddPage();
        waitForJSandJQueryToLoad();
        Thread.sleep(2000);
        manager.getMap2PageEditor(driver).addAdvancedSearchWidget();
        waitForJSandJQueryToLoad();
        manager.getMap2PageEditor(driver).activatePage();
        waitForJSandJQueryToLoad();
        /*turn off Advanced Search Horizontal widget from access*/
        manager.getDmsMenu(driver).clickOnSitesMenu();
        waitForJSandJQueryToLoad();
        manager.getSites(driver).openSiteEditor();
        waitForJSandJQueryToLoad();
        Thread.sleep(1000);
        manager.getSiteEditor(driver).turnOffAdvSearchHorizWidgetSite();
        waitForJSandJQueryToLoad();
        /*open Home page in dws*/
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();

        Assert.assertFalse(manager.getSearchDws(driver).isAdvSearchHorizWidgetExists());

        /*delete the last created page in MAP2*/
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dms.url"));
        waitForJSandJQueryToLoad();
        manager.getDmsMenu(driver).clickOnMap2Menu();
        waitForJSandJQueryToLoad();
        manager.getMap2General(driver).clickHomePageTab();
        waitForJSandJQueryToLoad();
        wait.until(getConditionForTitle("Index"));
        Thread.sleep(1000);
        manager.getMap2General(driver).deletePage();
        waitForJSandJQueryToLoad();
    }

    protected ExpectedCondition<Boolean> getConditionForTitle(String title) {
        return ExpectedConditions.textToBe(By.xpath("//div[@class='pull-left']/span"), title);
    }
}
