package dmsDws.settings.sites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utility.ConfigurationManager;
import utility.Page;

/**
 * Created by Julia on 18.04.2017.
 */
public class SiteEditor extends Page {

    /*declare elements on the page*/

    @FindBy(how = How.CSS, using = "span#site_pages_open a")
    private WebElement pagesBtn;

    @FindBy(how = How.CSS, using = "span#site_widgets_open a")
    private WebElement widgetsBtn;

    @FindBy(how = How.ID, using = "page_contact_us")
    private WebElement contactPageCheckbox;

    @FindBy(how = How.ID, using = "dws_contact_us")
    private WebElement contactWidgetCheckbox;

    @FindBy(how = How.ID, using = "page_trade_in")
    private WebElement tradeInPageCheckbox;

    @FindBy(how = How.ID, using = "dws_form_trade_in")
    private WebElement tradeInWidgetCheckbox;

    @FindBy(how = How.ID, using = "dws_search_advanced_horizontal")
    private WebElement advSearchHorizWidgetCheckbox;

    @FindBy(how = How.XPATH, using = "(//div[@class='ui-dialog-titlebar ui-widget-header ui-corner-all ui-helper-clearfix']/a)[1]")
    private WebElement crossPage;

    @FindBy(how = How.XPATH, using = "(//div[@class='ui-dialog-titlebar ui-widget-header ui-corner-all ui-helper-clearfix']/a)[2]")
    private WebElement crossWidget;

    @FindBy(how = How.XPATH, using = "//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only']/span[contains(text(), 'Ok')]")
    private WebElement okBtn;

    public SiteEditor(ConfigurationManager manager, WebDriver driver) {
        super(manager, driver);
    }

    /*turn off Contact Us page in access*/
    public void turnOffPageSite() {
        pagesBtn.click();
        /*click on Contact Us checkbox only if it is checked*/
        if (contactPageCheckbox.isSelected()) {
            contactPageCheckbox.click();
        }
        crossPage.click();
        okBtn.click();
    }

    /*turn off Contact Us widget in access*/
    public void turnOffWidgetSite() {
        widgetsBtn.click();
        /*click on Contact Us checkbox only if it is checked*/
        if (contactWidgetCheckbox.isSelected()) {
            contactWidgetCheckbox.click();
        }
        crossWidget.click();
        okBtn.click();
    }

    /*turn on Contact Us page in access*/
    public void turnOnPageSite() {
        pagesBtn.click();
        /*click on Contact Us checkbox only if it is unchecked*/
        if (contactPageCheckbox.getAttribute("checked") == null) {
            contactPageCheckbox.click();
        }
        crossPage.click();
        okBtn.click();
    }

    /*turn on Contact Us widget in access*/
    public void turnOnWidgetSite() {
        widgetsBtn.click();
        /*click on Contact Us checkbox only if it is unchecked*/
        if (contactWidgetCheckbox.getAttribute("checked") == null) {
            contactWidgetCheckbox.click();
        }
        crossWidget.click();
        okBtn.click();
    }

    /*turn off Trade In page in access*/
    public void turnOffTradeInPageSite() {
        pagesBtn.click();
        /*click on Contact Us checkbox only if it is checked*/
        if (tradeInPageCheckbox.isSelected()) {
            tradeInPageCheckbox.click();
        }
        crossPage.click();
        okBtn.click();
    }

    /*turn off TradeIn widget in access*/
    public void turnOffTradeInWidgetSite() {
        widgetsBtn.click();
        /*click on Contact Us checkbox only if it is checked*/
        if (tradeInWidgetCheckbox.isSelected()) {
            tradeInWidgetCheckbox.click();
        }
        crossWidget.click();
        okBtn.click();
    }

    /*turn on TradeIn page in access*/
    public void turnOnTradeInPageSite() {
        pagesBtn.click();
        /*click on Contact Us checkbox only if it is unchecked*/
        if (tradeInPageCheckbox.getAttribute("checked") == null) {
            tradeInPageCheckbox.click();
        }
        crossPage.click();
        okBtn.click();
    }

    /*turn on TradeIn widget in access*/
    public void turnOnTradeInWidgetSite() {
        widgetsBtn.click();
        /*click on Contact Us checkbox only if it is unchecked*/
        if (tradeInWidgetCheckbox.getAttribute("checked") == null) {
            tradeInWidgetCheckbox.click();
        }
        crossWidget.click();
        okBtn.click();
    }

    /*turn off Advanced Search Horizontal widget in access*/
    public void turnOffAdvSearchHorizWidgetSite() {
        widgetsBtn.click();
        /*click on Contact Us checkbox only if it is checked*/
        if (advSearchHorizWidgetCheckbox.isSelected()) {
            advSearchHorizWidgetCheckbox.click();
        }
        crossWidget.click();
        okBtn.click();
    }

    /*turn on TradeIn widget in access*/
    public void turnOnAdvSearchHorizWidgetSite() {
        widgetsBtn.click();
        /*click on Contact Us checkbox only if it is unchecked*/
        if (advSearchHorizWidgetCheckbox.getAttribute("checked") == null) {
            advSearchHorizWidgetCheckbox.click();
        }
        crossWidget.click();
        okBtn.click();
    }
}
