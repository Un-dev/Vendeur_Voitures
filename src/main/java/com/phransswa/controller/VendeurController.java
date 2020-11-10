package com.phransswa.controller;

import com.phransswa.entity.Adresse;
import com.phransswa.entity.Vendeur;
import com.phransswa.repository.AdressesRepo;
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

    @Autowired
    private AdressesRepo adressesRepo;

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

    @PostMapping("/")
    public void postVendeur(@RequestBody Vendeur vendeur, @RequestBody Adresse adresse) {
        adressesRepo.save(adresse);
        vendeursRepo.save(vendeur);
    }

    @PostMapping("/{vendeurId}/newAdress")
    public void addAdresse(@PathVariable("vendeurId") int vendeurId, @RequestBody Adresse adresse) {
        adresse.setVendeur_id(vendeurId);
        adressesRepo.save(adresse);
    }

    @PutMapping("/{vendeurId}")
    public Vendeur updateVendeur(@PathVariable("vendeurId") int vendeurId, @RequestBody Vendeur newVendeur){
        return vendeursRepo.findById(vendeurId)
                .map(vendeur -> {
                    vendeur.setName(newVendeur.getName());
                    return vendeursRepo.save(vendeur);
                })
                .orElseGet(() -> {
                    newVendeur.setId(vendeurId);
                    return vendeursRepo.save(newVendeur);
                });
    }
}