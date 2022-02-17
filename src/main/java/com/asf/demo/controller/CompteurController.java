package com.asf.demo.controller;

import com.asf.demo.model.Response;
import com.asf.demo.service.CompteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Map;

@RestController
@RequestMapping("/v1/asf")
public class CompteurController {

    @Autowired
    CompteurService compteurService;

    @GetMapping("/compteurs")
    public ResponseEntity<Response> getAllCompteurs(){
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("compteurs", compteurService.getAllCompteur()))
                        .message("liste de tous les compteurs trouvés")
                        .status(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .build()
        );
    }
    @GetMapping("/compteur/{id}")
    public ResponseEntity<Response> getCompteur(@PathVariable("id") Integer id){
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("compteur", compteurService.findOneCompteur(id)))
                        .message("Compteur trouvé : ")
                        .status(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .build()
        );
    }
}
