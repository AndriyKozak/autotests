package dmsDws.tools.map2.widgets.searches._commonSearch;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utility.ConfigurationManager;
import utility.Page;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Julia on 18.04.2017.
 */
public class SearchDws extends Page {

    @FindBy(how = How.XPATH, using = "//div[contains(@class, 'modul-search_adv_hor')]/div")
    private WebElement advSearch2Widget;

    @FindBy(how = How.XPATH, using = "//div[@class='panel-heading']")
    private WebElement widgetTitle;

    @FindBy(how = How.XPATH, using = "//label[contains(text(), 'Make')]")
    private WebElement makeSelectLabel;

    @FindBy(how = How.XPATH, using = "//label[contains(text(), 'Model')]")
    private WebElement modelSelectLabel;

    @FindBy(how = How.XPATH, using = "//label[contains(text(), 'Style')]")
    private WebElement styleSelectLabel;

    @FindBy(how = How.XPATH, using = "//div[@class='text-center text-muted'][contains(text(), 'Select Year')]")
    private WebElement yearSlideLabel;

    @FindBy(how = How.XPATH, using = "//div[@class='text-center text-muted'][contains(text(), 'Select Odometer')]")
    private WebElement odometerSlideLabel;

    @FindBy(how = How.XPATH, using = "//div[@class='text-center text-muted'][contains(text(), 'Select Price')]")
    private WebElement priceSlideLabel;

    @FindBy(how = How.ID, using = "adv_hor_make")
    private WebElement makeSelect;

    @FindBy(how = How.ID, using = "adv_hor_model")
    private WebElement modelSelect;

    @FindBy(how = How.ID, using = "adv_hor_body")
    private WebElement styleSelect;

    @FindBy(how = How.XPATH, using = "//span[@class='irs js-irs-0 irs-with-grid']//span[@class='irs-line progress']")
    private WebElement yearSlideLineProgress;

    @FindBy(how = How.XPATH, using = "//span[@class='irs js-irs-0 irs-with-grid']//span[contains(@class, 'irs-min')]")
    private WebElement yearSlideMinValue;

    @FindBy(how = How.XPATH, using = "//span[@class='irs js-irs-0 irs-with-grid']//span[contains(@class, 'irs-max')]")
    private WebElement yearSlideMaxValue;

    @FindBy(how = How.XPATH, using = "//span[@class='irs js-irs-0 irs-with-grid']//span[contains(@class, 'irs-from')]")
    private WebElement yearSlideFromValue;

    @FindBy(how = How.XPATH, using = "//span[@class='irs js-irs-0 irs-with-grid']//span[contains(@class, 'irs-to')]")
    private WebElement yearSlideToValue;

    @FindBy(how = How.XPATH, using = "//span[@class='irs js-irs-0 irs-with-grid']//span[contains(@class, 'irs-single')]")
    private WebElement yearSlideSingleValue;

    @FindBy(how = How.XPATH, using = "//span[@class='irs js-irs-0 irs-with-grid']//span[@class='irs-grid']")
    private WebElement yearSlideGrid;

    @FindBy(how = How.XPATH, using = "//span[@class='irs js-irs-0 irs-with-grid']//span[@class='irs-bar progress']/span")
    private WebElement yearSlideProgressBar;

    @FindBy(how = How.XPATH, using = "//span[@class='irs js-irs-0 irs-with-grid']")
    private WebElement yearSlideFull;

    @FindBy(how = How.XPATH, using = "//span[@class='irs js-irs-0 irs-with-grid']//span[@class='irs-slider from']")
    private WebElement yearSlideFromSlider;

    @FindBy(how = How.XPATH, using = "//span[@class='irs js-irs-0 irs-with-grid']//span[@class='irs-slider to type_last']")
    private WebElement yearSlideToSlider;

    @FindBy(how = How.XPATH, using = "//span[@class='irs js-irs-0 irs-with-grid']//span[@class='irs-slider to']")
    private WebElement yearSlideToSliderDefault;

    @FindBy(how = How.XPATH, using = "(//span[@class='irs js-irs-0 irs-with-grid']//span[contains(@class, 'irs-grid-text')])[1]")
    private WebElement yearSlideGridFirstValue;

    @FindBy(how = How.XPATH, using = "(//span[@class='irs js-irs-0 irs-with-grid']//span[contains(@class, 'irs-grid-text')])[last()]")
    private WebElement yearSlideGridLastValue;

    @FindBy(how = How.XPATH, using = "//span[@class='irs js-irs-1 irs-with-grid']//span[@class='irs-line progress']")
    private WebElement odometerSlideLineProgress;

    @FindBy(how = How.XPATH, using = "//span[@class='irs js-irs-1 irs-with-grid']//span[@class='irs-slider from']")
    private WebElement odometerSlideFromSlider;

    @FindBy(how = How.XPATH, using = "//span[@class='irs js-irs-1 irs-with-grid']//span[@class='irs-slider to type_last']")
    private WebElement odometerSlideToSlider;

    @FindBy(how = How.XPATH, using = "//span[@class='irs js-irs-1 irs-with-grid']//span[@class='irs-slider to']")
    private WebElement odometerSlideToSliderDefault;

    @FindBy(how = How.XPATH, using = "//span[@class='irs js-irs-1 irs-with-grid']//span[contains(@class, 'irs-min')]")
    private WebElement odometerSlideMinValue;

    @FindBy(how = How.XPATH, using = "//span[@class='irs js-irs-1 irs-with-grid']//span[contains(@class, 'irs-max')]")
    private WebElement odometerSlideMaxValue;

