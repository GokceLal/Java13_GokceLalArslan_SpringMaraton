package com.example.java13_gokcelalarslan_springmaraton.mapper;


import com.example.java13_gokcelalarslan_springmaraton.dto.request.DoktorAddRequestDto;
import com.example.java13_gokcelalarslan_springmaraton.dto.response.DoktorGetResponseDto;
import com.example.java13_gokcelalarslan_springmaraton.entity.Doktor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "default", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {RandevuMapper.class})
public interface DoktorMapper {

    DoktorMapper INSTANCE = Mappers.getMapper(DoktorMapper.class);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "randevuList", ignore = true)
    Doktor fromDtoToEntity(final DoktorAddRequestDto dto);

    @Mapping(target = "randevuGetResponseDtoList", source = "randevuList")
    DoktorGetResponseDto fromtEntityToDto(Doktor doktor);


    List<DoktorGetResponseDto> fromEntityListToDtoList(List<Doktor> doktorList);
}
