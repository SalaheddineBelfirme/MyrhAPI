package com.youcode.myrh.controllers;

import jakarta.servlet.http.HttpServletRequest;
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

@RestController
@RequestMapping("api/v1/file")
@CrossOrigin("http://localhost:4200")
public class FileController {

    @PostMapping("/upload")
    public ResponseEntity<String> uploadToLocalFileSystem(@RequestParam("file") MultipartFile file) {
        System.out.println("\n\n\n\n\n the file here :"+file.toString());
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        String filepath="C:\\Users\\YC\\Desktop\\brifs\\2ane\\MyRH\\MyRh\\pics\\";
        Path path = Paths.get(filepath+ fileName);
        try (OutputStream os = Files.newOutputStream(path)) {
            os.write(file.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new ResponseEntity<>(fileName, HttpStatus.OK);
    }


    @GetMapping("/files/download/{fileName:.+}")
    public ResponseEntity<Resource> downloadFile(@PathVariable String fileName, HttpServletRequest request) {
        // Load file as Resource
        Resource resource = new FileSystemResource("C:\\Users\\YC\\Desktop\\brifs\\2ane\\MyRH\\MyRh\\pics\\" + fileName);

        String contentType;
        try {
            contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
            contentType = "application/octet-stream";
        }
        if (contentType == null) {
            contentType = "application/octet-stream";
        }

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(contentType))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
                .body(resource);
    }


}
