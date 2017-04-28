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
 * Created by Julia on 21.04.2017.
 */
public class AdvSearchHorizTurnOffAccessDealers extends AdvSearchHorizTestBaseHome {

    private WebDriverWait wait;


    /*Advanced Search Horizontal widget should not be present in MAP2 in library*/
    @Test
    public void advSearchHorizWidgetDoesntExistInLib() throws InterruptedException {
        driver.manage().deleteAllCookies();
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dms.url"));
        wait = new WebDriverWait(driver, 20);
        waitForJSandJQueryToLoad();
        manager.getDmsLoginPage(driver).loginToDms(PropertyLoader.loadProperty(PropertySource.CRED, "super.login"), PropertyLoader.loadProperty(PropertySource.CRED,"super.pw"));
        waitForJSandJQueryToLoad();
        //navigate to dms-Dealers
        manager.getDmsMenu(driver).clickOnDealersMenu();
        waitForJSandJQueryToLoad();
        Thread.sleep(1000);
        //turn off Advanced Search Horizontal page from access
        manager.getDealers(driver).openSiteEditor();
        waitForJSandJQueryToLoad();
        wait.until(manager.getSitePackage(driver).isEditorVisible());
        manager.getSitePackage(driver).turnOffAdvSearch2WidgetDealers();
        waitForJSandJQueryToLoad();
        wait.until(manager.getDealers(driver).isEditorInvisible());
        manager.getDealers(driver).clickSave();
        waitForJSandJQueryToLoad();
        driver.manage().deleteAllCookies();
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dms.url"));
        waitForJSandJQueryToLoad();
        manager.getDmsLoginPage(driver).loginToDms(PropertyLoader.loadProperty(PropertySource.CRED, "manager.login"), PropertyLoader.loadProperty(PropertySource.CRED,"manager.pw"));
        waitForJSandJQueryToLoad();
        manager.getDmsMenu(driver).clickOnMap2Menu();
        waitForJSandJQueryToLoad();
        manager.getMap2General(driver).clickHomePageTab();
        waitForJSandJQueryToLoad();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("div.map-link.pull-right"))));
        wait.until(getConditionForTitle());
        Thread.sleep(1000);
        manager.getMap2General(driver).clickAddPage();
        waitForJSandJQueryToLoad();
        Thread.sleep(2000);
        Assert.assertFalse(manager.getMap2PageEditor(driver).isAdvancedSearchWidgetExists());
    }

    @Test
    public void tradeInWidgetDoesntExistInEditor() throws InterruptedException {
        driver.manage().deleteAllCookies();
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dms.url"));
        wait = new WebDriverWait(driver, 20);
        waitForJSandJQueryToLoad();
        manager.getDmsLoginPage(driver).loginToDms(PropertyLoader.loadProperty(PropertySource.CRED, "super.login"), PropertyLoader.loadProperty(PropertySource.CRED,"super.pw"));
        waitForJSandJQueryToLoad();
        //navigate to dms-Dealers
        manager.getDmsMenu(driver).clickOnDealersMenu();
        waitForJSandJQueryToLoad();
        Thread.sleep(1000);
        //turn on Advanced Search Horizontal page from access
        manager.getDealers(driver).openSiteEditor();
        waitForJSandJQueryToLoad();
        wait.until(manager.getSitePackage(driver).isEditorVisible());
        manager.getSitePackage(driver).turnOnAdvSearch2WidgetDealers();
        waitForJSandJQueryToLoad();
        wait.until(manager.getDealers(driver).isEditorInvisible());
        manager.getDealers(driver).clickSave();
        waitForJSandJQueryToLoad();
        //add widget to MAP2 home page
        manager.getDmsMenu(driver).clickOnMap2Menu();
        waitForJSandJQueryToLoad();
        manager.getMap2General(driver).clickHomePageTab();
        waitForJSandJQueryToLoad();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("div.map-link.pull-right"))));
        wait.until(getConditionForTitle());
        Thread.sleep(1000);
        manager.getMap2General(driver).clickAddPage();
        waitForJSandJQueryToLoad();
        Thread.sleep(2000);
        manager.getMap2PageEditor(driver).addAdvancedSearchWidget();
        waitForJSandJQueryToLoad();
        manager.getMap2PageEditor(driver).activatePage();
        waitForJSandJQueryToLoad();
        //turn off widget from access
        manager.getDmsMenu(driver).clickOnDealersMenu();
        waitForJSandJQueryToLoad();
        manager.getDealers(driver).openSiteEditor();
        waitForJSandJQueryToLoad();
        wait.until(manager.getSitePackage(driver).isEditorVisible());
        manager.getSitePackage(driver).turnOffAdvSearch2WidgetDealers();
        waitForJSandJQueryToLoad();
        wait.until(manager.getDealers(driver).isEditorInvisible());
        manager.getDealers(driver).clickSave();
        waitForJSandJQueryToLoad();
        //go to MAP2 and check, if added widget isn't displayed
        driver.manage().deleteAllCookies();
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dms.url"));
        waitForJSandJQueryToLoad();
        manager.getDmsLoginPage(driver).loginToDms(PropertyLoader.loadProperty(PropertySource.CRED, "manager.login"), PropertyLoader.loadProperty(PropertySource.CRED,"manager.pw"));
        waitForJSandJQueryToLoad();
        manager.getDmsMenu(driver).clickOnMap2Menu();
        waitForJSandJQueryToLoad();
        manager.getMap2General(driver).clickHomePageTab();
        waitForJSandJQueryToLoad();;
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("div.map-link.pull-right"))));
        Thread.sleep(1000);
        manager.getMap2General(driver).editLastPage();
        waitForJSandJQueryToLoad();
        Thread.sleep(2000);
        Assert.assertFalse(manager.getMap2PageEditor(driver).isAdvancesSearchWidgetExistsInEditor());
        Thread.sleep(1000);
        manager.getMap2PageEditor(driver).backToMap();
        wait.until(getConditionForTitle());
        waitForJSandJQueryToLoad();
        manager.getMap2General(driver).deletePage();
        waitForJSandJQueryToLoad();
    }

    /*Advanced Search Horizontal widget should not be present on dws page*/
    @Test
    public void advSearchHorizdwsWidgetDoesntExist() throws InterruptedException {
        driver.manage().deleteAllCookies();
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dms.url"));
        wait = new WebDriverWait(driver, 20);
        waitForJSandJQueryToLoad();
        manager.getDmsLoginPage(driver).loginToDms(PropertyLoader.loadProperty(PropertySource.CRED, "super.login"), PropertyLoader.loadProperty(PropertySource.CRED,"super.pw"));
        waitForJSandJQueryToLoad();
        //navigate to dms-Dealers
        manager.getDmsMenu(driver).clickOnDealersMenu();
        waitForJSandJQueryToLoad();
        Thread.sleep(1000);
        //turn on Advanced Search Horizontal page from access
        manager.getDealers(driver).openSiteEditor();
        waitForJSandJQueryToLoad();
        wait.until(manager.getSitePackage(driver).isEditorVisible());
        manager.getSitePackage(driver).turnOnAdvSearch2WidgetDealers();
        waitForJSandJQueryToLoad();
        wait.until(manager.getDealers(driver).isEditorInvisible());
        manager.getDealers(driver).clickSave();
        waitForJSandJQueryToLoad();
        //add widget to MAP2 Home page
        manager.getDmsMenu(driver).clickOnMap2Menu();
        waitForJSandJQueryToLoad();
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
        //turn off widget from access
        manager.getDmsMenu(driver).clickOnDealersMenu();
        waitForJSandJQueryToLoad();
        manager.getDealers(driver).openSiteEditor();
        waitForJSandJQueryToLoad();
        wait.until(manager.getSitePackage(driver).isEditorVisible());
        manager.getSitePackage(driver).turnOffAdvSearch2WidgetDealers();
        waitForJSandJQueryToLoad();
        wait.until(manager.getDealers(driver).isEditorInvisible());
        manager.getDealers(driver).clickSave();
        waitForJSandJQueryToLoad();
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        Assert.assertFalse(manager.getSearchDws(driver).isAdvSearchHorizWidgetExists());
        Thread.sleep(1000);
        //delete the last home page in MAP2
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dms.url"));
        waitForJSandJQueryToLoad();
        manager.getDmsMenu(driver).clickOnMap2Menu();
        waitForJSandJQueryToLoad();
        manager.getMap2General(driver).clickHomePageTab();
        waitForJSandJQueryToLoad();
        wait.until(getConditionForTitle());
        Thread.sleep(1000);
        manager.getMap2General(driver).deletePage();
        waitForJSandJQueryToLoad();
    }

    protected ExpectedCondition<Boolean> getConditionForTitle() {
        return ExpectedConditions.textToBe(By.xpath("//div[@class='pull-left']/span"), "Index");
    }
}
