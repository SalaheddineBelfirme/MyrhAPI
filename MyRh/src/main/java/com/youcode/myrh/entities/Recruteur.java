package com.youcode.myrh.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@RequiredArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
public class Recruteur extends  UserEntitie{

    private String image;
    private  String  login;
    private String password;
    @OneToMany(mappedBy = "recruteur")
    private List<Offer> offers;

}
