package com.youcode.myrh.services.impl;

import com.youcode.myrh.Configrtion.ModelMapperConfig;
import com.youcode.myrh.Dtos.Req.RecruteurReq;
import com.youcode.myrh.Dtos.Resp.RecruteurRespo;
import com.youcode.myrh.entities.Recruteur;
import com.youcode.myrh.exceptions.baseExsption;
import com.youcode.myrh.repositorys.RecruteurRepo;
import com.youcode.myrh.services.intrfaces.CroudService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
@Repository
@RequiredArgsConstructor
public class RecruteurServiceImpl implements CroudService<UUID, RecruteurReq, RecruteurRespo> {
    private  final RecruteurRepo repository;
    private final ModelMapperConfig mapper;

    @Override
    public RecruteurRespo create(RecruteurReq e) {
        Recruteur recruteur=repository.save(mapper.modelMapper().map(e, Recruteur.class));
        System.out.println("\n\n\n\n next  "+recruteur.toString());
        return mapper.modelMapper().map(recruteur,RecruteurRespo.class) ;
    }

    @Override
    public boolean delete(UUID uuid) {
        if (repository.findById(uuid).isPresent()){
             repository.deleteById(uuid);
             return true;
        }
        throw  new baseExsption("no recruiter with this id ");
    }

    @Override
    public List<RecruteurRespo> getALl() {
        List<RecruteurRespo> recruteurRespoList = repository.findAll()
                .stream()
                .map(recruteur -> mapper.modelMapper().map(recruteur, RecruteurRespo.class)).toList();
        if (recruteurRespoList.isEmpty()){
            throw new baseExsption("no content");
        }
        return recruteurRespoList;
    }

    @Override
    public RecruteurRespo update(RecruteurReq e) {
        return null;
    }

    @Override
    public RecruteurRespo getOne(UUID uuid) {
        if (repository.findById(uuid).isPresent()){
            return  repository.findById(uuid).stream()
                    .map(recruteur -> mapper.modelMapper().map(recruteur, RecruteurRespo.class)).findFirst().get();
        }
       throw new baseExsption("no recruteur with the id"+uuid);
    }
}
