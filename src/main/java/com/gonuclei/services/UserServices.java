package com.gonuclei.services;

import com.gonuclei.models.bo.UserBo;

public interface UserServices {
  String login(String name, String password);

  String signup(UserBo userBo) throws Exception;
}
