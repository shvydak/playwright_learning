package main_page.widgets;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import manager.BaseHelper;

public class WidgetsPage extends BaseHelper {
    public WidgetsPage(Page page) {
        super(page);
    }

    private final Locator selectMenu = page.getByText("Select Menu");
    private final Locator accordian = page.getByText("Accordian");
    private final Locator progressBar = page.getByText("Progress Bar");
    private final Locator toolTips = page.getByText("Tool Tips");
    private final Locator tabs = page.getByText("Tabs");

    public SelectMenuPage openSelectMenuPage() {
        selectMenu.click();
        return new SelectMenuPage(page);
    }

    public AccordianPage openAccordianPage() {
        accordian.click();
        return new AccordianPage(page);
    }

    public ProgressBarPage openProgressBarPage() {
        progressBar.click();
        return new ProgressBarPage(page);
    }

    public ToolTips openToolTipsPage() {
        toolTips.click();
        return new ToolTips(page);
    }

    public TabsPage openTabsPage() {
        tabs.click();
        return new TabsPage(page);
    }
}
