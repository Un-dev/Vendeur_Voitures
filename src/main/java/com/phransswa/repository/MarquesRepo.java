package com.phransswa.repository;

import com.phransswa.entity.Marque;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarquesRepo extends JpaRepository<Marque, Integer>{

}