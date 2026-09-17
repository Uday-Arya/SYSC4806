package org.sysc4806.lab1tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.sysc4806.lab1.BuddyInfo;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BuddyInfoTest {

    List<BuddyInfo> info;

    @BeforeEach
    void setUp() {
        info = new ArrayList<>();
        info.add(new BuddyInfo("Buddy1", "6131234567"));
        info.add(new BuddyInfo("Buddy2", "6131234567"));
        info.add(new BuddyInfo("Buddy3", "6131234567"));
        info.add(new BuddyInfo("Buddy4", "6131234567"));
        info.add(new BuddyInfo("Buddy5", "6131234567"));
    }

    @AfterEach
    void tearDown() {
        info.clear();
    }

    @Test
    void getName() {
        assertEquals("Buddy2", info.get(1).getName());
    }

    @Test
    void setName() {
        info.get(1).setName("Uday");
        assertEquals("Uday", info.get(1).getName());
    }

    @Test
    void getPhoneNumber() {
        assertEquals("6131234567", info.get(2).getPhoneNumber());
    }

    @Test
    void setPhoneNumber() {
        info.get(2).setPhoneNumber("1234567890");
        assertEquals("1234567890", info.get(2).getPhoneNumber());
    }
}