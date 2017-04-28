package dmsDws.tools.map2.widgets.advancedSearchHorizontal;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility.PropertyLoader;
import utility.PropertySource;

/**
 * Created by Julia on 20.04.2017.
 */
public class AdvSearchHorizElementsDisplayed extends AdvSearchHorizTestBase {

    @BeforeClass
    public void openDwsUrl(){
        driver.get(PropertyLoader.loadProperty(PropertySource.URL, "dws.url") + PropertyLoader.loadProperty(PropertySource.URL, "home.url"));
    }

    @Test
    public void advSearchHorizTitleDisplayed() {Assert.assertTrue(manager.getSearchDws(driver).isWidgetTitleExists());}

    @Test
    public void advSearchHorizMakeLabelDisplayed() {Assert.assertTrue(manager.getSearchDws(driver).isMakeSelectLabelExists());}

    @Test
    public void advSearchHorizModelLabelDisplayed() {Assert.assertTrue(manager.getSearchDws(driver).isModelSelectLabelExists());}

    @Test
    public void advSearchHorizStyleLabelDisplayed() {Assert.assertTrue(manager.getSearchDws(driver).isStyleSelectLabelExists());}

    @Test
    public void advSearchHorizMakeSelectDisplayed() {Assert.assertTrue(manager.getSearchDws(driver).isMakeSelectExists());}

    @Test
    public void advSearchHorizModelSelectDisplayed() {Assert.assertTrue(manager.getSearchDws(driver).isModelSelectExists());}

    @Test
    public void advSearchHorizStyleSelectDisplayed() {Assert.assertTrue(manager.getSearchDws(driver).isStyleSelectExists());}

    @Test
    public void advSearchHorizYearSlideFromDisplayed() {Assert.assertTrue(manager.getSearchDws(driver).isYearSlideFromValueExists());}

    @Test
    public void advSearchHorizYearSlideToDisplayed() {Assert.assertTrue(manager.getSearchDws(driver).isYearSlideToValueExists());}

    @Test
    public void advSearchHorizYearSlideGridDisplayed() {Assert.assertTrue(manager.getSearchDws(driver).isYearSlideGridExists());}

    @Test
    public void advSearchHorizYearSlideLabelDisplayed() {Assert.assertTrue(manager.getSearchDws(driver).isYearSlideLabelExists());}

    @Test
    public void advSearchHorizYearSlideLineProgressDisplayed() {Assert.assertTrue(manager.getSearchDws(driver).isYearSlideLineProgressExists());}

    @Test
    public void advSearchHorizYearSlideMaxValueDisplayed() {Assert.assertTrue(manager.getSearchDws(driver).isYearSlideMaxValueExists());}

    @Test
    public void advSearchHorizYearSlideMinValuedDisplayed() {Assert.assertTrue(manager.getSearchDws(driver).isYearSlideMinValueExists());}

    @Test
    public void advSearchHorizYearSlideProgressBarDisplayed() {Assert.assertTrue(manager.getSearchDws(driver).isYearSlideProgressBarExists());}

    @Test
    public void advSearchHorizYearSlideSingleValueDisplayed() {Assert.assertTrue(manager.getSearchDws(driver).isYearSlideSingleValueExists());}

    @Test
    public void advSearchHorizOdometerSlideFromDisplayed() {Assert.assertTrue(manager.getSearchDws(driver).isOdometerSlideFromValueExists());}

    @Test
    public void advSearchHorizOdometerSlideToDisplayed() {Assert.assertTrue(manager.getSearchDws(driver).isOdometerSlideToValueExists());}

    @Test
    public void advSearchHorizOdometerSlideGridDisplayed() {Assert.assertTrue(manager.getSearchDws(driver).isOdometerSlideGridExists());}

    @Test
    public void advSearchHorizOdometerSlideLabelDisplayed() {Assert.assertTrue(manager.getSearchDws(driver).isOdometerSlideLabelExists());}

    @Test
    public void advSearchHorizOdometerSlideLineProgressDisplayed() {Assert.assertTrue(manager.getSearchDws(driver).isOdometerSlideLineProgressExists());}

    @Test
    public void advSearchHorizOdometerSlideMaxValueDisplayed() {Assert.assertTrue(manager.getSearchDws(driver).isOdometerSlideMaxValueExists());}

    @Test
    public void advSearchHorizOdometerSlideMinValuedDisplayed() {Assert.assertTrue(manager.getSearchDws(driver).isOdometerSlideMinValueExists());}

    @Test
    public void advSearchHorizOdometerSlideProgressBarDisplayed() {Assert.assertTrue(manager.getSearchDws(driver).isOdometerSlideProgressBarExists());}

    @Test
    public void advSearchHorizOdometerSlideSingleValueDisplayed() {Assert.assertTrue(manager.getSearchDws(driver).isOdometerSlideSingleValueExists());}

    @Test
    public void advSearchHorizPriceSlideFromDisplayed() {Assert.assertTrue(manager.getSearchDws(driver).isPriceSlideFromValueExists());}

    @Test
    public void advSearchHorizPriceSlideToDisplayed() {Assert.assertTrue(manager.getSearchDws(driver).isPriceSlideToValueExists());}

    @Test
    public void advSearchHorizPriceSlideGridDisplayed() {Assert.assertTrue(manager.getSearchDws(driver).isPriceSlideGridExists());}

    @Test
    public void advSearchHorizPriceSlideLabelDisplayed() {Assert.assertTrue(manager.getSearchDws(driver).isPriceSlideLabelExists());}

    @Test
    public void advSearchHorizPriceSlideLineProgressDisplayed() {Assert.assertTrue(manager.getSearchDws(driver).isPriceSlideLineProgressExists());}

    @Test
    public void advSearchHorizPriceSlideMaxValueDisplayed() {Assert.assertTrue(manager.getSearchDws(driver).isPriceSlideMaxValueExists());}

    @Test
    public void advSearchHorizPriceSlideMinValuedDisplayed() {Assert.assertTrue(manager.getSearchDws(driver).isPriceSlideMinValueExists());}

    @Test
    public void advSearchHorizPriceSlideProgressBarDisplayed() {Assert.assertTrue(manager.getSearchDws(driver).isPriceSlideProgressBarExists());}

    @Test
    public void advSearchHorizPriceSlideSingleValueDisplayed() {Assert.assertTrue(manager.getSearchDws(driver).isPriceSlideSingleValueExists());}

    @Test
    public void advSearchHorizSearchButtonDisplayed() {Assert.assertTrue(manager.getSearchDws(driver).isSearchButtonExists());}

    @Test
    public void advSearchHorizSearchButtonIconDisplayed() {Assert.assertTrue(manager.getSearchDws(driver).isSearchButtonIconExists());}

    @Test
    public void advSearchHorizResetButtonDisplayed() {Assert.assertTrue(manager.getSearchDws(driver).isResetFiltersButtonExists());}

    @Test
    public void advSearchHorizResetButtonIconDisplayed() {Assert.assertTrue(manager.getSearchDws(driver).isResetFiltersButtonIconExists());}

}
