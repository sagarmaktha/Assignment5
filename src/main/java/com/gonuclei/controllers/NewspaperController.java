package com.gonuclei.controllers;

import com.gonuclei.mapper.NewspaperMapper;
import com.gonuclei.mapper.UserMapper;
import com.gonuclei.models.dto.NewspaperDto;
import com.gonuclei.models.dto.SignUpRequest;
import com.gonuclei.services.NewspaperServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/newspapers")
public class NewspaperController {

  @Autowired
  NewspaperServices newspaperServices;

  @Autowired
  NewspaperMapper newspaperMapper;

  @PostMapping(path = "/entry")
  private ResponseEntity<?> entry(@RequestBody NewspaperDto newspaperDto) throws Exception{
    return ResponseEntity.ok(newspaperServices.entry(newspaperMapper.newspaperDtoToNewspaperBo(newspaperDto)));

  }


}
