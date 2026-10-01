package org.sysc4806.Main;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.sysc4806.Entity.AddressBook;
import org.sysc4806.Entity.BuddyInfo;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddressBookTest {
    List<BuddyInfo> info;
    AddressBook addressBook;

    @BeforeEach
    void setUp() {
        info = new ArrayList<>();
        info.add(new BuddyInfo("Buddy1", "6131234567"));
        info.add(new BuddyInfo("Buddy2", "6131234567"));
        info.add(new BuddyInfo("Buddy3", "6131234567"));
        info.add(new BuddyInfo("Buddy4", "6131234567"));
        info.add(new BuddyInfo("Buddy5", "6131234567"));
        addressBook = new AddressBook(info);
    }

    @AfterEach
    void tearDown() {
        info.clear();
        addressBook = null;
    }

    @Test
    void getInfo() {
        assertEquals(addressBook.getBuddyInfos(), info);
        assertEquals(addressBook.getBuddyInfos().get(2), info.get(2));
    }

    @Test
    void setInfo() {
        info.add(new BuddyInfo("Buddy6", "6131234567"));
        info.get(0).setName("Uday");
        addressBook.setBuddyInfos(info);
        assertEquals(addressBook.getBuddyInfos().get(5), info.get(5));
        assertEquals(6, addressBook.getBuddyInfos().size());
        assertEquals("Uday", addressBook.getBuddyInfos().get(0).getName());

    }
}
