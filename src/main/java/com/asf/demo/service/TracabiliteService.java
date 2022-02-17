package com.asf.demo.service;

import com.asf.demo.model.Tracabilite;
import com.asf.demo.repository.TracabiliteRepository;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class TracabiliteService {

    @Autowired
    TracabiliteRepository tracabiliteRepository;

    public List<Tracabilite> getAllTracabilte(){
        log.info(" Affichage de toutes les tracabiltes");
        return tracabiliteRepository.findAll();
    }

    public Tracabilite findOneTracabilite(Integer id){
        log.info(String.format("Affichage de la traçabilité avec id = %d", id));
        return tracabiliteRepository.findById(id).get();
    }

}
