package main_page;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import main_page.elements.ElementsPage;
import manager.BaseHelper;

public class MainPage extends BaseHelper {

    public MainPage(Page page) {
        super(page);
    }

    private final Locator headerLogo = page.locator("//img[@src='/images/Toolsqa.jpg']");
    private final Locator elements = page.locator("'Elements'");
    private final Locator forms = page.locator("'Forms'");
    private final Locator alerts = page.locator("'Alerts, Frame & Windows'");
    private final Locator widgets = page.locator("'Widgets'");
    private final Locator interactions = page.locator("'Interactions'");
    private final Locator bookStore = page.locator("'Book Store Application'");

    public ElementsPage openElements() {
        elements.click();
        return new ElementsPage(page);
    }

    public MainPage openForms() {
        forms.click();
        return this;
    }

    public MainPage openAlerts() {
        alerts.click();
        return this;
    }

    public MainPage openWidgets() {
        widgets.click();
        return this;
    }

    public MainPage openInteractions() {
        interactions.click();
        return this;
    }

    public MainPage openBookStore() {
        bookStore.click();
        return this;
    }

    public MainPage goToMainPage() {
        headerLogo.click();
        return this;
    }
}
