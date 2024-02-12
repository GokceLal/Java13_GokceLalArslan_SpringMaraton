package com.example.java13_gokcelalarslan_springmaraton.controller;


import com.example.java13_gokcelalarslan_springmaraton.dto.request.DoktorAddRequestDto;
import com.example.java13_gokcelalarslan_springmaraton.dto.response.DoktorGetResponseDto;
import com.example.java13_gokcelalarslan_springmaraton.mapper.DoktorMapper;
import com.example.java13_gokcelalarslan_springmaraton.service.DoktorService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.example.java13_gokcelalarslan_springmaraton.constants.RestApiUrls.DOKTOR;


@RestController
@RequestMapping(DOKTOR)
@RequiredArgsConstructor
public class DoktorController {

    private final DoktorService doktorService;

    @PostMapping("/save")
    public ResponseEntity<Void> add(@RequestBody @Valid DoktorAddRequestDto dto) {
        doktorService.save(DoktorMapper.INSTANCE.fromDtoToEntity(dto));
        return ResponseEntity.ok().build();
    }

    @GetMapping("/get-by-ad-and-soyad")
    public ResponseEntity<DoktorGetResponseDto> get(@RequestParam String ad, @RequestParam String soyad ){
        return ResponseEntity.ok(DoktorMapper.INSTANCE.fromtEntityToDto(doktorService.findByAdAndSoyad(ad, soyad)));
    }

}
