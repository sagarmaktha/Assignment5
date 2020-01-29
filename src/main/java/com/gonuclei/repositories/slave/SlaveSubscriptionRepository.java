package com.gonuclei.repositories.slave;

import com.bizdirect.data.annotations.SlaveRepository;
import com.gonuclei.models.entities.SubscriptionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
@SlaveRepository
public interface SlaveSubscriptionRepository extends JpaRepository<SubscriptionEntity,Long> {
}
