package com.eldoraludo.hibernateexample.domain;

/**
 * Created by ludovic on 15/02/2015.
 */
public class TemplateVariable extends BaseEntity{

    private Variable variable;
    private Fonctions fonctions=new Fonctions();

    public Variable getVariable() {
        return variable;
    }

    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    public Fonctions getFonctions() {
        return fonctions;
    }

    public void setFonctions(Fonctions fonctions) {
        this.fonctions = fonctions;
    }
}
