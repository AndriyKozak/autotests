package dmsDws.tools.map2.widgets._common;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utility.ConfigurationManager;
import utility.Page;

/**
 * Created by Julia on 19.04.2017.
 */
public class Map2WidgetSettings extends Page {


    @FindBy(how = How.XPATH, using = "//div[@data-option='wow']//select")
    private WebElement wowAnimSelect;

    @FindBy(how = How.XPATH, using = "//label[text()='WOW Animation']")
    private WebElement wowAnimLabel;

    @FindBy(how = How.XPATH, using = "//div[@data-option='colorTheme']//select")
    private WebElement colorSelect;

    @FindBy(how = How.XPATH, using = "//label[text()='Color Variation']")
    private WebElement colorLabel;

    @FindBy(how = How.XPATH, using = "//div[@data-option='seller_type']//select")
    private WebElement sellerTypeSelect;

    @FindBy(how = How.XPATH, using = "//label[text()='Seller Type']")
    private WebElement sellerTypeLabel;

    @FindBy(how = How.XPATH, using = "//div[@data-option='motorized_type']//select")
    private WebElement inventoryMotorTypeSelect;

    @FindBy(how = How.XPATH, using = "//label[text()='Inventory Motorized Type']")
    private WebElement inventoryMotorTypeLabel;

    @FindBy(how = How.XPATH, using = "//input[@data-option='multiselect_vehicle_tags']")
    private WebElement filterVehicleTagsEditBtn;

    @FindBy(how = How.XPATH, using = "//label[text()='Filter Vehicle Tags']")
    private WebElement filterVehicleTagsLabel;

    @FindBy(how = How.XPATH, using = "//div[@data-option='status']//select")
    private WebElement inventoryStatusSelect;

    @FindBy(how = How.XPATH, using = "//label[text()='Inventory Status']")
    private WebElement inventoryStatusLabel;

    @FindBy(how = How.XPATH, using = "//div[@data-option='paid']//select")
    private WebElement paidDealersOnlySelect;

    @FindBy(how = How.XPATH, using = "//label[text()='Paid Dealers Only']")
    private WebElement paidDealersOnlyLabel;

    @FindBy(how = How.XPATH, using = "//div[@data-option='priority_min']//input")
    private WebElement priorityRangesInput;

    @FindBy(how = How.XPATH, using = "//label[text()='Priority Ranges']")
    private WebElement priorityRangesLabel;

    @FindBy(how = How.XPATH, using = "//div[@data-option='auction_mode']//select")
    private WebElement auctionModeSelect;

    @FindBy(how = How.XPATH, using = "//label[text()='Auction Mode']")
    private WebElement auctionModeLabel;

