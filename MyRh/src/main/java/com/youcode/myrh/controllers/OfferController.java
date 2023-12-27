package com.youcode.myrh.controllers;

import com.youcode.myrh.Dtos.Req.OfferReq;
import com.youcode.myrh.Dtos.Resp.OfferRespo;
import com.youcode.myrh.services.impl.OfferServiceImpl;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/offer")
@RequiredArgsConstructor
public class OfferController {
    private final OfferServiceImpl service;


    @GetMapping
    public ResponseEntity<List<OfferRespo>>getAll(){
        return new ResponseEntity<>(service.getALl(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<OfferRespo>create(@RequestBody @Valid OfferReq offerReq){
        return new ResponseEntity<>(service.create(offerReq),HttpStatus.OK);

    }

}
