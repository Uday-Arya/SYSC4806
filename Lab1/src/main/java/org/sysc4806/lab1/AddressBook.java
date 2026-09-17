package org.sysc4806.lab1;

import java.util.List;

public class AddressBook {

    private List<BuddyInfo> info;
    public AddressBook(List<BuddyInfo> info) {
        this.info = info;
    }

    public List<BuddyInfo> getInfo() {
        return info;
    }

    public void setInfo(List<BuddyInfo> info) {
        this.info = info;
    }
}
