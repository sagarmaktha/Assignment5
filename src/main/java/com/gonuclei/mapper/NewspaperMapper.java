package com.gonuclei.mapper;

import com.gonuclei.models.bo.NewspaperBo;
import com.gonuclei.models.dto.NewspaperDto;
import com.gonuclei.models.dto.SignUpRequest;
import com.gonuclei.models.entities.NewspaperEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface NewspaperMapper {

  NewspaperEntity newspaperBoToNewspaperEntity(NewspaperBo newspaperBo);


  NewspaperBo newspaperDtoToNewspaperBo(NewspaperDto newspaperDto);

}
