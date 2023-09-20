package manager;

import com.microsoft.playwright.Page;

import java.nio.file.Paths;

public class BaseHelper {
    protected Page page;

    public BaseHelper(Page page) {
        this.page = page;
    }

    public void screenShotFUllPage(){
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("output/lastScreenshotFullPage.png")).setFullPage(true));
    }

}
