package dmsDws.settings.sites;

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
public class Sites extends Page {

    /*declare elements on the page*/
    @FindBy(how = How.CSS, using = "div#sites_tree ul:first-child li.open.last > a")
    private WebElement rootSite;

    @FindBy(how = How.XPATH, using = "//div[@aria-labelledby='ui-dialog-title-site_editor']")
    private WebElement siteEditorWindow;

    public Sites(ConfigurationManager manager, WebDriver driver) {
        super(manager, driver);
    }


    /*open Site Editor popup on the root site*/
    public void openSiteEditor() {
        Actions action = new Actions(driver);
        Action dblclick = action.doubleClick(rootSite).build();
        dblclick.perform();
    }

}
