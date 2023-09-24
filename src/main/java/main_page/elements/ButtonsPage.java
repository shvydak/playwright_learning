package main_page.elements;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import manager.BaseHelper;
import org.testng.Assert;

public class ButtonsPage extends BaseHelper {
    public ButtonsPage(Page page) {
        super(page);
    }

    private final Locator titleText = page.locator(titleLocator);
    private final Locator doubleClickButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Double Click Me"));

    public ButtonsPage titleTextIs(String text) {
        Assert.assertEquals(titleText.textContent(), text);
        return this;
    }

    public ButtonsPage doubleClickButtonClick() {
        doubleClickButton.dblclick();
        return this;
    }
}
