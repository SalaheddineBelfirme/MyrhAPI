package com.youcode.myrh.Convert;

import com.youcode.myrh.Dtos.Req.OfferReq;
import com.youcode.myrh.Dtos.Resp.OfferRespo;
import com.youcode.myrh.entities.Offer;
import com.youcode.myrh.entities.Recruteur;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class OfferConvert {
    private final ModelMapper mapper;
    public Offer Offer(OfferReq offerReq){
        Offer offer = mapper.map(offerReq, Offer.class);

        Recruteur recruteur = Recruteur.builder().id(offerReq.getRecruteur()).build();
        offer.setRecruteur(recruteur);

        return offer;
    }
}
