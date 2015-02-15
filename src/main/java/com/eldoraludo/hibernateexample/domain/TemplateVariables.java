package com.eldoraludo.hibernateexample.domain;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TemplateVariables implements Iterable<TemplateVariable> {

    private Template template;
    private Set<TemplateVariable> templateVariables = new HashSet<>();

    @Override
    public Iterator<TemplateVariable> iterator() {
        return templateVariables.iterator();
    }

    public TemplateVariables(Template template) {
        this.template = template;
    }

    public TemplateVariables() {
    }

    public Template getTemplate() {
        return template;
    }

    public void setTemplate(Template template) {
        this.template = template;
    }

    public Set<TemplateVariable> getTemplateVariables() {
        return templateVariables;
    }

    public void setTemplateVariables(Set<TemplateVariable> templateVariables) {
        this.templateVariables = templateVariables;
    }

    ;

    public void ajouterVariable(Variable variable, Fonction... fonctions) {
        TemplateVariable templateVariable = new TemplateVariable();
        templateVariable.setVariable(variable);
        templateVariable.getFonctions().ajouter(fonctions);
        templateVariables.add(templateVariable);
    }
}
