package com.phransswa.controller;

import com.phransswa.entity.Marque;
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

    @PostMapping("/client/{clientId}")
    public void postVoiture(@PathVariable("clientId") int clientId, @RequestBody Voiture voiture, @RequestBody Marque marque) {
        voiture.setClient_id(clientId);
        voiture.setMarque_id(marque.getId());
        voituresRepo.save(voiture);
    }

    @PutMapping("/{voitureId}")
    public Voiture updateVoiture(@PathVariable("voitureId") int voitureId, @RequestBody Voiture newVoiture){
        return voituresRepo.findById(voitureId)
                .map(voiture -> {
                    voiture.setName(newVoiture.getName());
                    return voituresRepo.save(voiture);
                })
                .orElseGet(() -> {
                    newVoiture.setId(voitureId);
                    return voituresRepo.save(newVoiture);
                });
    }
}