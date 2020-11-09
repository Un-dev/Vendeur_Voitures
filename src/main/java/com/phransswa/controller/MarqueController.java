package com.phransswa.controller;

import com.phransswa.entity.Marque;
import com.phransswa.repository.MarquesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/marques")
public class MarqueController{

    @Autowired
    private MarquesRepo marquesRepo;

    @GetMapping("/")
    public List<Marque> getMarques(){return marquesRepo.findAll();}

    @GetMapping("/{marqueId}")
    public Optional<Marque> getMarque(@PathVariable("marqueId") int marqueId){
        return marquesRepo.findById(marqueId);
    }

    @DeleteMapping("/{marqueId}")
    public void  deleteMarque(@PathVariable("marqueId") int marqueId) {
        marquesRepo.deleteById(marqueId);
    }

    @PostMapping("/")
    public void postMarque(@RequestBody Marque marque) {
        marquesRepo.save(marque);
    }

    @PutMapping("/{marqueId}")
    public Marque updateMarque(@PathVariable("marqueId") int marqueId, @RequestBody Marque newMarque){
        return marquesRepo.findById(marqueId)
                .map(marque -> {
                    marque.setName(newMarque.getName());
                    return marquesRepo.save(marque);
                })
                .orElseGet(() -> {
                    newMarque.setId(marqueId);
                    return marquesRepo.save(newMarque);
                });
    }
}