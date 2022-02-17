package com.asf.demo.repository;

import com.asf.demo.model.Compteur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteurRepository extends JpaRepository<Compteur, Integer> {

}
