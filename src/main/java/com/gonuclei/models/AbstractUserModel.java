package com.gonuclei.models;


import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@MappedSuperclass
public abstract class AbstractUserModel {
  public String getPassword() {
    return password;
  }

  @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Email
    @NotBlank
    @Column(name = "email_id")
    private String mail;

    @NotBlank
    @Column(name = "name")
    private String  name;


    @NotBlank
    @Column(name = "password")
    private String  password;

    public AbstractUserModel(String mail, @NotBlank String name, Integer subscriptionid, @NotBlank String password) {
        this.mail = mail;
        this.name = name;
        this.password = password;
    }

    public AbstractUserModel() {
    }


    public void setId(long id) {
        this.id = id;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public String getMail() {
        return mail;
    }

    public String getName() {
        return name;
    }
}
