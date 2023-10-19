package tests.interactions;

import main_page.MainPage;
import main_page.interactions.SelectableGridPage;
import main_page.interactions.SelectableListPage;
import manager.PlaywrightFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectableGridTests extends PlaywrightFactory {
    @BeforeClass
    public void openSelectableGridPage() {
        new MainPage(page)
                .openInteractions()
                .openSelectablePage();
    }

    @BeforeMethod
    public void openGridPage() {
        new SelectableListPage(page)
                .openGridPage();
    }

    @Test
    public void selectOne() {
        new SelectableGridPage(page)
                .selectOne();
    }

    @Test
    public void unselectOne() {
        new SelectableGridPage(page)
                .selectOne()
                .unselectOne();
    }

    @Test
    public void selectUnselectAll() {
        new SelectableGridPage(page)
                .selectOne()
                .selectTwo()
                .selectThree()
                .selectFour()
                .selectFive()
                .selectSix()
                .selectSeven()
                .selectEight()
                .selectNine()
                .unselectOne()
                .unselectTwo()
                .unselectThree()
                .unselectFour()
                .unselectFive()
                .unselectSix()
                .unselectSeven()
                .unselectEight()
                .unselectNine();
    }

    @Test
    public void selectUnselectAll2() {
        new SelectableGridPage(page)
                .selectOne()
                .selectTwo()
                .selectThree()
                .selectFour()
                .selectFive()
                .selectSix()
                .selectSeven()
                .selectEight()
                .selectNine()
                .unselectNine()
                .unselectEight()
                .unselectSeven()
                .unselectSix()
                .unselectFive()
                .unselectFour()
                .unselectThree()
                .unselectTwo()
                .unselectOne()
                .selectOne()
                .selectTwo()
                .selectThree()
                .selectFour()
                .selectFive()
                .selectSix()
                .selectSeven()
                .selectEight()
                .selectNine()
                .unselectNine()
                .unselectEight()
                .unselectSeven()
                .unselectSix()
                .unselectFive()
                .unselectFour()
                .unselectThree()
                .unselectTwo()
                .unselectOne();
    }

    @AfterMethod
    public void reload() {
        new SelectableGridPage(page)
                .reloadPage();
    }
}
