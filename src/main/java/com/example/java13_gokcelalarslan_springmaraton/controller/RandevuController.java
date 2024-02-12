package com.example.java13_gokcelalarslan_springmaraton.controller;


import com.example.java13_gokcelalarslan_springmaraton.dto.request.DoktorAddRequestDto;
import com.example.java13_gokcelalarslan_springmaraton.dto.request.RandevuAddRequestDto;
import com.example.java13_gokcelalarslan_springmaraton.dto.response.DoktorGetResponseDto;
import com.example.java13_gokcelalarslan_springmaraton.mapper.DoktorMapper;
import com.example.java13_gokcelalarslan_springmaraton.mapper.RandevuMapper;
import com.example.java13_gokcelalarslan_springmaraton.service.DoktorService;
import com.example.java13_gokcelalarslan_springmaraton.service.RandevuService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/randevu")
@RequiredArgsConstructor
public class RandevuController {

    private final RandevuService randevuService;

    @PostMapping("/save")
    public ResponseEntity<Void> add(@RequestBody @Valid RandevuAddRequestDto dto) {
        randevuService.save(dto);
        return ResponseEntity.ok().build();
    }

}
