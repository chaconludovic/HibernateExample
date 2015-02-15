package com.eldoraludo.hibernateexample.domain;

import com.eldoraludo.HibernateSessionManager;
import com.eldoraludo.hibernateexample.repository.FonctionRepository;
import com.eldoraludo.hibernateexample.repository.TemplateRepository;
import com.eldoraludo.hibernateexample.repository.VariableRepository;
import org.hibernate.Session;
import org.junit.Test;

import java.util.Set;

public class TemplateTest {

    @Test
    public void lire_template() {
        Session session = HibernateSessionManager.getSessionFactory().openSession();

        session.beginTransaction();
        TemplateRepository templateRepository = new TemplateRepository(session);
        Set<Template> templates = templateRepository.trouverTous();
        for (Template template : templates) {
            System.out.println(template);
            for (TemplateVariable templateVariable : template.getTemplateVariables()) {
                System.out.println(templateVariable.getVariable());
                for (Fonction fonction : templateVariable.getFonctions()) {
                    System.out.println(fonction);
                }
            }
        }
    }

    @Test
    public void charger_template() {
        Session session = HibernateSessionManager.getSessionFactory().openSession();

        session.beginTransaction();

        nettoyerObjets(session);


        Variable variable = new Variable();
        variable.setNom("variable 1");
        session.save(variable);

        final Fonction fonction1 = new Fonction();
        fonction1.setNom("fonction 1");
        fonction1.setVariable(variable);
        session.save(fonction1);

        final Fonction fonction2 = new Fonction();
        fonction2.setNom("fonction 2");
        fonction2.setVariable(variable);
        session.save(fonction2);

        Template template = new Template();
        template.setId(1);
        template.setNom("template 1");
        template.getTemplateVariables().ajouterVariable(variable, fonction1, fonction2);

        session.save(template);
        session.getTransaction().commit();
    }

    private void nettoyerObjets(Session session) {
        this.nettoyerVariables(session);
        this.nettoyerTemplates(session);
        this.nettoyerFonctions(session);
    }

    private void nettoyerTemplates(Session session) {
        TemplateRepository templateRepository = new TemplateRepository(session);
        Set<Template> templates = templateRepository.trouverTous();
        for (Template template : templates) {
            templateRepository.supprimer(template);
        }
    }

    private void nettoyerFonctions(Session session) {
        FonctionRepository fonctionRepository = new FonctionRepository(session);
        Set<Fonction> fonctions = fonctionRepository.trouverTous();
        for (Fonction fonction : fonctions) {
            fonctionRepository.supprimer(fonction);
        }
    }

    private void nettoyerVariables(Session session) {
        VariableRepository variableRepository = new VariableRepository(session);
        Set<Variable> variables = variableRepository.trouverTous();
        for (Variable variable : variables) {
            variableRepository.supprimer(variable);
        }
    }

}
