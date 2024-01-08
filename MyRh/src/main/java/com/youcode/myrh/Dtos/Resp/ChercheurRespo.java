package com.youcode.myrh.Dtos.Resp;

import com.youcode.myrh.Dtos.UserDto;
import com.youcode.myrh.entities.ChercheurOffer;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChercheurRespo extends UserDto {

    private String identify ;
    private List<ChercheurOffer> offers;
}
