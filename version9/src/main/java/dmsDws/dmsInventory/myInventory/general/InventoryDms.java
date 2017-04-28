package dmsDws.dmsInventory.myInventory.general;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utility.ConfigurationManager;
import utility.Page;

import java.util.*;

/**
 * Created by Julia on 18.04.2017.
 */
public class InventoryDms extends Page {

    @FindBy(how = How.ID, using = "vehicle_type")
    private WebElement vehicleTypeSelect;

    @FindBy(how = How.ID, using = "make")
    private WebElement makeSelect;

    @FindBy(how = How.ID, using = "model")
    private WebElement modelSelect;

    @FindBy(how = How.ID, using = "trim")
    private WebElement trimSelect;

    @FindBy(how = How.CLASS_NAME, using = "ui-pg-selbox")
    private WebElement vehPerPageSelect;

    @FindBy(how = How.ID, using = "sp_1")
    private WebElement numberOfPages;

    @FindBy(how = How.CLASS_NAME, using = "ui-icon-seek-next")
    private WebElement nextArrow;

    @FindBy(how = How.ID, using = "jqgh_Body")
    private WebElement bodyColumnTitle;

    @FindBy(how = How.ID, using = "inventory-list_Body")
    private WebElement bodyColumnTitle2;

    @FindBy(how = How.ID, using = "jqgh_Year")
    private WebElement yearColumnTitle;

    @FindBy(how = How.ID, using = "inventory-list_Year")
    private WebElement yearColumnTitle2;

    @FindBy(how = How.ID, using = "jqgh_mileage")
    private WebElement odometerColumnTitle;

    @FindBy(how = How.ID, using = "inventory-list_mileage")
    private WebElement odometerColumnTitle2;

    @FindBy(how = How.ID, using = "jqgh_price_current")
    private WebElement priceColumnTitle;

    @FindBy(how = How.ID, using = "inventory-list_price_current")
    private WebElement priceColumnTitle2;

    @FindBy(how = How.XPATH, using = "//span[@id='edit_fields']//a")
    private WebElement editFieldsBtn;

    @FindBy(how = How.XPATH, using = "//li[@class='ui-state-default ui-element ui-draggable'][contains(text(), 'Body')]/a")
    private WebElement bodyItemPlus;

    @FindBy(how = How.XPATH, using = "//li[@class='ui-state-default ui-element ui-draggable'][contains(text(), 'Year')]/a")
    private WebElement yearItemPlus;

    @FindBy(how = How.XPATH, using = "//li[@class='ui-state-default ui-element ui-draggable'][contains(text(), 'Odometer')]/a")
    private WebElement odometerItemPlus;

    @FindBy(how = How.XPATH, using = "//li[@class='ui-state-default ui-element ui-draggable'][text()='Price']/a")
    private WebElement priceItemPlus;

    @FindBy(how = How.XPATH, using = "//button[contains(@class,'ui-button')]/span[contains(text(), 'Apply')]")
    private WebElement applyBtn;

    @FindBy(how = How.XPATH, using = "//td[@aria-describedby='inventory-list_Body']")
    private List<WebElement> bodyCell;

    @FindBy(how = How.XPATH, using = "//td[@aria-describedby='inventory-list_Year']")
    private List<WebElement> yearCell;

    @FindBy(how = How.XPATH, using = "//td[@aria-describedby='inventory-list_mileage']")
    private List<WebElement> odometerCell;

    @FindBy(how = How.XPATH, using = "//td[@aria-describedby='inventory-list_price_current']")
    private List<WebElement> priceCell;

    @FindBy(how = How.XPATH, using = "//input[@value='inv']")
    private WebElement invRadioBtn;

    public InventoryDms(ConfigurationManager manager, WebDriver driver) {
        super(manager, driver);
    }



    /*methods for getting all options from select*/

    public List<WebElement> getVehicleTypeSelectOptions() {
        WebElement select = vehicleTypeSelect;
        Select options = new Select(select);
        List<WebElement> allOptionsVehicleType = options.getOptions();
        return allOptionsVehicleType;
    }

    public List<WebElement> getMakeSelectOptions() {
        WebElement select = makeSelect;
        Select options = new Select(select);
        List<WebElement> allOptionsMake = options.getOptions();
        return allOptionsMake;
    }

