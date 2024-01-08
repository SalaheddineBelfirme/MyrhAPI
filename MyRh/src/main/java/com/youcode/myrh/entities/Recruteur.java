package com.youcode.myrh.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@RequiredArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@SuperBuilder
@AllArgsConstructor
public class Recruteur extends  UserEntitie{
    private String image;
    private  String  login;
    private String password;
    @OneToMany(mappedBy = "recruteur")
    private List<Offer> offers;

}
