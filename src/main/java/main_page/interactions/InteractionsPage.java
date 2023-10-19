package main_page.interactions;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import manager.BaseHelper;

public class InteractionsPage extends BaseHelper {
    public InteractionsPage(Page page) {
        super(page);
    }

    private final Locator selectableButton = page.locator("'Selectable'");

    public SelectableListPage openSelectablePage() {
        selectableButton.click();
        return new SelectableListPage(page);
    }
}
