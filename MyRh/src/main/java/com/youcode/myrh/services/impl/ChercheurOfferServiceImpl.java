package com.youcode.myrh.services.impl;

import com.youcode.myrh.Dtos.Req.ChercheurOfferReq;
import com.youcode.myrh.Dtos.Resp.ChercheurOfferRespo;
import com.youcode.myrh.entities.Chercheur;
import com.youcode.myrh.entities.ChercheurID;
import com.youcode.myrh.entities.ChercheurOffer;
import com.youcode.myrh.entities.Offer;
import com.youcode.myrh.exceptions.baseExsption;
import com.youcode.myrh.repositorys.ChercheurOfferRepo;
import com.youcode.myrh.repositorys.ChercheurRepo;
import com.youcode.myrh.repositorys.OfferRepo;
import com.youcode.myrh.services.intrfaces.CroudService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class ChercheurOfferServiceImpl implements CroudService<ChercheurID, ChercheurOfferReq, ChercheurOfferRespo> {

    private  final ChercheurOfferRepo repository;
    private  final OfferServiceImpl offerService;
    private  final ChercheurSeriviceImpl chercheurSerivice;
    private final ChercheurRepo chercheurRepo;
    private  final ModelMapper mapper;
    @Override
    public ChercheurOfferRespo create(ChercheurOfferReq e) {
        Offer offer=mapper.map(offerService.getOne(e.getOffer()),Offer.class);
        offer.setId(e.getOffer());

//        Chercheur chercheur1=repository.findAllById()

        Chercheur chercheur= chercheurRepo.findByIdentify(e.getChercheur()).orElseThrow(() -> new baseExsption("NOT FOUND chercheur "));
        ChercheurID chercheurID=ChercheurID.builder()
                .chercheur(chercheur)
                .offer(offer)
                .build();

        ChercheurOffer chercheurOffer=ChercheurOffer.builder()
                .id(chercheurID)
                .file(e.getFile())
                .status(false)
                .build();
        return mapper.map(repository.save(chercheurOffer),ChercheurOfferRespo.class);
    }

    @Override
    public boolean delete(ChercheurID chercheurID) {
        return false;
    }

    @Override
    public List<ChercheurOfferRespo> getALl() {
        return null;
    }

    @Override
    public ChercheurOfferRespo update(ChercheurOfferReq e) {
        return null;
    }

    @Override
    public ChercheurOfferRespo getOne(ChercheurID chercheurID) {
        return null;
    }
}
