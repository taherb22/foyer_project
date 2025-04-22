package org.example.foyerproj.model;

import jakarta.persistence.*;
import org.example.foyerproj.enums.TypeFoyer;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "chambre")

public class Chambre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdChambre ;
    private Long numeroChambre ;
    @Enumerated(EnumType.STRING)
    private TypeFoyer typeFoyer;
   @ManyToOne
   private Bloc bloc  ;
   @OneToMany(mappedBy = "bloc")
   private Set<Reservation> ReservationSet = new HashSet<>();


    public TypeFoyer getTypeFoyer() {
        return typeFoyer;
    }
    public void setTypeFoyer(TypeFoyer typeFoyer) {
        this.typeFoyer = typeFoyer;
    }
    public Long getIdChambre() {
        return IdChambre;
    }

    public void setIdChambre(Long idChambre) {
        IdChambre = idChambre;
    }
    public Long getNumeroChambre() {
        return numeroChambre;
    }

    public void setNumeroChambre(Long numeroChambre) {
        this.numeroChambre = numeroChambre;
    }

    public Bloc getBloc() {
        return bloc;
    }

    public void setBloc(Bloc bloc) {
        this.bloc = bloc;
    }

    public Set<Reservation> getReservationSet() {
        return ReservationSet;
    }

    public void setReservationSet(Set<Reservation> reservationSet) {
        ReservationSet = reservationSet;
    }
}
