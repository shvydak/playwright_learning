package tests.widgets;

import main_page.MainPage;
import main_page.widgets.ToolTips;
import manager.PlaywrightFactory;
import org.testng.annotations.AfterClass;
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
    public void hoverButtonTest() {
        new ToolTips(page)
                .hoverMeToSeeButtonHoverTextContains("You hovered over the Button"); // assertion
    }

    @Test
    public void hoverInputTest() {
        new ToolTips(page)
                .hoverMeToSeeInputHoverTextContains("You hovered over the text field"); // assertion
    }

    @Test
    public void hoverContraryLinkTest() {
        new ToolTips(page)
                .hoverMeToSeeContraryHoverTextContains("You hovered over the Contrary"); // assertion
    }

    @Test
    public void hoverDateLinkTest() {
        new ToolTips(page)
                .hoverMeToSeeDateHoverTextContains("You hovered over the 1.10.32"); // assertion
    }

    @AfterClass
    public void returnToMainPage() {
        new MainPage(page)
                .goToMainPage();
    }
}
