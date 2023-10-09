package main_page.widgets;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import manager.BaseHelper;
import org.testng.Assert;

public class ToolTips extends BaseHelper {
    public ToolTips(Page page) {
        super(page);
    }

    private final Locator titleText = page.locator(BaseHelper.titleLocator);

    public ToolTips titleTextIs(String text) {
        Assert.assertEquals(titleText.textContent(), text);
        return this;
    }
}
