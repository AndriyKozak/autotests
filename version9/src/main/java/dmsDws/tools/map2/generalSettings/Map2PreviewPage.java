package dmsDws.tools.map2.generalSettings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utility.ConfigurationManager;
import utility.Page;

/**
 * Created by Julia on 19.04.2017.
 */
public class Map2PreviewPage extends Page {


    /*declare elements on the page*/
    @FindBy(how = How.XPATH, using = "//a[@href='#preview-open']")
    private WebElement visitWebsiteBtn;

    public Map2PreviewPage(ConfigurationManager manager, WebDriver driver) {
        super(manager, driver);
    }

    /*click on Visit Website button, that opens Contact Us dws page*/
    public void clickOnVisitWebsite() {
        visitWebsiteBtn.click();
    }
}
