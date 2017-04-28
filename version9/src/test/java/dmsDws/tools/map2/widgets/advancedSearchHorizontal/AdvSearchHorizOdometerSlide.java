package dmsDws.tools.map2.widgets.advancedSearchHorizontal;

import org.slf4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.LogFactory;
import utility.PropertyLoader;
import utility.PropertySource;

/**
 * Created by Julia on 21.04.2017.
 */
public class AdvSearchHorizOdometerSlide extends AdvSearchHorizTestBaseHome {

    private static final Logger LOG = LogFactory.getLogger(AdvSearchHorizOdometerSlide.class);

    @Test(description = "from slider is enabled by default")
    public void fromSliderIsEnabled() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        Assert.assertTrue(manager.getSearchDws(driver).isOdometerSliderFromEnabled());
    }

    @Test(description = "to slider is enabled by default")
    public void toSliderIsEnabled() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        Assert.assertTrue(manager.getSearchDws(driver).isOdometerSliderToEnabled());
    }

    @Test(description = "from odometer equals the min odometer value from dms inventory")
    public void odoFromIsMinOdoFromInventory() {
        driver.manage().deleteAllCookies();
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dms.url"));
        waitForJSandJQueryToLoad();
        manager.getDmsLoginPage(driver).loginToDms(PropertyLoader.loadProperty(PropertySource.CRED, "super.login"), PropertyLoader.loadProperty(PropertySource.CRED,"super.pw"));
        waitForJSandJQueryToLoad();
        wait.until(isHomeBreadcrumbsVisible());
        manager.getDmsMenu(driver).clickOnInventoryMenu();
        waitForJSandJQueryToLoad();
        manager.getInventoryDms(driver).clickInventoryRadioBtn();
        waitForJSandJQueryToLoad();
        manager.getInventoryDms(driver).addOdometerColumn();
        waitForJSandJQueryToLoad();
        String minOdometer = manager.getInventoryDms(driver).getMinOdometerWithoutSpace();
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        Assert.assertEquals(manager.getSearchDws(driver).getOdometerSlideFromValueWithoutSpace(), minOdometer);
    }

    @Test(description = "to odometer equals the max odometer value from dms inventory")
    public void odoToIsMaxOdoFromInventory() {
        driver.manage().deleteAllCookies();
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dms.url"));
        waitForJSandJQueryToLoad();
        manager.getDmsLoginPage(driver).loginToDms(PropertyLoader.loadProperty(PropertySource.CRED, "super.login"), PropertyLoader.loadProperty(PropertySource.CRED,"super.pw"));
        waitForJSandJQueryToLoad();
        wait.until(isHomeBreadcrumbsVisible());
        manager.getDmsMenu(driver).clickOnInventoryMenu();
        waitForJSandJQueryToLoad();
        manager.getInventoryDms(driver).clickInventoryRadioBtn();
        waitForJSandJQueryToLoad();
        manager.getInventoryDms(driver).addOdometerColumn();
        waitForJSandJQueryToLoad();
        String maxOdometer = manager.getInventoryDms(driver).getMaxOdometerWithoutSpace();
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        Assert.assertEquals(manager.getSearchDws(driver).getOdometerSlideToValueWithoutSpace(), maxOdometer);
    }

    @Test(description = "min odometer equals the min odometer value from dms inventory")
    public void odoMinIsMinOdoFromInventory() {
        driver.manage().deleteAllCookies();
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dms.url"));
        waitForJSandJQueryToLoad();
        manager.getDmsLoginPage(driver).loginToDms(PropertyLoader.loadProperty(PropertySource.CRED, "super.login"), PropertyLoader.loadProperty(PropertySource.CRED,"super.pw"));
        waitForJSandJQueryToLoad();
        wait.until(isHomeBreadcrumbsVisible());
        manager.getDmsMenu(driver).clickOnInventoryMenu();
        waitForJSandJQueryToLoad();
        manager.getInventoryDms(driver).clickInventoryRadioBtn();
        waitForJSandJQueryToLoad();
        manager.getInventoryDms(driver).addOdometerColumn();
        waitForJSandJQueryToLoad();
        String minOdometer = manager.getInventoryDms(driver).getMinOdometerWithoutSpace();
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).moveOdometerFromSlider(3);
        waitForJSandJQueryToLoad();
        Assert.assertEquals(manager.getSearchDws(driver).getOdometerSlideMinValueWithoutSpace(), minOdometer);
    }

    @Test(description = "max odometer equals the max odometer value from dms inventory")
    public void odoMaxIsMaxOdoFromInventory() {
        driver.manage().deleteAllCookies();
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dms.url"));
        waitForJSandJQueryToLoad();
        manager.getDmsLoginPage(driver).loginToDms(PropertyLoader.loadProperty(PropertySource.CRED, "super.login"), PropertyLoader.loadProperty(PropertySource.CRED,"super.pw"));
        waitForJSandJQueryToLoad();
        wait.until(isHomeBreadcrumbsVisible());
        manager.getDmsMenu(driver).clickOnInventoryMenu();
        waitForJSandJQueryToLoad();
        manager.getInventoryDms(driver).clickInventoryRadioBtn();
        waitForJSandJQueryToLoad();
        manager.getInventoryDms(driver).addOdometerColumn();
        waitForJSandJQueryToLoad();
        String maxOdometer = manager.getInventoryDms(driver).getMaxOdometerWithoutSpace();
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).moveOdometerToSlider(3);
        waitForJSandJQueryToLoad();
        Assert.assertEquals(manager.getSearchDws(driver).getOdometerSlideMaxValueWithoutSpace(), maxOdometer);
    }

    @Test(description = "grid first value equals the min odometer value from dms inventory")
    public void odoGridFirstValueIsMinOdoFromInventory() {
        driver.manage().deleteAllCookies();
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dms.url"));
        waitForJSandJQueryToLoad();
        manager.getDmsLoginPage(driver).loginToDms(PropertyLoader.loadProperty(PropertySource.CRED, "super.login"), PropertyLoader.loadProperty(PropertySource.CRED,"super.pw"));
        waitForJSandJQueryToLoad();
        wait.until(isHomeBreadcrumbsVisible());
        manager.getDmsMenu(driver).clickOnInventoryMenu();
        waitForJSandJQueryToLoad();
        manager.getInventoryDms(driver).clickInventoryRadioBtn();
        waitForJSandJQueryToLoad();
        manager.getInventoryDms(driver).addOdometerColumn();
        waitForJSandJQueryToLoad();
        String minOdometer = manager.getInventoryDms(driver).getMinOdometerWithoutSpace();
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        Assert.assertEquals(manager.getSearchDws(driver).getOdometerSlideGridFirstValueWithoutSpace(), minOdometer);
    }

    @Test(description = "grid last value equals the max odometer value from dms inventory")
    public void odoGridLastValueIsMaxOdoFromInventory() {
        driver.manage().deleteAllCookies();
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dms.url"));
        waitForJSandJQueryToLoad();
        manager.getDmsLoginPage(driver).loginToDms(PropertyLoader.loadProperty(PropertySource.CRED, "super.login"), PropertyLoader.loadProperty(PropertySource.CRED,"super.pw"));
        waitForJSandJQueryToLoad();
        wait.until(isHomeBreadcrumbsVisible());
        manager.getDmsMenu(driver).clickOnInventoryMenu();
        waitForJSandJQueryToLoad();
        manager.getInventoryDms(driver).clickInventoryRadioBtn();
        waitForJSandJQueryToLoad();
        manager.getInventoryDms(driver).addOdometerColumn();
        waitForJSandJQueryToLoad();
        String maxOdometer = manager.getInventoryDms(driver).getMaxOdometerWithoutSpace();
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        Assert.assertEquals(manager.getSearchDws(driver).getOdometerSlideGridLastValueWithoutSpace(), maxOdometer);
    }

    @Test(description = "Odometer min value visibility is hidden by default")
    public void odometerMinValueHidden() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        Assert.assertEquals(manager.getSearchDws(driver).getOdometerMinValueVisibility(), "hidden");
    }

    @Test(description = "Odometer min value visibility is hidden by default")
    public void odometerMaxValueHidden() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        Assert.assertEquals(manager.getSearchDws(driver).getOdometerMaxValueVisibility(), "hidden");
    }

    @Test(description = "Progress bar is blue")
    public void isProgressBarBlue() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        Assert.assertEquals(manager.getSearchDws(driver).getOdometerProgressBarColor(), PropertyLoader.loadProperty(PropertySource.CSS,"bg_color_btn"));
    }

    @Test(description = "Progress bar width is full by default (92,2636%)")
    public void odometerProgressBarDefaultWidth() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        Assert.assertEquals(manager.getSearchDws(driver).getOdometerProgressBarWidth(0, 5), "92.26");
    }

    @Test(description = "Click search without selecting odometer - in search results should be from min to max odometers")
    public void clickSearchWithoutOdometer() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        String minOdometer = manager.getSearchDws(driver).getOdometerSlideFromValueWithoutSpace();
        LOG.info("minOdometer is " + minOdometer);
        String maxOdometer = manager.getSearchDws(driver).getOdometerSlideToValueWithoutSpace();
        LOG.info("maxOdometer is " + maxOdometer);
        manager.getSearchDws(driver).clickSearchBtn();
        waitForJSandJQueryToLoad();
        Assert.assertTrue(driver.getCurrentUrl().contains(("_mileagefrom_") + minOdometer + "_mileageto_" + maxOdometer + "_"));
    }

    @Test(description = "Slide odometer from - min odometer should be visible")
    public void odometerMinValueVisible() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).moveOdometerFromSlider(3);
        Assert.assertEquals(manager.getSearchDws(driver).getOdometerMinValueVisibility(), "visible");
    }

    @Test(description = "Slide odometer to - max odometer should be visible")
    public void odometerMaxValueVisible() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).moveOdometerToSlider(3);
        Assert.assertEquals(manager.getSearchDws(driver).getOdometerMaxValueVisibility(), "visible");
    }

    //TODO: actual and expected results are different
   /* @Test(description = "Slide odometer from - from value should change")
    public void odometerFromValueChanged() {
        driver.get(PropertyLoader.loadProperty("dws.url") + PropertyLoader.loadProperty("home.url"));
        waitForJSandJQueryToLoad();
        String odometerChanged = manager.getSearchDws(driver).getOdometerFromChanged(3);
        manager.getSearchDws(driver).moveOdometerFromSlider(3);
        Assert.assertEquals(manager.getSearchDws(driver).getOdometerSlideFromValue(), odometerChanged);
    }*/

    //TODO: odometerChanged is different from actual
    /*@Test(description = "Slide odometer to - to value should change")
    public void odometerToValueChanged() {
        driver.get(PropertyLoader.loadProperty("dws.url") + PropertyLoader.loadProperty("home.url"));
        waitForJSandJQueryToLoad();
        String odometerChanged = manager.getSearchDws(driver).getOdometerToChanged(3);
        manager.getSearchDws(driver).moveOdometerToSlider(3);
        Assert.assertEquals(manager.getSearchDws(driver).getOdometerSlideToValue(), odometerChanged);
    }*/

    //TODO: odometerChanged is different from actual
   /* @Test(description = "Slide odometer from - click search - in search result should be changed odometer from")
    public void odometerFromValueChangedInURL() {
        driver.get(PropertyLoader.loadProperty("dws.url") + PropertyLoader.loadProperty("home.url"));
        waitForJSandJQueryToLoad();
        String odometerChanged = manager.getSearchDws(driver).getOdometerFromChanged(3);
        manager.getSearchDws(driver).moveOdometerFromSlider(3);
        manager.getSearchDws(driver).clickSearchBtn();
        waitForJSandJQueryToLoad();
        Assert.assertTrue(driver.getCurrentUrl().contains(("_mileagefrom_") + odometerChanged));
    }*/

    //TODO: odometerChaged is different from actual
   /* @Test(description = "Slide odometer to - click search - in search result should be changed odometer to")
    public void odometerToValueChangedInURL() {
        driver.get(PropertyLoader.loadProperty("dws.url") + PropertyLoader.loadProperty("home.url"));
        waitForJSandJQueryToLoad();
        String odometerChanged = manager.getSearchDws(driver).getOdometerToChanged(3);
        manager.getSearchDws(driver).moveOdometerToSlider(3);
        manager.getSearchDws(driver).clickSearchBtn();
        waitForJSandJQueryToLoad();
        Assert.assertTrue(driver.getCurrentUrl().contains(("_mileageto_") + odometerChanged));
    }*/

    @Test(description = "Slide odometer from - progress bar width is changed")
    public void progressBarWidthChangedFrom() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).moveOdometerFromSlider(3);
        Assert.assertEquals(manager.getSearchDws(driver).getOdometerProgressBarWidth(0, 5), "59.96");
    }

    @Test(description = "Slide odometer to - progress bar width is changed")
    public void progressBarWidthChangedTo() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).moveOdometerToSlider(3);
        Assert.assertEquals(manager.getSearchDws(driver).getOdometerProgressBarWidth(0, 5), "59.96");
    }

    @Test(description = "Slide odometer from and odometer to on the same value - appears odometer primary value (odometerFrom is visible) ")
    public void yearPrimaryValueAppears() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).moveOdometerFromSlider(2);
        manager.getSearchDws(driver).moveOdometerToSlider(2);
        Assert.assertEquals(manager.getSearchDws(driver).getOdometerFromValueVisibility(), "visible");
    }

    @Test(description = "Slide odometer from and odometer to on the same value - appears odometer primary value (odometerTo is invisible)")
    public void odometerPrimaryValueAppears2() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).moveOdometerFromSlider(2);
        manager.getSearchDws(driver).moveOdometerToSlider(2);
        Assert.assertEquals(manager.getSearchDws(driver).getOdometerToValueVisibility(), "hidden");
    }

    @Test(description = "Slide odometer from and odometer to on the same value - click search - odometer from and odometer to should be the same (ex. 20000)")
    public void odometerPrimaryValueInURL() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).moveOdometerFromSlider(2);
        String odometerFromValue = manager.getSearchDws(driver).getOdometerSlideFromValueWithoutSpace();
        LOG.info("odometerFromValue is " + odometerFromValue);
        manager.getSearchDws(driver).moveOdometerToSlider(2);
        manager.getSearchDws(driver).clickSearchBtn();
        Assert.assertTrue(driver.getCurrentUrl().contains(("_mileagefrom_") + odometerFromValue + "_mileageto_" + odometerFromValue + "_"));
    }

    //TODO:
    /*@Test(description = "Slide odometer from and odometer to to be 1 year between them - appears year single value (ex. 2007-2008)")
    public void yearSingleValueAppears() {
        driver.get(PropertyLoader.loadProperty("dws.url") + PropertyLoader.loadProperty("home.url"));
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).moveYearFromSlider(2);
        manager.getSearchDws(driver).moveYearToSlider2(2);
        Assert.assertEquals(manager.getSearchDws(driver).getYearSingleValueVisibility(), "visible");
    }

//TODO:
    @Test(description = "Slide year from and year to to be 1 year between them - appears year single value (ex. 2007-2008)")
    public void yearSingleValue() {
        driver.get(PropertyLoader.loadProperty("dws.url") + PropertyLoader.loadProperty("home.url"));
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).moveYearFromSlider(2);
        String yearFromValue = manager.getSearchDws(driver).getYearSlideFromValue();
        String yearFromValuePlus = manager.getSearchDws(driver).getYearSlideFromValuePlus(1);
        manager.getSearchDws(driver).moveYearToSlider2(2);
        Assert.assertEquals(manager.getSearchDws(driver).getYearSingleValue(), yearFromValue + " — " + yearFromValuePlus);
    }*/

    @Test(description = "Slide odometer from and odometer to on the same value - progress bar width is 0")
    public void odometerPrimaryProgressBar() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).moveOdometerFromSlider(2);
        manager.getSearchDws(driver).moveOdometerToSlider(2);
        Assert.assertEquals(manager.getSearchDws(driver).getOdometerProgressBarWidth(0, 1), "0");
    }
}
