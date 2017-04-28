package dmsDws.tools.map2.widgets.advancedSearchHorizontal;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility.LogFactory;
import utility.PropertyLoader;
import utility.PropertySource;

/**
 * Created by Julia on 26.04.2017.
 */
public class AdvSearchHorizWidgetSettingsDisplayedSupervisor extends AdvSearchHorizTestBaseHome {

    private static final Logger LOG = LogFactory.getLogger(AdvSearchHorizWidgetSettingsDisplayedSupervisor.class);

    @BeforeClass(description = "open widget settings on existing page under manager")
    public void openWidgetSettings() throws InterruptedException {
        driver.manage().deleteAllCookies();
        driver.get(PropertyLoader.loadProperty(PropertySource.URL,"dms.url"));
        manager.getDmsLoginPage(driver).loginToDms(PropertyLoader.loadProperty(PropertySource.CRED, "super.login"), PropertyLoader.loadProperty(PropertySource.CRED,"super.pw"));
        waitForJSandJQueryToLoad();
        wait.until(isHomeBreadcrumbsVisible());
        manager.getDmsMenu(driver).clickOnMap2Menu();
        waitForJSandJQueryToLoad();
        manager.getMap2General(driver).clickHomePageTab();
        waitForJSandJQueryToLoad();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("div.map-link.pull-right"))));
        wait.until(getConditionForTitle("Index"));
        Thread.sleep(1000);
        manager.getMap2General(driver).editLastPage();
        waitForJSandJQueryToLoad();
        wait.until(isLoadingInvisible());
        manager.getMap2PageEditor(driver).openWidgetSettings();
        waitForJSandJQueryToLoad();
    }

    @Test(description = "widget has Style & Layout part under manager")
    public void styleLayoutPartExists(){
        Assert.assertEquals(manager.getMap2WidgetSettings(driver).getStyleLayoutTitleVisibility(), "visible");
    }

    @Test(description = "widget has Filter Settings part under manager")
    public void filterSettingsPartExists(){
        Assert.assertEquals(manager.getMap2WidgetSettings(driver).getFilterSettingsTitleVisibility(), "visible");
    }

    @Test(description = "widget has Other Options part under manager")
    public void otherOptionsPartExists(){
        Assert.assertEquals(manager.getMap2WidgetSettings(driver).getOtherOptionsTitleVisibility(), "visible");
    }

    @Test(description = "widget has not Admin part under manager")
    public void adminPartExists(){
        Assert.assertFalse(manager.getMap2WidgetSettings(driver).isAdminTitleDisplayed());
    }

    @Test(description = "widget has WOW animation select under manager")
    public void wowAnimSelectExists(){
        Assert.assertEquals(manager.getMap2WidgetSettings(driver).getWowAnimationSelectVisibility(), "visible");
    }

    @Test(description = "widget has WOW animation label under manager")
    public void wowAnimLabelExists(){
        Assert.assertEquals(manager.getMap2WidgetSettings(driver).getWowAnimationLabelVisibility(), "visible");
    }

    @Test(description = "widget has Color Variation select under manager")
    public void colorVariationSelectExists(){
        Assert.assertEquals(manager.getMap2WidgetSettings(driver).getColorVariationSelectVisibility(), "visible");
    }

    @Test(description = "widget has Color Variation label under manager")
    public void colorVariationLabelExists(){
        Assert.assertEquals(manager.getMap2WidgetSettings(driver).getColorVariationLabelVisibility(), "visible");
    }

    @Test(description = "widget has Use Alternative Layout select under manager")
    public void useAltLayoutSelectExists(){
        Assert.assertEquals(manager.getMap2SearchWidgetSettings(driver).getUseAltLayoutSelectVisibility(), "visible");
    }

    @Test(description = "widget has Use Alternative Layout label under manager")
    public void useAltLayoutLabelExists(){
        Assert.assertEquals(manager.getMap2SearchWidgetSettings(driver).getUseAltLayoutLabelVisibility(), "visible");
    }

    @Test(description = "widget has Slider Theme select under manager")
    public void sliderThemeSelectExists(){
        Assert.assertEquals(manager.getMap2SearchWidgetSettings(driver).getSliderThemeSelectVisibility(), "visible");
    }

    @Test(description = "widget has Slider Theme label under manager")
    public void sliderThemeLabelExists(){
        Assert.assertEquals(manager.getMap2SearchWidgetSettings(driver).getSliderThemeLabelVisibility(), "visible");
    }

    @Test(description = "widget has Inventory Status select under manager")
    public void invStatusSelectExists(){
        Assert.assertEquals(manager.getMap2WidgetSettings(driver).getInvStatusSelectVisibility(), "visible");
    }

    @Test(description = "widget has Inventory Status label under manager")
    public void invStatusLabelExists(){
        Assert.assertEquals(manager.getMap2WidgetSettings(driver).getInvStatusLabelVisibility(), "visible");
    }

    @Test(description = "widget has Seller Type select under manager")
    public void sellerTypeSelectExists(){
        Assert.assertEquals(manager.getMap2WidgetSettings(driver).getSellerTypeSelectVisibility(), "visible");
    }

    @Test(description = "widget has Seller Type label under manager")
    public void sellerTypeLabelExists(){
        Assert.assertEquals(manager.getMap2WidgetSettings(driver).getSellerTypeLabelVisibility(), "visible");
    }

    @Test(description = "widget has Inventory Motorized Type select under manager")
    public void invMotorTypeSelectExists(){
        Assert.assertEquals(manager.getMap2WidgetSettings(driver).getInvMotorTypeSelectVisibility(), "visible");
    }

    @Test(description = "widget has Inventory Motorized Type label under manager")
    public void invMotorTypeLabelExists(){
        Assert.assertEquals(manager.getMap2WidgetSettings(driver).getInvMotorTypeLabelVisibility(), "visible");
    }

    @Test(description = "widget has Filter Vehicle Tags edit button under manager")
    public void filterVehicleTagsSelectExists(){
        Assert.assertEquals(manager.getMap2WidgetSettings(driver).getFilterVehicleTagsBtnVisibility(), "visible");
    }

    @Test(description = "widget has Filter Vehicle Tags label under manager")
    public void filterVehicleTagsLabelExists(){
        Assert.assertEquals(manager.getMap2WidgetSettings(driver).getFilterVehicleTagsLabelVisibility(), "visible");
    }

    @Test(description = "widget has Show Reset Filters select under manager")
    public void showResetFiltersSelectExists(){
        Assert.assertEquals(manager.getMap2SearchWidgetSettings(driver).getShowResetFiltersSelectVisibility(), "visible");
    }

    @Test(description = "widget has Show Reset Filters label under manager")
    public void showResetFiltersLabelExists(){
        Assert.assertEquals(manager.getMap2SearchWidgetSettings(driver).getShowResetFiltersLabelVisibility(), "visible");
    }

    @Test(description = "widget has not Paid Dealers Only select under manager")
    public void paidDealersOnlySelectDoesnotExist(){
        Assert.assertEquals(manager.getMap2WidgetSettings(driver).getPaidDealersOnlySelectVisibility(), "hidden");
    }

    @Test(description = "widget has not Paid Dealers Only label under manager")
    public void paidDealersOnlyLabelDoesnotExist(){
        Assert.assertEquals(manager.getMap2WidgetSettings(driver).getPaidDealersOnlyLabelVisibility(), "hidden");
    }

    @Test(description = "widget has not Use Search by ZIP select under manager")
    public void useSearchByZipSelectDoesnotExist(){
        Assert.assertFalse(manager.getMap2SearchWidgetSettings(driver).isUseSearchByZipSelectDisplayed());
    }

    @Test(description = "widget has not Use Search by ZIP label under manager")
    public void useSearchByZipLabelDoesnotExist(){
        Assert.assertFalse(manager.getMap2SearchWidgetSettings(driver).isUseSearchByZipLabelDisplayed());
    }

    @Test(description = "widget has not Priority Ranges select under manager")
    public void priorityRangesSelectDoesnotExist(){
        Assert.assertEquals(manager.getMap2WidgetSettings(driver).getPriorityRangesInputVisibility(), "hidden");
    }

    @Test(description = "widget has not Priority Ranges label under manager")
    public void priorityRangesLabelDoesnotExist(){
        Assert.assertEquals(manager.getMap2WidgetSettings(driver).getPriorityRangesLabelVisibility(), "hidden");
    }

    @Test(description = "widget has not Auction Mode select under manager")
    public void auctionModeSelectDoesnotExist(){
        Assert.assertEquals(manager.getMap2WidgetSettings(driver).getAuctionModeSelectVisibility(), "hidden");
    }

    @Test(description = "widget has not Auction Mode label under manager")
    public void auctionModeLabelDoesnotExist(){
        Assert.assertEquals(manager.getMap2WidgetSettings(driver).getAuctionModeLabelVisibility(), "hidden");
    }

    @Test(description = "widget has OK button under manager")
    public void okBtnExists(){
        Assert.assertEquals(manager.getMap2WidgetSettings(driver).getOkBtnVisibility(), "visible");
    }

    @Test(description = "widget has Cancel button under manager")
    public void cancelBtnExists(){
        Assert.assertEquals(manager.getMap2WidgetSettings(driver).getCancelBtnVisibility(), "visible");
    }

    @Test(description = "widget has cross under manager")
    public void crossExists(){
        Assert.assertEquals(manager.getMap2WidgetSettings(driver).getCrossVisibility(), "visible");
    }

    @Test(description = "widget has search input under manager")
    public void searchInputExists(){
        Assert.assertEquals(manager.getMap2WidgetSettings(driver).getSearchInputVisibility(), "visible");
    }

    @Test(description = "wow animation select is enabled under manager")
    public void wowAnimIsEnabled(){
        Assert.assertTrue(manager.getMap2WidgetSettings(driver).isWowAnimSelectEnabled());
    }

    @Test(description = "color variation select is enabled under manager")
    public void colorVariationIsEnabled(){
        Assert.assertTrue(manager.getMap2WidgetSettings(driver).isColorSelectEnabled());
    }

    @Test(description = "use alternative layout select is enabled under manager")
    public void useAltLayoutIsEnabled(){
        Assert.assertTrue(manager.getMap2SearchWidgetSettings(driver).isUseAltLayoutSelectEnabled());
    }

    @Test(description = "slider theme select is enabled under manager")
    public void sliderThemeIsEnabled(){
        Assert.assertTrue(manager.getMap2SearchWidgetSettings(driver).isSliderThemeSelectEnabled());
    }

    @Test(description = "inventory status select is enabled under manager")
    public void invStatusIsEnabled(){
        Assert.assertTrue(manager.getMap2WidgetSettings(driver).isInvStatusSelectEnabled());
    }

    @Test(description = "seller type select is enabled under manager")
    public void sellerTypeIsEnabled(){
        Assert.assertTrue(manager.getMap2WidgetSettings(driver).isSellerTypeSelectEnabled());
    }

    @Test(description = "inventory motorized type select is enabled under manager")
    public void invMotorTypeIsEnabled(){
        Assert.assertTrue(manager.getMap2WidgetSettings(driver).isInvMotorTypeSelectEnabled());
    }

    @Test(description = "filter vehicle tags edit button select is enabled under manager")
    public void filterVehicleTagsIsEnabled(){
        Assert.assertTrue(manager.getMap2WidgetSettings(driver).isFilterVehicleTagsBtnEnabled());
    }

    @Test(description = "show reset filters select is enabled under manager")
    public void showResetFiltersIsEnabled(){
        Assert.assertTrue(manager.getMap2SearchWidgetSettings(driver).isShowResetFiltersSelectEnabled());
    }

    @Test(description = "Ok button is enabled under manager")
    public void okBtnIsEnabled(){
        Assert.assertTrue(manager.getMap2WidgetSettings(driver).isOkBtnEnabled());
    }

    @Test(description = "cancel button is enabled under manager")
    public void cancelBtnIsEnabled(){
        Assert.assertTrue(manager.getMap2WidgetSettings(driver).isCancelBtntEnabled());
    }

    @Test(description = "cross is enabled under manager")
    public void crossIsEnabled(){
        Assert.assertTrue(manager.getMap2WidgetSettings(driver).isCrossEnabled());
    }

    @Test(description = "search input is enabled under manager")
    public void searchIsEnabled(){
        Assert.assertTrue(manager.getMap2WidgetSettings(driver).isSearchInputEnabled());
    }

    @Test(description = "Search input has placeholder 'Search...'")
    public void searchInputPlaceholder(){
        Assert.assertEquals(manager.getMap2WidgetSettings(driver).getSearchInputPlaceholder(), "Search...");
    }

    @Test(description = "Search input has search icon")
    public void searchInputIcon(){
        Assert.assertEquals(manager.getMap2WidgetSettings(driver).getSearchInputBgImage(), "url(\"" + PropertyLoader.loadProperty(PropertySource.URL,"dws.url") + "vcr_files/images/ico_search.png" + "\")");
    }

    @Test(description = "widget settings title exists (Advances Search (horizontal) Settings)")
    public void settingsTitleExists(){
        Assert.assertEquals(manager.getMap2WidgetSettings(driver).getWidgetSettingsTitle(), "Advanced Search (horizontal) Settings");
    }

    @Test(description = "cross is hover")
    public void crossIsHover(){
        manager.getMap2WidgetSettings(driver).moveMouseOnCross();
        waitForJSandJQueryToLoad();
        Assert.assertEquals(manager.getMap2WidgetSettings(driver).getCrossBgImage(), "url(\"http://www.svtautotest.ixloo.com/css/jquery-ui/themes/map_flat/images/ui-icons_ffffff_256x240.png\")");
    }

    @Test(description = "OK button is hover")
    public void okBtnIsHover(){
        manager.getMap2WidgetSettings(driver).moveMouseOnOkBtn();
        waitForJSandJQueryToLoad();
        LOG.info("OK bg is " + manager.getMap2WidgetSettings(driver).getOkBtnBgColor());
        Assert.assertEquals(manager.getMap2WidgetSettings(driver).getOkBtnBgColor(), "rgba(34, 126, 211, 1)");
    }

    @Test(description = "Cancel button is hover")
    public void cancelBtnIsHover(){
        manager.getMap2WidgetSettings(driver).moveMouseOnCancelBtn();
        waitForJSandJQueryToLoad();
        LOG.info("Cancel bg is " + manager.getMap2WidgetSettings(driver).getCancelBtnBgColor());
        Assert.assertEquals(manager.getMap2WidgetSettings(driver).getCancelBtnBgColor(), "rgba(34, 126, 211, 1)");
    }

    @Test(description = "search input is clickable (higligted when focused)")
    public void searchInputIsClickable(){
        manager.getMap2WidgetSettings(driver).clickSearchInput();
        Assert.assertEquals(manager.getMap2WidgetSettings(driver).getSearchInputBorderColor(), PropertyLoader.loadProperty(PropertySource.CSS,"border_color_gray2"));
    }

    @Test(description = "click in search input - 'search...' text is displayed")
    public void placeholderInSearchExistsWhenClick(){
        manager.getMap2WidgetSettings(driver).clearSearchInput();
        manager.getMap2WidgetSettings(driver).clickSearchInput();
        LOG.info("input value is " + manager.getMap2WidgetSettings(driver).getSearchInputValue());
        Assert.assertEquals(manager.getMap2WidgetSettings(driver).getSearchInputPlaceholder(), "Search...");
    }

    @Test(description = "put some word in search input - 'search...' text is not displayed")
    public void placeholderInSearchDoesnotExistWhenPutValue(){
        manager.getMap2WidgetSettings(driver).putValueInSearchInput("text");
        LOG.info("input value is " + manager.getMap2WidgetSettings(driver).getSearchInputValue());
        Assert.assertEquals(manager.getMap2WidgetSettings(driver).getSearchInputValue(), "text");
        manager.getMap2WidgetSettings(driver).clearSearchInput();
    }

    @Test(description = "search wow animation setting - label is shown")
    public void searchByWowLabel(){
        manager.getMap2WidgetSettings(driver).putValueInSearchInput("Wow");
        Assert.assertEquals(manager.getMap2WidgetSettings(driver).getWowAnimationLabelVisibility(), "visible");
    }

    @Test(description = "search wow animation setting - select is shown")
    public void searchByWowSelect(){
        manager.getMap2WidgetSettings(driver).putValueInSearchInput("Wow");
        Assert.assertEquals(manager.getMap2WidgetSettings(driver).getWowAnimationSelectVisibility(), "visible");
    }

    @Test(description = "search color variation setting - label is shown")
    public void searchByColorLabel(){
        manager.getMap2WidgetSettings(driver).putValueInSearchInput("Color");
        Assert.assertEquals(manager.getMap2WidgetSettings(driver).getColorVariationLabelVisibility(), "visible");
    }

    @Test(description = "search color variation setting - select is shown")
    public void searchByColorSelect(){
        manager.getMap2WidgetSettings(driver).putValueInSearchInput("Color");
        Assert.assertEquals(manager.getMap2WidgetSettings(driver).getColorVariationSelectVisibility(), "visible");
    }

    @Test(description = "search use alternative layout setting - label is shown")
    public void searchByAlternativeLabel(){
        manager.getMap2WidgetSettings(driver).putValueInSearchInput("alternative");
        Assert.assertEquals(manager.getMap2WidgetSettings(driver).getColorVariationLabelVisibility(), "visible");
    }

    @Test(description = "search use alternative layout setting - select is shown")
    public void searchByAlternativeSelect(){
        manager.getMap2WidgetSettings(driver).putValueInSearchInput("alternative");
        Assert.assertEquals(manager.getMap2WidgetSettings(driver).getColorVariationSelectVisibility(), "visible");
    }

    @Test(description = "search slider theme setting - label is shown")
    public void searchBySliderLabel(){
        manager.getMap2WidgetSettings(driver).putValueInSearchInput("slider");
        Assert.assertEquals(manager.getMap2SearchWidgetSettings(driver).getSliderThemeLabelVisibility(), "visible");
    }

    @Test(description = "search slider theme setting - select is shown")
    public void searchBySliderSelect(){
        manager.getMap2WidgetSettings(driver).putValueInSearchInput("slider");
        Assert.assertEquals(manager.getMap2SearchWidgetSettings(driver).getSliderThemeSelectVisibility(), "visible");
    }

    @Test(description = "search inventory status setting - label is shown")
    public void searchByInvStatusLabel(){
        manager.getMap2WidgetSettings(driver).putValueInSearchInput("inventory status");
        Assert.assertEquals(manager.getMap2WidgetSettings(driver).getInvStatusLabelVisibility(), "visible");
    }

    @Test(description = "search inventory status setting - select is shown")
    public void searchByInvStatusSelect(){
        manager.getMap2WidgetSettings(driver).putValueInSearchInput("inventory status");
        Assert.assertEquals(manager.getMap2WidgetSettings(driver).getInvStatusSelectVisibility(), "visible");
    }

    @Test(description = "search seller type setting - label is shown")
    public void searchBySellerTypeLabel(){
        manager.getMap2WidgetSettings(driver).putValueInSearchInput("seller type");
        Assert.assertEquals(manager.getMap2WidgetSettings(driver).getSellerTypeLabelVisibility(), "visible");
    }

    @Test(description = "search slider theme setting - select is shown")
    public void searchBySellerTypeSelect(){
        manager.getMap2WidgetSettings(driver).putValueInSearchInput("seller type");
        Assert.assertEquals(manager.getMap2WidgetSettings(driver).getSellerTypeSelectVisibility(), "visible");
    }

    @Test(description = "search inventory motorized type setting - label is shown")
    public void searchByInvMotorTypeLabel(){
        manager.getMap2WidgetSettings(driver).putValueInSearchInput("motorized");
        Assert.assertEquals(manager.getMap2WidgetSettings(driver).getInvMotorTypeLabelVisibility(), "visible");
    }

    @Test(description = "search inventory motorized type setting - select is shown")
    public void searchByInvMotorTypeSelect(){
        manager.getMap2WidgetSettings(driver).putValueInSearchInput("motorized");
        Assert.assertEquals(manager.getMap2WidgetSettings(driver).getInvMotorTypeSelectVisibility(), "visible");
    }

    @Test(description = "search filter vehicle tags setting - label is shown")
    public void searchByFilterVehicleTagsLabel(){
        manager.getMap2WidgetSettings(driver).putValueInSearchInput("tags");
        Assert.assertEquals(manager.getMap2WidgetSettings(driver).getFilterVehicleTagsLabelVisibility(), "visible");
    }

    @Test(description = "search filter vehicle tags setting - select is shown")
    public void searchByFilterVehicleTagsSelect(){
        manager.getMap2WidgetSettings(driver).putValueInSearchInput("tags");
        Assert.assertEquals(manager.getMap2WidgetSettings(driver).getFilterVehicleTagsBtnVisibility(), "visible");
    }

    @Test(description = "search show reset filters setting - label is shown")
    public void searchByShowResetFiltersLabel(){
        manager.getMap2WidgetSettings(driver).putValueInSearchInput("tags");
        Assert.assertEquals(manager.getMap2SearchWidgetSettings(driver).getShowResetFiltersLabelVisibility(), "visible");
    }

    @Test(description = "search show reset filters setting - select is shown")
    public void searchByShowResetFiltersSelect(){
        manager.getMap2WidgetSettings(driver).putValueInSearchInput("tags");
        Assert.assertEquals(manager.getMap2SearchWidgetSettings(driver).getShowResetFiltersSelectVisibility(), "visible");
    }

    @Test(description = "search show reset filters setting - label is shown")
    public void searchByPaidDealersLabel(){
        manager.getMap2WidgetSettings(driver).putValueInSearchInput("paid");
        Assert.assertEquals(manager.getMap2WidgetSettings(driver).getPaidDealersOnlySelectVisibility(), "visible");
    }

    @Test(description = "search paid dealers only setting - select is shown")
    public void searchByPaidDealersSelect(){
        manager.getMap2WidgetSettings(driver).putValueInSearchInput("paid");
        Assert.assertEquals(manager.getMap2WidgetSettings(driver).getPaidDealersOnlySelectVisibility(), "visible");
    }

    @Test(description = "search paid dealers only setting - select is shown")
    public void searchByPaidDealersSelectInviz(){
        manager.getMap2WidgetSettings(driver).putValueInSearchInput("color");
        Assert.assertEquals(manager.getMap2WidgetSettings(driver).getPaidDealersOnlySelectVisibility(), "visible");
    }
}
