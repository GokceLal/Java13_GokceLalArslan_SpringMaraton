package com.example.java13_gokcelalarslan_springmaraton.repository;


import com.example.java13_gokcelalarslan_springmaraton.entity.Doktor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoktorRepository extends JpaRepository<Doktor, Long> {

    Doktor findByAdAndSoyad(String doktorAd, String doktorSoyad);
}
