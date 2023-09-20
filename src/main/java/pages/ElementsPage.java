package pages;

import com.microsoft.playwright.Page;
import manager.BaseHelper;

public class ElementsPage extends BaseHelper {
    public ElementsPage(Page page) {
        super(page);
    }

    private final String textBox = "'Text Box'";
    private final String checkBox = "'Check Box'";
    private final String radioButton = "''";
    private final String webTables = "''";
    private final String Buttons = "''";
    private final String links = "''";
    private final String brokenLinks = "''";
    private final String uploadDownload = "''";
    private final String dynamicProperties = "''";

    public TextBox openTextBox() {
        page.locator(textBox).click();
        return new TextBox(page);
    }

}
