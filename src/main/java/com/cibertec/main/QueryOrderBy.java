package com.cibertec.main;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class QueryOrderBy {
    public static void main(String[] args) {

        EntityManagerFactory emf= Persistence.createEntityManagerFactory("db_biblioteca");
        EntityManager em= emf.createEntityManager();


        //Create Query
        //Consulta JPQL
        TypedQuery<Double> query = em.createQuery("select l.precio from Libro l order by l.precio desc " , Double.class);

        List<Double> resultado = query.getResultList();
        for (Double precio : resultado) {
            System.out.println(precio);
        }

    }

    }

