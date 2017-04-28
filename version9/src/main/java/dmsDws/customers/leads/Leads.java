package dmsDws.customers.leads;

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
public class Leads extends Page {

/*declare elements on the page*/

    @FindBy(how = How.XPATH, using = "(//table[@id='leads-list']//tr[@class='ui-widget-content jqgrow ui-row-ltr'])[1]")
    private WebElement firstLead;

    @FindBy(how = How.XPATH, using = "(//table[@id='leads-list']//tr[@class='ui-widget-content jqgrow ui-row-ltr'])[1]/td[2]/a")
    private WebElement firstLeadTitle;

    @FindBy(how = How.XPATH, using = "(//table[@id='leads-list']//tr[@class='ui-widget-content jqgrow ui-row-ltr'])[1]//input")
    private WebElement firstLeadCheckbox;

    @FindBy(how = How.XPATH, using = "//span[@class='ui-icon ui-icon-trash']")
    private WebElement deleteIcon;

    @FindBy(how = How.ID, using = "dData")
    private WebElement deleteButton;

    public Leads(ConfigurationManager manager, WebDriver driver) {
        super(manager, driver);
    }

    /*actions on leads*/

    public void openFirstLead() {
        firstLeadTitle.click();
    }

    public void removeFirstLead() {
        firstLeadCheckbox.click();
        deleteIcon.click();
        deleteButton.click();
    }
}
