package dmsDws.tools.map2.widgets.advancedSearchHorizontal;

import org.slf4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.LogFactory;
import utility.PropertyLoader;
import utility.PropertySource;

import java.util.List;

/**
 * Created by Julia on 24.04.2017.
 */
public class AdvSearchHorizModelSelectOnCustom extends AdvSearchHorizTestBaseCustom {

    private static final Logger LOG = LogFactory.getLogger(AdvSearchHorizModelSelectOnCustom.class);

    @Test
    public void isModelSelectDisabledOnHomePage() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"custom.url"));
        waitForJSandJQueryToLoad();
        Assert.assertFalse(manager.getSearchDws(driver).isModelSelectEnabled());
    }

    @Test
    public void modelsAreTheSameWithInventory() {
        driver.manage().deleteAllCookies();
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dms.url"));
        waitForJSandJQueryToLoad();
        manager.getDmsLoginPage(driver).loginToDms(PropertyLoader.loadProperty(PropertySource.CRED, "super.login"), PropertyLoader.loadProperty(PropertySource.CRED,"super.pw"));
        waitForJSandJQueryToLoad();
        wait.until(isHomeBreadcrumbsVisible());
        manager.getDmsMenu(driver).clickOnInventoryMenu();
        waitForJSandJQueryToLoad();
        List<String> optionModel = manager.getInventoryDms(driver).getModelSelectOptionsText();
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"custom.url"));
        waitForJSandJQueryToLoad();
        int k = 0;
        for (int i = 1; i < manager.getSearchDws(driver).getMakeSelectOptions().size(); i++) { //loop starts from 1, because there are differences in search and dma inventory ('Make' and 'Any Make')
            manager.getSearchDws(driver).selectMakeByIndex(i);
            waitForJSandJQueryToLoad();
            for (int j = 1; j < manager.getSearchDws(driver).getModelSelectOptions().size(); j++) {

                LOG.info("InvOption is " + optionModel.get(k));
                LOG.info("SearchOption is " + manager.getSearchDws(driver).getModelSelectOptions().get(j).getText().trim());
                Assert.assertEquals(manager.getSearchDws(driver).getModelSelectOptions().get(j).getText().trim(), optionModel.get(k));
                k = k + 1;
            }
        }
    }

    @Test
    public void modelValueIsInSearchResult() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"custom.url"));
        waitForJSandJQueryToLoad();
        for (int i = 1; i < manager.getSearchDws(driver).getMakeSelectOptions().size(); i++) {
            manager.getSearchDws(driver).selectMakeByIndex(i);
            waitForJSandJQueryToLoad();
            manager.getSearchDws(driver).selectModelByIndex(1);
            waitForJSandJQueryToLoad();
            String optionValue = manager.getSearchDws(driver).getModelSelectValue();
            manager.getSearchDws(driver).clickSearchBtn();
            waitForJSandJQueryToLoad();
            LOG.info("optionValue is " + optionValue);
            Assert.assertTrue(driver.getCurrentUrl().contains("_model_" + optionValue));
            driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"custom.url"));
            waitForJSandJQueryToLoad();
        }
    }

    @Test
    public void modelSelected() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"custom.url"));
        waitForJSandJQueryToLoad();
        for (int i = 1; i < manager.getSearchDws(driver).getMakeSelectOptions().size(); i++) {
            manager.getSearchDws(driver).selectMakeByIndex(i);
            waitForJSandJQueryToLoad();
            manager.getSearchDws(driver).selectModelByIndex(1);
            waitForJSandJQueryToLoad();
            Assert.assertEquals(manager.getSearchDws(driver).getModelSelectText().trim(), manager.getSearchDws(driver).getModelSelectOptions().get(1).getText().trim());
        }
    }

    @Test
    public void selectModelByDefault() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"custom.url"));
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).selectMakeByIndex(1);
        waitForJSandJQueryToLoad();
        Assert.assertEquals(manager.getSearchDws(driver).getModelSelectText(), "Any Model");
    }

    @Test
    public void noModelInSearchResult() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"custom.url"));
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).selectMakeByIndex(1);
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickSearchBtn();
        waitForJSandJQueryToLoad();
        Assert.assertFalse(driver.getCurrentUrl().contains("_model_"));
    }

    @Test
    public void clickedModelSelectBackground() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"custom.url"));
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).selectMakeByIndex(1);
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).selectModelByIndex(1);
        waitForJSandJQueryToLoad();
        Assert.assertEquals(manager.getSearchDws(driver).getModelSelectBorderColor(), PropertyLoader.loadProperty(PropertySource.CSS,"border_color_gray2"));
    }

    @Test
    public void modelIsEnabledIfSelectMake() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"custom.url"));
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).selectMakeByIndex(1);
        waitForJSandJQueryToLoad();
        Assert.assertTrue(manager.getSearchDws(driver).isModelSelectEnabled());
    }
}
