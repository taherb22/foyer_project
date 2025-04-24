package org.example.foyerproj.repository;

import org.example.foyerproj.model.Tache;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TacheRepository extends JpaRepository<Tache,Long> {

}
