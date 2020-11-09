package com.phransswa.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Vendeur{

    @Id
    private int id;

    private String name;

    @ManyToMany
    @JoinTable(name = "vend",
                joinColumns = @JoinColumn(name = "vendeur_id"),
                inverseJoinColumns =  @JoinColumn(name = "marque_id"))
    @JsonIgnore
    private List<Marque> marqueList;

    @OneToMany
    @JoinColumn(name = "adresse_id")
    private  List<Adresse> adresses;

}