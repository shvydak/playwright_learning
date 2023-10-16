package main_page;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.WaitForSelectorState;
import main_page.elements.ElementsPage;
import main_page.forms.Forms;
import main_page.forms.PracticeFormPage;
import main_page.widgets.WidgetsPage;
import manager.BaseHelper;
import org.testng.Assert;

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
    private final Locator mainPageImage = page.getByAltText("Selenium Online Training");

    public ElementsPage openElements() {
        elements.click();
        return new ElementsPage(page);
    }

    public Forms openForms() {
        forms.click();
        return new Forms(page);
    }

    public MainPage openAlerts() {
        alerts.click();
        return this;
    }

    public WidgetsPage openWidgets() {
        widgets.click();
        return new WidgetsPage(page);
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
        mainPageImage.waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        Assert.assertTrue(mainPageImage.isVisible());
        return this;
    }

}
