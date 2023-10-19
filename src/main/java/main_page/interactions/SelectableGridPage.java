package main_page.interactions;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import manager.BaseHelper;
import manager.PlaywrightFactory;

public class SelectableGridPage extends BaseHelper {
    public SelectableGridPage(Page page) {
        super(page);
    }

    private final Locator one = page.getByText("One");
    private final Locator two = page.getByText("Two");
    private final Locator three = page.getByText("Three");
    private final Locator four = page.getByText("Four");
    private final Locator five = page.getByText("Five");
    private final Locator six = page.getByText("Six");
    private final Locator seven = page.getByText("Seven");
    private final Locator eight = page.getByText("Eight");
    private final Locator nine = page.getByText("Nine");

    public SelectableGridPage selectOne() {
        one.click();
        page.waitForCondition(() -> one.getAttribute("class").equals("list-group-item active list-group-item-action"));
        return this;
    }

    public SelectableGridPage unselectOne() {
        one.click();
        page.waitForCondition(() -> one.getAttribute("class").equals("list-group-item list-group-item-action"));
        return this;
    }

    public SelectableGridPage selectTwo() {
        two.click();
        page.waitForCondition(() -> two.getAttribute("class").equals("list-group-item active list-group-item-action"));
        return this;
    }

    public SelectableGridPage unselectTwo() {
        two.click();
        page.waitForCondition(() -> two.getAttribute("class").equals("list-group-item list-group-item-action"));
        return this;
    }

    public SelectableGridPage selectThree() {
        three.click();
        page.waitForCondition(() -> three.getAttribute("class").equals("list-group-item active list-group-item-action"));
        return this;
    }

    public SelectableGridPage unselectThree() {
        three.click();
        page.waitForCondition(() -> three.getAttribute("class").equals("list-group-item list-group-item-action"));
        return this;
    }

    public SelectableGridPage selectFour() {
        four.click();
        page.waitForCondition(() -> four.getAttribute("class").equals("list-group-item active list-group-item-action"));
        return this;
    }

    public SelectableGridPage unselectFour() {
        four.click();
        page.waitForCondition(() -> four.getAttribute("class").equals("list-group-item list-group-item-action"));
        return this;
    }

    public SelectableGridPage selectFive() {
        five.click();
        page.waitForCondition(() -> five.getAttribute("class").equals("list-group-item active list-group-item-action"));
        return this;
    }

    public SelectableGridPage unselectFive() {
        five.click();
        page.waitForCondition(() -> five.getAttribute("class").equals("list-group-item list-group-item-action"));
        return this;
    }

    public SelectableGridPage selectSix() {
        six.click();
        page.waitForCondition(() -> six.getAttribute("class").equals("list-group-item active list-group-item-action"));
        return this;
    }

    public SelectableGridPage unselectSix() {
        six.click();
        page.waitForCondition(() -> six.getAttribute("class").equals("list-group-item list-group-item-action"));
        return this;
    }

    public SelectableGridPage selectSeven() {
        seven.click();
        page.waitForCondition(() -> seven.getAttribute("class").equals("list-group-item active list-group-item-action"));
        return this;
    }

    public SelectableGridPage unselectSeven() {
        seven.click();
        page.waitForCondition(() -> seven.getAttribute("class").equals("list-group-item list-group-item-action"));
        return this;
    }

    public SelectableGridPage selectEight() {
        eight.click();
        page.waitForCondition(() -> eight.getAttribute("class").equals("list-group-item active list-group-item-action"));
        return this;
    }

    public SelectableGridPage unselectEight() {
        eight.click();
        page.waitForCondition(() -> eight.getAttribute("class").equals("list-group-item list-group-item-action"));
        return this;
    }

    public SelectableGridPage selectNine() {
        nine.click();
        page.waitForCondition(() -> nine.getAttribute("class").equals("list-group-item active list-group-item-action"));
        return this;
    }

    public SelectableGridPage unselectNine() {
        nine.click();
        page.waitForCondition(() -> nine.getAttribute("class").equals("list-group-item list-group-item-action"));
        return this;
    }
}

