package main_page.elements;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import manager.BaseHelper;
import org.testng.Assert;

public class CheckBoxPage extends BaseHelper {

    public CheckBoxPage(Page page) {
        super(page);
    }

    private final Locator title = page.locator(BaseHelper.titleLocator);
    private final Locator expandAllIcon = page.getByLabel("Expand all");
    private final Locator checkBoxDownloads = page.locator("label").filter(new Locator.FilterOptions().setHasText("Downloads")).getByRole(AriaRole.IMG).first();
    private final Locator checkBoxWordFile = page.locator("label").filter(new Locator.FilterOptions().setHasText("Word File.doc")).getByRole(AriaRole.IMG).first();
    private final Locator checkBoxExcelFile = page.locator("label").filter(new Locator.FilterOptions().setHasText("Excel File.doc")).getByRole(AriaRole.IMG).first();


    public CheckBoxPage titleTextIs(String text) {
        Assert.assertEquals(title.textContent(), text);
        return this;
    }

    public CheckBoxPage expandAll() {
        expandAllIcon.click();
        return this;
    }

    public CheckBoxPage clickOnDownloadsCheckBox() {
        checkBoxDownloads.check();
        Assert.assertTrue(checkBoxDownloads.isChecked());
        Assert.assertTrue(checkBoxWordFile.isChecked());
        Assert.assertTrue(checkBoxExcelFile.isChecked());
        return this;
    }
}
