package com.example.java13_gokcelalarslan_springmaraton.dto.request;

import jakarta.validation.constraints.Email;
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
public class DoktorAddRequestDto {

    @NotNull
    @Size(min = 3,max = 64)
    String ad;

    @NotNull
    @Size(min = 3,max = 64)
    String soyad;

    @NotNull
    String brans;
}
