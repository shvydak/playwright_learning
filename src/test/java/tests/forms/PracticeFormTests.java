package tests.forms;

import main_page.MainPage;
import main_page.forms.PracticeFormPage;
import manager.PlaywrightFactory;
import manager.TestDataProvider;
import models.PracticeFormModel;
import org.testng.annotations.*;

public class PracticeFormTests extends PlaywrightFactory {
    @BeforeClass
    public void openPracticeFormPage() {
        new MainPage(page)
                .openForms()
                .openPracticeForm()
                .titleTextIs("Practice Form");
    }

    @Test(description = "positive", dataProvider = "practiceFormTests", dataProviderClass = TestDataProvider.class)
    public void fillAllRequiredFields(PracticeFormModel user) {
        new
                PracticeFormPage(page)
                .fillPracticeForm(user)
                .screenShotFUllPage(); //WO Assertion (the BUG present on the site)
    }
}
