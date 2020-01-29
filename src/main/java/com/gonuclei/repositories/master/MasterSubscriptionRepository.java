package com.gonuclei.repositories.master;

import com.bizdirect.data.annotations.MasterRepository;
import com.gonuclei.models.entities.SubscriptionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
@MasterRepository
public interface MasterSubscriptionRepository extends JpaRepository<SubscriptionEntity,Long> {
}
