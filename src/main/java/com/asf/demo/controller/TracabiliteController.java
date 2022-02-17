package com.asf.demo.controller;

import com.asf.demo.model.Response;
import com.asf.demo.service.TracabiliteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Map;

@CrossOrigin(origins = "localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/v1/asf")
public class TracabiliteController {

    @Autowired
    TracabiliteService tracabiliteService;

    @GetMapping("/tracabilites")
    public ResponseEntity<Response> getAllTracability(){
        return ResponseEntity.ok(
                 Response.builder()
                         .timeStamp(LocalDateTime.now())
                         .data(Map.of("tracabilites", tracabiliteService.getAllTracabilte()))
                         .message("liste de l'ensemble des traçabilités trouvée")
                         .status(HttpStatus.OK)
                         .statusCode(HttpStatus.OK.value())
                         .build()
        );
    }
   @GetMapping("/tracabilite/{id}")
   public ResponseEntity<Response> getTracability(@PathVariable("id") Integer id){
       return ResponseEntity.ok(
               Response.builder()
                       .timeStamp(LocalDateTime.now())
                       .data(Map.of("tracabilite", tracabiliteService.findOneTracabilite(id)))
                       .message("Tracabilite trouvée : ")
                       .status(HttpStatus.OK)
                       .statusCode(HttpStatus.OK.value())
                       .build()
       );
   }
}
