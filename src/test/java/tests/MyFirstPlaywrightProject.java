package tests;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;
import org.testng.annotations.Test;

import java.nio.file.Paths;
import java.util.regex.Pattern;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static tests.TestExample.playwright;

public class MyFirstPlaywrightProject {


    @Test
    public void screenShot() {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.webkit().launch();
        Page page = browser.newPage();
        page.navigate("https://playwright.dev/");
        page.screenshot((new Page.ScreenshotOptions().setPath(Paths.get("example.png"))));
    }

    @Test
    public void asserting() {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("http://playwright.dev");

        assertThat(page).hasTitle(Pattern.compile("Playwright"));

        Locator getStarted = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Get Started"));

        assertThat(getStarted).hasAttribute("href", "/docs/intro");

        getStarted.click();

        assertThat(page.getByRole(AriaRole.HEADING,
                new Page.GetByRoleOptions().setName("Installation"))).isVisible();
    }



}
