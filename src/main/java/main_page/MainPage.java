package main_page;

import com.microsoft.playwright.Page;
import main_page.elements.ElementsPage;
import manager.BaseHelper;

public class MainPage extends BaseHelper {

    public MainPage(Page page) {
        super(page);
    }

    private final String elements = "'Elements'";
    private final String forms = "'Forms'";
    private final String alerts = "'Alerts, Frame & Windows'";
    private final String widgets = "'Widgets'";
    private final String interactions = "'Interactions'";
    private final String bookStore = "'Book Store Application'";

    public ElementsPage openElements() {
        page.locator(elements).click();
        return new ElementsPage(page);
    }

    public MainPage openForms() {
        page.locator(forms).click();
        return this;
    }

    public MainPage openAlerts() {
        page.locator(alerts).click();
        return this;
    }

    public MainPage openWidgets() {
        page.locator(widgets).click();
        return this;
    }

    public MainPage openInteractions() {
        page.locator(interactions).click();
        return this;
    }

    public MainPage openBookStore() {
        page.locator(bookStore).click();
        return this;
    }
}
