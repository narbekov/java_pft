package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.RecordData;

public class CreateNewRecordToBook extends TestBase{

  @Test
  public void testCreateNewRecordToBook() throws Exception {
    app.initRecordCreation();
    app.fillInfoForm(new RecordData("Vyacheslav", "Slava", "Narbekov", "spirit29", "QA", "VMedia", "Loginova 80-1", "+79210780445", "narbeckov.slava@yandex.ru"));
    app.submitNewCreatedRecord();
    app.returnToMainPage();
  }

}
