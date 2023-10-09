package tests.widgets;

import main_page.MainPage;
import main_page.widgets.ToolTips;
import manager.PlaywrightFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ToolTipsHoverTests extends PlaywrightFactory {
    @BeforeClass
    public void openToolTipsPage() {
        new MainPage(page)
                .openWidgets()
                .openToolTipsPage()
                .titleTextIs("Tool Tips"); // assert
    }

    @Test
    public void hoverTest() {
        new ToolTips(page)
                .screenShotFUllPage();
    }
}
