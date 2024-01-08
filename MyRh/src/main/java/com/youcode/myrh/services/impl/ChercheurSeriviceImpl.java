package com.youcode.myrh.services.impl;

import com.youcode.myrh.Configrtion.ModelMapperConfig;
import com.youcode.myrh.Dtos.Req.ChercheurReq;
import com.youcode.myrh.Dtos.Resp.ChercheurRespo;
import com.youcode.myrh.exceptions.baseExsption;
import com.youcode.myrh.repositorys.ChercheurRepo;
import com.youcode.myrh.services.intrfaces.CroudService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
@Data
@AllArgsConstructor
public class ChercheurSeriviceImpl implements CroudService<UUID, ChercheurReq, ChercheurRespo> {

    private final ChercheurRepo repository;
    private  final ModelMapperConfig mapper;
    @Override
    public ChercheurRespo create(ChercheurReq e) {
        return null;
    }

    @Override
    public boolean delete(UUID uuid) {
        return false;
    }

    @Override
    public List<ChercheurRespo> getALl() {
        return null;
    }

    @Override
    public ChercheurRespo update(ChercheurReq e) {
        return null;
    }

    @Override
    public ChercheurRespo getOne(UUID uuid) {
        return repository.findById(uuid)
                .map(chercheur -> mapper.modelMapper().map(chercheur, ChercheurRespo.class))
                .orElseThrow(() -> new baseExsption("Chercheur not found with UUID: " + uuid));
    }
    public ChercheurRespo getOneByidentify(String identify) {
        return repository.findByIdentify(identify)
                .map(chercheur -> mapper.modelMapper().map(chercheur, ChercheurRespo.class))
                .orElseThrow(() -> new baseExsption("Chercheur not found with identify: " + identify));
    }
}
