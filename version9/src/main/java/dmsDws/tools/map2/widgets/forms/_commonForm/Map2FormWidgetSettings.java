package dmsDws.tools.map2.widgets.forms._commonForm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.ConfigurationManager;
import utility.Page;

/**
 * Created by Julia on 19.04.2017.
 */
public class Map2FormWidgetSettings extends Page {


    @FindBy(how = How.XPATH, using = "//div[@data-option='staff_email_notification']//select")
    private WebElement staffEmailSelect;

    @FindBy(how = How.XPATH, using = "//div[@data-option='submit_message']//input")
    private WebElement submitInput;

    public Map2FormWidgetSettings(ConfigurationManager manager, WebDriver driver) {
        super(manager, driver);
    }


    public void openSubmitHtmlEditor() {
        submitInput.click();
    }
}
