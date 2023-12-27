package com.youcode.myrh.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Entity
@Data
public class Chercheur extends UserEntitie {
    private String identify ;
    @OneToMany(mappedBy = "id.chercheur")
    private List<ChercheurOffer>offers;
}