    public List<String> getMakeSelectOptionsText() {
        WebElement select = makeSelect;
        Select options = new Select(select);
        List<WebElement> allOptionsMake = options.getOptions();
        List<String> option = new ArrayList<>();
        for (int i = 0; i < allOptionsMake.size(); i++) {
            option.add(allOptionsMake.get(i).getText());
        }
        return option;
    }

    public List<String> getMakeSelectOptionsValue() {
        WebElement select = makeSelect;
        Select options = new Select(select);
        List<WebElement> allOptionsMake = options.getOptions();
        List<String> option = new ArrayList<>();
        for (int i = 0; i < allOptionsMake.size(); i++) {
            option.add(allOptionsMake.get(i).getAttribute("value"));
        }
        return option;
    }

    public List<String> getModelSelectOptionsText() {
        WebElement select = makeSelect;
        Select options = new Select(select);
        WebElement selectModel = modelSelect;
        Select optionsModel = new Select(modelSelect);
        List<WebElement> allOptionsMake = options.getOptions();

        List<String> option = new ArrayList<>();
        for (int i = 1; i < allOptionsMake.size(); i++) {
            allOptionsMake.get(i).click();
            waitForJSandJQueryToLoad();
            List<WebElement> allOptionsModel = optionsModel.getOptions();
            for (int j = 1; j < allOptionsModel.size(); j++) {
                option.add(allOptionsModel.get(j).getText());
            }
        }

        return option;
    }

    public List<String> getModelSelectOptionsValue() {
        WebElement select = makeSelect;
        Select options = new Select(select);
        WebElement selectModel = modelSelect;
        Select optionsModel = new Select(modelSelect);
        List<WebElement> allOptionsMake = options.getOptions();

        List<String> option = new ArrayList<>();
        for (int i = 1; i < allOptionsMake.size(); i++) {
            allOptionsMake.get(i).click();
            waitForJSandJQueryToLoad();
            List<WebElement> allOptionsModel = optionsModel.getOptions();
            for (int j = 1; j < allOptionsModel.size(); j++) {
                option.add(allOptionsModel.get(j).getText());
            }
        }

        return option;
    }


    /*Methods for getting selected option of select*/

    public String getVehicleTypeSelectedValue() {
        WebElement select = vehicleTypeSelect;
        Select options = new Select(select);
        WebElement selectedOptionVehicleType = options.getFirstSelectedOption();
        return selectedOptionVehicleType.getText();
    }

    public String getModelSelectedValue(int indexMake, int indexModel) {
        WebElement select = makeSelect;
        Select options = new Select(select);
        WebElement selectModel = modelSelect;
        Select optionsModel = new Select(modelSelect);
        options.selectByIndex(indexMake);
        waitForJSandJQueryToLoad();
        optionsModel.selectByIndex(indexModel);
        waitForJSandJQueryToLoad();
        WebElement selectedOptionModel = optionsModel.getFirstSelectedOption();
        return selectedOptionModel.getAttribute("value");
    }

   /*Select values in selects*/

    public void selectVehicleType(String vehicleType) {
        WebElement select = vehicleTypeSelect;
        Select options = new Select(select);
        options.selectByVisibleText(vehicleType);
    }

    public void selectMake(int index) {
        WebElement select = makeSelect;
        Select options = new Select(select);
        options.selectByIndex(index);
    }

    public void selectVehiclesPerPage(String value) {
        WebElement select = vehPerPageSelect;
        Select options = new Select(select);
        options.selectByValue(value);
    }

    /*work with pages number*/

    public void getAllPagesNumber() {
        numberOfPages.getText();
    }

    public void clickOnNextPage() {
        nextArrow.click();
    }

    /*add column*/

    public void addBodyColumn() {
        if (bodyColumnTitle2.getCssValue("display").equals("none")) {
            editFieldsBtn.click();
            waitForJSandJQueryToLoad();
            bodyItemPlus.click();
            applyBtn.click();
        }
    }

    public void addYearColumn() {
        if (yearColumnTitle2.getCssValue("display").equals("none")) {
            editFieldsBtn.click();
            waitForJSandJQueryToLoad();
            yearItemPlus.click();
            applyBtn.click();
        }
    }

    public void addOdometerColumn() {
        if (odometerColumnTitle2.getCssValue("display").equals("none")) {
            editFieldsBtn.click();
            waitForJSandJQueryToLoad();
            odometerItemPlus.click();
            applyBtn.click();
        }
    }

