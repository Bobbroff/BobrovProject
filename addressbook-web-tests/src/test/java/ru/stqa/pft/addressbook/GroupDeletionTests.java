package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {


  @Test
  public void testGroupDelition() throws Exception {
    gotoGroupPage();
    selectGroup("selected[]");
    deleteSelectedGroups();
    returnToGroupPage("group page");
  }


}
