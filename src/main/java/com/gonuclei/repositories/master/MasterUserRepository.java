package com.gonuclei.repositories.master;

import com.bizdirect.data.annotations.MasterRepository;
import com.gonuclei.models.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
@MasterRepository
public interface MasterUserRepository extends JpaRepository<UserEntity,Long> {
}
