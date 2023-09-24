package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import manager.BaseHelper;
import models.TextBoxData;
import org.testng.Assert;

public class TextBox extends BaseHelper {
    public TextBox(Page page) {

        super(page);
    }

    Locator title = page.locator("//div[@class='main-header']");
    Locator fullNameField = page.locator("id=userName");
    Locator emailField = page.locator("id=userEmail");
    Locator currAddress = page.locator("id=currentAddress");
    Locator permAddress = page.locator("id=permanentAddress");
    Locator submitButton = page.locator("id=submit");
    Locator outputName = page.locator("id=name");
    Locator outputEmail = page.locator("id=email");
    Locator outputCurrentAddress = page.locator("id=currentAddress").last();
    Locator outputPermanentAddress = page.locator("id=permanentAddress").last();

    public TextBox titleTextIs(String text) {
        String res = title.textContent();
        Assert.assertEquals(res, text);
        System.out.println(res);
        return this;
    }

    public TextBox submitWebForm(TextBoxData user) {
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
