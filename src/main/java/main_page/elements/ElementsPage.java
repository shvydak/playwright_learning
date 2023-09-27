package main_page.elements;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import manager.BaseHelper;

public class ElementsPage extends BaseHelper {
    public ElementsPage(Page page) {
        super(page);
    }

    private final Locator textBox = page.locator("'Text Box'");
    private final Locator checkBox = page.locator("'Check Box'");
    private final Locator radioButton = page.locator("'Radio Button'");
    private final String webTables = "''";
    private final Locator buttons = page.locator("'Buttons'");
    private final String links = "''";
    private final String brokenLinks = "''";
    private final Locator uploadDownload = page.getByText("Upload and Download");
    private final Locator dynamicProperties = page.locator("'Dynamic Properties'");

    public TextBoxPage openTextBox() {
        textBox.click();
        return new TextBoxPage(page);
    }

    public CheckBoxPage openCheckBox() {
        checkBox.click();
        return new CheckBoxPage(page);
    }

    public RadioButtonPage openRadioButton() {
        radioButton.click();
        return new RadioButtonPage(page);
    }

    public ButtonsPage openButtonsPage() {
        buttons.click();
        return new ButtonsPage(page);
    }

    public UploadDownloadPage openUploadDownloadPage() {
        uploadDownload.click();
        return new UploadDownloadPage(page);
    }

    public DynamicPropertiesPage opendynamicPropertiesPage() {
        dynamicProperties.click();
        return new DynamicPropertiesPage(page);
    }
}
