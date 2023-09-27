package tests.webelements;

import main_page.elements.CheckBoxPage;
import manager.PlaywrightFactory;
import org.testng.annotations.*;
import main_page.MainPage;

public class CheckBoxTests extends PlaywrightFactory {
    @BeforeClass
    public void preconditions() {
        new MainPage(page)
                .openElements()
                .openCheckBox()
                .titleTextIs("Check Box"); // check that "Check Box" page was opened
    }

    @Test
    public void checkBoxTest() {
        new CheckBoxPage(page)
                .expandAll()
                .clickOnDownloadsCheckBox()
                .testChecked(); // assert that all needed checkbox "checked"

    }

    @AfterMethod
    public void makeScreenShotOfFullPage() {
        new MainPage(page)
                .screenShotFUllPage();
    }

    @AfterClass
    public void returnToMainPage() {
        new MainPage(page)
                .goToMainPage();
    }

}
