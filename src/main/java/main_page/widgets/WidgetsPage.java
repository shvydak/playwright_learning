package main_page.widgets;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import manager.BaseHelper;

public class WidgetsPage extends BaseHelper {
    public WidgetsPage(Page page) {
        super(page);
    }

    private final Locator selectMenu = page.getByText("Select Menu");
    private final Locator Accordian = page.getByText("Accordian");

    public SelectMenuPage openSelectMenuPage() {
        selectMenu.click();
        return new SelectMenuPage(page);
    }

    public AccordianPage openAccordianPage() {
        Accordian.click();
        return new AccordianPage(page);
    }
}
