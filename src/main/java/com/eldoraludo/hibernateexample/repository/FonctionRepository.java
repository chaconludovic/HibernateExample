package com.eldoraludo.hibernateexample.repository;

import com.eldoraludo.hibernateexample.domain.Fonction;
import org.hibernate.Session;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ludovic on 15/02/2015.
 */
public class FonctionRepository {

    private Session session;

    public FonctionRepository(Session session) {
        this.session = session;
    }

    public Set<Fonction> trouverTous() {
        return new HashSet<>(session.createCriteria(Fonction.class).list());
    }

    public void supprimer(Fonction fonction) {
        session.delete(fonction);
    }
}
