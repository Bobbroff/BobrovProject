package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends ContactBase {

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void submitContactCreation(String submit) {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void fillContactForm(ContactData contactData) {
        firstName(By.name("firstname"), contactData.getFirstName());
        midleName(contactData);
        lastName(contactData);
        home(contactData);
        email(contactData);
    }

    public void gotoAddNewContact(String s) {
        click(By.linkText(s));
    }
}
