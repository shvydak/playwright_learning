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
    private final Locator whatIsLoremIpsum = page.locator("//div[@class='card']").first();
    private final Locator whereDoesItComeFrom = page.locator("id=section2Heading");
    private final Locator whyDoWeUseIt = page.locator("id=section3Heading");
    private final Locator whatIsLoremIpsumText = page.locator("//div[@class='collapse show']").first();
    private final Locator whereDoesItComeFromText = page.locator("//div[@class='collapse']").nth(2);
    private final Locator whyDoWeUseItText = page.locator("//div[@class='collapse']").last();

    public AccordianPage titleTextIs(String text) {
        Assert.assertEquals(text, titleText.textContent());
        return new AccordianPage(page);
    }

    public AccordianPage whatIsLoremIpsumOpen(String text) {
        whatIsLoremIpsum.dblclick();
        String res = whatIsLoremIpsumText.textContent();
        Assert.assertTrue(whatIsLoremIpsumText.textContent().contains(text));
        return this;
    }


}
