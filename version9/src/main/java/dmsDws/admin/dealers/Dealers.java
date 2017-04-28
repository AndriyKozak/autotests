package dmsDws.admin.dealers;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
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
public class Dealers extends Page {

    /*declare elements on the page*/

    @FindBy(how = How.ID, using = "dealer_20")
    private WebElement domainInTree;

    @FindBy(how= How.ID, using ="site_package_editor_open")
    private WebElement sitePackEditBtn;

    @FindBy(how= How.ID, using ="dealer_save")
    private WebElement saveBtn;

    @FindBy(how = How.CSS, using = "a[href='/dms/tools']")
    private WebElement toolsMenuItem;

    @FindBy(how = How.CSS, using = "a[href='/dms/tools/make_a_page_2']")
    private WebElement map2MenuItem;

    @FindBy(how = How.CSS, using = "a[href='/dms/settings']")
    private WebElement settingsMenuItem;

    @FindBy(how = How.CSS, using = "a[href='/dms/settings/website']")
    private WebElement websiteMenuItem;

    @FindBy(how = How.ID, using = "idBackCont")
    private WebElement screenLoading;

    public Dealers(ConfigurationManager manager, WebDriver driver) {
        super(manager, driver);
    }

    /*Open Site Package editor for tacker.ixloo.com*/
    public void openSiteEditor() throws InterruptedException { //TODO: rename on openSiteEditor
        Actions action = new Actions(driver);
        Action dblclick = action.doubleClick(domainInTree).build();
        dblclick.perform();
        waitForJSandJQueryToLoad();
        Thread.sleep(1000);
        sitePackEditBtn.click();
        waitForJSandJQueryToLoad();
    }

    /*click on Site Package Edit button*/
    public void clickSitePackBtn() throws InterruptedException {
        sitePackEditBtn.click();
        waitForJSandJQueryToLoad();
    }

    /*click on Save button*/
    public void clickSave(){
        saveBtn.click();
    }

    public ExpectedCondition<Boolean> isEditorInvisible() {
        return ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@aria-labelledby='ui-dialog-title-site_package_editor']"));
    }

    public boolean isLoadingExists(){
        try{
            screenLoading.isDisplayed();
            return false;
        }
        catch (NoSuchElementException ex){
            return true;
        }
    }
}
