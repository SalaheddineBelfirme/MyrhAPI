package com.youcode.myrh.repositorys;

import com.youcode.myrh.entities.Chercheur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ChercheurRepo extends JpaRepository<Chercheur, UUID> {

    Optional<Chercheur> findByIdentify(String identify);
}
