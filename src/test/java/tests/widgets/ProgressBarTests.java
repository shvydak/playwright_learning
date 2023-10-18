package tests.widgets;

import main_page.MainPage;
import main_page.widgets.ProgressBarPage;
import manager.PlaywrightFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProgressBarTests extends PlaywrightFactory {
    @BeforeClass
    public void openProgressBarPage() {
        new MainPage(page)
                .openWidgets()
                .openProgressBarPage()
                .titleTextIs("Progress Bar");
    }

    @Test
    public void startButton() {
        new ProgressBarPage(page)
                .clickOnStartButton();
    }

    @AfterMethod
    public void makeScreenshot() {
        new MainPage(page)
                .screenShotFUllPage();
    }
}
