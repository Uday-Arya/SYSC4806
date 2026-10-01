package org.sysc4806.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressBook {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<BuddyInfo> buddyInfos =  new ArrayList<>();

    public AddressBook(List<BuddyInfo> buddyInfos) {
        this.buddyInfos = buddyInfos;
    }

    public void addBuddy(BuddyInfo info) {
        this.buddyInfos.add(info);
    }
    public List<BuddyInfo> getBuddies() {
        return buddyInfos;
    }

}
