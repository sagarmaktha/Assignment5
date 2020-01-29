package com.gonuclei.models.bo;

public class NewspaperBo {
  private Long newspaperId;
  private String name;
  private Long price;

  public void setNewspaperId(Long newspaperId) {
    this.newspaperId = newspaperId;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPrice(Long price) {
    this.price = price;
  }

  public Long getNewspaperId() {
    return newspaperId;
  }

  public String getName() {
    return name;
  }

  public Long getPrice() {
    return price;
  }

  public NewspaperBo() {
  }

  public NewspaperBo(Long newspaperId, String name, Long price) {
    this.newspaperId = newspaperId;
    this.name = name;
    this.price = price;
  }
}