    public void addPriceColumn() {
        if (priceColumnTitle2.getCssValue("display").equals("none")) {
            editFieldsBtn.click();
            waitForJSandJQueryToLoad();
            priceItemPlus.click();
            applyBtn.click();
        }
    }

    /*get values from columns*/

    public List<String> getAllBodies() {
        List<String> bodies = new ArrayList<>();
        for (int i = 0; i < bodyCell.size(); i++) {
            bodies.add(bodyCell.get(i).getText());
        }
        return bodies;
    }

    public List<String> getAllBodiesOnAllPages() {
        List<String> bodies = new ArrayList<>();
        int pagesNumber = Integer.parseInt(numberOfPages.getText());
        for (int i = 0; i < pagesNumber; i++) {
            for (int j = 0; j < bodyCell.size(); j++) {
                bodies.add(bodyCell.get(j).getText());

            }
            nextArrow.click();
            waitForJSandJQueryToLoad();
        }
        return bodies;
    }

    public List<String> getBodies() {
        List<String> bodies = new ArrayList<>();
        int pagesNumber = Integer.parseInt(numberOfPages.getText());
        //  LOG.info("number of pages is " + pagesNumber);
        for (int i = 0; i < pagesNumber; i++) {
            //  LOG.info("bodyCell size is " + bodyCell.size());
            for (int j = 0; j < bodyCell.size(); j++) {
                bodies.add(bodyCell.get(j).getText());
                //LOG.info("added body is " + bodyCell.get(j).getText());
            }
            nextArrow.click();
            waitForJSandJQueryToLoad();
        }
        Set<String> singleBodies = new LinkedHashSet<>();
        singleBodies.addAll(bodies);
        bodies.clear();
        bodies.addAll(singleBodies);
        Collections.sort(bodies);
        return bodies;
    }

    public List<String> getEachBodyNumber() {
        List<String> bodies = new ArrayList<>();
        int pagesNumber = Integer.parseInt(numberOfPages.getText());
        List<String> bodyNumber = new ArrayList<>();
        for (int i = 0; i < pagesNumber; i++) {
            for (int j = 0; j < bodyCell.size(); j++) {
                bodies.add(bodyCell.get(j).getText());
            }
            nextArrow.click();
            waitForJSandJQueryToLoad();
        }
        for (int k = 0; k < bodies.size(); k++) {
            String number = String.valueOf(Collections.frequency(bodies, bodies.get(k)));
            bodyNumber.add(bodies.get(k) + " (" + number + ")");
        }
        Set<String> singleBodyNumber = new LinkedHashSet<>();
        singleBodyNumber.addAll(bodyNumber);
        bodyNumber.clear();
        bodyNumber.addAll(singleBodyNumber);
        Collections.sort(bodyNumber);
        return bodyNumber;
        //TODO: add cut for commercial truck (ex. heavy duty truck - ambulance = heavy duty truck)
    }

    public void clickInventoryRadioBtn() {
        invRadioBtn.click();
    }

    public String getMinYear() {
        yearColumnTitle.click();
        waitForJSandJQueryToLoad();
        String firstYear1 = yearCell.get(0).getText();
        yearColumnTitle.click();
        waitForJSandJQueryToLoad();
        String firstYear2 = yearCell.get(0).getText();
        if (Integer.parseInt(firstYear1) < Integer.parseInt(firstYear2)) {
            return firstYear1;
        } else return firstYear2;
    }

    public String getMaxYear() {
        yearColumnTitle.click();
        waitForJSandJQueryToLoad();
        String firstYear1 = yearCell.get(0).getText();
        yearColumnTitle.click();
        waitForJSandJQueryToLoad();
        String firstYear2 = yearCell.get(0).getText();
        if (Integer.parseInt(firstYear1) > Integer.parseInt(firstYear2)) {
            return firstYear1;
        } else return firstYear2;
    }

    public String getMinOdometer() {
        odometerColumnTitle.click();
        waitForJSandJQueryToLoad();
        String firstOdometer1 = odometerCell.get(0).getText();
        odometerColumnTitle.click();
        waitForJSandJQueryToLoad();
        String firstOdometer2 = odometerCell.get(0).getText();
        if (Integer.parseInt(firstOdometer1) < Integer.parseInt(firstOdometer2)) {
            return firstOdometer1;
        } else return firstOdometer2;
    }

