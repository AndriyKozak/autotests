package dmsDws.tools.map2.generalSettings;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utility.ConfigurationManager;
import utility.Page;

/**
 * Created by Julia on 19.04.2017.
 */
public class Map2General extends Page {


    /*declare elements on the page*/
    @FindBy(how = How.CSS, using = "div[data-page='contact_us']")
    private WebElement contactUsTab;

    @FindBy(how = How.CSS, using = "div[data-page='trade_in']")
    private WebElement tradeInTab;

    @FindBy(how = How.CSS, using = "div[data-page='vehicle']")
    private WebElement vehicleDetailsTab;

    @FindBy(how = How.CSS, using = "div[data-page='custom']")
    private WebElement customTab;

    @FindBy(how = How.CSS, using = "div[data-page='index']")
    private WebElement homePageTab;

    @FindBy(how = How.CSS, using = "div[data-page='inventory']")
    private WebElement inventoryPageTab;

    @FindBy(how = How.CSS, using = "div.map-link.pull-right")
    private WebElement addPageBtn;

    @FindBy(how = How.XPATH, using = "(//span[@class='ui-button ui-state-default'])[last()]")
    private WebElement deleteLastPageBtn;

    @FindBy(how = How.XPATH, using = "(//span[@class='mapx-button-ico edit'])[last()]/..")
    private WebElement editLastPageBtn;

    public Map2General(ConfigurationManager manager, WebDriver driver) {
        super(manager, driver);
    }

    /*click on a particular tab in pages tree*/
    public void clickContactTab() {
        contactUsTab.click();
    }
    public void clickTradeInTab() { tradeInTab.click(); }
    public void clickVDTab() {
        vehicleDetailsTab.click();
    }

    public void clickCustomTab() {
        customTab.click();
    }

    public void clickHomePageTab() {
        homePageTab.click();
    }

    public void clickInventoryPageTab() {
        inventoryPageTab.click();
    }

    /*click on Add Page button, that opens Contact Us editor*/
    public void clickAddPage() {
        addPageBtn.click();
    }

    /*click on Delete Page icon*/
    public void deletePage() {
        deleteLastPageBtn.click();
        driver.switchTo().alert().accept(); //click OK in alert

    }

    /*click on Edit last page icon*/
    public void editLastPage() {
        editLastPageBtn.click();
    }

    /*check if a particular tab exists in pages tree*/
    public boolean isContactTabExists() {
        try {
            contactUsTab.isDisplayed();
            return true;// return true, if element exists
        } catch (NoSuchElementException ex) {
            return false;//return false, if element doesn't exist
        }
    }

    public boolean isTradeInTabExists() {
        try {
            tradeInTab.isDisplayed();
            return true;// return true, if element exists
        } catch (NoSuchElementException ex) {
            return false;//return false, if element doesn't exist
        }
    }
}
