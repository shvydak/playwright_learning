package tests.interactions;

import main_page.MainPage;
import main_page.interactions.SelectablePage;
import manager.PlaywrightFactory;
import org.testng.annotations.*;

public class SelectableTests extends PlaywrightFactory {
    @BeforeClass
    public void openSelectablePage() {
        new MainPage(page)
                .openInteractions()
                .openSelectablePage()
                .titleTextIs("Selectable");
    }

    @BeforeMethod
    public void pageReload() {
        new SelectablePage(page).reloadPage();
    }

    @Test
    public void selectTest() {
        new SelectablePage(page)
                .selectCrasJustoOdio()
                .reloadPage();
    }

    @Test
    public void unselectCrasJustoOdio() {
        new SelectablePage(page)
                .selectCrasJustoOdio()
                .unSelectCrasJustoOdio();
    }

    @Test
    public void selectDapibusAcFacilisisIn() {
        new SelectablePage(page)
                .selectDapibusAcFacilisisin();
    }

    @Test
    public void unselectDapibusAcFacilisisIn() {
        new SelectablePage(page)
                .selectDapibusAcFacilisisin()
                .unSelectDapibusAcFacilisisin();
    }

    @Test
    public void selectMorbiLeoRisus() {
        new SelectablePage(page)
                .selectMorbiLeoRisus();
    }

    @Test
    public void unselectMorbiLeoRisus() {
        new SelectablePage(page)
                .selectMorbiLeoRisus()
                .unSelectMorbiLeoRisus();
    }

    @Test
    public void selectPortaAcConsecteturAc() {
        new SelectablePage(page)
                .selectportaAcConsecteturAc();
    }

    @Test
    public void unselectPortaAcConsecteturAc() {
        new SelectablePage(page)
                .selectportaAcConsecteturAc()
                .unSelectPortaAcConsecteturAc();
    }

    @Test
    public void selectAll() {
        new SelectablePage(page)
                .selectCrasJustoOdio()
                .selectDapibusAcFacilisisin()
                .selectMorbiLeoRisus()
                .selectportaAcConsecteturAc();
    }

    @Test
    public void unselectAll() {
        new SelectablePage(page)
                .selectCrasJustoOdio()
                .selectDapibusAcFacilisisin()
                .selectMorbiLeoRisus()
                .selectportaAcConsecteturAc()
                .unSelectCrasJustoOdio()
                .unSelectDapibusAcFacilisisin()
                .unSelectMorbiLeoRisus()
                .unSelectPortaAcConsecteturAc();
    }

    @AfterClass
    public void goToMainPage() {
        new MainPage(page)
                .goToMainPage();
    }
}
