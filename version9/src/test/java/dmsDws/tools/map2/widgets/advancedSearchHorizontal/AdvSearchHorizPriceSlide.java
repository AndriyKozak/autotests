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
public class AdvSearchHorizPriceSlide extends AdvSearchHorizTestBaseHome {

    private static final Logger LOG = LogFactory.getLogger(AdvSearchHorizPriceSlide.class);

    @Test(description = "from slider is enabled by default")
    public void fromSliderIsEnabled() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        Assert.assertTrue(manager.getSearchDws(driver).isPriceSliderFromEnabled());
    }

    @Test(description = "to slider is enabled by default")
    public void toSliderIsEnabled() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        Assert.assertTrue(manager.getSearchDws(driver).isPriceSliderToEnabled());
    }

    @Test(description = "from price equals the min odometer value from dms inventory")
    public void opriceFromIsMinPriceFromInventory() {
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
        manager.getInventoryDms(driver).addPriceColumn();
        waitForJSandJQueryToLoad();
        String minPrice = manager.getInventoryDms(driver).getMinPriceWithoutSpace();
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        Assert.assertEquals(manager.getSearchDws(driver).getPriceSlideFromValueWithoutSpace(), minPrice);
    }

    @Test(description = "to price equals the max price value from dms inventory")
    public void priceToIsMaxPriceFromInventory() {
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
        manager.getInventoryDms(driver).addPriceColumn();
        waitForJSandJQueryToLoad();
        String maxPrice = manager.getInventoryDms(driver).getMaxPriceWithoutSpace();
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        Assert.assertEquals(manager.getSearchDws(driver).getPriceSlideToValueWithoutSpace(), maxPrice);
    }

    @Test(description = "min price equals the min price value from dms inventory")
    public void priceMinIsMinPriceFromInventory() {
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
        manager.getInventoryDms(driver).addPriceColumn();
        waitForJSandJQueryToLoad();
        String minPrice = manager.getInventoryDms(driver).getMinPriceWithoutSpace();
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).movePriceFromSlider(3);
        waitForJSandJQueryToLoad();
        Assert.assertEquals(manager.getSearchDws(driver).getPriceSlideMinValueWithoutSpace(), minPrice);
    }

    @Test(description = "max price equals the max price value from dms inventory")
    public void priceMaxIsMaxPriceFromInventory() {
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
        manager.getInventoryDms(driver).addPriceColumn();
        waitForJSandJQueryToLoad();
        String maxPrice = manager.getInventoryDms(driver).getMaxPriceWithoutSpace();
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).movePriceToSlider(3);
        waitForJSandJQueryToLoad();
        Assert.assertEquals(manager.getSearchDws(driver).getPriceSlideMaxValueWithoutSpace(), maxPrice);
    }

    @Test(description = "grid first value equals the min price value from dms inventory")
    public void priceGridFirstValueIsMinPriceFromInventory() {
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
        manager.getInventoryDms(driver).addPriceColumn();
        waitForJSandJQueryToLoad();
        String minPrice = manager.getInventoryDms(driver).getMinPriceWithoutSpace();
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        Assert.assertEquals(manager.getSearchDws(driver).getPriceSlideGridFirstValueWithoutSpace(), minPrice);
    }

    @Test(description = "grid last value equals the max price value from dms inventory")
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
        manager.getInventoryDms(driver).addPriceColumn();
        waitForJSandJQueryToLoad();
        String maxPrice = manager.getInventoryDms(driver).getMaxPriceWithoutSpace();
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        Assert.assertEquals(manager.getSearchDws(driver).getPriceSlideGridLastValueWithoutSpace(), maxPrice);
    }

    @Test(description = "Price min value visibility is hidden by default")
    public void priceMinValueHidden() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        Assert.assertEquals(manager.getSearchDws(driver).getPriceMinValueVisibility(), "hidden");
    }

    @Test(description = "Price max value visibility is hidden by default")
    public void priceMaxValueHidden() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        Assert.assertEquals(manager.getSearchDws(driver).getPriceMaxValueVisibility(), "hidden");
    }

    @Test(description = "Progress bar is blue")
    public void isProgressBarBlue() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        Assert.assertEquals(manager.getSearchDws(driver).getPriceProgressBarColor(), PropertyLoader.loadProperty(PropertySource.CSS,"bg_color_btn"));
    }

    @Test(description = "Progress bar width is full by default (92,2636%)")
    public void priceProgressBarDefaultWidth() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        Assert.assertEquals(manager.getSearchDws(driver).getPriceProgressBarWidth(0, 5), "92.26");
    }

    @Test(description = "Click search without selecting price - in search results should be from min to max prices")
    public void clickSearchWithoutPrice() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        String minPrice = manager.getSearchDws(driver).getPriceSlideFromValueWithoutSpace();
        LOG.info("minPrice is " + minPrice);
        String maxPrice = manager.getSearchDws(driver).getPriceSlideToValueWithoutSpace();
        LOG.info("maxPrice is " + maxPrice);
        manager.getSearchDws(driver).clickSearchBtn();
        waitForJSandJQueryToLoad();
        Assert.assertTrue(driver.getCurrentUrl().contains("_pricefrom_" + minPrice + "_priceto_" + maxPrice));
    }

    @Test(description = "Slide price from - min price should be visible")
    public void priceMinValueVisible() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).movePriceFromSlider(3);
        Assert.assertEquals(manager.getSearchDws(driver).getPriceMinValueVisibility(), "visible");
    }

    @Test(description = "Slide price to - max price should be visible")
    public void priceMaxValueVisible() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).movePriceToSlider(3);
        Assert.assertEquals(manager.getSearchDws(driver).getPriceMaxValueVisibility(), "visible");
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

    @Test(description = "Slide price from - progress bar width is changed")
    public void progressBarWidthChangedFrom() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).movePriceFromSlider(3);
        Assert.assertEquals(manager.getSearchDws(driver).getPriceProgressBarWidth(0, 5), "59.96");
    }

    @Test(description = "Slide price to - progress bar width is changed")
    public void progressBarWidthChangedTo() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).movePriceToSlider(3);
        Assert.assertEquals(manager.getSearchDws(driver).getPriceProgressBarWidth(0, 5), "59.96");
    }

    @Test(description = "Slide price from and price to on the same value - appears price primary value (priceFrom is visible) ")
    public void pricePrimaryValueAppears() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).movePriceFromSlider(2);
        manager.getSearchDws(driver).movePriceToSlider(2);
        Assert.assertEquals(manager.getSearchDws(driver).getPriceFromValueVisibility(), "visible");
    }

    @Test(description = "Slide price from and price to on the same value - appears price primary value (priceTo is invisible)")
    public void pricePrimaryValueAppears2() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).movePriceFromSlider(2);
        manager.getSearchDws(driver).movePriceToSlider(2);
        Assert.assertEquals(manager.getSearchDws(driver).getPriceToValueVisibility(), "hidden");
    }

    @Test(description = "Slide price from and price to on the same value - click search - price from and price to should be the same (ex. 20000)")
    public void pricePrimaryValueInURL() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).movePriceFromSlider(2);
        String priceFromValue = manager.getSearchDws(driver).getPriceSlideFromValueWithoutSpace();
        LOG.info("priceFromValue is " + priceFromValue);
        manager.getSearchDws(driver).movePriceToSlider(2);
        manager.getSearchDws(driver).clickSearchBtn();
        Assert.assertTrue(driver.getCurrentUrl().contains(("_pricefrom_") + priceFromValue + "_priceto_" + priceFromValue));
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

   /* @Test(description = "Slide price from and price to on the same value - progress bar width is 0")
    public void pricePrimaryProgressBar() {
        driver.get(PropertyLoader.loadProperty("dws.url") + PropertyLoader.loadProperty("home.url"));
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).movePriceFromSlider(2);
        manager.getSearchDws(driver).movePriceToSlider(2);
        Assert.assertEquals(manager.getSearchDws(driver).getPriceProgressBarWidth(0, 1), "0");
    }*/

    @Test(description = "currency symbol of from value is from localization settings")
    public void priceCurrencyFromIsFromLocalization(){
        driver.manage().deleteAllCookies();
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dms.url"));
        waitForJSandJQueryToLoad();
        manager.getDmsLoginPage(driver).loginToDms(PropertyLoader.loadProperty(PropertySource.CRED, "super.login"), PropertyLoader.loadProperty(PropertySource.CRED,"super.pw"));
        waitForJSandJQueryToLoad();
        wait.until(isHomeBreadcrumbsVisible());
        manager.getDmsMenu(driver).clickOnWebsiteMenu();
        waitForJSandJQueryToLoad();
        manager.getGeneralWebsiteSettings(driver).clickOnLocalizationTab();
        waitForJSandJQueryToLoad();
        String currency = manager.getLocalizationSettings(driver).getCurrencySymbol();
        String position = manager.getLocalizationSettings(driver).getCurrencyPosition();
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        if (position.equals("Left")) {
            Assert.assertEquals(manager.getSearchDws(driver).getPriceFirstSymbolOfFromValue(), currency);
        }
        else if (position.equals("Right")){
            Assert.assertEquals(manager.getSearchDws(driver).getPriceLastSymbolOfFromValue(), currency);
        }
    }

    @Test(description = "currency symbol of to value is from localization settings")
    public void priceCurrencyToIsFromLocalization(){
        driver.manage().deleteAllCookies();
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dms.url"));
        waitForJSandJQueryToLoad();
        manager.getDmsLoginPage(driver).loginToDms(PropertyLoader.loadProperty(PropertySource.CRED, "super.login"), PropertyLoader.loadProperty(PropertySource.CRED,"super.pw"));
        waitForJSandJQueryToLoad();
        wait.until(isHomeBreadcrumbsVisible());
        manager.getDmsMenu(driver).clickOnWebsiteMenu();
        waitForJSandJQueryToLoad();
        manager.getGeneralWebsiteSettings(driver).clickOnLocalizationTab();
        waitForJSandJQueryToLoad();
        String currency = manager.getLocalizationSettings(driver).getCurrencySymbol();
        String position = manager.getLocalizationSettings(driver).getCurrencyPosition();
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        if (position.equals("Left")) {
            Assert.assertEquals(manager.getSearchDws(driver).getPriceFirstSymbolOfToValue(), currency);
        }
        else if (position.equals("Right")){
            Assert.assertEquals(manager.getSearchDws(driver).getPriceLastSymbolOfToValue(), currency);
        }
    }
}
