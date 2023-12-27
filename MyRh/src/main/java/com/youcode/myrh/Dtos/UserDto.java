package com.youcode.myrh.Dtos;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
@Data
@RequiredArgsConstructor
public abstract class UserDto {

    @NotNull
    private String email;
    @NotNull
    private  String adresse ;
    @NotNull
    private  String name;
    @NotNull
    private String phone;
}
