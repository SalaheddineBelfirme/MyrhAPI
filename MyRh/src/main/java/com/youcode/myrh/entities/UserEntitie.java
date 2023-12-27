package com.youcode.myrh.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;
@Data
@MappedSuperclass
public abstract class UserEntitie {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String email;
    private  String adresse ;
    private  String name;
    private String phone;

}
