package org.example.foyerproj.model;

import jakarta.persistence.*;
import org.example.foyerproj.enums.TypeFoyer;

import java.io.Serializable;

@Entity
@Table(name = "chambre")

public class Chambre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdChambre ;
    public Long getIdChambre() {
        return IdChambre;
    }

    public void setIdChambre(Long idChambre) {
        IdChambre = idChambre;
    }
    private Long numeroChambre ;

    public Long getNumeroChambre() {
        return numeroChambre;
    }

    public void setNumeroChambre(Long numeroChambre) {
        this.numeroChambre = numeroChambre;
    }
    @Enumerated(EnumType.STRING)
    private TypeFoyer typeFoyer;
    public TypeFoyer getTypeFoyer() {
        return typeFoyer;
    }

    public void setTypeFoyer(TypeFoyer typeFoyer) {
        this.typeFoyer = typeFoyer;
    }


}
