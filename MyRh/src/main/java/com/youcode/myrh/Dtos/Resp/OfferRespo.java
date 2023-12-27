package com.youcode.myrh.Dtos.Resp;

import com.youcode.myrh.entities.ChercheurOffer;
import com.youcode.myrh.entities.Recruteur;
import com.youcode.myrh.enums.Niveau;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@RequiredArgsConstructor
public class OfferRespo {
    private String description;
    private String profile;
    private String ville;
    private Niveau niveau;
    private Boolean status;
    private UUID recruteur;
    private List<ChercheurOffer> chercheurs;
}
