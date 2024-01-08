package com.youcode.myrh.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
@Entity
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class ChercheurOffer {
    @EmbeddedId
    private ChercheurID id;
    private  boolean status;
    private String file;
}