    public String getMinOdometerWithoutSpace() {
        odometerColumnTitle.click();
        waitForJSandJQueryToLoad();
        String stringValue1 = odometerCell.get(0).getText();
        String[] nums1 = stringValue1.split(" ");
        String firstOdometer1 = "";
        for (int i = 0; i < nums1.length; i++) {
            firstOdometer1 += nums1[i];
        }
        odometerColumnTitle.click();
        waitForJSandJQueryToLoad();
        String stringValue2 = odometerCell.get(0).getText();
        String[] nums2 = stringValue2.split(" ");
        String firstOdometer2 = "";
        for (int i = 0; i < nums2.length; i++) {
            firstOdometer2 += nums2[i];
        }
        Integer odo1 = Integer.parseInt(firstOdometer1);
        Integer odo2 = Integer.parseInt(firstOdometer2);
        if (odo1 % 10 != 0) {
            firstOdometer1 = firstOdometer1.substring(0, (firstOdometer1.length() - 1)) + "0";
        }
        if (odo2 % 10 != 0) {
            firstOdometer2 = firstOdometer2.substring(0, (firstOdometer2.length() - 1)) + "0";
        }
       // LOG.info("firstOdometer1 is " + firstOdometer1);
       // LOG.info("firstOdometer2 is " + firstOdometer2);
        if (Integer.parseInt(firstOdometer1) < Integer.parseInt(firstOdometer2)) {
            return firstOdometer1;
        } else return firstOdometer2;
    }

    public String getMaxOdometer() {
        odometerColumnTitle.click();
        waitForJSandJQueryToLoad();
        String firstOdometer1 = odometerCell.get(0).getText();
        odometerColumnTitle.click();
        waitForJSandJQueryToLoad();
        String firstOdometer2 = odometerCell.get(0).getText();
        if (Integer.parseInt(firstOdometer1) > Integer.parseInt(firstOdometer2)) {
            return firstOdometer1;
        } else return firstOdometer2;
    }

    public String getMaxOdometerWithoutSpace() {
        odometerColumnTitle.click();
        waitForJSandJQueryToLoad();
        String stringValue1 = odometerCell.get(0).getText(); //get String value of odometer (ex. "25 101")
        String[] nums1 = stringValue1.split(" "); //get an array from string odometer, that is contained from digits, divided by space (ex. ["25", "101"])
        String firstOdometer1 = ""; // declare a string variable for getting correct number here (ex. "25101")
        for (int i = 0; i < nums1.length; i++) { // add elements of array to string (ex. "25" + "101" = "25101")
            firstOdometer1 += nums1[i];
        }
        odometerColumnTitle.click();
        waitForJSandJQueryToLoad();
        String stringValue2 = odometerCell.get(0).getText();
        String[] nums2 = stringValue2.split(" ");
        String firstOdometer2 = "";
        for (int i = 0; i < nums2.length; i++) {
            firstOdometer2 += nums2[i];
        }
        Integer odo1 = Integer.parseInt(firstOdometer1);
        Integer odo2 = Integer.parseInt(firstOdometer2);
        /*
        if (odo1 % 10 != 0) {
            firstOdometer1 = firstOdometer1.substring(0, (firstOdometer1.length() - 1)) + "0";
        }
        if (odo2 % 10 != 0) {
            firstOdometer2 = firstOdometer2.substring(0, (firstOdometer2.length() - 1)) + "0";
        }*/
       // LOG.info("odo 1 is " + odo1);
        int length1 = firstOdometer1.length();
        Double temp1 = odo1 / (Math.pow(10, (length1 - 1)));
        //LOG.info("temp 1 is " + temp1.intValue());
        Integer temp11 = temp1.intValue() + 1;
        //LOG.info("temp 11 is " + temp11);
        Double result1 = temp11 * Math.pow(10, (length1 - 1));
        //LOG.info("result1 is " + result1.intValue());

       // LOG.info("odo 2 is " + odo2);
        int length2 = firstOdometer2.length();
        Double temp2 = odo2 / (Math.pow(10, (length2 - 1)));
       // LOG.info("temp 2 is " + temp2.intValue());
        Integer temp21 = temp2.intValue() + 1;
       // LOG.info("temp 21 is " + temp21);
        Double result2 = temp21 * Math.pow(10, (length2 - 1));
       // LOG.info("result2 is " + result2.intValue());
        if (result1 > result2) {
            return Integer.toString(result1.intValue());
        } else return Integer.toString(result2.intValue());
    }

