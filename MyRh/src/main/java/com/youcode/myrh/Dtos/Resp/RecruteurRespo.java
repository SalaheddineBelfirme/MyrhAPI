package com.youcode.myrh.Dtos.Resp;

import com.youcode.myrh.Dtos.UserDto;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@Data
@ToString(callSuper = true)
@RequiredArgsConstructor
public class RecruteurRespo extends UserDto {
    @NotNull
    private String image;
    @NotNull
    private  String  login;
    @NotNull
    private String password;
}
