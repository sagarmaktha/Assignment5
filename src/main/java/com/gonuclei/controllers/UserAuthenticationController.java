package com.gonuclei.controllers;

import com.gonuclei.mapper.UserMapper;
import com.gonuclei.models.dto.AuthenticationRequest;
import com.gonuclei.models.dto.AuthenticationResponse;
import com.gonuclei.models.dto.SignUpRequest;
import com.gonuclei.security.JwtUtil;
import com.gonuclei.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/users")
public class UserAuthenticationController {
  @Autowired
  UserServices userServices;

  @Autowired
  JwtUtil jwtUtil;

  @Autowired
  UserMapper userMapper;

  @PostMapping(path = "/authenticate")
  private ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest){
    final String jwt;
    jwt = userServices
      .login(authenticationRequest.getName(), authenticationRequest.getPassword());
    return ResponseEntity.ok(new AuthenticationResponse(jwt));
  }

  @PostMapping(path = "/signup")
  private ResponseEntity<?> signup(@RequestBody SignUpRequest user) throws Exception{
    return ResponseEntity.ok(userServices.signup(userMapper.userRequestToUserBo(user)));

  }
}
