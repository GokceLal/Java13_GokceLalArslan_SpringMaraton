package com.example.java13_gokcelalarslan_springmaraton.service;


import com.example.java13_gokcelalarslan_springmaraton.dto.request.RandevuAddRequestDto;
import com.example.java13_gokcelalarslan_springmaraton.entity.Doktor;
import com.example.java13_gokcelalarslan_springmaraton.entity.Hasta;
import com.example.java13_gokcelalarslan_springmaraton.entity.Randevu;
import com.example.java13_gokcelalarslan_springmaraton.repository.DoktorRepository;
import com.example.java13_gokcelalarslan_springmaraton.repository.RandevuRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RandevuService {

    private final RandevuRepository randevuRepository;
    private final DoktorService doktorService;

    public void save(RandevuAddRequestDto dto) {
        Randevu randevu = new Randevu();
        Doktor doktor = doktorService.findByAdAndSoyad(dto.getDoktorAd(), dto.getDoktorSoyad());
        doktor.ekleRandevu(randevu);
        Hasta hasta = Hasta.builder().ad(dto.getAd()).soyad(dto.getSoyad()).build();
        hasta.ekleRandevu(randevu);
        randevu.setTarih(dto.getTarih());
        randevu.setDoktor(doktor);
        randevu.setHasta(hasta);
        randevuRepository.save(randevu);
    }

}
