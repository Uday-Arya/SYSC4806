package org.sysc4806.lab2;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main() {
        persist();
    }

    static void persist(){

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-persistence");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        em.persist(new BuddyInfo("Buddy1", "6131234567"));
        em.persist(new BuddyInfo("Buddy2", "6131234567"));

        tx.commit();

        Query q = em.createQuery("select b from BuddyInfo b");
        List<BuddyInfo> buddyList = q.getResultList();
        for (BuddyInfo b : buddyList){
            System.out.println(b.getId() +" : "+ b.getName() +" : "+ b.getPhoneNumber());
        }

        tx.begin();
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(new BuddyInfo("Buddy3", "6131234567"));
        addressBook.addBuddy(new BuddyInfo("Buddy4", "6131234567"));
        addressBook.addBuddy(new BuddyInfo("Buddy5", "6131234567"));
        em.persist(addressBook);
        tx.commit();

        AddressBook persistedBook = em.find(AddressBook.class, addressBook.getId());
        for(int i = 0; i < persistedBook.getBuddies().size(); i++){
            System.out.println(persistedBook.getBuddies().get(i).getId() +" : "+ persistedBook.getBuddies().get(i).getName() +" : "+ persistedBook.getBuddies().get(i).getPhoneNumber());
        }


    }
}