    public String getMinPriceWithoutSpace() {
        priceColumnTitle.click();
        waitForJSandJQueryToLoad();
        String stringWithCurrency1 = priceCell.get(0).getText();//get string price with currency symbol
        //LOG.info("stringWithCurrency1 is " + stringWithCurrency1);
       // LOG.info("length1 is " + stringWithCurrency1.length());
        String stringValue1 = stringWithCurrency1.substring(1, stringWithCurrency1.length());
        //LOG.info("stringValue1 is " + stringValue1);
        String[] nums1 = stringValue1.split(",");
        String firstPrice1 = "";
        for (int i = 0; i < nums1.length; i++) {
            firstPrice1 += nums1[i];
        }
       // LOG.info("firstPrice1 is " + firstPrice1);
        priceColumnTitle.click();
        waitForJSandJQueryToLoad();
        String stringWithCurrency2 = priceCell.get(0).getText();//get string price with currency symbol
      //  LOG.info("stringWithCurrency2 is " + stringWithCurrency2);
       // LOG.info("length2 is " + stringWithCurrency2.length());
        String stringValue2 = stringWithCurrency2.substring(1, stringWithCurrency2.length());
       // LOG.info("stringValue2 is " + stringValue2);
        String[] nums2 = stringValue2.split(",");
        String firstPrice2 = "";
        for (int i = 0; i < nums2.length; i++) {
            firstPrice2 += nums2[i];
        }
       // LOG.info("firstPrice2 is " + firstPrice2);
        Integer odo1 = Integer.parseInt(firstPrice1);
        Integer odo2 = Integer.parseInt(firstPrice2);
        if (odo1 % 10 != 0) {
            firstPrice1 = firstPrice1.substring(0, (firstPrice1.length() - 1)) + "0";
        }
        if (odo2 % 10 != 0) {
            firstPrice2 = firstPrice2.substring(0, (firstPrice2.length() - 1)) + "0";
        }
       // LOG.info("firstPrice1 is " + firstPrice1);
       // LOG.info("firstPrice2 is " + firstPrice2);
        if (Integer.parseInt(firstPrice1) < Integer.parseInt(firstPrice2)) {
            return firstPrice1;
        } else return firstPrice2;
    }

    public String getMaxPriceWithoutSpace() {
        priceColumnTitle.click();
        waitForJSandJQueryToLoad();
        String stringWithCurrency1 = priceCell.get(0).getText();//get string price with currency symbol
       // LOG.info("stringWithCurrency1 is " + stringWithCurrency1);
       // LOG.info("length1 is " + stringWithCurrency1.length());
        String stringValue1 = stringWithCurrency1.substring(1, stringWithCurrency1.length());
       // LOG.info("stringValue1 is " + stringValue1);
        String[] nums1 = stringValue1.split(",");
        String firstPrice1 = "";
        for (int i = 0; i < nums1.length; i++) {
            firstPrice1 += nums1[i];
        }
      //  LOG.info("firstPrice1 is " + firstPrice1);
        priceColumnTitle.click();
        waitForJSandJQueryToLoad();
        String stringWithCurrency2 = priceCell.get(0).getText();//get string price with currency symbol
       // LOG.info("stringWithCurrency2 is " + stringWithCurrency2);
       // LOG.info("length2 is " + stringWithCurrency2.length());
        String stringValue2 = stringWithCurrency2.substring(1, stringWithCurrency2.length());
       // LOG.info("stringValue2 is " + stringValue2);
        String[] nums2 = stringValue2.split(",");
        String firstPrice2 = "";
        for (int i = 0; i < nums2.length; i++) {
            firstPrice2 += nums2[i];
        }
        //LOG.info("firstPrice2 is " + firstPrice2);
        Integer odo1 = Integer.parseInt(firstPrice1);
        Integer odo2 = Integer.parseInt(firstPrice2);
        if (odo1 % 10 != 0) {
            firstPrice1 = firstPrice1.substring(0, (firstPrice1.length() - 1)) + "0";
        }
        if (odo2 % 10 != 0) {
            firstPrice2 = firstPrice2.substring(0, (firstPrice2.length() - 1)) + "0";
        }
        //LOG.info("firstPrice1 is " + firstPrice1);
        //LOG.info("firstPrice2 is " + firstPrice2);
        if (Integer.parseInt(firstPrice1) > Integer.parseInt(firstPrice2)) {
            return firstPrice1;
        } else return firstPrice2;
    }
}
