package com.example.java13_gokcelalarslan_springmaraton.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "doktor")
public class Randevu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String tarih;

    @ManyToOne(cascade = CascadeType.ALL)
    Doktor doktor;

    @ManyToOne(cascade = CascadeType.ALL)
    Hasta hasta;

}
