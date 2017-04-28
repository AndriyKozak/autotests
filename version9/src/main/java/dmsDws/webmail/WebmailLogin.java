package dmsDws.webmail;

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
public class WebmailLogin extends Page {


    @FindBy(how = How.ID, using = "rcmloginuser")
    private WebElement username;

    @FindBy(how = How.ID, using = "rcmloginpwd")
    private WebElement password;

    @FindBy(how = How.ID, using = "rcmloginhost")
    private WebElement server;

    @FindBy(how = How.XPATH, using = "//input[@class='button mainaction']")
    private WebElement loginButton;

    @FindBy(how = How.ID, using = "fr")
    private WebElement iframe;

    public WebmailLogin(ConfigurationManager manager, WebDriver driver) {
        super(manager, driver);
    }

    public void loginToWebmail(){
        driver.switchTo().frame(iframe);
        username.clear();
        username.sendKeys(PropertyLoader.loadProperty(PropertySource.CRED,"webmail.user"));
        password.clear();
        password.sendKeys(PropertyLoader.loadProperty(PropertySource.CRED,"webmail.pw"));
        server.clear();
        server.sendKeys(PropertyLoader.loadProperty(PropertySource.CRED,"webmail.server"));
        loginButton.click();
        driver.switchTo().defaultContent();
    }
}
