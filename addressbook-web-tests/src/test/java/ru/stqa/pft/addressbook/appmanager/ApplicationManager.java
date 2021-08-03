package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    protected WebDriver wd;

    private SessionHelper sessionhelper;
    private  NavigationHelper navigationHelper;
    private GroupHelper groupHelper ;
    private ContactHelper contactHelper;

    public void init() {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wd.get("https://localhost/addressbook/");
        navigationHelper = new NavigationHelper(wd);
        groupHelper = new GroupHelper(wd);
        sessionhelper = new SessionHelper(wd);
        contactHelper = new ContactHelper(wd);
        sessionhelper.login("admin", "secret");
    }

    public void stop() {
        wd.quit();
    }

    public boolean isElementPresent(By by) {
      try {
        wd.findElement(by);
        return true;
      } catch (NoSuchElementException e) {
        return false;
      }
    }



    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }
}
