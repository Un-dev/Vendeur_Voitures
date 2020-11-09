package com.phransswa.repository;

import com.phransswa.entity.Voiture;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoituresRepo extends JpaRepository<Voiture, Integer>{

}