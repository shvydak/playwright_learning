package tests;

import main_page.MainPage;
import main_page.elements.ButtonsPage;
import manager.PlaywrightFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
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
                .doubleClickButtonClick()
                .doubleClickMessageAppeared(); // assert that text message appeared
    }

    @Test
    public void rightClickButtonTest() {
        new ButtonsPage(page)
                .rightClickMeButtonClick()
                .rightClickMeButtonMessageAppeared(); // assert that text message appeared
    }

    @Test
    public void clickButton() {
        new ButtonsPage(page)
                .clickMeButtonClick()
                .clickMeButtonMessageAppeared(); // assert that text message appeared
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