    @FindBy(how = How.XPATH, using = "//span[@class='irs js-irs-1 irs-with-grid']//span[contains(@class, 'irs-from')]")
    private WebElement odometerSlideFromValue;

    @FindBy(how = How.XPATH, using = "//span[@class='irs js-irs-1 irs-with-grid']//span[contains(@class, 'irs-to')]")
    private WebElement odometerSlideToValue;

    @FindBy(how = How.XPATH, using = "//span[@class='irs js-irs-1 irs-with-grid']//span[contains(@class, 'irs-single')]")
    private WebElement odometerSlideSingleValue;

    @FindBy(how = How.XPATH, using = "(//span[@class='irs js-irs-1 irs-with-grid']//span[contains(@class, 'irs-grid-text')])[1]")
    private WebElement odometerSlideGridFirstValue;

    @FindBy(how = How.XPATH, using = "(//span[@class='irs js-irs-1 irs-with-grid']//span[contains(@class, 'irs-grid-text')])[last()]")
    private WebElement odometerSlideGridLastValue;

    @FindBy(how = How.XPATH, using = "//span[@class='irs js-irs-1 irs-with-grid']//span[@class='irs-grid']")
    private WebElement odometerSlideGrid;

    @FindBy(how = How.XPATH, using = "//span[@class='irs js-irs-1 irs-with-grid']//span[@class='irs-bar progress']/span")
    private WebElement odometerSlideProgressBar;

    @FindBy(how = How.XPATH, using = "//span[@class='irs js-irs-1 irs-with-grid']")
    private WebElement odometerSlideFull;

    @FindBy(how = How.XPATH, using = "//span[@class='irs js-irs-2 irs-with-grid']//span[@class='irs-line progress']")
    private WebElement priceSlideLineProgress;

    @FindBy(how = How.XPATH, using = "//span[@class='irs js-irs-2 irs-with-grid']//span[contains(@class, 'irs-min')]")
    private WebElement priceSlideMinValue;

    @FindBy(how = How.XPATH, using = "//span[@class='irs js-irs-2 irs-with-grid']//span[contains(@class, 'irs-max')]")
    private WebElement priceSlideMaxValue;

    @FindBy(how = How.XPATH, using = "//span[@class='irs js-irs-2 irs-with-grid']//span[contains(@class, 'irs-from')]")
    private WebElement priceSlideFromValue;

    @FindBy(how = How.XPATH, using = "//span[@class='irs js-irs-2 irs-with-grid']//span[contains(@class, 'irs-to')]")
    private WebElement priceSlideToValue;

    @FindBy(how = How.XPATH, using = "//span[@class='irs js-irs-2 irs-with-grid']//span[@class='irs-slider to']")
    private WebElement priceSlideToSliderDefault;

    @FindBy(how = How.XPATH, using = "//span[@class='irs js-irs-2 irs-with-grid']//span[contains(@class, 'irs-single')]")
    private WebElement priceSlideSingleValue;

    @FindBy(how = How.XPATH, using = "//span[@class='irs js-irs-2 irs-with-grid']//span[@class='irs-grid']")
    private WebElement priceSlideGrid;

    @FindBy(how = How.XPATH, using = "(//span[@class='irs js-irs-2 irs-with-grid']//span[contains(@class, 'irs-grid-text')])[1]")
    private WebElement priceSlideGridFirstValue;

    @FindBy(how = How.XPATH, using = "(//span[@class='irs js-irs-2 irs-with-grid']//span[contains(@class, 'irs-grid-text')])[last()]")
    private WebElement priceSlideGridLastValue;

    @FindBy(how = How.XPATH, using = "//span[@class='irs js-irs-2 irs-with-grid']//span[@class='irs-bar progress']/span")
    private WebElement priceSlideProgressBar;

    @FindBy(how = How.XPATH, using = "//span[@class='irs js-irs-2 irs-with-grid']//span[@class='irs-slider from']")
    private WebElement priceSlideFromSlider;

    @FindBy(how = How.XPATH, using = "//span[@class='irs js-irs-2 irs-with-grid']//span[@class='irs-slider to type_last']")
    private WebElement priceSlideToSlider;

    @FindBy(how = How.XPATH, using = "//span[@class='irs js-irs-2 irs-with-grid']")
    private WebElement priceSlideFull;

    @FindBy(how = How.CLASS_NAME, using = "submit_btn")
    private WebElement searchButton;

    @FindBy(how = How.CLASS_NAME, using = "reset-search-filters")
    private WebElement resetFiltersButton;

    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary submit_btn']/i[@class='fa fa-search']")
    private WebElement searchButtonIcon;

    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-default reset-search-filters']/i[@class='fa fa-remove']")
    private WebElement resetFiltersButtonIcon;

    public SearchDws(ConfigurationManager manager, WebDriver driver) {
        super(manager, driver);
    }

/*Method for check if widget exists or doesn't exist*/

