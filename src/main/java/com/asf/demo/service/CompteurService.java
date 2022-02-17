package com.asf.demo.service;

import com.asf.demo.model.Compteur;
import com.asf.demo.model.Tracabilite;
import com.asf.demo.repository.CompteurRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CompteurService {
    @Autowired
    CompteurRepository compteurRepository;

    public List<Compteur> getAllCompteur(){
        log.info(" Affichage de toutes les compteurs");
        return compteurRepository.findAll();
    }

    public Compteur findOneCompteur(Integer id){
        log.info(String.format("Affichage du compteur avec id = %d", id));
        return compteurRepository.findById(id).get();
    }

}
