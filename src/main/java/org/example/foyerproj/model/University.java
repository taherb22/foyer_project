package org.example.foyerproj.model;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;


@Entity
@Table(name = "University")
public class University implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUniversity;

    private String nomUniversity;

    private String adresse;

    @OneToOne
    private Foyer foyer ;

    // Getters and Setters

    public Long getIdUniversity() {
        return idUniversity;
    }

    public void setIdUniversity(Long idUniversity) {
        this.idUniversity = idUniversity;
    }

    public String getNomUniversity() {
        return nomUniversity;
    }

    public void setNomUniversity(String nomUniversity) {
        this.nomUniversity = nomUniversity;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Foyer getFoyer() {
        return foyer;
    }

    public void setFoyer(Foyer foyer) {
        this.foyer = foyer;
    }
}