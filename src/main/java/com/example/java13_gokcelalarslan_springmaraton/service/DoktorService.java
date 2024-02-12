package com.example.java13_gokcelalarslan_springmaraton.service;


import com.example.java13_gokcelalarslan_springmaraton.entity.Doktor;
import com.example.java13_gokcelalarslan_springmaraton.repository.DoktorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DoktorService {

    private final DoktorRepository doktorRepository;

    public void save(Doktor doktor) {
        doktorRepository.save(doktor);
    }

    public List<Doktor> getAll() {
        return doktorRepository.findAll();
    }

    public Doktor findByAdAndSoyad(String doktorAd, String doktorSoyad) {
        return doktorRepository.findByAdAndSoyad(doktorAd, doktorSoyad);
    }
}
