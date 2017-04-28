package utility;

import dmsDws.admin.dealers.Dealers;
import dmsDws.admin.dealers.SitePackage;
import dmsDws.customers.leads.LeadDetails;
import dmsDws.customers.leads.Leads;
import dmsDws.dmsHomePage.DmsMenu;
import dmsDws.dmsInventory.myInventory.general.InventoryDms;
import dmsDws.dmsInventory.uploadWizard.general.UWInformation;
import dmsDws.dmsLoginPage.DmsLogin;
import dmsDws.settings.sites.SiteEditor;
import dmsDws.settings.sites.Sites;
import dmsDws.settings.users.UserEditor;
import dmsDws.settings.users.Users;
import dmsDws.settings.websiteSettings.general.GeneralWebsiteSettings;
import dmsDws.settings.websiteSettings.leadsEmail.LeadsEmailSettings;
import dmsDws.settings.websiteSettings.localization.LocalizationSettings;
import dmsDws.tools.map2.generalSettings.Map2General;
import dmsDws.tools.map2.widgets._common.Map2WidgetSettings;
import dmsDws.tools.map2.widgets._common.Map2HtmlEditor;
import dmsDws.tools.map2.generalSettings.Map2PageEditor;
import dmsDws.tools.map2.generalSettings.Map2PreviewPage;
import dmsDws.tools.map2.widgets.forms._commonForm.FormDws;
import dmsDws.tools.map2.widgets.forms._commonForm.Map2FormWidgetSettings;
import dmsDws.tools.map2.widgets.searches._commonSearch.Map2SearchWidgetSettings;
import dmsDws.tools.map2.widgets.searches._commonSearch.SearchDws;
import dmsDws.webmail.WebmailDetails;
import dmsDws.webmail.WebmailList;
import dmsDws.webmail.WebmailLogin;
import org.openqa.selenium.WebDriver;

/**
 * Created by Julia on 17.04.2017.
 */
public class ConfigurationManager {

    private static ConfigurationManager instance;
    private Page page;
    private WebDriver driver;

    private DmsLogin dmsLogin;
    private DmsMenu dmsMenu;
    private LeadDetails leadDetails;
    private Leads leads;
    private Dealers dealers;
    private SitePackage sitePackage;
    private Sites sites;
    private SiteEditor siteEditor;
    private InventoryDms inventoryDms;
    private UWInformation uwInformation;
    private FormDws formDws;
    private SearchDws searchDws;
    private Map2General map2General;
    private Map2PageEditor map2PageEditor;
    private Map2PreviewPage map2PreviewPage;
    private Map2HtmlEditor map2HtmlEditor;
    private Map2WidgetSettings map2WidgetSettings;
    private Map2FormWidgetSettings map2FormWidgetSettings;
    private Map2SearchWidgetSettings map2SearchWidgetSettings;
    private LeadsEmailSettings leadsEmailSettings;
    private LocalizationSettings localizationSettings;
    private Users users;
    private UserEditor userEditor;
    private GeneralWebsiteSettings generalWebsiteSettings;
    private WebmailLogin webmailLogin;
    private WebmailList webmailList;
    private WebmailDetails webmailDetails;


    public static ConfigurationManager getInstance(WebDriver driver) {
        if (instance == null)
            instance = new ConfigurationManager(driver);
        return instance;
    }

    public static ConfigurationManager killManagerInstance(){
        instance = null;
        return instance;
    }

