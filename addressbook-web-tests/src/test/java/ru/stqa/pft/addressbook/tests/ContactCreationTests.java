package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;
import ru.stqa.pft.addressbook.model.ContactData;

import static org.testng.AssertJUnit.fail;

public class ContactCreationTests extends TestBase {


    @Test
    public void testContactCreation() throws Exception {
        app.getContactHelper().gotoAddNewContact("add new");
        app.getContactHelper().fillContactForm(new ContactData("Mikhail", "Bobrov", "Bobrovich", "1231231414", "mail@mail.ru"));
        app.getContactHelper().submitContactCreation("submit");
        app.getContactHelper().gotoAddNewContact("home");
    }
}


