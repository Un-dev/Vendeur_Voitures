package com.phransswa.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
@Data
@NoArgsConstructor
public class Voiture{

    @Id
    private int id;

    private String name;

    @ManyToOne
    private Client client;

    @ManyToOne
    private Marque marque;

}