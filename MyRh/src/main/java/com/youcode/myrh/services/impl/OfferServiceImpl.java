package com.youcode.myrh.services.impl;

import com.youcode.myrh.Configrtion.ModelMapperConfig;
import com.youcode.myrh.Dtos.Req.OfferReq;
import com.youcode.myrh.Dtos.Resp.OfferRespo;
import com.youcode.myrh.entities.Offer;
import com.youcode.myrh.exceptions.baseExsption;
import com.youcode.myrh.repositorys.OfferRepo;
import com.youcode.myrh.services.intrfaces.CroudService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OfferServiceImpl implements CroudService<UUID, OfferReq, OfferRespo> {

    private  final OfferRepo repository;
    private  final ModelMapperConfig mapper;
    @Override
    public OfferRespo create(OfferReq e) {
        return  mapper.modelMapper().map(repository.save(mapper.modelMapper().map(e,Offer.class)),OfferRespo.class);
    }

    @Override
    public boolean delete(UUID uuid) {
       if(repository.findById(uuid).isPresent()){
           repository.deleteById(uuid);
           return  true;
       }
       throw  new baseExsption("No Offer With The id :"+uuid);
    }

    @Override
    public List<OfferRespo> getALl() {
       if (!repository.findAll().isEmpty()){
           repository.findAll().stream().map(
                   offer -> mapper.modelMapper().map(offer,OfferRespo.class)
           ).toList();
       }
        throw  new baseExsption("No Content");

    }

    @Override
    public OfferRespo update(OfferReq e) {
        return null;
    }

    @Override
    public OfferRespo getOne(UUID uuid) {
        return null;
    }
}
