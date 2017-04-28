package dmsDws.tools.map2.widgets.searches._commonSearch;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.ConfigurationManager;
import utility.Page;

/**
 * Created by Julia on 19.04.2017.
 */
public class Map2SearchWidgetSettings extends Page {


    @FindBy(how = How.XPATH, using = "//div[@data-option='alternative_layout']//select")
    private WebElement useAlternativeLayoutSelect;

    @FindBy(how = How.XPATH, using = "//label[text()='Use Alternative Layout']")
    private WebElement useAlternativeLayoutLabel;

    @FindBy(how = How.XPATH, using = "//div[@data-option='theme']//select")
    private WebElement sliderThemeSelect;

    @FindBy(how = How.XPATH, using = "//label[text()='Slider Theme']")
    private WebElement sliderThemeLabel;

    @FindBy(how = How.XPATH, using = "//div[@data-option='show_reset_button']//select")
    private WebElement showResetFiltersSelect;

    @FindBy(how = How.XPATH, using = "//label[text()='Show Reset Filters']")
    private WebElement showResetFiltersLabel;

    @FindBy(how = How.XPATH, using = "//div[@data-option='search_by_zip']//select")
    private WebElement useSearchByZipSelect;

    @FindBy(how = How.XPATH, using = "//label[text()='Use Search by ZIP']")
    private WebElement useSearchByZipLabel;

    public Map2SearchWidgetSettings(ConfigurationManager manager, WebDriver driver) {
        super(manager, driver);
    }

    /*get visibility of elements*/

    public String getUseAltLayoutSelectVisibility() {
        try {
            return useAlternativeLayoutSelect.getCssValue("visibility");
        } catch (NoSuchElementException ex) {
            return "No such element";
        }
    }

    public String getUseAltLayoutLabelVisibility() {
        try {
            return useAlternativeLayoutLabel.getCssValue("visibility");
        } catch (NoSuchElementException ex) {
            return "No such element";
        }
    }

    public String getSliderThemeSelectVisibility() {
        try {
            return sliderThemeSelect.getCssValue("visibility");
        } catch (NoSuchElementException ex) {
            return "No such element";
        }
    }

    public String getSliderThemeLabelVisibility() {
        try {
            return sliderThemeLabel.getCssValue("visibility");
        } catch (NoSuchElementException ex) {
            return "No such element";
        }
    }

    public String getShowResetFiltersSelectVisibility() {
        try {
            return showResetFiltersSelect.getCssValue("visibility");
        } catch (NoSuchElementException ex) {
            return "No such element";
        }
    }

    public String getShowResetFiltersLabelVisibility() {
        try {
            return showResetFiltersLabel.getCssValue("visibility");
        } catch (NoSuchElementException ex) {
            return "No such element";
        }
    }

    public boolean isUseSearchByZipSelectDisplayed() {
        try {
            useSearchByZipSelect.isDisplayed();
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public boolean isUseSearchByZipLabelDisplayed() {
        try {
            useSearchByZipLabel.isDisplayed();
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    /*is element enabled*/

    public boolean isUseAltLayoutSelectEnabled(){return useAlternativeLayoutSelect.isEnabled();}

    public boolean isSliderThemeSelectEnabled(){return sliderThemeSelect.isEnabled();}

    public boolean isShowResetFiltersSelectEnabled(){return showResetFiltersSelect.isEnabled();}

    public boolean isUseSearchByZipSelectEnabled(){return useSearchByZipSelect.isEnabled();}


    /*get font/border/background color of elements*/

    public String getUseSearchByZipLabelFontColor(){return useSearchByZipLabel.getCssValue("color");}

    public String getUseSearchByZipSelectColor(){return useSearchByZipSelect.getCssValue("border-color");}
}
