package com.gonuclei.repositories.master;

import com.bizdirect.data.annotations.MasterRepository;
import com.gonuclei.models.entities.NewspaperEntity;
import org.springframework.data.jpa.repository.JpaRepository;
@MasterRepository
public interface MasterNewspaperRepository extends JpaRepository<NewspaperEntity,Long> {
}
