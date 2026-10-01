package org.sysc4806;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.sysc4806.Entity.AddressBook;
import org.sysc4806.Entity.BuddyInfo;
import org.sysc4806.Repository.AddressBookRepo;
import org.sysc4806.Repository.BuddyInfoRepo;

@Slf4j
@SpringBootApplication
public class Lab3Application {

	private static final Logger logger = LoggerFactory.getLogger(Lab3Application.class);


	public static void main(String[] args) {
		SpringApplication.run(Lab3Application.class, args);
	}

	@Bean
	@Order(1)
	public CommandLineRunner buddyTest(BuddyInfoRepo buddyInfoRepo) {
		return (args) -> {
			buddyInfoRepo.save(new BuddyInfo("Buddy1", "6131234567"));
			buddyInfoRepo.save(new BuddyInfo("Buddy2", "6131234567"));

			logger.info("Buddies found with findAll():");
			logger.info(buddyInfoRepo.findAll().toString());
		};
	}

	@Bean
	@Order(2)
	public CommandLineRunner addressBookTest(AddressBookRepo addressBookRepo) {
		return (args) -> {

			AddressBook addressBook = new AddressBook();
			addressBook.addBuddy(new BuddyInfo("Buddy3", "6131234567"));
			addressBook.addBuddy(new BuddyInfo("Buddy4", "6131234567"));
			addressBook.addBuddy(new BuddyInfo("Buddy5", "6131234567"));

			addressBookRepo.save(addressBook);

			logger.info("AddressBooks found with findAll():");
			logger.info(addressBookRepo.findAll().toString());

		};
	}
}
