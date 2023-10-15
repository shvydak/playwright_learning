package main_page.widgets;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import manager.BaseHelper;
import org.testng.Assert;

public class TabsPage extends BaseHelper {
    public TabsPage(Page page) {
        super(page);
    }

    private final Locator titleText = page.locator(BaseHelper.titleLocator);
    private final Locator whatTab = page.locator("id=demo-tab-what");
    private final Locator originTab = page.locator("id=demo-tab-origin");
    private final Locator useTab = page.locator("id=demo-tab-use");
    private final Locator moreTab = page.locator("id=demo-tab-more");
    private final Locator whatBody = page.locator("id=demo-tabpane-what");
    private final Locator originBody = page.locator("id=demo-tabpane-origin");
    private final Locator useBody = page.locator("id=demo-tabpane-use");


    public TabsPage titleTextIs(String text) {
        Assert.assertEquals(titleText.textContent(), text);
        return this;
    }

    public TabsPage whatTabContains(String text) {
        whatTab.click();
        Assert.assertTrue(whatBody.textContent().contains(text));
        return this;
    }

    public TabsPage originTabContains(String text) {
        originTab.click();
        Assert.assertTrue(originBody.textContent().contains(text));
        return this;
    }

    public TabsPage useTabContains(String text) {
        useTab.click();
        Assert.assertTrue(useBody.textContent().contains(text));
        return this;
    }

    public TabsPage moreTabIsDisable() {
        Assert.assertTrue(moreTab.isDisabled());
        return this;
    }
}
