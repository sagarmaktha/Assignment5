package com.gonuclei.services.implementation;

import com.gonuclei.models.bo.UserBo;
import com.gonuclei.security.JwtUtil;
import com.gonuclei.services.UserServices;
import com.gonuclei.transactionService.UserTransaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

@Service
public class UserServicesImplementation implements UserServices {

  private static final Logger LOGGER = LoggerFactory.getLogger(UserServicesImplementation.class);

  @Autowired
  AuthenticationManager authenticationManager;

  @Autowired
  JwtUtil jwtUtil;

  @Autowired
  UserTransaction userTransaction;

  @Override
  public String login(String username, String password) {
    try {
      authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username,
        password));

      return jwtUtil.generateToken(username);
    } catch (BadCredentialsException e) {
      LOGGER.error("Incorrect user name password! " + e);
    }
    return null;
  }

  public String signup(UserBo userBo) throws Exception{
    if (userTransaction.signupTransaction(userBo)) {
      return jwtUtil.generateToken(userBo.getEmailId());
    } else {
      throw new Exception("Username is already in use");
    }
  }


}
