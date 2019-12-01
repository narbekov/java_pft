package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.RecordData;

public class RecordDeletionTests extends TestBase{

    @Test
    public void testRecordDeletion()
    {
        if (!app.getRecordHelper().isThereARecord())
        {
            app.getRecordHelper().createRecord(new RecordData("Vyacheslav", "Slava", "Narbekov", "spirit29", "QA", "VMedia", "Loginova 80-1", "+79210780445", "narbeckov.slava@yandex.ru", "test1"),true);
        }
        app.getRecordHelper().selectRecord();
        app.getRecordHelper().deleteRecord();
        app.wd.switchTo().alert().accept();
    }
}
