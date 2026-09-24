package org.sysc4806.lab2;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class AddressBook {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "AddressBook_ID")
    private List<BuddyInfo> info;

    public AddressBook() {
        this.id = null;
        this.info = new ArrayList<>();
    }

    public AddressBook(List<BuddyInfo> info) {
        this.info = info;
    }

    public List<BuddyInfo> getInfo() {
        return info;
    }

    public void setInfo(List<BuddyInfo> info) {
        this.info = info;
    }

    public void addBuddy(BuddyInfo info) {
        this.info.add(info);
    }
    public List<BuddyInfo> getBuddies() {
        return info;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void printInfo() {
        for (BuddyInfo buddyInfo : info) {
            System.out.println(buddyInfo.getName() +" : "+ buddyInfo.getPhoneNumber());
        }
    }
}
