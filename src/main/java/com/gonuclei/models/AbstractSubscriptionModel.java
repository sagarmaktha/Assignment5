package com.gonuclei.models;


import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@MappedSuperclass
public abstract class AbstractSubscriptionModel {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "subscriptionId")
  private long subscriptionId;

  @NotBlank
  @Column(name = "userId")
  private long userId;

  @NotBlank
  @Column(name = "userName")
  private String userName;

  @NotBlank
  @Column(name = "newspaperId")
  private long newspaperId;

  @NotBlank
  @Column(name = "newspaperName")
  private String namspaperName;

  @CreatedDate
  @Column(name = "CreatedOn")
  private Date date=new Date();

  public AbstractSubscriptionModel() {
  }

  public AbstractSubscriptionModel(long subscriptionId, long userId, long newspaperId, String userName, String namspaperName) {
    this.subscriptionId = subscriptionId;
    this.userId = userId;
    this.newspaperId = newspaperId;
    this.userName = userName;
    this.namspaperName = namspaperName;
  }

  public long getSubscriptionId() {
    return subscriptionId;
  }

  public long getUserId() {
    return userId;
  }

  public long getNewspaperId() {
    return newspaperId;
  }

  public String getUserName() {
    return userName;
  }

  public String getNamspaperName() {
    return namspaperName;
  }

  public Date getDate() {
    return date;
  }

  public void setSubscriptionId(long subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

  public void setNewspaperId(long newspaperId) {
    this.newspaperId = newspaperId;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public void setNamspaperName(String namspaperName) {
    this.namspaperName = namspaperName;
  }
}
