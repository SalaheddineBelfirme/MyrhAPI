package com.youcode.myrh.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

import java.time.LocalDate;
@Entity
public class ChercheurOffer {
    @EmbeddedId
    private ChercheurID id;
    private LocalDate date;
    private  boolean status;
}
