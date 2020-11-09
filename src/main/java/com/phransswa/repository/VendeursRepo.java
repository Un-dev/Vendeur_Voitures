package com.phransswa.repository;

import com.phransswa.entity.Vendeur;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendeursRepo extends JpaRepository<Vendeur, Integer>{

}