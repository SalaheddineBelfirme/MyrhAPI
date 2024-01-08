package com.youcode.myrh.Dtos.Req;

import com.youcode.myrh.entities.ChercheurID;
import com.youcode.myrh.entities.Offer;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.UUID;
@Data
@RequiredArgsConstructor
public class ChercheurOfferReq {
    private UUID offer;
    private  String chercheur;
    private  boolean status=false;
    private String file;

}
