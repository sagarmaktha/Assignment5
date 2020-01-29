package com.gonuclei.models.dto;

public class AuthenticationResponse {
  private String jwt;

  public AuthenticationResponse(String jwt) {
    this.jwt = jwt;
  }

  public AuthenticationResponse() {
  }

  public String getJwt() {
    return jwt;
  }
}
