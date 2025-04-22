package org.example.foyerproj.model;



import jakarta.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Bloc")
public class Bloc implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc;

    private String nomBloc;

    private Long capacityBloc;

    @ManyToOne
    private Foyer foyer ;

    @OneToMany(mappedBy = "bloc")
    private Set<Chambre> chambreSet = new HashSet<>();



    // Getters and Setters

    public Long getIdBloc() {
        return idBloc;
    }

    public void setIdBloc(Long idBloc) {
        this.idBloc = idBloc;
    }

    public String getNomBloc() {
        return nomBloc;
    }

    public void setNomBloc(String nomBloc) {
        this.nomBloc = nomBloc;
    }

    public Long getCapacityBloc() {
        return capacityBloc;
    }

    public void setCapacityBloc(Long capacityBloc) {
        this.capacityBloc = capacityBloc;
    }

    public Set<Chambre> getChambreSet() {
        return chambreSet;
    }

    public void setChambreSet(Set<Chambre> chambreSet) {
        this.chambreSet = chambreSet;
    }
}

