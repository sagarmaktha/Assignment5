package com.gonuclei.services.implementation;

import com.gonuclei.mapper.NewspaperMapper;
import com.gonuclei.models.bo.NewspaperBo;
import com.gonuclei.services.NewspaperServices;
import com.gonuclei.transactionService.NewspaperTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewspaperServicesImplementation implements NewspaperServices {


  @Autowired
  NewspaperTransaction newspaperTransaction;

  @Autowired
  NewspaperMapper newspaperMapper;


  @Override
  public String entry(NewspaperBo newspaperBo) throws Exception{
    return "";
  }

}
