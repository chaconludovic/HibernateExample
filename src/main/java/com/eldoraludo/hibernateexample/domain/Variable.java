package com.eldoraludo.hibernateexample.domain;

/**
 * Created by ludovic on 15/02/2015.
 */
public class Variable extends BaseEntity {

    private String nom;

    public Variable() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return nom;
    }
}
