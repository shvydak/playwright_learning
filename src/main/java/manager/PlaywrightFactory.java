package manager;

import com.microsoft.playwright.*;

public class PlaywrightFactory {
    Playwright playwright;
    Browser browser;
    BrowserContext context;
    Page page;

    public Page initBrowser(String browserName) {

        System.out.println("Browser name is " + browserName);

        playwright = Playwright.create();

        // Select browser
        switch (browserName.toLowerCase()) {
            case "chromium":
                browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
                break;
            case "firefox":
                browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
                break;
            case "safari":
                browser = playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));
                break;
            case "chrome":
                browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
                break;
            default:
                System.out.println("Please select browser");
                break;
        }

        context = browser.newContext();
        page = context.newPage();
        page.navigate("https://demoqa.com/");

        return page;
    }
}
