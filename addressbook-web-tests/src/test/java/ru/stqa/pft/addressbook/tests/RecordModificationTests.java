package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.RecordData;

public class RecordModificationTests extends TestBase {

    @Test
    public void testRecordModification()
    {
        if (!app.getRecordHelper().isThereARecordEditElement())
        {
            app.getRecordHelper().createRecord(new RecordData("Vyacheslav", "Slava", "Narbekov", "spirit29", "QA", "VMedia", "Loginova 80-1", "+79210780445", "narbeckov.slava@yandex.ru"));
        }
        app.getRecordHelper().initRecordModification();
        app.getRecordHelper().fillInfoForm(new RecordData("Vasiliy", "Vasya", "Pupkin", "pupkin", "junior QA", "KartinaCanada", "Nab.Sev.Dviny 30", "88003535", "qwerty@mail.com"));
        app.getRecordHelper().submitRecordModification();
        app.getRecordHelper().returnToMainPage();
    }
}
