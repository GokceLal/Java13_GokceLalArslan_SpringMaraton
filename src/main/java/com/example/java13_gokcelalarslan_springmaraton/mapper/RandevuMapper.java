package com.example.java13_gokcelalarslan_springmaraton.mapper;


import com.example.java13_gokcelalarslan_springmaraton.dto.request.DoktorAddRequestDto;
import com.example.java13_gokcelalarslan_springmaraton.dto.request.RandevuAddRequestDto;
import com.example.java13_gokcelalarslan_springmaraton.dto.response.DoktorGetResponseDto;
import com.example.java13_gokcelalarslan_springmaraton.dto.response.RandevuGetResponseDto;
import com.example.java13_gokcelalarslan_springmaraton.entity.Doktor;
import com.example.java13_gokcelalarslan_springmaraton.entity.Hasta;
import com.example.java13_gokcelalarslan_springmaraton.entity.Randevu;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "default", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {HastaMapper.class})
public interface RandevuMapper {

    RandevuMapper INSTANCE = Mappers.getMapper(RandevuMapper.class);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "doktor", ignore = true)
    @Mapping(target = "hasta", ignore = true)
    Randevu fromDtoToEntity(final RandevuAddRequestDto dto);

    @Mapping(target = "hastaGetResponseDto", source = "hasta")
    RandevuGetResponseDto fromtEntityToDto(Randevu randevu);


    List<RandevuGetResponseDto> fromEntityListToDtoList(List<Randevu> randevuList);
}
