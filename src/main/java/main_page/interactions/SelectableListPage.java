package main_page.interactions;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import manager.BaseHelper;
import org.testng.Assert;

public class SelectableListPage extends BaseHelper {
    public SelectableListPage(Page page) {
        super(page);
    }

    private final Locator titleText = page.locator(BaseHelper.titleLocator);
    private final Locator listTab = page.locator("id=demo-tab-list");
    private final Locator gridTab = page.locator("id=demo-tab-grid");
    private final Locator crasJustoOdio = page.locator("'Cras justo odio'");
    private final Locator dapibusAcFacilisisin = page.locator("'Dapibus ac facilisis in'");
    private final Locator morbiLeoRisus = page.locator("'Morbi leo risus'");
    private final Locator portaAcConsecteturAc = page.locator("'Porta ac consectetur ac'");

    public SelectableListPage titleTextIs(String text) {
        Assert.assertEquals(titleText.textContent(), text);
        return this;
    }

    public SelectableListPage openListPage() {
        listTab.click();
        return this;
    }

    public SelectableGridPage openGridPage() {
        gridTab.click();
        return new SelectableGridPage(page);
    }

    public SelectableListPage selectCrasJustoOdio() {
        crasJustoOdio.click();
        page.waitForCondition(() -> crasJustoOdio.getAttribute("class").equals("mt-2 list-group-item active list-group-item-action"));
        return this;
    }

    public SelectableListPage unSelectCrasJustoOdio() {
        crasJustoOdio.click();
        page.waitForCondition(() -> crasJustoOdio.getAttribute("class").equals("mt-2 list-group-item list-group-item-action"));
        return this;
    }

    public SelectableListPage selectDapibusAcFacilisisin() {
        dapibusAcFacilisisin.click();
        page.waitForCondition(() -> dapibusAcFacilisisin.getAttribute("class").equals("mt-2 list-group-item active list-group-item-action"));
        return this;
    }

    public SelectableListPage unSelectDapibusAcFacilisisin() {
        dapibusAcFacilisisin.click();
        page.waitForCondition(() -> dapibusAcFacilisisin.getAttribute("class").equals("mt-2 list-group-item list-group-item-action"));
        return this;
    }

    public SelectableListPage selectMorbiLeoRisus() {
        morbiLeoRisus.click();
        page.waitForCondition(() -> morbiLeoRisus.getAttribute("class").equals("mt-2 list-group-item active list-group-item-action"));
        return this;
    }

    public SelectableListPage unSelectMorbiLeoRisus() {
        morbiLeoRisus.click();
        page.waitForCondition(() -> morbiLeoRisus.getAttribute("class").equals("mt-2 list-group-item list-group-item-action"));
        return this;
    }

    public SelectableListPage selectportaAcConsecteturAc() {
        portaAcConsecteturAc.click();
        page.waitForCondition(() -> portaAcConsecteturAc.getAttribute("class").equals("mt-2 list-group-item active list-group-item-action"));
        return this;
    }

    public SelectableListPage unSelectPortaAcConsecteturAc() {
        portaAcConsecteturAc.click();
        page.waitForCondition(() -> portaAcConsecteturAc.getAttribute("class").equals("mt-2 list-group-item list-group-item-action"));
        return this;
    }
}
