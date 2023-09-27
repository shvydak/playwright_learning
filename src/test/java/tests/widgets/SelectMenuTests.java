package tests.widgets;

import main_page.MainPage;
import main_page.widgets.SelectMenuPage;
import manager.PlaywrightFactory;
import manager.TestDataProvider;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SelectMenuTests extends PlaywrightFactory {
    @BeforeClass
    public void openSelectMenuPage() {
        new MainPage(page)
                .openWidgets()
                .openSelectMenuPage()
                .titleTextIs("Select Menu"); // with assert title name
    }

    @Test(dataProvider = "selectValue", dataProviderClass = TestDataProvider.class)
    public void selectValueTest(String text) {
        new SelectMenuPage(page)
                .selectValue(text);
    }

    @Test
    public void multiselectDropDownTest() {
        new SelectMenuPage(page)
                .multiselectDropDown();
    }

    @Test(dataProvider = "select", dataProviderClass = TestDataProvider.class)
    public void oldStyleSelectMenuTestIndexValue(int value) {
        new SelectMenuPage(page)
                .selectOption(value); // with assert select
    }

    @Test
    public void oldStyleSelectMenuTestStringValue() {
        new SelectMenuPage(page)
                .selectOption("Yellow"); // with assert select
    }

    @Test
    public void standardMultiSelectTest() {
        new SelectMenuPage(page)
                .multiSelect(new String[]{"Saab", "Opel"}); // TODO Assert
    }

    @AfterMethod
    public void makeScreenshot() {
        new MainPage(page)
                .screenShotFUllPage();
    }

    @AfterClass
    public void returnToMainPage() {
        new MainPage(page)
                .goToMainPage();
    }
}
