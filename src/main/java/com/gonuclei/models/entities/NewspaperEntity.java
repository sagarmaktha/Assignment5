package com.gonuclei.models.entities;

import com.gonuclei.models.AbstractNewspaperModel;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Newspaper")
public class NewspaperEntity extends AbstractNewspaperModel {
}
