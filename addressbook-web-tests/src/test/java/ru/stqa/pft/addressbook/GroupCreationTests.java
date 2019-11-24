package ru.stqa.pft.addressbook;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase{

  @Test
  public void testGroupCreation() throws Exception {
    gotoGroupPage();
    wd.findElement(By.name("new")).click();
    initGroupCreation();
    fillGroupForm(new GroupData("test", "test1", "test2"));
    submitGroupCreation();
    returnToGroupPage();
  }

}
