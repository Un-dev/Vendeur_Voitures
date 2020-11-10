package com.phransswa.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Voiture{

    @Id
    private int id;

    private String name;

    private int client_id;
    private int marque_id;

}