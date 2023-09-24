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
    private final String Buttons = "''";
    private final String links = "''";
    private final String brokenLinks = "''";
    private final String uploadDownload = "''";
    private final String dynamicProperties = "''";

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
}
