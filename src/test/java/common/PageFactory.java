package common;

import pages.ElementsPage;
import pages.WebTablesPage;
import utils.PropertyManager;

public class PageFactory {
    private static String elementPageURL;
    private static String webTablesPageURL;

    public static ElementsPage buildElementsPage() {
        return new ElementsPage(elementPageURL);
    }

    public static WebTablesPage buildWebTablesPage() {
        return new WebTablesPage(webTablesPageURL);
    }

    public static void setPagesUrl() {
        PropertyManager propertyManager = new PropertyManager();
        elementPageURL = propertyManager.getProperty("APP_URL_ELEMENTS");
        webTablesPageURL = propertyManager.getProperty("APP_URL_WEBTABLES");
    }

}