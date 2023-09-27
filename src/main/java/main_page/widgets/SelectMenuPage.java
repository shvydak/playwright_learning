package main_page.widgets;

import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Keyboard;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.SelectOption;
import manager.BaseHelper;
import org.testng.Assert;

import java.util.logging.Handler;

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
    private final Locator standardMultiSelect = page.locator("id=cars");
    private final Locator selectValue = page.locator("id=withOptGroup");

    public SelectMenuPage selectValue() {
        selectValue.click();
        page.keyboard().type("Gro");
        return this;
    }

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

    public SelectMenuPage multiSelect(String[] car) {
        standardMultiSelect.selectOption(car);
        return this; // TODO Assert
    }
}
