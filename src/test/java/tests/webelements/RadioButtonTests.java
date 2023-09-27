package tests.webelements;

import main_page.MainPage;
import main_page.elements.RadioButtonPage;
import manager.PlaywrightFactory;
import org.testng.annotations.*;


public class RadioButtonTests extends PlaywrightFactory {
    @BeforeClass
    public void openRadioButtonPage() {
        new MainPage(page)
                .openElements()
                .openRadioButton()
                .titleTextIs("Radio Button");
    }

    @Test
    public void yesRadioButtonTest() {
        new RadioButtonPage(page)
                .yesRadioButtonClick(); // with assertion
    }

    @Test
    public void impressiveRadioButtonTest() {
        new RadioButtonPage(page)
                .impressiveRadioButtonClick(); // with assertion
    }

    @Test
    public void noRadioButtonTest() {
        new RadioButtonPage(page)
                .noRadioButtonIsDisable();
    }

    @AfterMethod
    public void makeScreenShotOfFullPage() {
        new MainPage(page)
                .screenShotFUllPage();
    }

    @AfterClass
    public void returnToMainPage() {
        new MainPage(page)
                .goToMainPage();
    }

}
