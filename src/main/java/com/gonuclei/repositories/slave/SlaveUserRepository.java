package com.gonuclei.repositories.slave;

import com.bizdirect.data.annotations.SlaveRepository;
import com.gonuclei.models.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
@SlaveRepository
public interface SlaveUserRepository extends JpaRepository<UserEntity,Long> {

 // boolean existsByEmailId(String emailId);
}
