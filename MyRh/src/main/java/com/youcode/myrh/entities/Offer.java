package com.youcode.myrh.entities;

import com.youcode.myrh.enums.Niveau;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.UUID;
@Data
@RequiredArgsConstructor
@Entity
public class Offer {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String description;
    private String profile;
    private String ville;
    private Niveau niveau;
    private Boolean status;
//    @NotNull
    @ManyToOne(cascade = CascadeType.ALL)
    private Recruteur recruteur;
    @OneToMany(mappedBy = "id.offer")
    private List<ChercheurOffer> chercheurs;

}
