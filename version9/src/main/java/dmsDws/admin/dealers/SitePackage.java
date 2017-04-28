package dmsDws.admin.dealers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utility.ConfigurationManager;
import utility.Page;

/**
 * Created by Julia on 18.04.2017.
 */
public class SitePackage extends Page {

    /*declare elements on the page*/
    @FindBy(how = How.XPATH, using = "//div[@aria-labelledby='ui-dialog-title-site_package_editor']")
    private WebElement sitePackWindow;

    @FindBy(how = How.ID, using = "dws_contact_us")
    private WebElement contactWidgetCheckbox;

    @FindBy(how = How.ID, using = "page_contact_us")
    private WebElement contactPageCheckbox;

    @FindBy(how = How.ID, using = "dws_form_trade_in")
    private WebElement tradeInWidgetCheckbox;

    @FindBy(how = How.ID, using = "page_trade_in")
    private WebElement tradeInPageCheckbox;

    @FindBy(how = How.ID, using = "dws_search_advanced_horizontal")
    private WebElement advancesSearch2Checkbox;

    @FindBy(how = How.XPATH, using = "(//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only']/span[contains(text(),'Ok')])[2]")
    private WebElement okBtn;

    public SitePackage(ConfigurationManager manager, WebDriver driver) {
        super(manager, driver);
    }

    /*turn on Contact Us widget*/
    public void turnOnWidgetDealers() {
        if (contactWidgetCheckbox.getAttribute("checked") == null) {
            contactWidgetCheckbox.click();
        }
        okBtn.click();
    }

    /*turn on Contact Us page*/
    public void turnOnPageDealers() {
        if (contactPageCheckbox.getAttribute("checked") == null) {
            contactPageCheckbox.click();
        }
        okBtn.click();
    }

    /*turn off Contact Us widget*/
    public void turnOffWidgetDealers() {
        if (contactWidgetCheckbox.isSelected()) {
            contactWidgetCheckbox.click();
        }
        okBtn.click();
    }

    /*turn off Contact Us page*/
    public void turnOffPageDealers() {
        if (contactPageCheckbox.isSelected()) {
            contactPageCheckbox.click();
        }
        okBtn.click();
    }

    /*turn on Trade In widget*/
    public void turnOnTradeInWidgetDealers() {
        if (tradeInWidgetCheckbox.getAttribute("checked") == null) {
            tradeInWidgetCheckbox.click();
        }
        okBtn.click();
    }

    /*turn on Trade In page*/
    public void turnOnTradeInPageDealers() {
        if (tradeInPageCheckbox.getAttribute("checked") == null) {
            tradeInPageCheckbox.click();
        }
        okBtn.click();
    }

    /*turn off Trade In widget*/
    public void turnOffTradeInWidgetDealers() {
        if (tradeInWidgetCheckbox.isSelected()) {
            tradeInWidgetCheckbox.click();
        }
        okBtn.click();
    }

    /*turn off Trade In page*/
    public void turnOffTradeInPageDealers() {
        if (tradeInPageCheckbox.isSelected()) {
            tradeInPageCheckbox.click();
        }
        okBtn.click();
    }

    /*turn on Advanced Search2 widget*/
    public void turnOnAdvSearch2WidgetDealers() {
        if (advancesSearch2Checkbox.getAttribute("checked") == null) {
            advancesSearch2Checkbox.click();
        }
        okBtn.click();
    }

    /*turn off Advanced Search2 widget*/
    public void turnOffAdvSearch2WidgetDealers() {
        if (advancesSearch2Checkbox.isSelected()) {
            advancesSearch2Checkbox.click();
        }
        okBtn.click();
    }

    public ExpectedCondition<WebElement> isEditorVisible() {
        return ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@aria-labelledby='ui-dialog-title-site_package_editor']")));
    }
}
