package com.gonuclei.models.bo;

import java.util.Date;

public class SubscriptionBo {
  private Long subscriptionId;
  private Long userId;
  private String userName;
  private Long newspaperId;
  private String newspaperName;
  private Date date;

  public SubscriptionBo(Long subscriptionId, Long userId, String userName, Long newspaperId, String newspaperName, Date date) {
    this.subscriptionId = subscriptionId;
    this.userId = userId;
    this.userName = userName;
    this.newspaperId = newspaperId;
    this.newspaperName = newspaperName;
    this.date = date;
  }

  public SubscriptionBo() {
  }

  public void setSubscriptionId(Long subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public void setNewspaperId(Long newspaperId) {
    this.newspaperId = newspaperId;
  }

  public void setNewspaperName(String newspaperName) {
    this.newspaperName = newspaperName;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public Long getSubscriptionId() {
    return subscriptionId;
  }

  public Long getUserId() {
    return userId;
  }

  public String getUserName() {
    return userName;
  }

  public Long getNewspaperId() {
    return newspaperId;
  }

  public String getNewspaperName() {
    return newspaperName;
  }

  public Date getDate() {
    return date;
  }
}
