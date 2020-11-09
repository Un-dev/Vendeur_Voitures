package com.phransswa.controller;

import com.phransswa.entity.Voiture;
import com.phransswa.repository.VoituresRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/voitures")
public class VoitureController{

    @Autowired
    private VoituresRepo voituresRepo;

    @GetMapping("/")
    public List<Voiture> getVoitures(){return voituresRepo.findAll();}

    @GetMapping("/{voitureId}")
    public Optional<Voiture> getVoiture(@PathVariable("voitureId") int voitureId){
        return voituresRepo.findById(voitureId);
    }

    @DeleteMapping("/{voitureId}")
    public void  deleteMVoiture(@PathVariable("voitureId") int voitureId) {
        voituresRepo.deleteById(voitureId);
    }

    @PostMapping("/")
    public void postVoiture() {

    }
}