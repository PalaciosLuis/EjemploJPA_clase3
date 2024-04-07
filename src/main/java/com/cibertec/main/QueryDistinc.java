package com.cibertec.main;

import com.cibertec.domain.Libro;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class QueryDistinc {
    public static void main(String[] args) {

        EntityManagerFactory emf= Persistence.createEntityManagerFactory("db_biblioteca");
        EntityManager em= emf.createEntityManager();


        //Create Query
        //Consulta JPQL
        TypedQuery query = em.createQuery("select l.autor from Libro l" , String.class);

        List<String> resultado = query.getResultList();
        for (String autor : resultado) {
            System.out.println(autor);
        }

    }

    }

