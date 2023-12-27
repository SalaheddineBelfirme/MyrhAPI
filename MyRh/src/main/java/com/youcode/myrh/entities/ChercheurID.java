package com.youcode.myrh.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
@Data
@Embeddable
@RequiredArgsConstructor
public class ChercheurID implements Serializable {
    private  static  final long serialVersionUUID=1L;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="chercheur.id",nullable = false)
    private Chercheur chercheur;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "offer.id",nullable = false)
    private Offer offer;

}
