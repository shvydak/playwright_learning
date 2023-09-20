package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import manager.BaseHelper;
import org.testng.Assert;

public class TextBox extends BaseHelper {
    public TextBox(Page page) {

        super(page);
    }

    Locator title = page.locator("//div[@class='main-header']");
    Locator fullNameField = page.getByPlaceholder("Full Name");
    Locator emailField = page.locator("id=userEmail");
    Locator currAddress = page.locator("id=currentAddress");
    Locator permAddress = page.locator("id=permanentAddress");
    Locator submitButton = page.locator("id=submit");
    Locator output = page.locator("id=output");

    public TextBox titleTextIs(String text) {
        String res = title.textContent();
        Assert.assertEquals(res, text);
        System.out.println(res);
        return this;
    }

    public TextBox submitWebForm(String fullName, String emailAddress, String currentAddress, String permanentAddress) {
        fullNameField.fill(fullName);
        emailField.fill(emailAddress);
        currAddress.fill(currentAddress);
        permAddress.fill(permanentAddress);
        submitButton.click();
        return this;
    }

    public TextBox outputText() {
        System.out.println(output.textContent());
        return this;
    }
}
