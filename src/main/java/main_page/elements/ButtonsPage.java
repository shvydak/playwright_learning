package main_page.elements;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.microsoft.playwright.options.MouseButton;
import manager.BaseHelper;
import org.testng.Assert;

public class ButtonsPage extends BaseHelper {
    public ButtonsPage(Page page) {
        super(page);
    }

    private final Locator titleText = page.locator(titleLocator);
    private final Locator doubleClickButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Double Click Me"));
    private final Locator rightClickMeButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Right Click Me"));
    private final Locator clickMeButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Click Me")).nth(2);
    private final Locator doubleClickMessage = page.locator("id=doubleClickMessage");
    private final Locator rightClickMeButtonMessage = page.locator("id=rightClickMessage");
    private final Locator clickMeButtonMessage = page.locator("id=dynamicClickMessage");

    public ButtonsPage titleTextIs(String text) {
        Assert.assertEquals(titleText.textContent(), text);
        return this;
    }

    public ButtonsPage doubleClickButtonClick() {
        doubleClickButton.dblclick();
        return this;
    }

    public ButtonsPage doubleClickMessageAppeared() {
        Assert.assertEquals(doubleClickMessage.textContent(), "You have done a double click");
        return this;
    }

    public ButtonsPage rightClickMeButtonClick() {
        rightClickMeButton.click(new Locator.ClickOptions().setButton(MouseButton.RIGHT));
        return this;
    }

    public ButtonsPage clickMeButtonClick() {
        clickMeButton.click();
        return this;
    }

    public ButtonsPage rightClickMeButtonMessageAppeared() {
        Assert.assertEquals(rightClickMeButtonMessage.textContent(), "You have done a right click");
        return this;
    }

    public ButtonsPage clickMeButtonMessageAppeared() {
        Assert.assertEquals(clickMeButtonMessage.textContent(), "You have done a dynamic click");
        return this;
    }
}
