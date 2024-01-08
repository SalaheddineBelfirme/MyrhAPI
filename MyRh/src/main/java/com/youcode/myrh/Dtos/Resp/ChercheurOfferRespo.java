package com.youcode.myrh.Dtos.Resp;

import com.youcode.myrh.entities.ChercheurID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChercheurOfferRespo {

    private ChercheurID id;
    private  boolean status;
    private String file;



}
