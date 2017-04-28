package dmsDws.tools.map2.widgets.advancedSearchHorizontal;

import org.testng.Assert;
import org.testng.annotations.Test;
import utility.PropertyLoader;
import utility.PropertySource;

/**
 * Created by Julia on 21.04.2017.
 */
public class AdvSearchHorizResetFiltersButton extends AdvSearchHorizTestBaseHome {

    @Test(description = "button has 'Search' text")
    public void textIsSearch(){
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        Assert.assertEquals(manager.getSearchDws(driver).getResetFiltersBtnText().trim(), "Reset Filters");
    }

    @Test(description = "button has hover class (change color when move mouse on it)")
    public void btnIsHover(){
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).moveMouseToResetFiltersBtn();
        Assert.assertEquals(manager.getSearchDws(driver).getResetFiltersBtnBgColor(), PropertyLoader.loadProperty(PropertySource.CSS,"bg_color_btn_hover2"));
    }

    @Test(description = "button has blue color")
    public void btnDefaultColor(){
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        Assert.assertEquals(manager.getSearchDws(driver).getResetFiltersBtnBgColor(), PropertyLoader.loadProperty(PropertySource.CSS,"font_color_white"));
    }

    @Test
    public void isBtnEnabled() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        Assert.assertTrue(manager.getSearchDws(driver).isResetFiltersBtnEnabled());
    }

    @Test(description = "select any make - click reset - make is Any Make")
    public void resetMake() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).selectMakeByIndex(1);
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickResetFiltetrsBtn();
        waitForJSandJQueryToLoad();
        Assert.assertEquals(manager.getSearchDws(driver).getMakeSelectText(), "Any Make");
    }

    @Test(description = "select any model - click reset - make is Any Model")
    public void resetModel() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).selectMakeByIndex(1);
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).selectModelByIndex(1);
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickResetFiltetrsBtn();
        waitForJSandJQueryToLoad();
        Assert.assertEquals(manager.getSearchDws(driver).getModelSelectText(), "Any Model");
    }

    @Test(description = "select any Model - click reset - Model is disabled")
    public void resetModelDisabled() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).selectMakeByIndex(1);
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).selectModelByIndex(1);
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickResetFiltetrsBtn();
        waitForJSandJQueryToLoad();
        Assert.assertFalse(manager.getSearchDws(driver).isModelSelectEnabled());
    }

    @Test(description = "select any style - click reset - make is Any Style")
    public void resetStyle() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).selectStyleByIndex(1);
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickResetFiltetrsBtn();
        waitForJSandJQueryToLoad();
        Assert.assertEquals(manager.getSearchDws(driver).getStyleSelectText(), "Any Style");
    }

    @Test(description = "select any year from - click reset - year from  is min year")
    public void resetYearFrom() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        String minYear = manager.getSearchDws(driver).getYearSlideFromValue();
        manager.getSearchDws(driver).moveYearFromSlider(3);
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickResetFiltetrsBtn();
        waitForJSandJQueryToLoad();
        Assert.assertEquals(manager.getSearchDws(driver).getYearSlideFromValue(), minYear);
    }

    @Test(description = "select any year to - click reset - year to  is max year")
    public void resetYearTo() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        String maxYear = manager.getSearchDws(driver).getYearSlideToValue();
        manager.getSearchDws(driver).moveYearToSlider(3);
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickResetFiltetrsBtn();
        waitForJSandJQueryToLoad();
        Assert.assertEquals(manager.getSearchDws(driver).getYearSlideToValue(), maxYear);
    }

    @Test(description = "select any odometer from - click reset - odometer from is min odometer")
    public void resetOdometerFrom() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        String minOdometer = manager.getSearchDws(driver).getOdometerSlideFromValue();
        manager.getSearchDws(driver).moveOdometerFromSlider(3);
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickResetFiltetrsBtn();
        waitForJSandJQueryToLoad();
        Assert.assertEquals(manager.getSearchDws(driver).getOdometerSlideFromValue(), minOdometer);
    }

    @Test(description = "select any odometer to - click reset - odometer to is max year")
    public void resetOdometerTo() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        String maxYear = manager.getSearchDws(driver).getYearSlideToValue();
        manager.getSearchDws(driver).moveYearToSlider(3);
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickResetFiltetrsBtn();
        waitForJSandJQueryToLoad();
        Assert.assertEquals(manager.getSearchDws(driver).getYearSlideToValue(), maxYear);
    }

    @Test(description = "select any price from - click reset - price from is min price")
    public void resetPriceFrom() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        String minPrice = manager.getSearchDws(driver).getPriceSlideFromValueWithoutSpace();
        manager.getSearchDws(driver).movePriceFromSlider(3);
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickResetFiltetrsBtn();
        waitForJSandJQueryToLoad();
        Assert.assertEquals(manager.getSearchDws(driver).getPriceSlideFromValueWithoutSpace(), minPrice);
    }

    @Test(description = "select any price to - click reset - price to is max price")
    public void resetPriceTo() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        String maxPrice = manager.getSearchDws(driver).getPriceSlideToValueWithoutSpace();
        manager.getSearchDws(driver).movePriceToSlider(3);
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickResetFiltetrsBtn();
        waitForJSandJQueryToLoad();
        Assert.assertEquals(manager.getSearchDws(driver).getPriceSlideToValueWithoutSpace(), maxPrice);
    }

    @Test(description = "select any year from - click search - click reset - year from is min year")
    public void resetYearFromAfterSearch() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        String minYear = manager.getSearchDws(driver).getYearSlideFromValue();
        manager.getSearchDws(driver).moveYearFromSlider(3);
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickSearchBtn();
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickResetFiltetrsBtn();
        waitForJSandJQueryToLoad();
        Assert.assertEquals(manager.getSearchDws(driver).getYearSlideFromValue(), minYear);
    }

    @Test(description = "select any year from - click search - click reset - url is cars-for-sale")
    public void resetYearFromInURLAfterSearch() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).moveYearFromSlider(3);
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickSearchBtn();
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickResetFiltetrsBtn();
        waitForJSandJQueryToLoad();
        Assert.assertEquals(driver.getCurrentUrl(), PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"inventory.url"));
    }

    @Test(description = "select any year to - click search - click reset - year to is max year")
    public void resetYearToAfterSearch() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        String maxYear = manager.getSearchDws(driver).getYearSlideToValue();
        manager.getSearchDws(driver).moveYearToSlider(3);
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickSearchBtn();
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickResetFiltetrsBtn();
        waitForJSandJQueryToLoad();
        Assert.assertEquals(manager.getSearchDws(driver).getYearSlideToValue(), maxYear);
    }

    @Test(description = "select any year to - click search - click reset - url is cars-for-sale")
    public void resetYearToInURLAfterSearch() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).moveYearToSlider(3);
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickSearchBtn();
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickResetFiltetrsBtn();
        waitForJSandJQueryToLoad();
        Assert.assertEquals(driver.getCurrentUrl(), PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"inventory.url"));
    }

    @Test(description = "select any odometer from - click search - click reset - odometer from is min odometer")
    public void resetOdometerFromAfterSearch() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        String minOdometer = manager.getSearchDws(driver).getOdometerSlideFromValue();
        manager.getSearchDws(driver).moveOdometerFromSlider(3);
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickSearchBtn();
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickResetFiltetrsBtn();
        waitForJSandJQueryToLoad();
        Assert.assertEquals(manager.getSearchDws(driver).getOdometerSlideFromValue(), minOdometer);
    }

    @Test(description = "select any odometer from - click search - click reset - url is cars-for-sale")
    public void resetOdometerFromInURLAfterSearch() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).moveOdometerFromSlider(3);
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickSearchBtn();
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickResetFiltetrsBtn();
        waitForJSandJQueryToLoad();
        Assert.assertEquals(driver.getCurrentUrl(), PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"inventory.url"));
    }

    @Test(description = "select any Odometer to - click search - click reset - Odometer to is max Odometer")
    public void resetOdometerToAfterSearch() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        String maxOdometer = manager.getSearchDws(driver).getOdometerSlideToValue();
        manager.getSearchDws(driver).moveOdometerToSlider(3);
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickSearchBtn();
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickResetFiltetrsBtn();
        waitForJSandJQueryToLoad();
        Assert.assertEquals(manager.getSearchDws(driver).getOdometerSlideToValue(), maxOdometer);
    }

    @Test(description = "select any Odometer to - click search - click reset - url is cars-for-sale")
    public void resetOdometerToInURLAfterSearch() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).moveOdometerToSlider(3);
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickSearchBtn();
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickResetFiltetrsBtn();
        waitForJSandJQueryToLoad();
        Assert.assertEquals(driver.getCurrentUrl(), PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"inventory.url"));
    }

    @Test(description = "select any Price from - click search - click reset - Price from is min Price")
    public void resetOPriceFromAfterSearch() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        String minPrice = manager.getSearchDws(driver).getPriceSlideFromValueWithoutSpace();
        manager.getSearchDws(driver).movePriceFromSlider(3);
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickSearchBtn();
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickResetFiltetrsBtn();
        waitForJSandJQueryToLoad();
        Assert.assertEquals(manager.getSearchDws(driver).getPriceSlideFromValueWithoutSpace(), minPrice);
    }

    @Test(description = "select any Price from - click search - click reset - url is cars-for-sale")
    public void resetPriceFromInURLAfterSearch() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).movePriceFromSlider(3);
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickSearchBtn();
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickResetFiltetrsBtn();
        waitForJSandJQueryToLoad();
        Assert.assertEquals(driver.getCurrentUrl(), PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"inventory.url"));
    }

    @Test(description = "select any Price to - click search - click reset - Price to is max Price")
    public void resetPricerToAfterSearch() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        String maxPrice = manager.getSearchDws(driver).getPriceSlideToValueWithoutSpace();
        manager.getSearchDws(driver).movePriceToSlider(3);
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickSearchBtn();
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickResetFiltetrsBtn();
        waitForJSandJQueryToLoad();
        Assert.assertEquals(manager.getSearchDws(driver).getPriceSlideToValueWithoutSpace(), maxPrice);
    }

    @Test(description = "select any Price to - click search - click reset - url is cars-for-sale")
    public void resetPriceToInURLAfterSearch() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).movePriceToSlider(3);
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickSearchBtn();
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickResetFiltetrsBtn();
        waitForJSandJQueryToLoad();
        Assert.assertEquals(driver.getCurrentUrl(), PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"inventory.url"));
    }

    @Test(description = "select any Make - click search - click reset - Make to is Any Make")
    public void resetMakeAfterSearch() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).selectMakeByIndex(1);
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickSearchBtn();
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickResetFiltetrsBtn();
        waitForJSandJQueryToLoad();
        Assert.assertEquals(manager.getSearchDws(driver).getMakeSelectText(), "Any Make");
    }

    @Test(description = "select any Make - click search - click reset - url is cars-for-sale")
    public void resetMakeInURLAfterSearch() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).selectMakeByIndex(1);
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickSearchBtn();
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickResetFiltetrsBtn();
        waitForJSandJQueryToLoad();
        Assert.assertEquals(driver.getCurrentUrl(), PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"inventory.url"));
    }

    @Test(description = "select any Model - click search - click reset - Model to is Any Model")
    public void resetModelAfterSearch() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).selectMakeByIndex(1);
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).selectModelByIndex(1);
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickSearchBtn();
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickResetFiltetrsBtn();
        waitForJSandJQueryToLoad();
        Assert.assertEquals(manager.getSearchDws(driver).getModelSelectText(), "Any Model");
    }

    @Test(description = "select any Model - click search - click reset - url is cars-for-sale")
    public void resetModelInURLAfterSearch() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).selectMakeByIndex(1);
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).selectModelByIndex(1);
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickSearchBtn();
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickResetFiltetrsBtn();
        waitForJSandJQueryToLoad();
        Assert.assertEquals(driver.getCurrentUrl(), PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"inventory.url"));
    }

    @Test(description = "select any Model - click search - click reset - Model is disabled")
    public void resetModelDisabledAfterSearch() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).selectMakeByIndex(1);
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).selectModelByIndex(1);
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickSearchBtn();
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickResetFiltetrsBtn();
        waitForJSandJQueryToLoad();
        Assert.assertFalse(manager.getSearchDws(driver).isModelSelectEnabled());
    }

    @Test(description = "select any Style - click search - click reset - Style to is Any Style")
    public void resetStyleAfterSearch() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).selectStyleByIndex(1);
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickSearchBtn();
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickResetFiltetrsBtn();
        waitForJSandJQueryToLoad();
        Assert.assertEquals(manager.getSearchDws(driver).getStyleSelectText(), "Any Style");
    }

    @Test(description = "select any Style - click search - click reset - url is cars-for-sale")
    public void resetStyleInURLAfterSearch() {
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"home.url"));
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).selectStyleByIndex(1);
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickSearchBtn();
        waitForJSandJQueryToLoad();
        manager.getSearchDws(driver).clickResetFiltetrsBtn();
        waitForJSandJQueryToLoad();
        Assert.assertEquals(driver.getCurrentUrl(), PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + PropertyLoader.loadProperty(PropertySource.URL,"inventory.url"));
    }
}
