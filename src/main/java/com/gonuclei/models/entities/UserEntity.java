package com.gonuclei.models.entities;

import com.gonuclei.models.AbstractUserModel;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
public class UserEntity extends AbstractUserModel {
}
