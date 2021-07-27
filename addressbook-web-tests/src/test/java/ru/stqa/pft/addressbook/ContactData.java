package ru.stqa.pft.addressbook;

public class ContactData {
    private final String firstname;
    private final String middlename;
    private final String lastname;
    private final String home;
    private final String email;





    public ContactData(String firstname, String middlename, String lastname, String home, String email) {
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.home = home;
        this.email = email;

    }

    public String getFirstName() {
        return firstname;
    }
    public String getMiddleName() {
        return middlename;
    }
    public String getLastName() {
        return lastname;
    }

    public String getHomePhone() {
        return home;
    }
    public String getEmail() {
        return email;
    }

}
