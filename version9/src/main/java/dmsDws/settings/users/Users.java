package dmsDws.settings.users;

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
public class Users extends Page {

    /*declare elements on the page*/
    @FindBy(how = How.XPATH, using = "//li[@class='rootUserBranch jstree-open jstree-last']/a")
    private WebElement rootUser;

    @FindBy(how = How.XPATH, using = "(//li[contains(@class, 'userBranch')]/a)[last()]")
    private WebElement lastUser;

    @FindBy(how = How.ID, using = "user_tree_add")
    private WebElement addUserBtn;

    @FindBy(how = How.ID, using = "user_tree_delete")
    private WebElement deleteUserBtn;

    public Users(ConfigurationManager manager, WebDriver driver) {
        super(manager, driver);
    }


    /*open User Editor of root user*/
    public void openRootUserEditor() {
        Actions action = new Actions(driver);
        Action moveToElem = action.doubleClick(rootUser).build();
        moveToElem.perform();
    }

    /*click Add user button*/
    public void clickAddUser(){
        addUserBtn.click();
    }


    /*delete the last user in the tree*/
    public void deleteLastUser(){
        lastUser.click();
        deleteUserBtn.click();
    }

    /*open the last user in the tree*/
    public void openLastUserEditor(){
        Actions action = new Actions(driver);
        Action moveToElem = action.doubleClick(lastUser).build();
        moveToElem.perform();
    }
}
