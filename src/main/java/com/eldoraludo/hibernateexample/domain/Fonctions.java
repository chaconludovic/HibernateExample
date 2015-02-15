package com.eldoraludo.hibernateexample.domain;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Fonctions implements Iterable<Fonction> {

//    private Variable variable;
    private Set<Fonction> fonctions = new HashSet<>();

    public Fonctions() {
    }

    @Override
    public Iterator<Fonction> iterator() {
        return fonctions.iterator();
    }

  /*  public Variable getVariable() {
        return variable;
    }

    public void setVariable(Variable variable) {
        this.variable = variable;
    }*/

    public Set<Fonction> getFonctions() {
        return fonctions;
    }

    public void setFonctions(Set<Fonction> fonctions) {
        this.fonctions = fonctions;
    }

    public void ajouter(Fonction... fonctions) {
        this.fonctions.addAll(Arrays.asList(fonctions));
    }
}
