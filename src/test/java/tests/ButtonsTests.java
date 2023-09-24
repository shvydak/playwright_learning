package tests;

import main_page.MainPage;
import main_page.elements.ButtonsPage;
import manager.PlaywrightFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ButtonsTests extends PlaywrightFactory {
    @BeforeClass
    public void openButtonPage() {
        new MainPage(page)
                .openElements()
                .openButtonsPage()
                .titleTextIs("Buttons"); // assert title name
    }

    @Test
    public void doubleClickButtonTest() {
        new ButtonsPage(page)
                .doubleClickButtonClick();
    }
}
