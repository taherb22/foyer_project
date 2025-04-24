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


    @ManyToOne(cascade = CascadeType.ALL)
    private Chambre  chambre ;




    @ManyToMany(mappedBy = "Reservations", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
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



    public Set<Etudiant> getEtudiantset() {
        return etudiantset;
    }

    public void setEtudiantset(Set<Etudiant> etudiantset) {
        this.etudiantset = etudiantset;
    }

    public Chambre getChambre() {
        return chambre;
    }

    public void setChambre(Chambre chambre) {
        this.chambre = chambre;
    }
}
