package org.sysc4806.Repository;

import org.springframework.data.repository.CrudRepository;
import org.sysc4806.Entity.AddressBook;

public interface AddressBookRepo extends CrudRepository<AddressBook, Long> {
}
