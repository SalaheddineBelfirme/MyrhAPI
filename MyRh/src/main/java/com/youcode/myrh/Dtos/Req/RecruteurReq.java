package com.youcode.myrh.Dtos.Req;

import com.youcode.myrh.Dtos.UserDto;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.ToString;

@ToString(callSuper = true)
@Data
public class RecruteurReq extends UserDto {
    @NotNull
    private String image;
    @NotNull
    @Column(unique = true)
    private  String  login;
    @NotNull
    private String password;

}
