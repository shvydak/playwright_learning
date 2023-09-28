package main_page.widgets;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import manager.BaseHelper;
import org.testng.Assert;


public class AccordianPage extends BaseHelper {
    public AccordianPage(Page page) {
        super(page);
    }

    private final Locator titleText = page.locator(BaseHelper.titleLocator);
    private final Locator whatIsLoremIpsum = page.locator("id=section1Heading");
    private final Locator whereDoesItComeFrom = page.locator("id=section2Heading");
    private final Locator whyDoWeUseIt = page.locator("id=section3Heading");
    private final Locator expandClass = page.locator("//div[@class='collapse show']");

    public AccordianPage titleTextIs(String text) {
        Assert.assertEquals(text, titleText.textContent());
        return new AccordianPage(page);
    }

    public AccordianPage whatIsLoremIpsumContainText(String text) {
        Assert.assertTrue(expand(whatIsLoremIpsum, expandClass).contains(text));
        return this;
    }

    public AccordianPage expandAll() {
        whatIsLoremIpsum.dblclick();
        page.waitForTimeout(1000);
        page.waitForCondition(() -> expandClass.getAttribute("class").equals("collapse show"));
        whereDoesItComeFrom.click();
        page.waitForTimeout(1000);
        page.waitForCondition(() -> expandClass.getAttribute("class").equals("collapse show"));
        whyDoWeUseIt.click();
        page.waitForTimeout(1000);
        page.waitForCondition(() -> expandClass.getAttribute("class").equals("collapse show"));
        return this;
    }

    private String expand(Locator button, Locator buttonText) {
        page.waitForTimeout(2000);
        button.dblclick();
        page.waitForTimeout(2000);
        return buttonText.textContent();
    }


}
