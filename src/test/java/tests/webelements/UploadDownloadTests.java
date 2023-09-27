package tests.webelements;

import main_page.MainPage;
import main_page.elements.UploadDownloadPage;
import manager.PlaywrightFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UploadDownloadTests extends PlaywrightFactory {
    @BeforeClass
    public void openUploadDownloadPage() {
        new MainPage(page)
                .openElements()
                .openUploadDownloadPage()
                .titleTextIs("Upload and Download"); // check that "Upload and Download" page was opened
    }

    @Test
    public void downloadTest() {
        new UploadDownloadPage(page)
                .downloadFile(); // with assert that the file saved (+ deleting the file after successfully saving)
    }

    @Test
    public void uploadTest() {
        new UploadDownloadPage(page)
                .uploadFile("output/lastScreenshotFullPage.png");
    }

    @AfterMethod
    public void makeScreenshot() {
        new MainPage(page)
                .screenShotFUllPage();
    }

    @AfterClass
    public void goToHomePage() {
        new MainPage(page)
                .goToMainPage();
    }
}
