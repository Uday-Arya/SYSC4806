package org.sysc4806.lab1;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private List<BuddyInfo> info =  new ArrayList<>();
    public AddressBook(List<BuddyInfo> info) {
        this.info = info;
    }

    public void printInfo() {
        for (BuddyInfo buddyInfo : info) {
            System.out.println(buddyInfo.getName() +" : "+ buddyInfo.getPhoneNumber());

        }
    }

    public List<BuddyInfo> getInfo() {
        return info;
    }

    public void setInfo(List<BuddyInfo> info) {
        this.info = info;
    }
}
