package com.gonuclei.repositories.slave;

import com.bizdirect.data.annotations.SlaveRepository;
import com.gonuclei.models.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
@SlaveRepository
public interface SlaveUserRepository extends JpaRepository<UserEntity,Long> {
    boolean existsBymail(String mail);

  Optional<UserEntity> findBymail(String name);
}
