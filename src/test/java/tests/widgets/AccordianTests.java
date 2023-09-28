package tests.widgets;

import main_page.MainPage;
import main_page.widgets.AccordianPage;
import manager.PlaywrightFactory;
import org.testng.annotations.AfterClass;
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
    public void whatIsLoremIpsumContainTextTest() {
        new AccordianPage(page)
                .whatIsLoremIpsumContainText("Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
    }

    @Test
    public void expandAllTest() {
        new AccordianPage(page)
                .expandAll();
    }

    @AfterMethod
    public void makeScreenshot() {
        new MainPage(page)
                .screenShotFUllPage();
    }

    @AfterClass
    public void goToMainPage() {
        new MainPage(page)
                .goToMainPage();
    }
}
