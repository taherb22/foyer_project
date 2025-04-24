package org.example.foyerproj.service;

import org.example.foyerproj.model.Tache;
import org.example.foyerproj.repository.TacheRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TacheService {

    private final TacheRepository tacheRepository;

    public TacheService(TacheRepository tacheRepository) {
        this.tacheRepository = tacheRepository;
    }

    // Create
    public Tache saveTache(Tache tache) {
        return tacheRepository.save(tache);
    }

    // Read all
    public List<Tache> getAllTaches() {
        return tacheRepository.findAll();
    }

    // Read by ID
    public Optional<Tache> getTacheById(Long id) {
        return tacheRepository.findById(id);
    }

    // Update
    public Tache updateTache(Long id, Tache updatedTache) {
        return tacheRepository.findById(id)
                .map(t -> {
                    t.setDateTache(updatedTache.getDateTache());
                    t.setDuree(updatedTache.getDuree());
                    t.setTarifHoraire(updatedTache.getTarifHoraire());
                    t.setTypeTache(updatedTache.getTypeTache());
                    t.setEtudiant(updatedTache.getEtudiant());
                    return tacheRepository.save(t);
                }).orElseThrow(() -> new RuntimeException("Tache not found with id " + id));
    }

    // Delete
    public void deleteTache(Long id) {
        tacheRepository.deleteById(id);
    }
}
