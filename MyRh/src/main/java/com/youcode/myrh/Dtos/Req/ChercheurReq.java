package com.youcode.myrh.Dtos.Req;

import com.youcode.myrh.Dtos.UserDto;
import com.youcode.myrh.entities.ChercheurOffer;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;
@Data
public class ChercheurReq extends UserDto {

    private String identify ;
}
