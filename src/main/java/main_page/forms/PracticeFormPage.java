package main_page.forms;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import manager.BaseHelper;
import org.testng.Assert;

public class PracticeFormPage extends BaseHelper {
    public PracticeFormPage(Page page) {
        super(page);
    }

    private final Locator titleText = page.locator(BaseHelper.titleLocator);

    public PracticeFormPage titleTextIs(String text) {
        Assert.assertEquals(titleText.textContent(), text);
        return this;
    }
}
