package tests.widgets;

import main_page.MainPage;
import main_page.widgets.AccordianPage;
import manager.PlaywrightFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AccordianTests extends PlaywrightFactory {
    @BeforeClass
    public void openAccordianPage() {
        new MainPage(page)
                .openWidgets()
                .openAccordianPage()
                .titleTextIs("Accordian"); // assert title
    }

    @Test
    public void whatIsLoremIpsumTest() {
        new AccordianPage(page)
                .whatIsLoremIpsumOpen("Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
    }

    @AfterMethod
    public void makeScreenshot() {
        new MainPage(page)
                .screenShotFUllPage();
    }
}
