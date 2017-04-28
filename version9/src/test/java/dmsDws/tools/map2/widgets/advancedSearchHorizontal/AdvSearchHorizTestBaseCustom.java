package dmsDws.tools.map2.widgets.advancedSearchHorizontal;

import org.testng.annotations.BeforeClass;
import utility.PropertyLoader;
import utility.PropertySource;

/**
 * Created by Julia on 24.04.2017.
 */
public class AdvSearchHorizTestBaseCustom extends AdvSearchHorizTestBase {

    @BeforeClass
    public void addMap2page(){
        //add custom page and Advanced Search Horizontal widget in MAP2
        manager.getDmsMenu(driver).clickOnMap2Menu();
        waitForJSandJQueryToLoad();
        wait.until(isLoadingInvisible());
        manager.getMap2General(driver).clickCustomTab();
        waitForJSandJQueryToLoad();
        wait.until(isLoadingInvisible());
        wait.until(isAddPageVisible());
        manager.getMap2General(driver).clickAddPage();
        waitForJSandJQueryToLoad();
        wait.until(isLoadingInvisible());
        manager.getMap2PageEditor(driver).setPageName(PropertyLoader.loadProperty(PropertySource.URL,"custom.url"));
        manager.getMap2PageEditor(driver).setPageTitle(PropertyLoader.loadProperty(PropertySource.URL,"custom.url"));
        manager.getMap2PageEditor(driver).setPageUrl(PropertyLoader.loadProperty(PropertySource.URL,"custom.url"));
        waitForJSandJQueryToLoad();
        manager.getMap2PageEditor(driver).addAdvancedSearchWidget();
        waitForJSandJQueryToLoad();
        manager.getMap2PageEditor(driver).activatePage();
        waitForJSandJQueryToLoad();
        wait.until(isLoadingInvisible());
//        wait.until(isPageActivatedTooltipVisible());
    }
}
