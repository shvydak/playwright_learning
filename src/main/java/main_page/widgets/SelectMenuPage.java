package main_page.widgets;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import manager.BaseHelper;
import org.testng.Assert;

public class SelectMenuPage extends BaseHelper {
    public SelectMenuPage(Page page) {
        super(page);
    }

    public SelectMenuPage titleTextIs(String text) {
        Assert.assertEquals(titleText.textContent(), text);
        return this;
    }

    private final Locator titleText = page.locator(BaseHelper.titleLocator);
    private final Locator oldStyleSelectMenuSelector = page.locator("id=oldSelectMenu");
    private final Locator oldStyleSelectMenuSelectorOption = page.locator("//select[@id='oldSelectMenu']/option");

    public SelectMenuPage selectOption(String value) {
        int length = oldStyleSelectMenuSelectorOption.count();
        oldStyleSelectMenuSelector.selectOption(value);
        int res = Integer.parseInt(oldStyleSelectMenuSelector.inputValue());
        String res1 = oldStyleSelectMenuSelectorOption.nth(res).innerText();
        Assert.assertEquals(value, res1);
        return this;
    }

    public SelectMenuPage selectOption(int value) {
        int length = oldStyleSelectMenuSelectorOption.count();
        oldStyleSelectMenuSelector.selectOption(String.valueOf(value));
        int res = Integer.parseInt(oldStyleSelectMenuSelector.inputValue());
        String res1 = oldStyleSelectMenuSelectorOption.nth(res).innerText();
        Assert.assertEquals(value, res);
        return this;
    }
}
