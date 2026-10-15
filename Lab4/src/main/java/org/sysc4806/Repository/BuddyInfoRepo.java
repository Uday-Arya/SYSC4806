package org.sysc4806.Repository;

import org.springframework.data.repository.CrudRepository;
import org.sysc4806.Entity.BuddyInfo;

public interface BuddyInfoRepo extends CrudRepository<BuddyInfo, Long> {
}
