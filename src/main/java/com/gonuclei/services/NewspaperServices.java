package com.gonuclei.services;

import com.gonuclei.models.bo.NewspaperBo;
import com.gonuclei.models.bo.UserBo;
import com.gonuclei.models.entities.NewspaperEntity;
import com.gonuclei.services.implementation.NewspaperServicesImplementation;
import com.gonuclei.transactionService.NewspaperTransaction;
import org.springframework.beans.factory.annotation.Autowired;

public interface NewspaperServices {

  String entry(NewspaperBo newspaperBo) throws Exception;
}
