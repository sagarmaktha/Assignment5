package com.gonuclei.models.entities;

import com.gonuclei.models.AbstractSubscriptionModel;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Subscription")
public class SubscriptionEntity extends AbstractSubscriptionModel {
}
