package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.RecordData;

public class RecordHelper extends HelperBase {

    public RecordHelper(WebDriver wd) {
        super(wd);
    }

    public void initRecordCreation()
    {
        click(By.linkText("add new"));
    }

    public void submitNewCreatedRecord() {

        click(By.xpath("(//input[@name='submit'])[2]"));
    }

    public void fillInfoForm(RecordData recordData) {
      type(By.name("firstname"),recordData.getFirstname());
      type(By.name("middlename"),recordData.getMiddlename());
      type(By.name("lastname"),recordData.getLastname());
      type(By.name("nickname"),recordData.getNickname());
      type(By.name("title"),recordData.getTitle());
      type(By.name("company"),recordData.getCompany());
      type(By.name("address"),recordData.getAddress());
      type(By.name("mobile"),recordData.getMobile());
      type(By.name("email"),recordData.getEmail());
    }

    public void returnToMainPage() {

        click(By.linkText("home page"));
    }

    public void selectRecord() {
        click(By.name("selected[]"));
    }

    public void deleteRecord() {
        click(By.xpath("//input[@value='Delete']"));
    }

    public void initRecordModification() {
        click(By.xpath("//img[@alt='Edit']"));
    }

    public void submitRecordModification() {
        click(By.xpath("//input[@name='update']"));
    }
}
