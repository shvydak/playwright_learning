package tests;

import manager.PlaywrightFactory;
import manager.TestDataProvider;
import models.TextBoxData;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.TextBox;


public class TextBoxTests extends PlaywrightFactory {
    @BeforeClass(description = "TB - 0001")
    public void preconditions() {
        new MainPage(page)
                .openElements()
                .openTextBox()
                .titleTextIs("Text Box");
    }

    @Test(dataProvider = "textBox", dataProviderClass = TestDataProvider.class)
    public void test1(TextBoxData user) {
        new TextBox(page)
                .submitWebForm(user)
                .testAssertion(user); // comparing input/output test data
    }
}
