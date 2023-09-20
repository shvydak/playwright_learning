package tests;

import com.microsoft.playwright.Page;
import manager.PlaywrightFactory;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    PlaywrightFactory pf;
    Page page;

    @BeforeSuite
    public void setUp() {
        pf = new PlaywrightFactory();
        page = pf.initBrowser("chromium");





    }
}
