package ru.stqa.pft.addressbook;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateNewRecordToBook extends TestBase{

  @Test
  public void testCreateNewRecordToBook() throws Exception {
    wd.findElement(By.linkText("add new")).click();
    fillInfoForm(new RecordData("Vyacheslav", "Slava", "Narbekov", "spirit29", "QA", "VMedia", "Loginova 80-1", "+79210780445", "narbeckov.slava@yandex.ru"));
    submitNewCreatedRecord();
    returnToMainPage();
  }

}
