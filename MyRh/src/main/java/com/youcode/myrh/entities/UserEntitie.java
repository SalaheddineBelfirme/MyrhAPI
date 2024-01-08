package com.youcode.myrh.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.UUID;
@Data
@MappedSuperclass
@RequiredArgsConstructor
@AllArgsConstructor
@SuperBuilder
public abstract class UserEntitie {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String email;
    private  String adresse ;
    private  String name;
    private String phone;

}
