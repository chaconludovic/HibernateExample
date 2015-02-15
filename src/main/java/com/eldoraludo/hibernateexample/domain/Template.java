package com.eldoraludo.hibernateexample.domain;

public class Template extends BaseEntity {

    private String nom;
    private TemplateVariables templateVariables = new TemplateVariables(this);

    public Template() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public TemplateVariables getTemplateVariables() {
        return templateVariables;
    }

    public void setTemplateVariables(TemplateVariables templateVariables) {
        this.templateVariables = templateVariables;
    }

    @Override
    public String toString() {
        return nom;
    }
}
