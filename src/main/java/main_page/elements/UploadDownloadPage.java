package main_page.elements;

import com.microsoft.playwright.Download;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import manager.BaseHelper;
import org.testng.Assert;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UploadDownloadPage extends BaseHelper {
    public UploadDownloadPage(Page page) {
        super(page);
    }

    private final Locator pageTitle = page.locator(BaseHelper.titleLocator);
    private final Locator downloadButton = page.locator("id=downloadButton");
    private final Locator chooseFileButton = page.locator("id=uploadFile");
    private final Locator afterUploadMessage = page.locator("id=uploadedFilePath");

    public UploadDownloadPage titleTextIs(String text) {
        Assert.assertEquals(pageTitle.textContent(), text);
        return this;
    }

    public UploadDownloadPage downloadFile() {
        Download download = page.waitForDownload(downloadButton::click);

        String toSavePath = "output/tmp";
        String fileName = download.suggestedFilename();

        download.saveAs(Paths.get(toSavePath, fileName));
        Assert.assertTrue(Files.exists(Path.of(toSavePath, fileName)));
        try {
            Files.delete(Path.of(toSavePath, fileName));
            Assert.assertFalse(Files.exists(Path.of(toSavePath, fileName)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return this;
    }

    public UploadDownloadPage uploadFile(String path) {
        chooseFileButton.setInputFiles(Paths.get(path));
        // find file name only
        String[] arr = path.split("/");
        String fileName = arr[arr.length - 1];

        Assert.assertTrue(afterUploadMessage.textContent().contains(fileName));
        return this;
    }
}
