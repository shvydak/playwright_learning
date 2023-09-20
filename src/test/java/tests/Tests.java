package tests;

import manager.PlaywrightFactory;
import org.testng.annotations.Test;
import pages.MainPage;


public class Tests extends PlaywrightFactory {
    @Test
    public void test1() {
        new MainPage(page)
                .openElements()
                .openTextBox();

    }

    @Test
    public void test2() {
        new MainPage(page)
                .openBookStore();
    }

}
