package dmsDws.tools.map2.widgets.advancedSearchHorizontal;

import org.testng.annotations.BeforeClass;

/**
 * Created by Julia on 24.04.2017.
 */
public class AdvSearchHorizTestBaseHome extends AdvSearchHorizTestBase {

    @BeforeClass
    public void addMap2page(){
        //add home page and Advanced Search Horizontal widget in MAP2
        manager.getDmsMenu(driver).clickOnMap2Menu();
        waitForJSandJQueryToLoad();
        wait.until(isLoadingInvisible());
        manager.getMap2General(driver).clickHomePageTab();
        waitForJSandJQueryToLoad();
        wait.until(isLoadingInvisible());
        wait.until(isAddPageVisible());
        manager.getMap2General(driver).clickAddPage();
        waitForJSandJQueryToLoad();
        wait.until(isLoadingInvisible());
        manager.getMap2PageEditor(driver).addAdvancedSearchWidget();
        waitForJSandJQueryToLoad();
        manager.getMap2PageEditor(driver).activatePage();
        waitForJSandJQueryToLoad();
        wait.until(isLoadingInvisible());
        wait.until(isPageActivatedTooltipVisible());
    }
}
