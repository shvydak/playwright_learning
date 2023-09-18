package tests;

import com.microsoft.playwright.*;
import org.testng.annotations.Test;

public class LocatorsAndWebElements {
    @Test
    public void locators() {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

        // locators

        BrowserContext browserContext = browser.newContext();
        Page page = browser.newPage();
        page.navigate("https://demoqa.com/");

        // single element
        Locator elements = page.locator("text =Elements");
        int sumElements = elements.count();

        elements.click();

        Locator widgets = page.locator("text =Widgets");
        widgets.click();
        Locator selectMenu = page.locator("text =Select Menu");
        selectMenu.click();

        // multiple elements

        Locator selector = page.locator("select#oldSelectMenu option");

        int selectorSize = selector.count();
        System.out.println(selectorSize);
        for (int i = 0; i < selectorSize; i++) {
            System.out.println(selector.nth(i).innerText());
        }
    }
}
