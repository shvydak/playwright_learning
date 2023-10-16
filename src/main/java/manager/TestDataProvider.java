package manager;

import com.github.javafaker.Faker;
import models.PracticeFormModel;
import models.TextBoxData;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestDataProvider implements PracticeFormInterface {
    /////////////////// * * * TEXTBOX * * * ////////////////
    @DataProvider
    public Iterator<Object[]> textBox() {
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{new TextBoxData().setFullName(Faker.instance().name().fullName())
                .setEmail(Faker.instance().internet().emailAddress())
                .setCurrentAddress(Faker.instance().address().fullAddress())
                .setPermanentAddress(Faker.instance().address().secondaryAddress())});
        return list.iterator();
    }

    /////////////////// * * * SELECT * * * ////////////////
    @DataProvider
    public Iterator<Object[]> select() {
        List<Object[]> list = new ArrayList<>();
//        list.add(new Object[]{new Integer(3)});
        for (int i = 1; i <= 10; i++) {
            System.out.println("Print i -> " + i);
            list.add(new Object[]{new Integer(i)});
        }
        return list.iterator();
    }

    @DataProvider
    public Iterator<Object[]> selectValue() {
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{"Group 1, option 1"});
        list.add(new Object[]{"Group 1, option 2"});
        list.add(new Object[]{"Group 2, option 1"});
        list.add(new Object[]{"Group 2, option 2"});
        list.add(new Object[]{"A root option"});
        list.add(new Object[]{"Another root option"});
        return list.iterator();
    }

    @DataProvider
    public Iterator<Object[]> multiselectDropDown() {
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{new String[]{"Green"}});
        list.add(new Object[]{new String[]{"Green", "Blue"}});
        list.add(new Object[]{new String[]{"Green", "Blue", "Black"}});
        list.add(new Object[]{new String[]{"Green", "Blue", "Black", "Red"}});
        return list.iterator();
    }

    /////////////////// * * * PRACTICE FORM * * * ////////////////
    @DataProvider
    public Iterator<Object[]> practiceFormTests() {
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{PracticeFormModel
                .builder()
                .firstName(Faker.instance().name().firstName())
                .lastName(Faker.instance().name().lastName())
//                .email(Faker.instance().internet().emailAddress())
                .gender(MALE)
//                .mobileNumber(String.valueOf(Faker.instance().number().randomNumber(10, true)))
//                .subject(new String[]{"e"})
                .hobieSport(true)
//                .hobieReading(true)
//                .hobieMusic(true)
                .build()});
        list.add(new Object[]{PracticeFormModel
                .builder()
                .firstName(Faker.instance().name().firstName())
                .lastName(Faker.instance().name().lastName())
                .email(Faker.instance().internet().emailAddress())
                .gender(FEMALE)
                .mobileNumber(String.valueOf(Faker.instance().number().randomNumber(10, true)))
//                .subject(new String[]{"e"})
//                .hobieSport(true)
                .hobieReading(true)
//                .hobieMusic(true)
                .build()});
        list.add(new Object[]{PracticeFormModel
                .builder()
                .firstName(Faker.instance().name().firstName())
                .lastName(Faker.instance().name().lastName())
                .email(Faker.instance().internet().emailAddress())
                .gender(OTHER)
                .mobileNumber(String.valueOf(Faker.instance().number().randomNumber(10, true)))
//                .subject(new String[]{"e"})
//                .hobieSport(true)
//                .hobieReading(true)
                .hobieMusic(true)
                .build()});
        list.add(new Object[]{PracticeFormModel
                .builder()
                .firstName(Faker.instance().name().firstName())
                .lastName(Faker.instance().name().lastName())
                .email(Faker.instance().internet().emailAddress())
                .gender(OTHER)
                .mobileNumber(String.valueOf(Faker.instance().number().randomNumber(10, true)))
//                .subject(new String[]{"e"})
                .hobieSport(true)
                .hobieReading(true)
                .hobieMusic(true)
                .currentAddress(Faker.instance().address().fullAddress())
                .build()});
        return list.iterator();
    }
}
