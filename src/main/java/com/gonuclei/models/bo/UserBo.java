package com.gonuclei.models.bo;

public class UserBo {
  private Long id;
  private String emailId;
  private String name;
  private String password;

  public UserBo(Long id, String emailId, String name, String password) {
    this.id = id;
    this.emailId = emailId;
    this.name = name;
    this.password = password;
  }

  public UserBo() {
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setEmailId(String emailId) {
    this.emailId = emailId;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Long getId() {
    return id;
  }

  public String getEmailId() {
    return emailId;
  }

  public String getName() {
    return name;
  }

  public String getPassword() {
    return password;
  }
}
