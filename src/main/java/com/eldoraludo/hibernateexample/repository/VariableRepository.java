package com.eldoraludo.hibernateexample.repository;

import com.eldoraludo.hibernateexample.domain.Variable;
import org.hibernate.Session;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ludovic on 15/02/2015.
 */
public class VariableRepository {

    private Session session;

    public VariableRepository(Session session) {
        this.session = session;
    }

    public Set<Variable> trouverTous() {
        return new HashSet<>(session.createCriteria(Variable.class).list());
    }

    public void supprimer(Variable variable) {
        session.delete(variable);
    }
}
