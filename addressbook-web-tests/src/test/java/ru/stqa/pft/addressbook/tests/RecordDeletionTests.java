package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class RecordDeletionTests extends TestBase{

    @Test
    public void testRecordDeletion()
    {
        app.getRecordHelper().selectRecord();
        app.getRecordHelper().deleteRecord();
        app.wd.switchTo().alert().accept();
    }
}
