package dmsDws.tools.map2.widgets.advancedSearchHorizontal;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.PropertyLoader;
import utility.PropertySource;

/**
 * Created by Julia on 21.04.2017.
 */
public class AdvSearchHorizSearchButton extends AdvSearchHorizTestBaseHome {

    @Test(description = "button has 'Search' text")
    public void textIsSearch(){
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        Assert.assertEquals(manager.getSearchDws(driver).getSearchBtnText().trim(), "Search");
    }

    @Test(description = "button has hover class (change color when move mouse on it)")
    public void btnIsHover(){
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).moveMouseToSearchBtn();
        Assert.assertEquals(manager.getSearchDws(driver).getSearchBtnBgColor(), PropertyLoader.loadProperty(PropertySource.CSS,"bg_color_btn_hover"));
    }

    @Test(description = "button has blue color")
    public void btnDefaultColor(){
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        Assert.assertEquals(manager.getSearchDws(driver).getSearchBtnBgColor(), PropertyLoader.loadProperty(PropertySource.CSS,"bg_color_btn"));
    }

    @Test(description = "by click on search button it redirects on inventory page (from home)")
    public void redirectOnInvFromHome(){
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickSearchBtn();
        waitForJSandJQueryToLoad();
        Assert.assertTrue(driver.getCurrentUrl().contains(PropertyLoader.loadProperty(PropertySource.URL,"inventory.url")));
    }

    @Test(description = "by click on search button it redirects on inventory page (from custom)")
    public void redirectOnInvFromCustom(){
        driver.manage().deleteAllCookies();
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dms.url"));
        manager.getDmsLoginPage(driver).loginToDms(PropertyLoader.loadProperty(PropertySource.CRED, "super.login"), PropertyLoader.loadProperty(PropertySource.CRED,"super.pw"));
        waitForJSandJQueryToLoad();
        wait.until(isHomeBreadcrumbsVisible());
        manager.getDmsMenu(driver).clickOnMap2Menu();
        waitForJSandJQueryToLoad();
        wait.until(isLoadingInvisible());
        manager.getMap2General(driver).clickCustomTab();
        waitForJSandJQueryToLoad();
        wait.until(isLoadingInvisible());
        wait.until(isAddPageVisible());
        manager.getMap2General(driver).clickAddPage();
        waitForJSandJQueryToLoad();
        wait.until(isLoadingInvisible());
        manager.getMap2PageEditor(driver).setPageName("customadv");
        manager.getMap2PageEditor(driver).setPageTitle("customadv");
        manager.getMap2PageEditor(driver).setPageUrl("customadv");
        waitForJSandJQueryToLoad();
        manager.getMap2PageEditor(driver).addAdvancedSearchWidget();
        waitForJSandJQueryToLoad();
        manager.getMap2PageEditor(driver).activatePage();
        waitForJSandJQueryToLoad();
        wait.until(isLoadingInvisible());
//        wait.until(isPageActivatedTooltipVisible());
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + "customadv");
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickSearchBtn();
        waitForJSandJQueryToLoad();
        Assert.assertTrue(driver.getCurrentUrl().contains(PropertyLoader.loadProperty(PropertySource.URL,"inventory.url")));
    }

    @Test(description = "by click on search button it redirects on inventory page (from inventory)")
    public void redirectOnInvFromInventory(){
        driver.manage().deleteAllCookies();
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dms.url"));
        manager.getDmsLoginPage(driver).loginToDms(PropertyLoader.loadProperty(PropertySource.CRED, "super.login"), PropertyLoader.loadProperty(PropertySource.CRED,"super.pw"));
        waitForJSandJQueryToLoad();
        wait.until(isHomeBreadcrumbsVisible());
        manager.getDmsMenu(driver).clickOnMap2Menu();
        waitForJSandJQueryToLoad();
        wait.until(isLoadingInvisible());
        manager.getMap2General(driver).clickInventoryPageTab();
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
        wait.until(isPageActivatedTooltipVisible());
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"inventory.url"));
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickSearchBtn();
        waitForJSandJQueryToLoad();
        Assert.assertTrue(driver.getCurrentUrl().contains(PropertyLoader.loadProperty(PropertySource.URL,"inventory.url")));
    }

    @Test
    public void isBtnEnabled() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        Assert.assertTrue(manager.getSearchDws(driver).isSearchBtnEnabled());
    }
}
