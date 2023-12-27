package com.youcode.myrh.entities;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor
@Entity
public class Agent extends UserEntitie{
    private String password;
}
