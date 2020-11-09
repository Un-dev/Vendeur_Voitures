package com.phransswa.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Client{

    @Id
    private int id;
    private String name;

    @OneToMany
    @JoinColumn(name = "client_id")
    private List<Voiture> voitureList;
}