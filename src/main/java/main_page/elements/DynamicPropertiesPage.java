package main_page.elements;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.microsoft.playwright.options.WaitForSelectorState;
import manager.BaseHelper;
import org.testng.Assert;

public class DynamicPropertiesPage extends BaseHelper {


    public DynamicPropertiesPage(Page page) {
        super(page);
    }

    private final Locator titleText = page.locator(BaseHelper.titleLocator);
    private final Locator enableAfter5Sec = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Will enable 5 seconds"));
    private final Locator colorChangeAfter5Sec = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Color Change"));
    private final Locator visibleAfter5Sec = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Visible After 5 Seconds"));

    public DynamicPropertiesPage titleTextIs(String text) {
        Assert.assertEquals(titleText.textContent(), text);
        return this;
    }

    public DynamicPropertiesPage waitWhenEnabled() {
        page.waitForTimeout(5000);
        Assert.assertTrue(enableAfter5Sec.isEnabled());
        return this;
    }

    public DynamicPropertiesPage refrashThePage() {
        page.reload();
        return this;
    }

    public DynamicPropertiesPage colorButton() {
        String res = colorChangeAfter5Sec.getAttribute("class");
        page.waitForCondition(() -> colorChangeAfter5Sec.getAttribute("class").equals("mt-4 text-danger btn btn-primary"));
        System.out.println("colorChangeAfter5Sec.getAttribute -> "+res);
        return this;
    }

    public DynamicPropertiesPage visibleAfter5SecAssert() {
        visibleAfter5Sec.waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        Assert.assertTrue(visibleAfter5Sec.isVisible());
        return this;
    }

}
