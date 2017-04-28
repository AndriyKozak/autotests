package dmsDws.tools.map2.widgets.advancedSearchHorizontal;

import org.slf4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.LogFactory;
import utility.PropertyLoader;
import utility.PropertySource;

import java.util.List;

/**
 * Created by Julia on 21.04.2017.
 */
public class AdvSearchHorizStyleSelect extends AdvSearchHorizTestBaseHome {

    private static final Logger LOG = LogFactory.getLogger(AdvSearchHorizStyleSelect.class);

    @Test
    public void isStyleSelectEnabledOnHomePage() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        Assert.assertTrue(manager.getSearchDws(driver).isStyleSelectEnabled());
    }

    @Test
    public void selectStyleByDefault() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        Assert.assertEquals(manager.getSearchDws(driver).getStyleSelectText(), "Any Style");
    }

    @Test
    public void styleSelected() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        for (int i = 0; i < manager.getSearchDws(driver).getStyleSelectOptions().size(); i++) {
            manager.getSearchDws(driver).selectStyleByIndex(i);
            waitForJSandJQueryToLoad();
            LOG.info("actual is " + manager.getSearchDws(driver).getStyleSelectText());
            LOG.info("expected is " + manager.getSearchDws(driver).getStyleSelectOptions().get(i).getText());
            Assert.assertEquals(manager.getSearchDws(driver).getStyleSelectText().trim(), manager.getSearchDws(driver).getStyleSelectOptions().get(i).getText().trim());
        }
    }

    @Test
    public void styleValueIsInSearchResult() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        for (int i = 1; i < manager.getSearchDws(driver).getStyleSelectOptions().size(); i++) {
            manager.getSearchDws(driver).selectStyleByIndex(i);
            waitForJSandJQueryToLoad();
            String optionValue = manager.getSearchDws(driver).getStyleSelectValue();
            manager.getSearchDws(driver).clickSearchBtn();
            waitForJSandJQueryToLoad();
            LOG.info("value is " + optionValue);
            Assert.assertTrue(driver.getCurrentUrl().contains("_body_" + optionValue));
            driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
            waitForJSandJQueryToLoad();
        }
    }

    @Test
    public void noStyleInSearchResult() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickSearchBtn();
        waitForJSandJQueryToLoad();
        Assert.assertFalse(driver.getCurrentUrl().contains("_body_"));
    }

    @Test
    public void clickedStyleSelectBackground() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).selectStyleByIndex(1);
        waitForJSandJQueryToLoad();
        Assert.assertEquals(manager.getSearchDws(driver).getStyleSelectBorderColor(), PropertyLoader.loadProperty(PropertySource.CSS,"border_color_gray2"));
    }

    @Test
    public void styleNumberIsTheSameWithInventory() {
        driver.manage().deleteAllCookies();
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dms.url"));
        waitForJSandJQueryToLoad();
        manager.getDmsLoginPage(driver).loginToDms(PropertyLoader.loadProperty(PropertySource.CRED, "super.login"), PropertyLoader.loadProperty(PropertySource.CRED,"super.pw"));
        waitForJSandJQueryToLoad();
        wait.until(isHomeBreadcrumbsVisible());
        manager.getDmsMenu(driver).clickOnInventoryMenu();
        waitForJSandJQueryToLoad();
        manager.getInventoryDms(driver).selectVehiclesPerPage("50");
        waitForJSandJQueryToLoad();
        manager.getInventoryDms(driver).addBodyColumn();
        waitForJSandJQueryToLoad();
        List<String> allBodies = manager.getInventoryDms(driver).getBodies();
        waitForJSandJQueryToLoad();
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        Assert.assertEquals(manager.getSearchDws(driver).getStyleSelectOptions().size() - 1, allBodies.size());
    }

    @Test
    public void styleValueIsTheSameWithInventory() {
        driver.manage().deleteAllCookies();
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dms.url"));
        waitForJSandJQueryToLoad();
        manager.getDmsLoginPage(driver).loginToDms(PropertyLoader.loadProperty(PropertySource.CRED, "super.login"), PropertyLoader.loadProperty(PropertySource.CRED,"super.pw"));
        waitForJSandJQueryToLoad();
        wait.until(isHomeBreadcrumbsVisible());
        manager.getDmsMenu(driver).clickOnInventoryMenu();
        waitForJSandJQueryToLoad();
        manager.getInventoryDms(driver).selectVehiclesPerPage("50");
        waitForJSandJQueryToLoad();
        manager.getInventoryDms(driver).addBodyColumn();
        waitForJSandJQueryToLoad();
        driver.navigate().refresh();
        waitForJSandJQueryToLoad();
        List<String> bodiesNumber = manager.getInventoryDms(driver).getEachBodyNumber();
        waitForJSandJQueryToLoad();
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        for (int i = 1; i < manager.getSearchDws(driver).getStyleSelectOptions().size(); i++) {
            LOG.info("result is " + bodiesNumber.get(i - 1));
            Assert.assertEquals(manager.getSearchDws(driver).getStyleSelectOptionsText().get(i), bodiesNumber.get(i - 1));
        }
    }
}
