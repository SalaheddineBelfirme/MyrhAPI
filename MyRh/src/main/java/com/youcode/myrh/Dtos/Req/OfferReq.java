package com.youcode.myrh.Dtos.Req;

import com.youcode.myrh.entities.ChercheurOffer;
import com.youcode.myrh.entities.Recruteur;
import com.youcode.myrh.enums.Niveau;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@RequiredArgsConstructor
public class OfferReq {
    @NotNull
    private String description;
    @NotNull
    private String profile;
    @NotNull
    private String ville;
    @NotNull
    private Niveau niveau;
    @NotNull
    private Boolean status;
    private UUID recruteur;

}

