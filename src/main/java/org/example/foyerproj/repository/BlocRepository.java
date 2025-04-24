package org.example.foyerproj.repository;

import org.example.foyerproj.model.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
public interface BlocRepository extends JpaRepository<Bloc,Long> {
    @Query("SELECT b FROM Bloc b WHERE b.foyer.university.nomUniversity = :nomUniversite")
    List<Bloc> findBlocsByNomUniversity(@Param("nomUniversity") String nomUniversity);
}
