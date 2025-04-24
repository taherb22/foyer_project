package org.example.foyerproj.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Etudiant")
public class Etudiant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;

    private String nomEt;

    private String prenomEt;

    private String cin;

    private String ecole;

    private Date dateNaissance;


    @OneToMany(mappedBy = "etudiant", cascade = CascadeType.ALL )
    private Set<Tache> taches = new HashSet<>() ;



    @ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private Set<Reservation> Reservations = new HashSet<>() ;

    public Set<Reservation> getReservations() {
        return Reservations;
    }
    // Getters and Setters

    public Long getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(Long idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public String getNomEt() {
        return nomEt;
    }

    public void setNomEt(String nomEt) {
        this.nomEt = nomEt;
    }

    public String getPrenomEt() {
            return prenomEt;
    }

    public void setPrenomEt(String prenomEt) {
        this.prenomEt = prenomEt;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getEcole() {
        return ecole;
    }

    public void setEcole(String ecole) {
        this.ecole = ecole;
    }

    public Date getDate() {
        return dateNaissance;
    }

    public void setDate(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
}
