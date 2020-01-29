package com.gonuclei.models;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
@MappedSuperclass
public abstract class AbstractNewspaperModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "newspaperId")
    private long newspaperId;

    @NotBlank
    @Column(name = "name")
    private String name;

    @NotBlank
    @Column(name = "price")
    private long price;

    public AbstractNewspaperModel() {
    }

    public AbstractNewspaperModel(long newspaperId, @NotBlank String name, long price) {
        this.newspaperId = newspaperId;
        this.name = name;
        this.price = price;
    }

    public void setNewspaperId(long newspaperId) {
        this.newspaperId = newspaperId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getNewspaperId() {
        return newspaperId;
    }

    public String getName() {
        return name;
    }

    public long getPrice() {
        return price;
    }
}
