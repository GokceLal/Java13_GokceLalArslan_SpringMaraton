package com.example.java13_gokcelalarslan_springmaraton.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RandevuAddRequestDto {

    @NotNull
    String tarih;

    @NotNull
    @Size(min = 3,max = 64)
    String ad;

    @NotNull
    @Size(min = 3,max = 64)
    String soyad;

    @NotNull
    @Size(min = 3,max = 64)
    String doktorAd;

    @NotNull
    @Size(min = 3,max = 64)
    String doktorSoyad;
}
