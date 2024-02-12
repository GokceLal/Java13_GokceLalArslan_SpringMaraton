package com.example.java13_gokcelalarslan_springmaraton.dto.response;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DoktorGetResponseDto {

    String ad;

    String soyad;

    String brans;

    List<RandevuGetResponseDto> randevuGetResponseDtoList;

}
