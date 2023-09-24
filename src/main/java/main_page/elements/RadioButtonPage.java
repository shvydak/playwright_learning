package main_page.elements;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import manager.BaseHelper;
import org.testng.Assert;

public class RadioButtonPage extends BaseHelper {
    public RadioButtonPage(Page page) {
        super(page);
    }

    private final Locator title = page.locator(BaseHelper.titleLocator);
    private final Locator yesRadioButton = page.locator("'Yes'");
    private final Locator impressiveRadioButton = page.locator("'Impressive'");
    private final Locator noRadioButton = page.locator("id=noRadio");
    private final Locator resultString = page.locator("//span[@class='text-success']");

    public RadioButtonPage titleTextIs(String text) {
        Assert.assertEquals(title.textContent(), text);
        return this;
    }

    public RadioButtonPage yesRadioButtonClick() {
        yesRadioButton.check();
        Assert.assertEquals(resultString.textContent(), "Yes");
        return this;
    }

    public RadioButtonPage impressiveRadioButtonClick() {
        impressiveRadioButton.check();
        Assert.assertEquals(resultString.textContent(), "Impressive");
        return this;
    }

    public RadioButtonPage noRadioButtonIsDisable() {
        Assert.assertTrue(noRadioButton.isDisabled());
        return this;
    }
}
