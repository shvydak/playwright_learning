package main_page.forms;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import manager.BaseHelper;
import models.PracticeFormInterface;
import models.PracticeFormModel;
import org.testng.Assert;

import java.nio.file.Paths;

public class PracticeFormPage extends BaseHelper implements PracticeFormInterface {
    public PracticeFormPage(Page page) {
        super(page);
    }

    private final Locator titleText = page.locator(BaseHelper.titleLocator);
    private final Locator firstNameInput = page.locator("id=firstName");
    private final Locator lastNameInput = page.locator("id=lastName");
    private final Locator emailInput = page.locator("id=userEmail");
    private final Locator maleRadioButton = page.getByText("Male", new Page.GetByTextOptions().setExact(true));
    private final Locator femaleRadioButton = page.getByText("Female");
    private final Locator otherRadioButton = page.getByText("Other");
    private final Locator mobileNumber = page.locator("id=userNumber");
    private final Locator subjects = page.locator("id=subjectsContainer");
    private final Locator sportCheckBox = page.getByText("Sports");
    private final Locator readingCheckBox = page.getByText("Reading");
    private final Locator musicCheckBox = page.getByText("Music");
    private final Locator uploadPicture = page.getByLabel("Select picture");
    private final Locator currentAddress = page.locator("id=currentAddress");
    private final Locator state = page.locator("id=state");
    private final Locator city = page.locator("id=city");
    private final Locator submitButton = page.locator("//button[@id='submit']");

    public PracticeFormPage fillPracticeForm(PracticeFormModel user) {
        if (user.getFirstName() != null)
            firstNameInput.fill(user.getFirstName());
        if (user.getLastName() != null)
            lastNameInput.fill(user.getLastName());
        if (user.getEmail() != null)
            emailInput.fill(user.getEmail());
        if (user.getGender() != null) {
            if (user.getGender().toLowerCase().equals(PracticeFormInterface.MALE)) {
                maleRadioButton.click();
            }
            if (user.getGender().toLowerCase().equals(PracticeFormInterface.FEMALE)) {
                femaleRadioButton.click();
            }
            if (user.getGender().equalsIgnoreCase(PracticeFormInterface.OTHER)) {
                otherRadioButton.click();
            }
        }
        if (user.getMobileNumber() != null)
            mobileNumber.fill(user.getMobileNumber());
        if (user.isHobieSport())
            sportCheckBox.check();
        if (user.isHobieReading())
            readingCheckBox.check();
        if (user.isHobieMusic())
            musicCheckBox.check();
        if (user.getPicture() != null) {
            uploadPicture.setInputFiles(Paths.get(user.getPicture()));
            // find file name only
            String[] arr = user.getPicture().split("/");
            String fileName = arr[arr.length - 1];
        }
        if (user.getCurrentAddress() != null)
            currentAddress.type(user.getCurrentAddress());
        return this;
    }

    public PracticeFormPage titleTextIs(String text) {
        Assert.assertEquals(titleText.textContent(), text);
        return this;
    }
}
