package main_page.elements;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import manager.BaseHelper;
import models.TextBoxData;
import org.testng.Assert;

public class TextBoxPage extends BaseHelper {
    public TextBoxPage(Page page) {

        super(page);
    }

    //    private final Locator title = page.locator("//div[@class='main-header']");
    private final Locator title = page.locator(BaseHelper.titleLocator);
    private final Locator fullNameField = page.locator("id=userName");
    private final Locator emailField = page.locator("id=userEmail");
    private final Locator currAddress = page.locator("id=currentAddress");
    private final Locator permAddress = page.locator("id=permanentAddress");
    private final Locator submitButton = page.locator("id=submit");
    private final Locator outputName = page.locator("id=name");
    private final Locator outputEmail = page.locator("id=email");
    private final Locator outputCurrentAddress = page.locator("id=currentAddress").last();
    private final Locator outputPermanentAddress = page.locator("id=permanentAddress").last();

    public TextBoxPage titleTextIs(String text) {
        String res = title.textContent();
        Assert.assertEquals(res, text);
        return this;
    }

    public TextBoxPage submitWebForm(TextBoxData user) {
        fullNameField.fill(user.getFullName());
        emailField.fill(user.getEmail());
        currAddress.fill(user.getCurrentAddress());
        permAddress.fill(user.getPermanentAddress());
        submitButton.click();
        return this;
    }

    public void testAssertion(TextBoxData user) {
        Assert.assertTrue(outputName.textContent().contains(user.getFullName()));
        Assert.assertTrue(outputEmail.textContent().contains(user.getEmail()));
        Assert.assertTrue(outputCurrentAddress.textContent().contains(user.getCurrentAddress()));
        Assert.assertTrue(outputPermanentAddress.textContent().contains(user.getPermanentAddress()));
    }
}
