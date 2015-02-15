package com.eldoraludo.hibernateexample.domain;

/**
 * Created by ludovic on 15/02/2015.
 */
public class Fonction extends BaseEntity{

    private String nom;
    private Variable variable;

    public Fonction() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Variable getVariable() {
        return variable;
    }

    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    @Override
    public String toString() {
        return "Fonction{" +
                "nom='" + nom + '\'' +
                ", variable=" + variable +
                '}';
    }
}
