package com.youcode.myrh.controllers;

import com.youcode.myrh.Dtos.Req.ChercheurOfferReq;
import com.youcode.myrh.Dtos.Resp.ChercheurOfferRespo;
import com.youcode.myrh.services.impl.ChercheurOfferServiceImpl;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/chercheuroffer")
@CrossOrigin("http://localhost:4200")

@AllArgsConstructor

public class ChercheurOfferController {

    private  final ChercheurOfferServiceImpl service;

    @PostMapping
    public ResponseEntity<ChercheurOfferRespo>create(@RequestBody @Valid ChercheurOfferReq chercheurOfferReq){
        return new ResponseEntity<>(service.create(chercheurOfferReq), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ChercheurOfferRespo>>getAll(){
        return new  ResponseEntity<>(service.getALl(),HttpStatus.OK);
        
    }

}
