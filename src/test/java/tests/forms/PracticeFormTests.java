package tests.forms;

import main_page.MainPage;
import manager.PlaywrightFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PracticeFormTests extends PlaywrightFactory {
    @BeforeClass
    public void openPracticeFormPage() {
        new MainPage(page)
                .openForms()
                .openPracticeForm()
                .titleTextIs("Practice Form");
    }

    @Test(description = "positive")
    public void fillAllRequiredFields() {

    }

}
