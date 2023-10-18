package main_page.interactions;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import manager.BaseHelper;
import org.testng.Assert;

public class SelectablePage extends BaseHelper {
    public SelectablePage(Page page) {
        super(page);
    }

    private final Locator titleText = page.locator(BaseHelper.titleLocator);
    private final Locator listTab = page.locator("id=demo-tab-list");
    private final Locator gridTab = page.locator("id=demo-tab-grid");
    private final Locator crasJustoOdio = page.locator("'Cras justo odio'");
    private final Locator dapibusAcFacilisisin = page.locator("'Dapibus ac facilisis in'");
    private final Locator morbiLeoRisus = page.locator("'Morbi leo risus'");
    private final Locator portaAcConsecteturAc = page.locator("'Porta ac consectetur ac'");

    public SelectablePage titleTextIs(String text) {
        Assert.assertEquals(titleText.textContent(), text);
        return this;
    }

    public SelectablePage selectCrasJustoOdio() {
        crasJustoOdio.click();
        page.waitForCondition(() -> crasJustoOdio.getAttribute("class").equals("mt-2 list-group-item active list-group-item-action"));
        Assert.assertEquals(page.locator("//li[@class='mt-2 list-group-item active list-group-item-action']").textContent(), "Cras justo odio");
        return this;
    }
    public SelectablePage unSelectCrasJustoOdio(){
        crasJustoOdio.click();
        page.waitForCondition(()-> crasJustoOdio.getAttribute("class").equals("mt-2 list-group-item list-group-item-action"));
        Assert.assertEquals(crasJustoOdio.getAttribute("class"), "mt-2 list-group-item list-group-item-action");
        return this;
    }
}
