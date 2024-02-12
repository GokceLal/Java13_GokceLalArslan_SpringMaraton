package com.example.java13_gokcelalarslan_springmaraton.repository;


import com.example.java13_gokcelalarslan_springmaraton.entity.Doktor;
import com.example.java13_gokcelalarslan_springmaraton.entity.Randevu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RandevuRepository extends JpaRepository<Randevu, Long> {

}
