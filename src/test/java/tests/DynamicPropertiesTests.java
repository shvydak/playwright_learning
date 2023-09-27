package tests;

import main_page.MainPage;
import main_page.elements.DynamicPropertiesPage;
import manager.PlaywrightFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DynamicPropertiesTests extends PlaywrightFactory {
    @BeforeClass
    public void openDynamicPropertiesPage() {
        new MainPage(page)
                .openElements()
                .opendynamicPropertiesPage()
                .titleTextIs("Dynamic Properties"); // check that "Dynamic Properties" page was open
    }

    @Test
    public void willEnableAfter5SeccondsTest() {
        new DynamicPropertiesPage(page)
                .waitWhenEnabled();
    }

    @Test
    public void colorButtonTest() {
        new DynamicPropertiesPage(page)
                .colorButton();
    }

    @Test
    public void visibleAfter5SecTest() {
        new DynamicPropertiesPage(page)
                .visibleAfter5SecAssert();
    }

    @AfterMethod
    public void refreshPage() {
        new DynamicPropertiesPage(page)
                .refrashThePage();
    }

    @AfterClass
    public void returnToMainPage() {
        new MainPage(page)
                .goToMainPage();
    }
}


