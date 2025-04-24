package org.example.foyerproj.model;


import jakarta.persistence.*;
import org.example.foyerproj.enums.TypeTache;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "Tache")
public class Tache  implements Serializable  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTache;
    private LocalDate dateTache;
    private Integer duree; // duration in hours or minutes
    private Double tarifHoraire;
    @Enumerated(EnumType.STRING)
    private TypeTache typeTache;




    @ManyToOne( cascade = CascadeType.ALL)
    private Etudiant etudiant ;
    // Getters and Setters
    public Long getIdTache() {
        return idTache;
    }

    public void setIdTache(Long idTache) {
        this.idTache = idTache;
    }

    public LocalDate getDateTache() {
        return dateTache;
    }

    public void setDateTache(LocalDate dateTache) {
        this.dateTache = dateTache;
    }

    public Integer getDuree() {
        return duree;
    }

    public void setDuree(Integer duree) {
        this.duree = duree;
    }

    public Double getTarifHoraire() {
        return tarifHoraire;
    }

    public void setTarifHoraire(Double tarifHoraire) {
        this.tarifHoraire = tarifHoraire;
    }

    public TypeTache getTypeTache() {
        return typeTache;
    }

    public void setTypeTache(TypeTache typeTache) {
        this.typeTache = typeTache;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }
}