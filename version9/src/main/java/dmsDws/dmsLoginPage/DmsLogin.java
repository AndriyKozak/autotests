package dmsDws.dmsLoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utility.ConfigurationManager;
import utility.Page;

/**
 * Created by Julia on 17.04.2017.
 */
public class DmsLogin extends Page {

/*declare elements on the page*/

    @FindBy(how = How.ID, using = "login")
    private WebElement loginInput;

    @FindBy(how = How.ID, using = "password")
    private WebElement pwInput;

    @FindBy(how = How.ID, using = "login2")
    private WebElement signInButton;

    public DmsLogin(ConfigurationManager manager, WebDriver driver) {
        super(manager, driver);
    }

    /*method of logging to dms, login and pw are in method variables*/
    public void loginToDms(String login, String pw) {
        loginInput.clear();
        loginInput.sendKeys(login); //login is taken from environment.properties file
        pwInput.clear();
        pwInput.sendKeys(pw); //password is taken from environment.properties file
        signInButton.click();
    }


}
