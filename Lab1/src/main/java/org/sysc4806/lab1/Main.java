package org.sysc4806.lab1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main() {
        List<BuddyInfo> info = new ArrayList<>();
        info.add(new BuddyInfo("Buddy1", "6131234567"));
        info.add(new BuddyInfo("Buddy2", "6131234567"));
        info.add(new BuddyInfo("Buddy3", "6131234567"));
        info.add(new BuddyInfo("Buddy4", "6131234567"));
        info.add(new BuddyInfo("Buddy5", "6131234567"));
        AddressBook addressBook = new AddressBook(info);
        addressBook.printInfo();

    }
}
