package org.example.foyerproj.repository;

import org.example.foyerproj.model.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {

}
