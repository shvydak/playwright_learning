package main_page.widgets;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import com.microsoft.playwright.options.AriaRole;
import manager.BaseHelper;
import org.testng.Assert;

public class ToolTips extends BaseHelper {
    public ToolTips(Page page) {
        super(page);
    }

    private final Locator titleText = page.locator(BaseHelper.titleLocator);
    private final Locator hoverMeToSeeButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Hover me to see"));
    private final Locator hoverMeToSeeInput = page.locator("id=toolTipTextField");
    private final Locator contrary = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Contrary"));
    private final Locator date = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("1.10.32"));

    public ToolTips titleTextIs(String text) {
        Assert.assertEquals(titleText.textContent(), text);
        return this;
    }

    public ToolTips hoverMeToSeeButtonHoverTextContains(String text) {
        hoverMeToSeeButton.hover();
        page.waitForCondition(() -> page.locator(".tooltip-inner").isVisible());
        Assert.assertEquals(page.locator(".tooltip-inner").textContent(), text);
        page.reload();
        return this;
    }

    public ToolTips hoverMeToSeeInputHoverTextContains(String text) {
        hoverMeToSeeInput.hover();
        page.waitForCondition(() -> page.locator(".tooltip-inner").isVisible());
        Assert.assertEquals(page.locator(".tooltip-inner").textContent(), text);
        page.reload();
        return this;
    }

    public ToolTips hoverMeToSeeContraryHoverTextContains(String text) {
        contrary.hover();
        page.waitForCondition(() -> page.locator(".tooltip-inner").isVisible());
        Assert.assertEquals(page.locator(".tooltip-inner").textContent(), text);
        page.reload();
        return this;
    }

    public ToolTips hoverMeToSeeDateHoverTextContains(String text) {
        date.hover();
        page.waitForCondition(() -> page.locator(".tooltip-inner").isVisible());
        Assert.assertEquals(page.locator(".tooltip-inner").textContent(), text);
        page.reload();
        return this;
    }
}
