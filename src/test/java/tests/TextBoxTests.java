package tests;

import manager.PlaywrightFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.TextBox;


public class TextBoxTests extends PlaywrightFactory {
    @BeforeClass(description = "TB - 0001")
    public void preconditions() {
        new MainPage(page)
                .openElements()
                .openTextBox()
                .titleTextIs("Text Box");
    }

    @Test
    public void test1() {
        new TextBox(page)
                .submitWebForm("Adarea","asd@asd.com","Haifa","Israel");
//                .outputText();

    }
    @Test
    public void nothing(){
        
    }


}
