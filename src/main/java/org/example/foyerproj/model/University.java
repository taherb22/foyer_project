package org.example.foyerproj.model;

import jakarta.persistence.*;

import java.io.Serializable;


@Entity
@Table(name = "University")
public class University implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUniversity;

    private String nomUniversity;

    private String adresse;

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
}