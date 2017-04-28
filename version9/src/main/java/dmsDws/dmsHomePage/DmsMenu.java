package dmsDws.dmsHomePage;

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
 * Created by Julia on 18.04.2017.
 */
public class DmsMenu extends Page {

    public DmsMenu(ConfigurationManager manager, WebDriver driver) {
        super(manager, driver);
    }

    @FindBy(how = How.XPATH, using = "(//a[contains(text(), 'Admin')])[1]")
    private WebElement adminMenuItem;

    @FindBy(how = How.CSS, using = "a[href='/dms/admin/dealers']")
    private WebElement dealersMenuItem;

    @FindBy(how = How.CSS, using = "a[href='/dms/tools']")
    private WebElement toolsMenuItem;

    @FindBy(how = How.CSS, using = "a[href='/dms/tools/make_a_page_2']")
    private WebElement map2MenuItem;

    @FindBy(how = How.CSS, using = "a[href='/dms/settings']")
    private WebElement settingsMenuItem;

    @FindBy(how = How.CSS, using = "a[href='/dms/settings/website']")
    private WebElement websiteMenuItem;

    @FindBy(how = How.CSS, using = "a[href='/dms/settings/sites']")
    private WebElement sitesMenuItem;

    @FindBy(how = How.CSS, using = "a[href='/dms/settings/users']")
    private WebElement usersMenuItem;

    @FindBy(how = How.CSS, using = "a[href='/dms/customers']")
    private WebElement customersMenuItem;

    @FindBy(how = How.CSS, using = "a[href='/dms/customers/leads']")
    private WebElement leadsMenuItem;

    @FindBy(how = How.CSS, using = "a[href='/dms/email']")
    private WebElement webmailMenuItem;

    @FindBy(how = How.CSS, using = "a[href='/dms/inventory']")
    private WebElement inventoryMenuItem;

    @FindBy(how = How.CSS, using = "a[href='/dms/inventory/wizard']")
    private WebElement uploadWizardMenuItem;


    /*go to dms Dealers page*/
    public void clickOnDealersMenu() {
        /*move mouse on Admin menu item*/
        Actions action = new Actions(driver);
        Action moveToElem = action.moveToElement(adminMenuItem).build();
        moveToElem.perform();
        dealersMenuItem.click();
    }

    /*go to dms MAP2 page*/
    public void clickOnMap2Menu() {
        Actions action = new Actions(driver);
        Action moveToElem = action.moveToElement(toolsMenuItem).build();
        moveToElem.perform();
        map2MenuItem.click();
    }

    /*go to dms Website General page*/
    public void clickOnWebsiteMenu() {
        Actions action = new Actions(driver);
        Action moveToElem = action.moveToElement(settingsMenuItem).build();
        moveToElem.perform();
        websiteMenuItem.click();
    }

    public void clickOnWebsiteMenu2() {
        driver.get("http://www.svtautotest.ixloo.com/dms/settings/website#general");
    }

    /*go to dms Sites page*/
    public void clickOnSitesMenu() {
        Actions action = new Actions(driver);
        Action moveToElem = action.moveToElement(settingsMenuItem).build();
        moveToElem.perform();
        sitesMenuItem.click();
    }

    /*go to dms Users page*/
    public void clickOnUsersMenu() {
        Actions action = new Actions(driver);
        Action moveToElem = action.moveToElement(settingsMenuItem).build();
        moveToElem.perform();
        usersMenuItem.click();
//        driver.get("http://www.svtautotest.ixloo.com/dms/settings/users");
    }

    /*go to dms Customers Leads page*/
    public void clickOnLeadsMenu() {
        Actions action = new Actions(driver);
        Action moveToElem = action.moveToElement(customersMenuItem).build();
        moveToElem.perform();
        leadsMenuItem.click();
    }

    /*go to Webmail login page*/
    public void clickOnWebmailMenu() {
        webmailMenuItem.click();
    }

    /*go to Webmail page*/
    public void clickOnWebmailMenu2() {
        webmailMenuItem.click();
    }

    /*go to Inventory page*/
    public void clickOnInventoryMenu() {
        inventoryMenuItem.click();
    }

    /*go to dms Customers Leads page*/
    public void clickOnUploadWizardMenu() {
        Actions action = new Actions(driver);
        Action moveToElem = action.moveToElement(inventoryMenuItem).build();
        moveToElem.perform();
        uploadWizardMenuItem.click();
    }
}
