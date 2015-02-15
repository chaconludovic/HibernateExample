package com.eldoraludo.hibernateexample.repository;

import com.eldoraludo.hibernateexample.domain.Template;
import org.hibernate.Session;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ludovic on 15/02/2015.
 */
public class TemplateRepository {

    private Session session;

    public TemplateRepository(Session session) {
        this.session = session;
    }

    public Set<Template> trouverTous() {
        return new HashSet<>(session.createCriteria(Template.class).list());
    }

    public void supprimer(Template template) {
        session.delete(template);
    }
}
