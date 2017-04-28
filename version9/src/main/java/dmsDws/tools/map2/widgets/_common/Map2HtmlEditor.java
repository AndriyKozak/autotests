package dmsDws.tools.map2.widgets._common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utility.ConfigurationManager;
import utility.Page;
import utility.PropertyLoader;
import utility.PropertySource;

/**
 * Created by Julia on 19.04.2017.
 */
public class Map2HtmlEditor extends Page {


    @FindBy(how= How.XPATH, using ="//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
    private WebElement textarea;

    @FindBy(how= How.ID, using ="cke_105")
    private WebElement sourceButton;

    @FindBy(how= How.XPATH, using ="(//span[contains(text(), 'Ok')])[2]")
    private WebElement okEditorButton;

    @FindBy(how= How.XPATH, using ="//iframe[@class='cke_wysiwyg_frame cke_reset']")
    private WebElement iFrame;

    public Map2HtmlEditor(ConfigurationManager manager, WebDriver driver) {
        super(manager, driver);
    }

    public void addText(){
        driver.switchTo().frame(iFrame);
        textarea.sendKeys(PropertyLoader.loadProperty(PropertySource.ENVIRONMENT,"text50"));
        driver.switchTo().defaultContent();
    }

    public void clickEditorOk(){
        okEditorButton.click();
    }
}
