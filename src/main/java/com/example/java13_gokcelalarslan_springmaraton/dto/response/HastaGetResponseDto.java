package com.example.java13_gokcelalarslan_springmaraton.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class HastaGetResponseDto {

    String id;

    String ad;

    String soyad;
}
