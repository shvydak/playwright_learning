package main_page.widgets;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import manager.BaseHelper;
import org.testng.Assert;

public class ProgressBarPage extends BaseHelper {
    public ProgressBarPage(Page page) {
        super(page);
    }

    Locator titleText = page.locator(BaseHelper.titleLocator);
    Locator startButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Start"));
    Locator progressBar = page.locator("id=progressBar");

    public ProgressBarPage titleTextIs(String text) {
        Assert.assertEquals(titleText.textContent(), text);
        return this;
    }

    public ProgressBarPage clickOnStartButton() {
        startButton.click();
        page.waitForCondition(() -> progressBar.textContent().equals("100%"));
        Assert.assertEquals(progressBar.textContent(), "100%");
        return this;
    }
}
