package tests.interactions;

import main_page.MainPage;
import manager.PlaywrightFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SelectableTests extends PlaywrightFactory {
    @BeforeClass
    public void openSelectablePage() {
        new MainPage(page)
                .openInteractions()
                .openSelectablePage()
                .titleTextIs("Selectable");
    }

    @Test
    public void listTest() {

    }
}
