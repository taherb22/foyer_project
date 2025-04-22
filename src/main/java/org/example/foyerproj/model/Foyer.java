package org.example.foyerproj.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name ="Foyer")


public class Foyer  implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient ;
    private String nomFoyer ;
    private Long capaciteFoyer ;
    // Getters
    public Long getIdClient() {
        return idClient;
    }

    public String getNomFoyer() {
        return nomFoyer;
    }

    public Long getCapaciteFoyer() {
        return capaciteFoyer;
    }

    // Setters
    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public void setNomFoyer(String nomFoyer) {
        this.nomFoyer = nomFoyer;
    }

    public void setCapaciteFoyer(Long capaciteFoyer) {
        this.capaciteFoyer = capaciteFoyer;
    }


}
