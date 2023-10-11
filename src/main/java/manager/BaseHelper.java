package manager;

import com.microsoft.playwright.Page;

import java.nio.file.Paths;

public class BaseHelper {
    protected Page page;
    protected static String titleLocator = "//div[@class='main-header']";

    public BaseHelper(Page page) {
        this.page = page;
    }

    public void screenShotFUllPage() {
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("output/lastScreenshotFullPage.png")).setFullPage(true));
    }

    public void screenShotFUllPage(String screenShotName) {
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("output/screenshots/" + screenShotName + ".png")).setFullPage(true));
    }


}