    @FindBy(how = How.XPATH, using = "//div[@data-option='title']//input")
    private WebElement widgetTitleInput;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'widget-editor-searchbox')]//input[@class='mapx-form-control']")
    private WebElement searchInput;

    @FindBy(how = How.XPATH, using = "//div[@class='pull-left mapx-input-group widget-editor-searchbox']")
    private WebElement searchInput2;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(), 'Ok')])[1]//..")
    private WebElement okBtn;

    @FindBy(how = How.XPATH, using = "//button[contains(@class,'ui-button')]/span[contains(text(), 'Cancel')]//..")
    private WebElement cancelBtn;

    @FindBy(how = How.XPATH, using = "//span[@class='ui-icon ui-icon-closethick']")
    private WebElement cross;

    @FindBy(how = How.XPATH, using = "//div[@class='mapx-option-group mapx-legend bold'][contains(text(), 'Style & Layout')]")
    private WebElement styleLayoutTitle;

    @FindBy(how = How.XPATH, using = "//div[@class='mapx-option-group mapx-legend bold'][contains(text(), 'Filter Settings')]")
    private WebElement filterSettingsTitle;

    @FindBy(how = How.XPATH, using = "//div[@class='mapx-option-group mapx-legend bold'][contains(text(), 'Other Options')]")
    private WebElement otherOptionsTitle;

    @FindBy(how = How.XPATH, using = "//div[@class='mapx-option-group mapx-legend bold'][contains(text(), 'Admin')]")
    private WebElement adminTitle;

    @FindBy(how = How.ID, using = "ui-dialog-title-1")
    private WebElement widgetSettingsTitle;

    public Map2WidgetSettings(ConfigurationManager manager, WebDriver driver) {
        super(manager, driver);
    }

    public void clickOK() {
        okBtn.click();
    }

    public void clickCancel() {
        cancelBtn.click();
    }

    public void clickCross() {
        cross.click();
    }

    public void setAnimationDisabled() {
        WebElement select = wowAnimSelect;
        Select options = new Select(select);
        options.selectByValue("nowow");
    }

    public void setAnimation(String animation) {
        WebElement select = wowAnimSelect;
        Select options = new Select(select);
        options.selectByValue(animation);
    }



    public void setColorVariation(String colorVariation) {
        WebElement select = colorSelect;
        Select options = new Select(select);
        options.selectByValue(colorVariation);
    }

    public void fillWidgetTitle(String title) {
        widgetTitleInput.clear();
        widgetTitleInput.sendKeys(title);
    }

    /*get visibility of elements*/

    public String getStyleLayoutTitleVisibility() {
        try {
            return styleLayoutTitle.getCssValue("visibility");
        } catch (NoSuchElementException ex) {
            return "No such element";
        }
    }

    public String getFilterSettingsTitleVisibility() {
        try {
            return filterSettingsTitle.getCssValue("visibility");
        } catch (NoSuchElementException ex) {
            return "No such element";
        }
    }

    public String getOtherOptionsTitleVisibility() {
        try {
            return otherOptionsTitle.getCssValue("visibility");
        } catch (NoSuchElementException ex) {
            return "No such element";
        }
    }

    public boolean isAdminTitleDisplayed() {
        try {
            adminTitle.isDisplayed();
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public String getWowAnimationSelectVisibility() {
        try {
            return wowAnimSelect.getCssValue("visibility");
        } catch (NoSuchElementException ex) {
            return "No such element";
        }
    }

    public String getWowAnimationLabelVisibility() {
        try {
            return wowAnimLabel.getCssValue("visibility");
        } catch (NoSuchElementException ex) {
            return "No such element";
        }
    }

    public String getColorVariationSelectVisibility() {
        try {
            return colorSelect.getCssValue("visibility");
        } catch (NoSuchElementException ex) {
            return "No such element";
        }
    }

    public String getColorVariationLabelVisibility() {
        try {
            return colorLabel.getCssValue("visibility");
        } catch (NoSuchElementException ex) {
            return "No such element";
        }
    }

    public String getSellerTypeSelectVisibility() {
        try {
            return sellerTypeSelect.getCssValue("visibility");
        } catch (NoSuchElementException ex) {
            return "No such element";
        }
    }

    public String getSellerTypeLabelVisibility() {
        try {
            return sellerTypeLabel.getCssValue("visibility");
        } catch (NoSuchElementException ex) {
            return "No such element";
        }
    }

    public String getInvStatusSelectVisibility() {
        try {
            return inventoryStatusSelect.getCssValue("visibility");
        } catch (NoSuchElementException ex) {
            return "No such element";
        }
    }

    public String getInvStatusLabelVisibility() {
        try {
            return inventoryStatusLabel.getCssValue("visibility");
        } catch (NoSuchElementException ex) {
            return "No such element";
        }
    }

    public String getInvMotorTypeSelectVisibility() {
        try {
            return inventoryMotorTypeSelect.getCssValue("visibility");
        } catch (NoSuchElementException ex) {
            return "No such element";
        }
    }

    public String getInvMotorTypeLabelVisibility() {
        try {
            return inventoryMotorTypeLabel.getCssValue("visibility");
        } catch (NoSuchElementException ex) {
            return "No such element";
        }
    }

    public String getFilterVehicleTagsBtnVisibility() {
        try {
            return filterVehicleTagsEditBtn.getCssValue("visibility");
        } catch (NoSuchElementException ex) {
            return "No such element";
        }
    }

    public String getFilterVehicleTagsLabelVisibility() {
        try {
            return filterVehicleTagsLabel.getCssValue("visibility");
        } catch (NoSuchElementException ex) {
            return "No such element";
        }
    }



    public String getPaidDealersOnlySelectVisibility() {
        try {
            return paidDealersOnlySelect.getCssValue("visibility");
        } catch (NoSuchElementException ex) {
            return "No such element";
        }
    }

    public String getPaidDealersOnlyLabelVisibility() {
        try {
            return paidDealersOnlyLabel.getCssValue("visibility");
        } catch (NoSuchElementException ex) {
            return "No such element";
        }
    }



    public String getPriorityRangesInputVisibility() {
        try {
            return priorityRangesInput.getCssValue("visibility");
        } catch (NoSuchElementException ex) {
            return "No such element";
        }
    }

    public String getPriorityRangesLabelVisibility() {
        try {
            return priorityRangesLabel.getCssValue("visibility");
        } catch (NoSuchElementException ex) {
            return "No such element";
        }
    }

    public String getAuctionModeSelectVisibility() {
        try {
            return auctionModeSelect.getCssValue("visibility");
        } catch (NoSuchElementException ex) {
            return "No such element";
        }
    }

    public String getAuctionModeLabelVisibility() {
        try {
            return auctionModeLabel.getCssValue("visibility");
        } catch (NoSuchElementException ex) {
            return "No such element";
        }
    }

    public String getOkBtnVisibility() {
        try {
            return okBtn.getCssValue("visibility");
        } catch (NoSuchElementException ex) {
            return "No such element";
        }
    }

    public String getCancelBtnVisibility() {
        try {
            return cancelBtn.getCssValue("visibility");
        } catch (NoSuchElementException ex) {
            return "No such element";
        }
    }

    public String getCrossVisibility() {
        try {
            return cross.getCssValue("visibility");
        } catch (NoSuchElementException ex) {
            return "No such element";
        }
    }

    public String getSearchInputVisibility() {
        try {
            return searchInput.getCssValue("visibility");
        } catch (NoSuchElementException ex) {
            return "No such element";
        }
    }


   /*is element enabled*/

    public boolean isWowAnimSelectEnabled() { return wowAnimSelect.isEnabled(); }

    public boolean isColorSelectEnabled() { return colorSelect.isEnabled(); }

    public boolean isSellerTypeSelectEnabled(){return sellerTypeSelect.isEnabled();}

    public boolean isInvMotorTypeSelectEnabled(){return inventoryMotorTypeSelect.isEnabled();}

    public boolean isFilterVehicleTagsBtnEnabled(){return filterVehicleTagsEditBtn.isEnabled();}

    public boolean isInvStatusSelectEnabled(){return inventoryStatusSelect.isEnabled();}

    public boolean isPaidDealersOnlySelectEnabled(){return paidDealersOnlySelect.isEnabled();}

    public boolean isPriorityRangesInputEnabled(){return priorityRangesInput.isEnabled();}

    public boolean isAuctionModeSelectEnabled(){return auctionModeSelect.isEnabled();}

    public boolean isOkBtnEnabled(){return okBtn.isEnabled();}

    public boolean isCancelBtntEnabled(){return cancelBtn.isEnabled();}

    public boolean isCrossEnabled(){return cross.isEnabled();}

    public boolean isSearchInputEnabled(){return searchInput.isEnabled();}


    /*get font/border/background color of elements*/

    public String getPaidDealersOnlyLabelFontColor(){return paidDealersOnlyLabel.getCssValue("color");}

    public String getPaidDealersOnlySelectColor(){return paidDealersOnlySelect.getCssValue("border-color");}

    public String getPriorityRangesLabelFontColor(){return priorityRangesLabel.getCssValue("color");}

    public String getPriorityRangesInputColor(){return priorityRangesInput.getCssValue("border-color");}

    public String getAuctionModeLabelFontColor(){return auctionModeLabel.getCssValue("color");}

    public String getAuctionModeSelectColor(){return auctionModeSelect.getCssValue("border-color");}

    public String getOkBtnBgColor(){return okBtn.getCssValue("background-color");}

    public String getCancelBtnBgColor(){return cancelBtn.getCssValue("background-color");}

    public String getSearchInputBorderColor(){return searchInput.getCssValue("border-color");}


    /*get text/value of elements*/

    public String getSearchInputPlaceholder(){return searchInput.getAttribute("placeholder");}

    public String getSearchInputValue(){return searchInput.getAttribute("value");}

    public String getWidgetSettingsTitle(){return widgetSettingsTitle.getText();}


    /*get background image of elements*/

    public String getSearchInputBgImage(){return searchInput.getCssValue("background-image");}

    public String getCrossBgImage(){return cross.getCssValue("background-image");}


    /*actions on elements*/

    public void moveMouseOnCross(){
        Actions action = new Actions(driver);
        Action moveToElem = action.moveToElement(cross).build();
        moveToElem.perform();
    }

    public void moveMouseOnOkBtn(){
        Actions action = new Actions(driver);
        Action moveToElem = action.moveToElement(okBtn).build();
        moveToElem.perform();
    }

    public void moveMouseOnCancelBtn(){
        Actions action = new Actions(driver);
        Action moveToElem = action.moveToElement(cancelBtn).build();
        moveToElem.perform();
    }

    public void clickSearchInput(){ searchInput.click(); }

    public void putValueInSearchInput(String text){
        searchInput.clear();
        searchInput.sendKeys(text);
    }

    public void clearSearchInput(){ searchInput.clear(); }
}
