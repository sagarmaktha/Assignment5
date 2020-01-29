package com.gonuclei.repositories.slave;

import com.bizdirect.data.annotations.SlaveRepository;
import com.gonuclei.models.entities.NewspaperEntity;
import org.springframework.data.jpa.repository.JpaRepository;

@SlaveRepository
public interface SlaveNewspaperRepository extends JpaRepository<NewspaperEntity,Long> {

}