    public ConfigurationManager(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public Page getPage(WebDriver driver) {
        if (page == null) {
            page = new Page(this, driver);
        }
        return page;
    }

    public DmsLogin getDmsLoginPage(WebDriver driver) {
        if (dmsLogin == null) {
            dmsLogin = new DmsLogin(this, driver);
        }
        return dmsLogin;
    }

    public DmsMenu getDmsMenu(WebDriver driver) {
        if (dmsMenu == null) {
            dmsMenu = new DmsMenu(this, driver);
        }
        return dmsMenu;
    }

    public LeadDetails getLeadDetails(WebDriver driver) {
        if (leadDetails == null) {
            leadDetails = new LeadDetails(this, driver);
        }
        return leadDetails;
    }

    public Leads getLeads(WebDriver driver) {
        if (leads == null) {
            leads = new Leads(this, driver);
        }
        return leads;
    }

    public Dealers getDealers(WebDriver driver) {
        if (dealers == null) {
            dealers = new Dealers(this, driver);
        }
        return dealers;
    }

    public SitePackage getSitePackage(WebDriver driver) {
        if (sitePackage == null) {
            sitePackage = new SitePackage(this, driver);
        }
        return sitePackage;
    }

    public SiteEditor getSiteEditor(WebDriver driver) {
        if (siteEditor == null) {
            siteEditor = new SiteEditor(this, driver);
        }
        return siteEditor;
    }

    public InventoryDms getInventoryDms(WebDriver driver) {
        if (inventoryDms == null) {
            inventoryDms = new InventoryDms(this, driver);
        }
        return inventoryDms;
    }

    public UWInformation getUwInformation(WebDriver driver) {
        if (uwInformation == null) {
            uwInformation = new UWInformation(this, driver);
        }
        return uwInformation;
    }

    public FormDws getFormDws(WebDriver driver) {
        if (formDws == null) {
            formDws = new FormDws(this, driver);
        }
        return formDws;
    }

    public SearchDws getSearchDws(WebDriver driver) {
        if (searchDws == null) {
            searchDws = new SearchDws(this, driver);
        }
        return searchDws;
    }

    public Map2General getMap2General(WebDriver driver) {
        if (map2General == null) {
            map2General = new Map2General(this, driver);
        }
        return map2General;
    }

    public Map2PageEditor getMap2PageEditor(WebDriver driver) {
        if (map2PageEditor == null) {
            map2PageEditor = new Map2PageEditor(this, driver);
        }
        return map2PageEditor;
    }

    public Map2PreviewPage getMap2PreviewPage(WebDriver driver) {
        if (map2PreviewPage == null) {
            map2PreviewPage = new Map2PreviewPage(this, driver);
        }
        return map2PreviewPage;
    }

    public Map2HtmlEditor getMap2HtmlEditor(WebDriver driver) {
        if (map2HtmlEditor == null) {
            map2HtmlEditor = new Map2HtmlEditor(this, driver);
        }
        return map2HtmlEditor;
    }

    public Map2WidgetSettings getMap2WidgetSettings(WebDriver driver) {
        if (map2WidgetSettings == null) {
            map2WidgetSettings = new Map2WidgetSettings(this, driver);
        }
        return map2WidgetSettings;
    }

    public Map2FormWidgetSettings getMap2FormWidgetSettings(WebDriver driver) {
        if (map2FormWidgetSettings == null) {
            map2FormWidgetSettings = new Map2FormWidgetSettings(this, driver);
        }
        return map2FormWidgetSettings;
    }

    public Map2SearchWidgetSettings getMap2SearchWidgetSettings(WebDriver driver) {
        if (map2SearchWidgetSettings == null) {
            map2SearchWidgetSettings = new Map2SearchWidgetSettings(this, driver);
        }
        return map2SearchWidgetSettings;
    }

    public LeadsEmailSettings getLeadsEmailSettings(WebDriver driver) {
        if (leadsEmailSettings == null) {
            leadsEmailSettings = new LeadsEmailSettings(this, driver);
        }
        return leadsEmailSettings;
    }

    public LocalizationSettings getLocalizationSettings(WebDriver driver) {
        if (localizationSettings == null) {
            localizationSettings = new LocalizationSettings(this, driver);
        }
        return localizationSettings;
    }

    public Sites getSites(WebDriver driver) {
        if (sites == null) {
            sites = new Sites(this, driver);
        }
        return sites;
    }

    public Users getUsers(WebDriver driver) {
        if (users == null) {
            users = new Users(this, driver);
        }
        return users;
    }

    public UserEditor getUserEditor(WebDriver driver) {
        if (userEditor == null) {
            userEditor = new UserEditor(this, driver);
        }
        return userEditor;
    }

    public GeneralWebsiteSettings getGeneralWebsiteSettings(WebDriver driver) {
        if (generalWebsiteSettings == null) {
            generalWebsiteSettings = new GeneralWebsiteSettings(this, driver);
        }
        return generalWebsiteSettings;
    }

    public WebmailLogin getWebmailLogin(WebDriver driver) {
        if (webmailLogin == null) {
            webmailLogin = new WebmailLogin(this, driver);
        }
        return webmailLogin;
    }

    public WebmailList getWebmailList(WebDriver driver) {
        if (webmailList == null) {
            webmailList = new WebmailList(this, driver);
        }
        return webmailList;
    }

    public WebmailDetails getWebmailDetails(WebDriver driver) {
        if (webmailDetails == null) {
            webmailDetails = new WebmailDetails(this, driver);
        }
        return webmailDetails;
    }
}
