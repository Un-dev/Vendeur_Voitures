package com.phransswa.controller;

import com.phransswa.entity.Vendeur;
import com.phransswa.repository.VendeursRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/vendeurs")
public class VendeurController{

    @Autowired
    private VendeursRepo vendeursRepo;

    @GetMapping("/")
    public List<Vendeur> getVendeurs(){return vendeursRepo.findAll();}

    @GetMapping("/{vendeurId}")
    public Optional<Vendeur> getVendeur(@PathVariable("vendeurId") int vendeurId){
        return vendeursRepo.findById(vendeurId);
    }

    @DeleteMapping("/{vendeurId}")
    public void  deleteVendeur(@PathVariable("vendeurId") int vendeurId) {
        vendeursRepo.deleteById(vendeurId);
    }

}