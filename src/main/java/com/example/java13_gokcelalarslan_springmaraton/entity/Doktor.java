package com.example.java13_gokcelalarslan_springmaraton.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "doktor")
public class Doktor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String ad;

    String soyad;

    String brans;

    @OneToMany(mappedBy = "doktor", cascade = CascadeType.ALL)
    List<Randevu> randevuList;

    public void ekleRandevu(Randevu randevu) {
        if (randevuList == null) {
            randevuList = new ArrayList<>(List.of(randevu));
        } else {
            randevuList.add(randevu);
        }
    }
}
