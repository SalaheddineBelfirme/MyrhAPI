package com.youcode.myrh.controllers;

import com.youcode.myrh.Configrtion.ModelMapperConfig;
import com.youcode.myrh.Dtos.Req.RecruteurReq;
import com.youcode.myrh.Dtos.Resp.RecruteurRespo;
import com.youcode.myrh.services.impl.RecruteurServiceImpl;
import jakarta.validation.Valid;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/recruteur")
@Data
@RequiredArgsConstructor
public class RecruteurController {

    private final RecruteurServiceImpl service;

    @PostMapping
    public ResponseEntity<RecruteurRespo>create(@RequestBody @Valid RecruteurReq recruteur, BindingResult bindingResult){
        return new ResponseEntity<>(service.create(recruteur), HttpStatus.CREATED);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String>delete(@PathVariable UUID id){
        if (service.delete(id)){
            return new ResponseEntity<>("deleted",HttpStatus.OK);
        }else return new ResponseEntity<>("try again",HttpStatus.NOT_FOUND);
    }

    @GetMapping
    public  ResponseEntity<List<RecruteurRespo>>getAll(){
        return new ResponseEntity<>(service.getALl(),HttpStatus.OK);
    }
    @GetMapping("{id}")
    public  ResponseEntity<RecruteurRespo>getOneById(@PathVariable  UUID id){
        return new ResponseEntity<>(service.getOne(id),HttpStatus.OK);
    }


}
