package tests.interactions;

import main_page.MainPage;
import main_page.interactions.SelectableListPage;
import manager.PlaywrightFactory;
import org.testng.annotations.*;

public class SelectableListTests extends PlaywrightFactory {
    @BeforeClass
    public void openSelectablePage() {
        new MainPage(page)
                .openInteractions()
                .openSelectablePage()
                .titleTextIs("Selectable");
        new SelectableListPage(page)
                .openListPage();
    }

    @BeforeMethod
    public void pageReload() {
        new SelectableListPage(page).reloadPage();
    }

    @Test
    public void selectTest() {
        new SelectableListPage(page)
                .selectCrasJustoOdio()
                .reloadPage();
    }

    @Test
    public void unselectCrasJustoOdio() {
        new SelectableListPage(page)
                .selectCrasJustoOdio()
                .unSelectCrasJustoOdio();
    }

    @Test
    public void selectDapibusAcFacilisisIn() {
        new SelectableListPage(page)
                .selectDapibusAcFacilisisin();
    }

    @Test
    public void unselectDapibusAcFacilisisIn() {
        new SelectableListPage(page)
                .selectDapibusAcFacilisisin()
                .unSelectDapibusAcFacilisisin();
    }

    @Test
    public void selectMorbiLeoRisus() {
        new SelectableListPage(page)
                .selectMorbiLeoRisus();
    }

    @Test
    public void unselectMorbiLeoRisus() {
        new SelectableListPage(page)
                .selectMorbiLeoRisus()
                .unSelectMorbiLeoRisus();
    }

    @Test
    public void selectPortaAcConsecteturAc() {
        new SelectableListPage(page)
                .selectportaAcConsecteturAc();
    }

    @Test
    public void unselectPortaAcConsecteturAc() {
        new SelectableListPage(page)
                .selectportaAcConsecteturAc()
                .unSelectPortaAcConsecteturAc();
    }

    @Test
    public void selectAll() {
        new SelectableListPage(page)
                .selectCrasJustoOdio()
                .selectDapibusAcFacilisisin()
                .selectMorbiLeoRisus()
                .selectportaAcConsecteturAc();
    }

    @Test
    public void unselectAll() {
        new SelectableListPage(page)
                .selectCrasJustoOdio()
                .selectDapibusAcFacilisisin()
                .selectMorbiLeoRisus()
                .selectportaAcConsecteturAc()
                .unSelectCrasJustoOdio()
                .unSelectDapibusAcFacilisisin()
                .unSelectMorbiLeoRisus()
                .unSelectPortaAcConsecteturAc();
    }
}
