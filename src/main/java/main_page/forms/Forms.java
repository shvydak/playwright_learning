package main_page.forms;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import manager.BaseHelper;

public class Forms extends BaseHelper {
    public Forms(Page page) {
        super(page);
    }

    private final Locator practiceFormPage = page.locator("'Practice Form'");

    public PracticeFormPage openPracticeForm() {
        practiceFormPage.click();
        return new PracticeFormPage(page);
    }

}
