package com.youcode.myrh.repositorys;

import com.youcode.myrh.entities.Agent;
import com.youcode.myrh.entities.Recruteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface RecruteurRepo extends JpaRepository<Recruteur, UUID> {
}
