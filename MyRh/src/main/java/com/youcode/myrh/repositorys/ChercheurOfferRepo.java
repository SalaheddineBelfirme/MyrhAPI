package com.youcode.myrh.repositorys;

import com.youcode.myrh.entities.ChercheurID;
import com.youcode.myrh.entities.ChercheurOffer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChercheurOfferRepo extends JpaRepository<ChercheurOffer, ChercheurID> {

}
