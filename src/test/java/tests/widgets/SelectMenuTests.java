package tests.widgets;

import main_page.MainPage;
import main_page.widgets.SelectMenuPage;
import manager.PlaywrightFactory;
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

    //    @Test(dataProvider = "select", dataProviderClass = TestDataProvider.class)
    @Test
    public void oldStyleSelectMenuTest() {
        new SelectMenuPage(page)
                .selectOption(10); // with assert select
    }

    @AfterMethod
    public void makeScreenshot() {
        new MainPage(page)
                .screenShotFUllPage();
    }
}
