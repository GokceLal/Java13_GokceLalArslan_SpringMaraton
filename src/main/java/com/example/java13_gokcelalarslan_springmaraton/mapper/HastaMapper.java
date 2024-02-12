package com.example.java13_gokcelalarslan_springmaraton.mapper;


import com.example.java13_gokcelalarslan_springmaraton.dto.request.RandevuAddRequestDto;
import com.example.java13_gokcelalarslan_springmaraton.dto.response.HastaGetResponseDto;
import com.example.java13_gokcelalarslan_springmaraton.dto.response.RandevuGetResponseDto;
import com.example.java13_gokcelalarslan_springmaraton.entity.Hasta;
import com.example.java13_gokcelalarslan_springmaraton.entity.Randevu;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {HastaMapper.class})
public interface HastaMapper {

    HastaMapper INSTANCE = Mappers.getMapper(HastaMapper.class);

    HastaGetResponseDto fromtEntityToDto(Hasta hasta);


    List<HastaGetResponseDto> fromEntityListToDtoList(List<Hasta> hastaList);
}
