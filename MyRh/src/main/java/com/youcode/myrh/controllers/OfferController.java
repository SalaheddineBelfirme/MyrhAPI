package com.youcode.myrh.controllers;

import com.youcode.myrh.Dtos.Req.OfferReq;
import com.youcode.myrh.Dtos.Resp.OfferRespo;
import com.youcode.myrh.services.impl.OfferServiceImpl;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/offer")
@RequiredArgsConstructor
@CrossOrigin("http://localhost:4200")
public class OfferController {
    private final OfferServiceImpl service;
    @GetMapping
    public ResponseEntity<List<OfferRespo>>getAll(){
        return new ResponseEntity<>(service.getALl(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<OfferRespo>create(@RequestBody @Valid OfferReq offerReq){
        return new ResponseEntity<>(service.create(offerReq),HttpStatus.CREATED);

    }

    @GetMapping("/{id}")
    public ResponseEntity<OfferRespo> read(@PathVariable UUID id){
    return new  ResponseEntity<>(service.getOne(id),HttpStatus.OK);
    }
    @GetMapping("/{id}/{status}")
    public ResponseEntity<OfferRespo> switchStatus(@PathVariable UUID id ,@PathVariable Boolean status){
        System.out.println("\n\n\n\n\n the status is :"+status);
        return new  ResponseEntity<>(service.switchStatus(id,status),HttpStatus.OK);
    }

}