    public boolean isAdvSearchHorizWidgetExists() {
        try {
            advSearch2Widget.isDisplayed();
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    /*Method for check if element exists or doesn't exist*/

    public boolean isWidgetTitleExists() {
        try {
            widgetTitle.isDisplayed();
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public boolean isMakeSelectLabelExists() {
        try {
            makeSelectLabel.isDisplayed();
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public boolean isModelSelectLabelExists() {
        try {
            modelSelectLabel.isDisplayed();
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public boolean isStyleSelectLabelExists() {
        try {
            styleSelectLabel.isDisplayed();
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public boolean isMakeSelectExists() {
        try {
            makeSelect.isDisplayed();
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public boolean isModelSelectExists() {
        try {
            modelSelect.isDisplayed();
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public boolean isStyleSelectExists() {
        try {
            styleSelect.isDisplayed();
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public boolean isYearSlideLineProgressExists() {
        try {
            yearSlideLineProgress.isDisplayed();
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public boolean isYearSlideLabelExists() {
        try {
            yearSlideLabel.isDisplayed();
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public boolean isYearSlideFromValueExists() {
        try {
            yearSlideFromValue.isDisplayed();
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public boolean isYearSlideGridExists() {
        try {
            yearSlideGrid.isDisplayed();
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public boolean isYearSlideMaxValueExists() {
        try {
            yearSlideMaxValue.isDisplayed();
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public boolean isYearSlideMinValueExists() {
        try {
            yearSlideMinValue.isDisplayed();
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public boolean isYearSlideProgressBarExists() {
        try {
            yearSlideProgressBar.isDisplayed();
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public boolean isYearSlideSingleValueExists() {
        try {
            yearSlideSingleValue.isDisplayed();
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public boolean isYearSlideToValueExists() {
        try {
            yearSlideToValue.isDisplayed();
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public boolean isOdometerSlideFromValueExists() {
        try {
            odometerSlideFromValue.isDisplayed();
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public boolean isOdometerSlideGridExists() {
        try {
            odometerSlideGrid.isDisplayed();
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public boolean isOdometerSlideLabelExists() {
        try {
            odometerSlideLabel.isDisplayed();
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public boolean isOdometerSlideLineProgressExists() {
        try {
            odometerSlideLineProgress.isDisplayed();
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public boolean isOdometerSlideMaxValueExists() {
        try {
            odometerSlideMaxValue.isDisplayed();
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public boolean isOdometerSlideMinValueExists() {
        try {
            odometerSlideMinValue.isDisplayed();
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public boolean isOdometerSlideProgressBarExists() {
        try {
            odometerSlideProgressBar.isDisplayed();
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public boolean isOdometerSlideSingleValueExists() {
        try {
            odometerSlideSingleValue.isDisplayed();
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public boolean isOdometerSlideToValueExists() {
        try {
            odometerSlideToValue.isDisplayed();
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public boolean isPriceSlideFromValueExists() {
        try {
            priceSlideFromValue.isDisplayed();
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public boolean isPriceSlideGridExists() {
        try {
            priceSlideGrid.isDisplayed();
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public boolean isPriceSlideLabelExists() {
        try {
            priceSlideLabel.isDisplayed();
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public boolean isPriceSlideLineProgressExists() {
        try {
            priceSlideLineProgress.isDisplayed();
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public boolean isPriceSlideMaxValueExists() {
        try {
            priceSlideMaxValue.isDisplayed();
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public boolean isPriceSlideMinValueExists() {
        try {
            priceSlideMinValue.isDisplayed();
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public boolean isPriceSlideProgressBarExists() {
        try {
            priceSlideProgressBar.isDisplayed();
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public boolean isPriceSlideSingleValueExists() {
        try {
            priceSlideSingleValue.isDisplayed();
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public boolean isPriceSlideToValueExists() {
        try {
            priceSlideToValue.isDisplayed();
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public boolean isSearchButtonExists() {
        try {
            searchButton.isDisplayed();
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public boolean isSearchButtonIconExists() {
        try {
            searchButtonIcon.isDisplayed();
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public boolean isResetFiltersButtonExists() {
        try {
            resetFiltersButton.isDisplayed();
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public boolean isResetFiltersButtonIconExists() {
        try {
            resetFiltersButtonIcon.isDisplayed();
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    /*if element enabled*/

    public boolean isMakeSelectEnabled() {
        return makeSelect.isEnabled();
    }

    public boolean isModelSelectEnabled() {
        return modelSelect.isEnabled();
    }

    public boolean isStyleSelectEnabled() {
        return styleSelect.isEnabled();
    }

    public boolean isYearSliderFromEnabled() {
        return yearSlideFromSlider.isEnabled();
    }

    public boolean isYearSliderToEnabled() {
        return yearSlideToSliderDefault.isEnabled();
    }

    public boolean isOdometerSliderFromEnabled() { return odometerSlideFromSlider.isEnabled(); }

    public boolean isOdometerSliderToEnabled() {
        return odometerSlideToSliderDefault.isEnabled();
    }

    public boolean isPriceSliderFromEnabled() {
        return priceSlideFromSlider.isEnabled();
    }

    public boolean isPriceSliderToEnabled() {
        return priceSlideToSliderDefault.isEnabled();
    }

    public boolean isSearchBtnEnabled() {
        return searchButton.isEnabled();
    }

    public boolean isResetFiltersBtnEnabled() {
        return resetFiltersButton.isEnabled();
    }

    /*get visibility value of elements*/

    public String getYearMinValueVisibility() {
        return yearSlideMinValue.getCssValue("visibility");
    }

    public String getYearMaxValueVisibility() {
        return yearSlideMaxValue.getCssValue("visibility");
    }

    public String getYearSingleValueVisibility() {
        return yearSlideSingleValue.getCssValue("visibility");
    }

    public String getYearFromValueVisibility() {
        return yearSlideFromValue.getCssValue("visibility");
    }

    public String getYearToValueVisibility() {
        return yearSlideToValue.getCssValue("visibility");
    }

    public String getOdometerMinValueVisibility() { return odometerSlideMinValue.getCssValue("visibility"); }

    public String getOdometerMaxValueVisibility() {
        return odometerSlideMaxValue.getCssValue("visibility");
    }

    public String getOdometerSingleValueVisibility() {
        return odometerSlideSingleValue.getCssValue("visibility");
    }

    public String getOdometerFromValueVisibility() {
        return odometerSlideFromValue.getCssValue("visibility");
    }

    public String getOdometerToValueVisibility() {
        return odometerSlideToValue.getCssValue("visibility");
    }

    public String getPriceMinValueVisibility() { return priceSlideMinValue.getCssValue("visibility"); }

    public String getPriceMaxValueVisibility() {
        return priceSlideMaxValue.getCssValue("visibility");
    }

    public String getPriceSingleValueVisibility() {
        return priceSlideSingleValue.getCssValue("visibility");
    }

    public String getPriceFromValueVisibility() {
        return priceSlideFromValue.getCssValue("visibility");
    }

    public String getPriceToValueVisibility() {
        return priceSlideToValue.getCssValue("visibility");
    }

    /*get all options of select*/

    public List<WebElement> getMakeSelectOptions() {
        WebElement select = makeSelect;
        Select options = new Select(select);
        List<WebElement> allOptionsMake = options.getOptions();
        return allOptionsMake;
    }

    public List<WebElement> getModelSelectOptions() {
        WebElement select = modelSelect;
        Select options = new Select(select);
        List<WebElement> allOptionsMake = options.getOptions();
        return allOptionsMake;
    }

    public List<WebElement> getStyleSelectOptions() {
        WebElement select = styleSelect;
        Select options = new Select(select);
        List<WebElement> allOptionsMake = options.getOptions();
        return allOptionsMake;
    }

    public List<String> getStyleSelectOptionsText() {
        WebElement select = styleSelect;
        Select options = new Select(select);
        List<WebElement> allOptionsStyle = options.getOptions();
        List<String> option = new ArrayList<>();
        for (int i = 0; i < allOptionsStyle.size(); i++) {
            option.add(allOptionsStyle.get(i).getText().trim());
            //LOG.info("search Style is " + allOptionsStyle.get(i).getText().trim());
        }
        Collections.sort(option);
        for (int i = 0; i < option.size(); i++) {

            //LOG.info("search Style is " + option.get(i));
        }
        return option;
    }

    public List<String> getStyleSelectOptionsValue() {
        WebElement select = styleSelect;
        Select options = new Select(select);
        List<WebElement> allOptionsStyle = options.getOptions();
        List<String> option = new ArrayList<>();
        for (int i = 0; i < allOptionsStyle.size(); i++) {
            option.add(allOptionsStyle.get(i).getAttribute("value"));
        }
        Collections.sort(option);
        return option;
    }

    /*select option by index*/

    public void selectMakeByIndex(int index) {
        WebElement select = makeSelect;
        Select options = new Select(select);
        try {
            options.selectByIndex(index);
        } catch (NoSuchElementException ex) {
            options.selectByIndex(0);
           // LOG.info("No makes in the list");
        }
    }

    public void selectModelByIndex(int index) {
        WebElement select = modelSelect;
        Select options = new Select(select);
        try {
            options.selectByIndex(index);
        } catch (NoSuchElementException ex) {
            options.selectByIndex(0);
           // LOG.info("No makes in the list");
        }
    }

    public void selectStyleByIndex(int index) {
        WebElement select = styleSelect;
        Select options = new Select(select);
        try {
            options.selectByIndex(index);
        } catch (NoSuchElementException ex) {
            options.selectByIndex(0);
           // LOG.info("No makes in the list");
        }
    }

    /*get value of option in select*/

    public String getMakeSelectValue() {
        WebElement select = makeSelect;
        Select options = new Select(select);
        WebElement selectedOption = options.getFirstSelectedOption();
        return selectedOption.getAttribute("value");
    }

    public String getModelSelectValue() {
        WebElement select = modelSelect;
        Select options = new Select(select);
        WebElement selectedOption = options.getFirstSelectedOption();
        return selectedOption.getAttribute("value");
    }

    public String getStyleSelectValue() {
        WebElement select = styleSelect;
        Select options = new Select(select);
        WebElement selectedOption = options.getFirstSelectedOption();
        return selectedOption.getAttribute("value");
    }

    /*get text of option in select*/

    public String getMakeSelectText() {
        WebElement select = makeSelect;
        Select options = new Select(select);
        WebElement selectedOption = options.getFirstSelectedOption();
        return selectedOption.getText();
    }

    public String getModelSelectText() {
        WebElement select = modelSelect;
        Select options = new Select(select);
        WebElement selectedOption = options.getFirstSelectedOption();
        return selectedOption.getText();
    }

    public String getStyleSelectText() {
        WebElement select = styleSelect;
        Select options = new Select(select);
        WebElement selectedOption = options.getFirstSelectedOption();
        return selectedOption.getText();
    }

    /*get text/value of elements*/

    public String getYearSlideFromValue() {
        return yearSlideFromValue.getText();
    }

    public String getYearSlideFromValuePlus(int value) {
        int year = Integer.parseInt(yearSlideFromValue.getText()) + value;
        return Integer.toString(year);
    }

    public String getYearSlideToValue() {
        return yearSlideToValue.getText();
    }

    public String getYearSlideMinValue() {
        return yearSlideMinValue.getText();
    }

    public String getYearSlideMaxValue() {
        return yearSlideMaxValue.getText();
    }

    public String getYearSlideGridFirstValue() {
        return yearSlideGridFirstValue.getText();
    }

    public String getYearSlideGridLastValue() {
        return yearSlideGridLastValue.getText();
    }

    public String getYearSingleValue() {
        return yearSlideSingleValue.getText();
    }

    public String getOdometerSlideFromValue() {
        return odometerSlideFromValue.getText();
    }

    public String getOdometerSlideFromValueWithoutSpace() {
        String stringValue = odometerSlideFromValue.getText();
        String[] nums = stringValue.split(" ");
        String odometer = "";
        for (int i = 0; i < nums.length; i++) {
            odometer += nums[i];
        }
        return odometer;
    }

    public String getOdometerSlideFromValuePlus(int value) {
        int odo = Integer.parseInt(odometerSlideFromValue.getText()) + value;
        return Integer.toString(odo);
    }

    public String getOdometerSlideToValue() {
        return odometerSlideToValue.getText();
    }

    public String getOdometerSlideToValueWithoutSpace() {
        String stringValue = odometerSlideToValue.getText();
        String[] nums = stringValue.split(" ");
        String odometer = "";
        for (int i = 0; i < nums.length; i++) {
            odometer += nums[i];
        }
        return odometer;
    }

    public String getOdometerSlideMinValue() {
        return odometerSlideMinValue.getText();
    }

    public String getOdometerSlideMinValueWithoutSpace() {
        String stringValue = odometerSlideMinValue.getText(); //get String value of odometer (ex. "25 101")
        String[] nums = stringValue.split(" "); //get an array from string odometer, that is contained from digits, divided by space (ex. ["25", "101"])
        String lastValue = ""; // declare a string variable for getting correct number here (ex. "25101")
        for (int i = 0; i < nums.length; i++) { // add elements of array to string (ex. "25" + "101" = "25101")
            lastValue += nums[i];
        }
        return lastValue;
    }

    public String getOdometerSlideMaxValue() {
        return odometerSlideMaxValue.getText();
    }

    public String getOdometerSlideMaxValueWithoutSpace() {
        String stringValue = odometerSlideMaxValue.getText(); //get String value of odometer (ex. "25 101")
        String[] nums = stringValue.split(" "); //get an array from string odometer, that is contained from digits, divided by space (ex. ["25", "101"])
        String lastValue = ""; // declare a string variable for getting correct number here (ex. "25101")
        for (int i = 0; i < nums.length; i++) { // add elements of array to string (ex. "25" + "101" = "25101")
            lastValue += nums[i];
        }
        return lastValue;
    }

    public String getOdometerSlideGridFirstValueWithoutSpace() {
        String stringValue = odometerSlideGridFirstValue.getText(); //get String value of odometer (ex. "25 101")
        String[] nums = stringValue.split(" "); //get an array from string odometer, that is contained from digits, divided by space (ex. ["25", "101"])
        String value = ""; // declare a string variable for getting correct number here (ex. "25101")
        for (int i = 0; i < nums.length; i++) { // add elements of array to string (ex. "25" + "101" = "25101")
            value += nums[i];
        }
        return value;
    }

    public String getOdometerSlideGridLastValueWithoutSpace() {
        String stringValue = odometerSlideGridLastValue.getText(); //get String value of odometer (ex. "25 101")
        String[] nums = stringValue.split(" "); //get an array from string odometer, that is contained from digits, divided by space (ex. ["25", "101"])
        String value = ""; // declare a string variable for getting correct number here (ex. "25101")
        for (int i = 0; i < nums.length; i++) { // add elements of array to string (ex. "25" + "101" = "25101")
            value += nums[i];
        }
        return value;
    }

    public String getOdometerSingleValue() {
        return odometerSlideSingleValue.getText();
    }

    public String getPriceSlideFromValueWithoutSpace() {
        String stringWithCurrency = priceSlideFromValue.getText();
        //LOG.info("stringWithCurrency is " + stringWithCurrency);
        String stringValue = stringWithCurrency.substring(2, stringWithCurrency.length());
        //LOG.info("stringValue1 is " + stringValue);
        String[] nums = stringValue.split(" ");
        String price = "";
        for (int i = 0; i < nums.length; i++) {
            price += nums[i];
        }
        return price;
    }

    public String getPriceSlideToValueWithoutSpace() {
        String stringWithCurrency = priceSlideToValue.getText();
       // LOG.info("stringWithCurrency is " + stringWithCurrency);
        String stringValue = stringWithCurrency.substring(2, stringWithCurrency.length());
       // LOG.info("stringValue1 is " + stringValue);
        String[] nums = stringValue.split(" ");
        String price = "";
        for (int i = 0; i < nums.length; i++) {
            price += nums[i];
        }
        return price;
    }

    public String getPriceSlideMinValueWithoutSpace() {
        String stringWithCurrency = priceSlideMinValue.getText();
       // LOG.info("stringWithCurrency is " + stringWithCurrency);
        String stringValue = stringWithCurrency.substring(2, stringWithCurrency.length());
       // LOG.info("stringValue1 is " + stringValue);
        String[] nums = stringValue.split(" "); //get an array from string odometer, that is contained from digits, divided by space (ex. ["25", "101"])
        String lastValue = ""; // declare a string variable for getting correct number here (ex. "25101")
        for (int i = 0; i < nums.length; i++) { // add elements of array to string (ex. "25" + "101" = "25101")
            lastValue += nums[i];
        }
        return lastValue;
    }

    public String getPriceSlideMaxValueWithoutSpace() {
        String stringWithCurrency = priceSlideMaxValue.getText();
       // LOG.info("stringWithCurrency is " + stringWithCurrency);
        String stringValue = stringWithCurrency.substring(2, stringWithCurrency.length());
       // LOG.info("stringValue1 is " + stringValue);
        String[] nums = stringValue.split(" "); //get an array from string odometer, that is contained from digits, divided by space (ex. ["25", "101"])
        String lastValue = ""; // declare a string variable for getting correct number here (ex. "25101")
        for (int i = 0; i < nums.length; i++) { // add elements of array to string (ex. "25" + "101" = "25101")
            lastValue += nums[i];
        }
        return lastValue;
    }

    public String getPriceSlideGridFirstValueWithoutSpace() {
        String stringValue = priceSlideGridFirstValue.getText(); //get String value of odometer (ex. "25 101")
        String[] nums = stringValue.split(" "); //get an array from string odometer, that is contained from digits, divided by space (ex. ["25", "101"])
        String value = ""; // declare a string variable for getting correct number here (ex. "25101")
        for (int i = 0; i < nums.length; i++) { // add elements of array to string (ex. "25" + "101" = "25101")
            value += nums[i];
        }
        return value;
    }

    public String getPriceSlideGridLastValueWithoutSpace() {
        String stringValue = priceSlideGridLastValue.getText(); //get String value of odometer (ex. "25 101")
        String[] nums = stringValue.split(" "); //get an array from string odometer, that is contained from digits, divided by space (ex. ["25", "101"])
        String value = ""; // declare a string variable for getting correct number here (ex. "25101")
        for (int i = 0; i < nums.length; i++) { // add elements of array to string (ex. "25" + "101" = "25101")
            value += nums[i];
        }
        return value;
    }

    public String getPriceFirstSymbolOfFromValue(){
        String stringValue = priceSlideFromValue.getText();
        String firstSymbol = stringValue.substring(0,1);
       // LOG.info("firstSymbol is " + firstSymbol);
        return firstSymbol;
    }

    public String getPriceLastSymbolOfFromValue(){
        String stringValue = priceSlideFromValue.getText();
        String lastSymbol = stringValue.substring(stringValue.length()-1,stringValue.length());
       // LOG.info("lastSymbol is " + lastSymbol);
        return lastSymbol;
    }

    public String getPriceFirstSymbolOfToValue(){
        String stringValue = priceSlideToValue.getText();
        String firstSymbol = stringValue.substring(0,1);
       // LOG.info("firstSymbol is " + firstSymbol);
        return firstSymbol;
    }

    public String getPriceLastSymbolOfToValue(){
        String stringValue = priceSlideToValue.getText();
        String lastSymbol = stringValue.substring(stringValue.length()-1,stringValue.length());
       // LOG.info("lastSymbol is " + lastSymbol);
        return lastSymbol;
    }

    public String getSearchBtnText(){
        return searchButton.getText();
    }

    public String getResetFiltersBtnText(){
        return resetFiltersButton.getText();
    }

    /*click on buttons*/

    public void clickSearchBtn() {
        searchButton.click();
    }

    public void clickResetFiltetrsBtn() {
        resetFiltersButton.click();
    }

    /*move mouse om element*/

    public void moveMouseToSearchBtn() {
        Actions action = new Actions(driver);
        Action moveToElem = action.moveToElement(searchButton).build();
        moveToElem.perform();
    }

    public void moveMouseToResetFiltersBtn() {
        Actions action = new Actions(driver);
        Action moveToElem = action.moveToElement(resetFiltersButton).build();
        moveToElem.perform();
    }

    /*get border/background color of elements*/

    public String getMakeSelectBorderColor() {
        return makeSelect.getCssValue("border-color");
    }

    public String getModelSelectBorderColor() {
        return modelSelect.getCssValue("border-color");
    }

    public String getStyleSelectBorderColor() {
        return styleSelect.getCssValue("border-color");
    }

    public String getYearProgressBarColor() {
        return yearSlideProgressBar.getCssValue("background-color");
    }

    public String getOdometerProgressBarColor() {
        return odometerSlideProgressBar.getCssValue("background-color");
    }

    public String getPriceProgressBarColor() { return priceSlideProgressBar.getCssValue("background-color"); }

    public String getSearchBtnBgColor() { return searchButton.getCssValue("background-color"); }

    public String getResetFiltersBtnBgColor() { return resetFiltersButton.getCssValue("background-color"); }


    /*get width of elements*/

    public String getYearProgressBarWidth(int substring1, int substring2) {
       // LOG.info("string slide is " + yearSlideFull.getCssValue("width").replace("px", ""));
        float sliderWidth = Float.parseFloat(yearSlideFull.getCssValue("width").replace("px", ""));
      //  LOG.info("sliderWidth = " + sliderWidth);
        float progressBarWidth = Float.parseFloat(yearSlideProgressBar.getCssValue("width").replace("px", ""));
       // LOG.info("progressBarWidth = " + progressBarWidth);
        float progressbarWidthPercent = (progressBarWidth * 100) / sliderWidth;
        return Float.toString(progressbarWidthPercent).substring(substring1, substring2);
    }

    public String getOdometerProgressBarWidth(int substring1, int substring2) {
        float sliderWidth = Float.parseFloat(odometerSlideFull.getCssValue("width").replace("px", ""));
        float progressBarWidth = Float.parseFloat(odometerSlideProgressBar.getCssValue("width").replace("px", ""));
        float progressbarWidthPercent = (progressBarWidth * 100) / sliderWidth;
        return Float.toString(progressbarWidthPercent).substring(substring1, substring2);
    }

    public String getPriceProgressBarWidth(int substring1, int substring2) {
        float sliderWidth = Float.parseFloat(priceSlideFull.getCssValue("width").replace("px", ""));
        float progressBarWidth = Float.parseFloat(priceSlideProgressBar.getCssValue("width").replace("px", ""));
        float progressbarWidthPercent = (progressBarWidth * 100) / sliderWidth;
        return Float.toString(progressbarWidthPercent).substring(substring1, substring2);
    }

    /*actions on elements*/

    public void moveYearFromSlider(int divider) {
        int width = yearSlideLineProgress.getSize().getWidth();
        Actions actions = new Actions(driver);
        Action moveSlider = actions.dragAndDropBy(yearSlideFromSlider, (width / divider), 0).build();
        moveSlider.perform();
    }

    public void moveYearToSlider(int divider) {
        int width = yearSlideLineProgress.getSize().getWidth();
        Actions actions = new Actions(driver);
        Action moveSlider = actions.dragAndDropBy(yearSlideToSliderDefault, (-width / divider), 0).build();
        moveSlider.perform();
    }

    public void moveYearToSlider2(int divider) { //divider+1
        int width = yearSlideLineProgress.getSize().getWidth();
        int yearNumber = Integer.parseInt(yearSlideToValue.getText()) - Integer.parseInt(yearSlideMinValue.getText());
        int yearWidth = width / yearNumber;
      //  LOG.info("width is " + width);
       // LOG.info("yearNumber is " + yearNumber);
        //LOG.info("yearWidth is " + yearWidth);
        Actions actions = new Actions(driver);
        Action moveSlider = actions.dragAndDropBy(yearSlideToSliderDefault, ((-width / divider) + yearWidth), 0).build();
        moveSlider.perform();
    }

    public void moveOdometerFromSlider(int divider) {
        int width = odometerSlideLineProgress.getSize().getWidth();
       // LOG.info("width is " + width);
        Actions actions = new Actions(driver);
        Action moveSlider = actions.dragAndDropBy(odometerSlideFromSlider, (width / divider), 0).build();
        moveSlider.perform();
    }

    public void moveOdometerToSlider(int divider) {
        int width = odometerSlideLineProgress.getSize().getWidth();
        Actions actions = new Actions(driver);
        Action moveSlider = actions.dragAndDropBy(odometerSlideToSliderDefault, (-width / divider), 0).build();
        moveSlider.perform();
    }

    public void moveOdometerToSlider2(int divider) { //divider+1
        int width = odometerSlideLineProgress.getSize().getWidth();
        int yearNumber = Integer.parseInt(odometerSlideToValue.getText()) - Integer.parseInt(odometerSlideMinValue.getText());
        int yearWidth = width / yearNumber;
        //LOG.info("width is " + width);
        //LOG.info("yearNumber is " + yearNumber);
        //LOG.info("yearWidth is " + yearWidth);
        Actions actions = new Actions(driver);
        Action moveSlider = actions.dragAndDropBy(odometerSlideToSliderDefault, ((-width / divider) + yearWidth), 0).build();
        moveSlider.perform();
    }

    public void movePriceFromSlider(int divider) {
        int width = priceSlideLineProgress.getSize().getWidth();
       // LOG.info("width is " + width);
        Actions actions = new Actions(driver);
        Action moveSlider = actions.dragAndDropBy(priceSlideFromSlider, (width / divider), 0).build();
        moveSlider.perform();
    }

    public void movePriceToSlider(int divider) {
        int width = priceSlideLineProgress.getSize().getWidth();
        //LOG.info("width is " + width);
        Actions actions = new Actions(driver);
        Action moveSlider = actions.dragAndDropBy(priceSlideToSliderDefault, (-width / divider), 0).build();
        moveSlider.perform();
    }

    public String getYearFromChanged(int divider) {
        Double dividedValue = Math.ceil((Double.parseDouble(yearSlideToValue.getText()) - Double.parseDouble(yearSlideFromValue.getText())) / divider);
        Double yearFromChanged = Double.parseDouble(yearSlideFromValue.getText()) + dividedValue;
        return Integer.toString(yearFromChanged.intValue());
    }

    public String getYearToChanged(int divider) {
        Double dividedValue = Math.ceil((Double.parseDouble(yearSlideToValue.getText()) - Double.parseDouble(yearSlideFromValue.getText())) / divider);
        Double yearToChanged = Double.parseDouble(yearSlideToValue.getText()) - dividedValue;
        return Integer.toString(yearToChanged.intValue());
    }

    public String getOdometerFromChanged(int divider) {
        String stringValue1 = odometerSlideFromValue.getText(); //get String value of odometer (ex. "25 101")
        String[] nums1 = stringValue1.split(" "); //get an array from string odometer, that is contained from digits, divided by space (ex. ["25", "101"])
        String fromOdometer = ""; // declare a string variable for getting correct number here (ex. "25101")
        for (int i = 0; i < nums1.length; i++) { // add elements of array to string (ex. "25" + "101" = "25101")
            fromOdometer += nums1[i];
        }
        //LOG.info("fromOdometer is " + fromOdometer);

        String stringValue2 = odometerSlideToValue.getText(); //get String value of odometer (ex. "25 101")
        String[] nums2 = stringValue2.split(" "); //get an array from string odometer, that is contained from digits, divided by space (ex. ["25", "101"])
        String toOdometer = ""; // declare a string variable for getting correct number here (ex. "25101")

        for (int i = 0; i < nums2.length; i++) { // add elements of array to string (ex. "25" + "101" = "25101")
            toOdometer += nums2[i];
        }
       // LOG.info("toOdometer is " + toOdometer);
        Double dividedValue = Math.ceil((Double.parseDouble(toOdometer) - Double.parseDouble(fromOdometer)) / divider);
       // LOG.info("dividedValue is " + dividedValue);
        Double odometerFromChanged = Double.parseDouble(fromOdometer) + dividedValue;

        //LOG.info("changedOdometer is " + odometerFromChanged);
        return Integer.toString(odometerFromChanged.intValue());
    }

    public String getOdometerToChanged(int divider) {
        String stringValue1 = odometerSlideFromValue.getText(); //get String value of odometer (ex. "25 101")
        String[] nums1 = stringValue1.split(" "); //get an array from string odometer, that is contained from digits, divided by space (ex. ["25", "101"])
        String fromOdometer = ""; // declare a string variable for getting correct number here (ex. "25101")
        for (int i = 0; i < nums1.length; i++) { // add elements of array to string (ex. "25" + "101" = "25101")
            fromOdometer += nums1[i];
        }
       // LOG.info("fromOdometer is " + fromOdometer);

        String stringValue2 = odometerSlideToValue.getText(); //get String value of odometer (ex. "25 101")
        String[] nums2 = stringValue2.split(" "); //get an array from string odometer, that is contained from digits, divided by space (ex. ["25", "101"])
        String toOdometer = ""; // declare a string variable for getting correct number here (ex. "25101")

        for (int i = 0; i < nums2.length; i++) { // add elements of array to string (ex. "25" + "101" = "25101")
            toOdometer += nums2[i];
        }
       // LOG.info("toOdometer is " + toOdometer);
        Double dividedValue = Math.ceil((Double.parseDouble(toOdometer) - Double.parseDouble(fromOdometer)) / divider);
        Double odometerToChanged = Double.parseDouble(toOdometer) - dividedValue;
        return Integer.toString(odometerToChanged.intValue());
    }

    public String getPriceFromChanged(int divider) {
        String stringValue1 = priceSlideFromValue.getText(); //get String value of odometer (ex. "25 101")
        String[] nums1 = stringValue1.split(" "); //get an array from string odometer, that is contained from digits, divided by space (ex. ["25", "101"])
        String fromPriceWithCurrency = ""; // declare a string variable for getting correct number here (ex. "25101")
        for (int i = 0; i < nums1.length; i++) { // add elements of array to string (ex. "25" + "101" = "25101")
            fromPriceWithCurrency += nums1[i];
        }
        String fromPrice = fromPriceWithCurrency.substring(1, fromPriceWithCurrency.length());
      //  LOG.info("fromPrice is " + fromPrice);
        String stringValue2 = priceSlideToValue.getText(); //get String value of odometer (ex. "25 101")
        String[] nums2 = stringValue2.split(" "); //get an array from string odometer, that is contained from digits, divided by space (ex. ["25", "101"])
        String toPriceWithCurrency = ""; // declare a string variable for getting correct number here (ex. "25101")
        for (int i = 0; i < nums2.length; i++) { // add elements of array to string (ex. "25" + "101" = "25101")
            toPriceWithCurrency += nums2[i];
        }
        String toPrice = toPriceWithCurrency.substring(1, toPriceWithCurrency.length());
       // LOG.info("toPrice is " + toPrice);
        Double dividedValue = Math.ceil((Double.parseDouble(toPrice) - Double.parseDouble(fromPrice)) / divider);
       // LOG.info("dividedValue is " + dividedValue);
        Double priceFromChanged = Double.parseDouble(fromPrice) + dividedValue;
      //  LOG.info("changedPrice is " + priceFromChanged);
        return Integer.toString(priceFromChanged.intValue());
    }

    public String getPriceToChanged(int divider) {
        String stringValue1 = priceSlideFromValue.getText(); //get String value of odometer (ex. "25 101")
        String[] nums1 = stringValue1.split(" "); //get an array from string odometer, that is contained from digits, divided by space (ex. ["25", "101"])
        String fromPriceWithCurrency = ""; // declare a string variable for getting correct number here (ex. "25101")
        for (int i = 0; i < nums1.length; i++) { // add elements of array to string (ex. "25" + "101" = "25101")
            fromPriceWithCurrency += nums1[i];
        }
        String fromPrice = fromPriceWithCurrency.substring(1, fromPriceWithCurrency.length());
      //  LOG.info("fromPrice is " + fromPrice);
        String stringValue2 = priceSlideToValue.getText(); //get String value of odometer (ex. "25 101")
        String[] nums2 = stringValue2.split(" "); //get an array from string odometer, that is contained from digits, divided by space (ex. ["25", "101"])
        String toPriceWithCurrency = ""; // declare a string variable for getting correct number here (ex. "25101")
        for (int i = 0; i < nums2.length; i++) { // add elements of array to string (ex. "25" + "101" = "25101")
            toPriceWithCurrency += nums2[i];
        }
        String toPrice = toPriceWithCurrency.substring(1, toPriceWithCurrency.length());
       // LOG.info("toPrice is " + toPrice);
        Double dividedValue = Math.ceil((Double.parseDouble(toPrice) - Double.parseDouble(fromPrice)) / divider);
        Double priceToChanged = Double.parseDouble(toPrice) - dividedValue;
        return Integer.toString(priceToChanged.intValue());
    }
}
