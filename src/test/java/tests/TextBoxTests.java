package tests;

import manager.PlaywrightFactory;
import manager.TestDataProvider;
import models.TextBoxData;
import org.testng.annotations.*;
import main_page.MainPage;
import main_page.elements.TextBoxPage;


public class TextBoxTests extends PlaywrightFactory {
    @BeforeClass(description = "TB - 0001")
    public void preconditions() {
        new MainPage(page)
                .openElements()
                .openTextBox()
                .titleTextIs("Text Box"); // check that "Text Box" page was opened
    }

    @Test(dataProvider = "textBox", dataProviderClass = TestDataProvider.class)
    public void submitUserFormTest(TextBoxData user) {
        new TextBoxPage(page)
                .submitWebForm(user)
                .testAssertion(user); // comparing input/output test data
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
