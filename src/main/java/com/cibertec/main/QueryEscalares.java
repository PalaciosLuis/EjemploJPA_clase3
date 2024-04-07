package com.cibertec.main;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class QueryEscalares {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("db_biblioteca");
        EntityManager em= emf.createEntityManager();

       TypedQuery<String> query= em.createQuery("select l.autor from Libro l where l.autor='Cesar'", String.class);

        List<String> resultado= query.getResultList();

        for (String autor : resultado) {
            System.out.println(autor);
        }

    }






}
