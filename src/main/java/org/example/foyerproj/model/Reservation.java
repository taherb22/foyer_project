package org.example.foyerproj.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Reservation")
public class Reservation  implements Serializable  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;

    private String anneeUniversitaire;

    private Boolean estValide;


    @ManyToOne
    private Reservation reservation ;


    @ManyToMany(mappedBy = "reservation")
    private Set<Etudiant> etudiantset = new HashSet<>() ;


    // Getters and Setters

    public Long getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(Long idReservation) {
        this.idReservation = idReservation;
    }

    public String getAnneeUniversitaire() {
        return anneeUniversitaire;
    }

    public void setAnneeUniversitaire(String anneeUniversitaire) {
        this.anneeUniversitaire = anneeUniversitaire;
    }

    public Boolean getEstValide() {
        return estValide;
    }

    public void setEstValide(Boolean estValide) {
        this.estValide = estValide;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public Set<Etudiant> getEtudiantset() {
        return etudiantset;
    }

    public void setEtudiantset(Set<Etudiant> etudiantset) {
        this.etudiantset = etudiantset;
    }
}
