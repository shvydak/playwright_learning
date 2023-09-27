package manager;

import com.github.javafaker.Faker;
import models.TextBoxData;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestDataProvider {
    @DataProvider
    public Iterator<Object[]> textBox() {
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{new TextBoxData().setFullName(Faker.instance().name().fullName())
                .setEmail(Faker.instance().internet().emailAddress())
                .setCurrentAddress(Faker.instance().address().fullAddress())
                .setPermanentAddress(Faker.instance().address().secondaryAddress())});
        return list.iterator();
    }

    @DataProvider // ??? TO REMOVE
    public Iterator<Object[]> select() {
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{new String("3")});
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Print i -> " + i);
//            list.add(new Object[]{i + ""});
//        }
        return list.iterator();
    }
}
