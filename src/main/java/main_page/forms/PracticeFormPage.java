package main_page.forms;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import manager.BaseHelper;
import models.PracticeFormModel;
import org.testng.Assert;

public class PracticeFormPage extends BaseHelper {
    public PracticeFormPage(Page page) {
        super(page);
    }

    private final Locator titleText = page.locator(BaseHelper.titleLocator);
    private final Locator firstNameInput = page.locator("id=firstName");
    private final Locator lastNameInput = page.locator("id=lastName");
    private final Locator emailInput = page.locator("id=userEmail");
    private final Locator maleRadioButton = page.locator("id=gender-radio-1");
    private final Locator femaleRadioButton = page.locator("id=gender-radio-2");
    private final Locator otherRadioButton = page.locator("id=gender-radio-3");
    private final Locator mobileNumber = page.locator("id=userNumber");
    private final Locator subjects = page.locator("id=subjectsContainer");
    private final Locator sportCheckBox = page.locator("id=hobbies-checkbox-1");
    private final Locator readingCheckBox = page.locator("id=hobbies-checkbox-2");
    private final Locator musicCheckBox = page.locator("id=hobbies-checkbox-3");
    private final Locator uploadPicture = page.locator("id=uploadPicture");
    private final Locator currentAddress = page.locator("id=currentAddress");
    private final Locator state = page.locator("id=state");
    private final Locator city = page.locator("id=city");

    public PracticeFormPage fillPracticeForm(PracticeFormModel user) {
        firstNameInput.fill(user.getFirstName());
        return this;
    }

    public PracticeFormPage titleTextIs(String text) {
        Assert.assertEquals(titleText.textContent(), text);
        return this;
    }
}
