package com.phransswa.repository;

import com.phransswa.entity.Adresse;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdressesRepo extends JpaRepository<Adresse, Integer>{

}