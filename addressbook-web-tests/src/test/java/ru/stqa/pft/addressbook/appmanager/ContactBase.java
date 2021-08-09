package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactBase {

    WebDriver wd;

    public ContactBase(WebDriver wd) {
        this.wd = wd;
    }

    protected void click(By locator) {
        wd.findElement(locator).click();
    }

    protected void email(ContactData contactData) {
        firstName(By.name("email"), contactData.getEmail());
    }

    protected void home(ContactData contactData) {
        firstName(By.name("home"), contactData.getHomePhone());
    }

    protected void lastName(ContactData contactData) {
        firstName(By.name("lastname"), contactData.getLastName());
    }

    protected void midleName(ContactData contactData) {
        firstName(By.name("middlename"), contactData.getMiddleName());
    }

    protected void firstName(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

}
