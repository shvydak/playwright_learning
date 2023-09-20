package manager;

import com.microsoft.playwright.*;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.nio.file.Paths;


public class PlaywrightFactory {
    protected static Page page;
    BrowserContext context;


    @BeforeSuite
    public void start() {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        context = browser.newContext();
        // start tracing
        context.tracing().start(new Tracing.StartOptions().setScreenshots(true).setSnapshots(true));

        page = context.newPage();
        page.navigate("https://demoqa.com/");

    }

    @AfterSuite
    public void stop() {
        context.tracing().stop(new Tracing.StopOptions().setPath(Paths.get("output/Trace.zip")));
        page.close();
    }


}
