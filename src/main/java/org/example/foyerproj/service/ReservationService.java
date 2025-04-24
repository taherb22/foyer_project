package org.example.foyerproj.service;

import org.example.foyerproj.model.Reservation;
import org.example.foyerproj.repository.ReservationRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ReservationService {

    private final ReservationRepository reservationRepository;

    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    // Create or Update a reservation
    public Reservation saveReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    // Get all reservations
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    // Get a reservation by ID
    public Optional<Reservation> getReservationById(Long id) {
        return reservationRepository.findById(id);
    }

    // Update an existing reservation
    public Reservation updateReservation(Long id, Reservation updatedReservation) {
        return reservationRepository.findById(id).map(reservation -> {
            reservation.setAnneeUniversitaire(updatedReservation.getAnneeUniversitaire());
            reservation.setEstValide(updatedReservation.getEstValide());
            reservation.setChambre(updatedReservation.getChambre());
            reservation.setEtudiantset(updatedReservation.getEtudiantset());
            return reservationRepository.save(reservation);
        }).orElseThrow(() -> new RuntimeException("Reservation not found with id " + id));
    }

    // Delete a reservation by ID
    public void deleteReservation(Long id) {
        reservationRepository.deleteById(id);
    }
}
