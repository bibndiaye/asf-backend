package com.asf.demo.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
@Entity(name = "Compteur")
@Table(name = "compteur")
public class Compteur implements Serializable {
    private static final long serialVersionUID = -8277291315019029083L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;

    private Integer rCompteurid;

    private Integer rVoieid;

    private Integer rGareid;

    private Integer rSocieteid;

    private Instant dateDebut;

    private Instant dateFin;

    private BigDecimal valeur;

    private String codeRegroupement;

    @Column(name = "CODE_REGROUPEMENT", length = 10)
    public String getCodeRegroupement() {
        return codeRegroupement;
    }

    @Column(name = "VALEUR", nullable = false, precision = 10, scale = 2)
    public BigDecimal getValeur() {
        return valeur;
    }

    @Column(name = "DATE_FIN", nullable = false)
    public Instant getDateFin() {
        return dateFin;
    }

    @Column(name = "DATE_DEBUT", nullable = false)
    public Instant getDateDebut() {
        return dateDebut;
    }

    public Integer getRSocieteid() {
        return rSocieteid;
    }

    public Integer getRGareid() {
        return rGareid;
    }

    public Integer getRVoieid() {
        return rVoieid;
    }

    public Integer getRCompteurid() {
        return rCompteurid;
    }

    public Integer getId() {
        return id;
    }
}