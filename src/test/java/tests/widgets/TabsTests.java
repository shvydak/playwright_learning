package tests.widgets;

import main_page.MainPage;
import main_page.widgets.TabsPage;
import manager.PlaywrightFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TabsTests extends PlaywrightFactory {
    @BeforeClass
    public void openTabsPage() {
        new MainPage(page)
                .openWidgets()
                .openTabsPage()
                .titleTextIs("Tabs");
    }

    @Test
    public void whatTabTest() {
        new TabsPage(page)
                .whatTabContains("Lorem Ipsum is simply dummy text");
    }

    @Test
    public void originTabTest() {
        new TabsPage(page)
                .originTabContains("Contrary to popular belief, Lorem Ipsum is not simply random text.");
    }

    @Test
    public void useTabTest() {
        new TabsPage(page)
                .useTabContains("It is a long established fact that a reader will be distracted");
    }

    @Test
    public void moreTabTest() {
        new TabsPage(page)
                .moreTabIsDisable();
    }
}
