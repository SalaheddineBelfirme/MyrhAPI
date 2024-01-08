package com.youcode.myrh.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.io.Writer;

@Data
@Embeddable
@RequiredArgsConstructor
@Builder
@AllArgsConstructor
public class ChercheurID implements Serializable {
    private  static  final long serialVersionUUID=1L;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="chercheur.id",nullable = false)
    @JsonIgnore
    private Chercheur chercheur;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "offer.id",nullable = false)
    @JsonIgnore
    private Offer offer;

}
