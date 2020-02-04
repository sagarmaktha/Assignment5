package com.gonuclei.transactionService;

import com.gonuclei.mapper.UserMapper;
import com.gonuclei.models.bo.UserBo;
import com.gonuclei.models.entities.UserEntity;
import com.gonuclei.repositories.master.MasterUserRepository;
import com.gonuclei.repositories.slave.SlaveUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserTransaction {

  @Autowired
  MasterUserRepository masterUserRepository;

  @Autowired
  SlaveUserRepository slaveUserRepository;

  @Autowired
  UserMapper userMapper;

  public boolean signupTransaction(UserBo userBo) {
    UserEntity userEntity = userMapper.userBoToUserEntity(userBo);
    if (!slaveUserRepository.existsBymail(userEntity.getMail())) {
      masterUserRepository.save(userEntity);
      return true;
    } else {
      return false;
    }
   }

  }

