package com.youcode.myrh.repositorys;

import com.youcode.myrh.entities.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface OfferRepo extends JpaRepository<Offer, UUID> {
}
