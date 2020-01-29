package com.gonuclei.mapper;

import com.gonuclei.models.bo.UserBo;
import com.gonuclei.models.dto.SignUpRequest;
import com.gonuclei.models.entities.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

  UserEntity userBoToUserEntity(UserBo userBo);
  UserBo userRequestToUserBo(SignUpRequest signUpRequest);
}
