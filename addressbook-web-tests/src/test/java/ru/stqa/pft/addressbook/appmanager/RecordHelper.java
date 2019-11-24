package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.RecordData;

public class RecordHelper {
    private WebDriver wd;

    public RecordHelper(WebDriver wd) {
        this.wd = wd;
    }

    public void initRecordCreation()
    {
        wd.findElement(By.linkText("add new")).click();
    }

    public void submitNewCreatedRecord() {
      wd.findElement(By.xpath("(//input[@name='submit'])[2]")).click();
    }

    public void fillInfoForm(RecordData recordData) {
      wd.findElement(By.name("firstname")).click();
      wd.findElement(By.name("firstname")).clear();
      wd.findElement(By.name("firstname")).sendKeys(recordData.getFirstname());
      wd.findElement(By.name("middlename")).clear();
      wd.findElement(By.name("middlename")).sendKeys(recordData.getMiddlename());
      wd.findElement(By.name("lastname")).clear();
      wd.findElement(By.name("lastname")).sendKeys(recordData.getLastname());
      wd.findElement(By.name("nickname")).clear();
      wd.findElement(By.name("nickname")).sendKeys(recordData.getNickname());
      wd.findElement(By.name("title")).clear();
      wd.findElement(By.name("title")).sendKeys(recordData.getTitle());
      wd.findElement(By.name("company")).clear();
      wd.findElement(By.name("company")).sendKeys(recordData.getCompany());
      wd.findElement(By.name("address")).clear();
      wd.findElement(By.name("address")).sendKeys(recordData.getAddress());
      wd.findElement(By.name("mobile")).clear();
      wd.findElement(By.name("mobile")).sendKeys(recordData.getMobile());
      wd.findElement(By.name("email")).click();
      wd.findElement(By.name("email")).clear();
      wd.findElement(By.name("email")).sendKeys(recordData.getEmail());
    }

    public void returnToMainPage() {
        wd.findElement(By.linkText("home page")).click();
    }
}
